package com.hnk;

public class Student {
    // Bien instance nay la nhin thay cho bat ky lop con nao.
    public String ten;

    // Bien hocphi la chi nhin thay cho lop Student.
    private double hocphi;
    // Bien hocphi la mot bien private static

    // FACULTY la mot constant
    public static final String FACULTY = "KhoaIT ";

    // Bien ten duoc gan trong constructor.
    public Student(String tenSV){
        ten = tenSV;
    }

    // Bien hocphi duoc gan mot gia tri.
    public void setHocPhi(double hp){
        hocphi = hp;
    }

    // Phuong thuc nay in chi tiet ve Student.
    public void inThongTin(){
        System.out.println("Ho va ten: " + ten );
        System.out.println("Hoc phi: " + hocphi);
        System.out.println(FACULTY+"hocphi trung binh:"+hocphi);
    }

    public static void main(String args[]){
        Student sv1 = new Student("Nguyen Thi Ngoc Thuy");
        sv1.setHocPhi(4000);
        sv1.inThongTin();
    }
}
