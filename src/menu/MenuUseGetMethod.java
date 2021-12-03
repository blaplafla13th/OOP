package menu;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class MenuUseGetMethod {

    public static void main(String[] args) {
        String classPath;
        String packagePath = "." + File.separator + "src";

        FileFilter removeMenu = file -> !file.getName().equals("menu");

        File current = new File(packagePath);
        while (!current.isFile()) {
            File[] listPackage = current.listFiles(removeMenu);
            int option = printMenu(listPackage);
            current = new File(listPackage[option].getPath());
            // FIXME: 03/12/2021 chua loc duoc cac file chay duoc va khong chay duoc
        }

        classPath = current.getPath().replace(packagePath + File.separator, "")
                .replace(File.separator, ".").replace(".java", "");
        runClass(classPath);
    }

    public static int printMenu(File[] list) {

        if (list == null) {
            System.out.println("Không tìm thấy đối tượng");
            System.exit(2);
        }
        System.out.println("______Menu______");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d) %s\n", (i + 1), list[i].getName().replace(".java", "")
                    .replace("OOP_", ""));
        }
        System.out.println("0) Exit");
        System.out.print("Nhập lựa chọn của bạn:");
        int option = input(list.length) - 1;
        System.out.println("____________");
        if (option == -1) {
            System.out.println("Bye!");
            System.exit(0);
        } else if (option > list.length) {
            return printMenu(list);
        }
        return option;
    }

    public static int input(int maxNumber) {
        Scanner input = new Scanner(System.in);
        int i;
        try {
            i = Integer.parseInt(input.nextLine());
            if (i > maxNumber || i < 0) {
                System.out.println("Không tìm thấy lựa chọn");
                return maxNumber + 1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Không tìm thấy lựa chọn");
            return maxNumber + 1;
        }
        return i;
    }

    public static void runClass(String packageName) {
        Class<?> inputClass;

        try { // run class
            inputClass = Class.forName(packageName);
            Object obj = inputClass.getDeclaredConstructor().newInstance();
            if (inputClass.isInstance(obj)) {
                System.out.println("______Chạy______");
                inputClass.getMethod("main", String[].class).invoke(obj, (Object) null);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.println("Class không chạy được");
            System.exit(3);
        }
        System.out.println();
        System.out.println("______Kết thúc______");
        System.exit(1);
    }
}
