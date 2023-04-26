package BT1_Variables;

public class Student {

    String fullName = "Trần Thúy Vy";         //Biến cục bộ

    public static String firstName = "Vy";    // Biến static

    public static void main(String[] args) {

        String lastName = "Trần";            //Biến local

        Student st = new Student();

        System.out.println("Họ tên sinh viên :" + st.fullName);
        System.out.println("Tên sinh viên: " + Thongtin.firstName);
        System.out.println("Họ sinh viên: " + lastName);
        System.out.println("Khóa học của sinh viên: " + Thongtin.Khoahoc);
    }
}




