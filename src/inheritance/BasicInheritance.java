package inheritance;

class HoTen {
    String name = "Nguyen Lan Anh";

    public void showName() {
        System.out.println("Name: " + name);
    }
}
class SinhVien extends HoTen {
    String type = "Sinh vien";

    public void showType() {
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.showName();
        sv.showType();

    }
}
