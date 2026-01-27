public class Bai04 {

public static void sortBooks(int[] arr) {
int n = arr.length;
boolean swapped;


for (int i = 0; i < n - 1; i++) {
swapped = false;


for (int j = 0; j < n - 1 - i; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
swapped = true;
}
}

if (!swapped) {
break;
}
}
}

public static void displayBooks(int[] arr) {
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i]);
if (i < arr.length - 1) {
System.out.print(", ");
}
}
System.out.println();
}

public static void main(String[] args) {
int[] books = {504, 120, 999, 321, 210, 777};

System.out.print("Mảng trước khi sắp xếp: ");
displayBooks(books);
sortBooks(books);
System.out.print("Mảng sau khi sắp xếp: ");
displayBooks(books);
}
}