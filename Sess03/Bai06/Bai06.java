import java.util.Arrays;

public class Bai06 {

public static int[] mergeBooks(int[] a, int[] b) {
int i = 0, j = 0;
int[] temp = new int[a.length + b.length];
int k = 0;

while (i < a.length && j < b.length) {
int value;

if (a[i] < b[j]) {
value = a[i++];
} else if (a[i] > b[j]) {
value = b[j++];
} else {
value = a[i];
i++;
j++;
}

if (k == 0 || temp[k - 1] != value) {
temp[k++] = value;
}
}

while (i < a.length) {
int value = a[i++];
if (k == 0 || temp[k - 1] != value) {
temp[k++] = value;
}
}

while (j < b.length) {
int value = b[j++];
if (k == 0 || temp[k - 1] != value) {
temp[k++] = value;
}
}

return Arrays.copyOf(temp, k);
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
int[] arrayFirst = {101, 202, 303, 404, 505};
int[] arraySecond = {202, 303, 606, 707, 808};

System.out.print("Kho sách cũ: ");
displayBooks(arrayFirst);

System.out.print("Lô sách mới: ");
displayBooks(arraySecond);

int[] merged = mergeBooks(arrayFirst, arraySecond);

System.out.print("Danh sách hoàn chỉnh sau khi gộp: ");
displayBooks(merged);
}
}