package METHOD;

public class Caculator {

    static int tinhTong(int a, int b) {
        return a + b;
    }

    static int tinhTich(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Tổng của 2 số a, b là: " + tinhTong(4,8));
        System.out.println("Tích của 2 số a, b là: " + tinhTich(5,3));
    }

}

