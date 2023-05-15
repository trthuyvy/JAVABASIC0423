package BT5_Collection;

import java.util.ArrayList;

public class BT_ArrayList {
    public static void main(String[] args) {

        //Khai báo ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        //Thêm thông tin nhân viên vào collection
        arrayList.add("Họ tên: Thúy Vy");
        arrayList.add("Môn học: Selenium");
        arrayList.add("Khóa học: 042023");

        //Duyệt ArrayList, in ra thông tin nhân viên
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

    }
}
