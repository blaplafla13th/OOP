# cd to OOP project folder
file="./UnixCombine/src/Combine.java"
# find ./ -name "*.java" | sed 's/.*src\///g' | sed 's/\//./g' --> list all java file with java package format

echo >$file

#start main
echo -e "import java.util.Scanner;
public class Combine {
public static Scanner input = new Scanner(System.in);
public static String[] arrayTest = {\"Test\"};
public static void main(String[] args){" >>$file

#print case
echo "System.out.println(\"Nhập lựa chọn của bạn:\");" >>$file
listFolder=()
i=1
for folder in OOP_*; do
  temp=$(echo $folder | sed 's/OOP_//g')
  echo "System.out.println(\"$i: $temp\");" >>$file
  listFolder+=($temp)
  i=$((i+1))
done
#end print case

#start switch folder
echo "switch (input()) {" >>$file
for ((i = 0; i < ${#listFolder[@]}; i++)); do
  echo "case $((i+1)): run${listFolder[i]}(); break;" >>$file
done
echo "case 0: break;">>$file
echo "default: main(arrayTest);">>$file
echo "}" >>$file
#end switch folder
echo "}" >>$file
#end main

#start mini func

for i in "${listFolder[@]}"; do
  echo "public static void run$i(){" >>$file
  listMain=($(find ./OOP_$i -name "*.java" | sed 's/.*src\///g' | sed 's/\//./g' | sed 's/.java//g' |
  awk -F"." '{if (index($2,"part")==0) {print $0} else if (index($4,"Test")!=0) {print $0}}'))
  #print case
  echo "System.out.println(\"Nhập lựa chọn của bạn:\");" >>$file
  for ((j = 0; j < ${#listMain[@]}; j++)); do
    temp=`echo ${listMain[j]} | awk -F"." '{if (index($2,"part")==0) {print $2} else if (index($4,"Test")!=0) {print ($3,$4)}}'`
    echo "System.out.println(\"$((j+1)): $temp\");" >> $file
  done
  echo "System.out.println(\"0: Back\");" >> $file
  #end print case

  #print switch case
  echo "int i = input();" >> $file
  echo "System.out.println(\"Function Run: \");" >>$file
  echo "switch (input()) {" >>$file
  for ((j = 0; j < ${#listMain[@]}; j++)); do
    echo "case $((j+1)): ${listMain[j]}.main(arrayTest);break;">>$file
  done
  echo "case 0: main(arrayTest);break;">>$file
  echo "default: run$i();">>$file
  echo "}" >>$file
  #end print switch case
  echo "}" >>$file
done

#end mini func
#start input func
echo -e "public static int input() {
int i;
try {
i = Integer.parseInt(input.nextLine());
} catch (NumberFormatException e) {
{System.out.println(\"Không tìm thấy lựa chọn\");
return -1;}
}
return i;
}
}" >>$file
