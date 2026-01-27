import java.util.Scanner;


public class Bai02 {

public static int searchBooks(String[] arr, String search) {
for (int i = 0; i < arr.length; i++) {
if (arr[i].equalsIgnoreCase(search)) {
return i; 
}
}
return -1;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String[] books = {
"Lập trình Java",
"Cấu trúc dữ liệu",
"Giải thuật cơ bản",
"Mạng máy tính",
"Cơ sở dữ liệu"
};

System.out.print("Nhập tên sách cần tìm: ");
String search = sc.nextLine();
int result = searchBooks(books, search);

if (result != -1) {
System.out.println("Tìm thấy sách" + books[result] + "tại vị trí " + result);
} else {
System.out.println("Sách không tồn tại");
}
}
}