import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;


public class MenuUseGetMethod {

    public static void main(String[] args) {
        String classPath;
        File current = new File(".");
        FileFilter getJavaFolder = file -> file.getAbsolutePath().contains("OOP_");
        FileFilter getJavaTest = file -> file.getAbsolutePath().contains("Test");

        File[] listModule = current.listFiles(getJavaFolder);
        int level1 = printMenu(listModule);
        String modulePath = listModule[level1].getPath() + File.separator + "src" + File.separator;

        File PackageFatherPath = new File(modulePath
                + listModule[level1].getName().replace("OOP_", "").toLowerCase());
        File[] listFolderPackage = PackageFatherPath.listFiles();
        int level2 = printMenu(listFolderPackage);

        File subPackagePath = new File(listFolderPackage[level2].getPath());
        if (subPackagePath.isFile()) {
            classPath = subPackagePath.getPath().replace(modulePath, "")
                    .replace(File.separator, ".").replace(".java", "");

        } else {
            File packageSubPath = new File(PackageFatherPath.getPath() + File.separator
                    + listFolderPackage[level2].getName());
            File[] listSubPackage = packageSubPath.listFiles();
            int level3 = printMenu(listSubPackage);

            if (listSubPackage[level3].isFile()) {
                classPath = listSubPackage[level3].getPath().replace(modulePath, "")
                        .replace(File.separator, ".").replace(".java", "");

            } else {
                File packageChildPath = new File(packageSubPath.getPath() + File.separator
                        + listSubPackage[level3].getName());
                File[] listChildPackage = packageChildPath.listFiles(getJavaTest);
                int level4 = printMenu(listChildPackage);

                File packageTestPath = new File(packageChildPath.getPath() + File.separator
                        + listChildPackage[level4].getName());
                classPath = packageTestPath.getPath().replace(modulePath, "")
                        .replace(File.separator, ".").replace(".java", "");
            }
        }
        runClass(classPath);
    }

    public static int printMenu(File[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d) %s\n", (i + 1), list[i].getName().replace(".java", "")
                    .replace("OOP_", ""));
        }
        System.out.println("0) Exit");
        System.out.print("Nhập lựa chọn của bạn:");
        int option = input(list.length) - 1;
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
                System.out.println("Run:");
                inputClass.getMethod("main", String[].class).invoke(obj, (Object) null);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.println("Not runnable file. Return to main menu.");
            System.exit(2);
        }
        System.out.println();
        System.out.println("Done");
        System.exit(1);
    }
}
