package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {

    public void myProfile() {
        String name = "정찬희";
        int age = 23;
        String major = "컴퓨터공학부";

        System.out.println("이름 : " + name + "\n나이 : " + age + "살" + "\n전공 : " + major);
    }

    public void empInformation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("부서를 입력하세요 : ");
        String dept = sc.next();

        System.out.println("*** 사원정보 ***");
        System.out.println("이름 : " + name + "\n나이 : " + age + "살" + "\n부서 : " + dept);
    }
}
