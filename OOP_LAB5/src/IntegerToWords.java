import java.util.Scanner;

public class IntegerToWords {
    public static final String[] DON_VI = {"tỷ", "nghìn", "triệu"};
    public static final String[] SO = {"không", "một", "hai", "ba",
            "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số: ");
        String inStr = input.nextLine().strip();

        char[] inNum = inStr.toCharArray();
        for (char c : inNum) {
            int temp = (int) c - 48;
            if (temp < 0 || temp > 9) {
                System.out.println("Không phải số tự nhiên");
                return;
            }
        }
        read(inNum);
    }

    public static void read(char[] input) {
        int checker = 0;
        while (input[checker] == '0') {
            checker++;
            if (checker == input.length) {
                System.out.print("không");
                return;
            }
        }

        int maxLevel = ((input.length - checker) % 3 > 0) ?
                (input.length - checker) / 3 + 1 : (input.length - checker) / 3;
        int[][] splitter = new int[maxLevel][3];

        //split
        {
            maxLevel--;
            int index = input.length - 1;
            for (int currentLevel = 0; currentLevel <= maxLevel; currentLevel++) {
                for (int num = 2; num >= 0; num--) {
                    splitter[currentLevel][num] = (int) input[index] - 48;
                    index--;
                    if (index < checker) break;
                }
                if (index < checker) break;
            }
        }

        //read
        for (int currentLevel = maxLevel; currentLevel >= 0; currentLevel--) {
            if (splitter[currentLevel][0] == 0 && splitter[currentLevel][1] == 0
                    && splitter[currentLevel][2] == 0 && (currentLevel % 3 != 0 || currentLevel == 0)) continue;

            toText(splitter[currentLevel], currentLevel, maxLevel);

            if (currentLevel != 0)
                System.out.print(DON_VI[currentLevel % 3] + " ");
        }
    }

    public static void toText(int[] num, int currentLevel, int maxLevel) {
        if (num[0] == num[1] && num[1] == num[2] && num[2] == 0) {
            System.out.print("");
            return;
        }

        String first;
        if (num[0] == 0 && currentLevel == maxLevel)
            first = "";
        else first = (SO[num[0]] + " trăm ");

        String second = switch (num[1]) {
            case 0 -> num[0] == 0 ? (currentLevel == maxLevel ? "" : "linh ") : num[2] == 0 ? "" : "linh ";
            case 1 -> "mười ";
            default -> (SO[num[1]] + " mươi ");
        };

        String third = switch (num[2]) {
            case 0 -> "";
            case 1 -> (num[1] > 1) ? "mốt " : (SO[num[2]] + " ");
            case 5 -> (num[1] == 0) ? (SO[num[2]] + " ") : "lăm ";
            default -> SO[num[2]] + " ";
        };

        System.out.print(first + second + third);
    }
}
