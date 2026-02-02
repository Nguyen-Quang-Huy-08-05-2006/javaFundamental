public class Main {
    public static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("Nguyen Van A");
        ClassRoom sv2 = new ClassRoom("Tran Thi B");
        ClassRoom sv3 = new ClassRoom("Le Van C");

        sv1.dongTien(50000);
        sv2.dongTien(70000);
        sv3.dongTien(30000);

        ClassRoom.xemQuyLop();
    }
}
