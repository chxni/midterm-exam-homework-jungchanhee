package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {

    Scanner sc = new Scanner(System.in);
    public void calculator() {
        System.out.print("정수 두 개를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("연산문자를 입력하세요 : ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("num1 + num2 = " + (num1 + num2));
                break;
            case "-":
                System.out.println("num1 - num2 = " + (num1 - num2));
                break;
            case "*":
                System.out.println("num1 * num2 = " + (num1 * num2));
                break;
            case "/":
                System.out.println("num1 / num2 = " + (num1 / num2));
                break;
            case "%":
                System.out.println("num1 % num2 = " + (num1 % num2));
                break;
        }
    }
    public void fruitPrice() {
        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = sc.nextLine();

        switch(fruit) {
            case "사과":
                System.out.println(fruit + "의 가격은 1000원 입니다.");
                break;
            case "바나나":
                System.out.println(fruit + "의 가격은 3000원 입니다.");
                break;
            case "복숭아":
                System.out.println(fruit + "의 가격은 2000원 입니다.");
                break;
            case "키위":
                System.out.println(fruit + "의 가격은 5000원 입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
        }
    }
}
