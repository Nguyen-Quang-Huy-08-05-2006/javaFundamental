import java.util.Scanner;
import java.util.regex.Pattern;

public class Btth {
    static String[] mssvList = new String[100];

    static int size = 0;

    static final String MSSV_REGEX = "^B\\d{7}$";
    static final Pattern MSSV_PATTERN = Pattern.compile(MSSV_REGEX);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mssvList[size++] = "B2101234";
        mssvList[size++] = "B2200001";
        mssvList[size++] = "B2309999";

        int choice;

        do {
            printMenu();
            choice = readInt(sc, "Chon chuc nang: ");

            switch (choice) {
                case 1:
                    displayMssv();
                    break;
                case 2:
                    addNewMssv(sc);
                    break;
                case 3:
                    updateMssv(sc);
                    break;
                case 4:
                    deleteMssv(sc);
                    break;
                case 5:
                    searchMssv(sc);
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        } while (choice != 0);

        sc.close();
    }

    public static void printMenu() {
        System.out.println("\n========== QUAN LY MSSV ==========");
        System.out.println("1. Hien thi danh sach MSSV");
        System.out.println("2. Them moi MSSV (Regex)");
        System.out.println("3. Cap nhat MSSV theo index (Regex)");
        System.out.println("4. Xoa MSSV (don mang)");
        System.out.println("5. Tim kiem MSSV (khong phan biet hoa thuong)");
        System.out.println("0. Thoat");
        System.out.println("==================================");
    }


    public static void displayMssv() {
        if (size == 0) {
            System.out.println("Danh sach rong. Chua co MSSV nao!");
            return;
        }

        System.out.println("\n--- DANH SACH MSSV ---");
        System.out.printf("%-5s %-10s\n", "STT", "MSSV");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-5d %-10s\n", (i + 1), mssvList[i]);
        }
    }


    public static void addNewMssv(Scanner sc) {
        // Kiểm tra mảng đầy (100 phần tử)
        if (size >= mssvList.length) {
            System.out.println("Mang da day (100 MSSV). Khong the them moi!");
            return;
        }

        String newMssv = inputValidMssv(sc, "Nhap MSSV moi (vd: B2101234): ");

        if (findIndexByMssv(newMssv) != -1) {
            System.out.println("MSSV da ton tai. Khong the them trung!");
            return;
        }

        mssvList[size] = newMssv;
        size++;

        System.out.println("Them MSSV thanh cong!");
    }


    public static void updateMssv(Scanner sc) {
        if (size == 0) {
            System.out.println("Danh sach rong. Khong co gi de cap nhat!");
            return;
        }

        displayMssv();

        int index = readInt(sc, "Nhap index can sua (0.." + (size - 1) + "): ");

        if (index < 0 || index >= size) {
            System.out.println("Index khong hop le!");
            return;
        }

        String newMssv = inputValidMssv(sc, "Nhap MSSV moi (vd: B2101234): ");

        int existed = findIndexByMssv(newMssv);
        if (existed != -1 && existed != index) {
            System.out.println("MSSV nay da ton tai o vi tri khac. Khong the cap nhat trung!");
            return;
        }

        mssvList[index] = newMssv;
        System.out.println("Cap nhat thanh cong!");
    }


    public static void deleteMssv(Scanner sc) {
        if (size == 0) {
            System.out.println("Danh sach rong. Khong co gi de xoa!");
            return;
        }

        System.out.print("Nhap MSSV can xoa: ");
        String target = sc.nextLine().trim();

        int pos = findIndexByMssv(target);

        if (pos == -1) {
            System.out.println("Khong tim thay MSSV can xoa!");
            return;
        }

        for (int i = pos; i < size - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }

        mssvList[size - 1] = null;

        size--;

        System.out.println("Da xoa MSSV: " + target);
    }


    public static void searchMssv(Scanner sc) {
        if (size == 0) {
            System.out.println("Danh sach rong. Khong co gi de tim!");
            return;
        }

        System.out.print("Nhap chuoi can tim: ");
        String key = sc.nextLine().trim().toLowerCase();

        boolean found = false;

        System.out.println("\n--- KET QUA TIM KIEM ---");
        for (int i = 0; i < size; i++) {
            if (mssvList[i].toLowerCase().contains(key)) {
                System.out.println("Index " + i + " : " + mssvList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay MSSV nao chua: " + key);
        }
    }


    public static String inputValidMssv(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String mssv = sc.nextLine().trim();

            if (MSSV_PATTERN.matcher(mssv).matches()) {
                return mssv; // hợp lệ thì trả về
            } else {
                System.out.println("Sai dinh dang! MSSV phai bat dau bang 'B' va theo sau la 7 chu so. (VD: B2101234)");
            }
        }
    }


    public static int findIndexByMssv(String mssv) {
        for (int i = 0; i < size; i++) {
            if (mssvList[i].equalsIgnoreCase(mssv)) {
                return i;
            }
        }
        return -1;
    }


    public static int readInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen!");
            }
        }
    }
}