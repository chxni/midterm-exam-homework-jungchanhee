package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {

    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;
    public void maxNumber() {
        System.out.print("두 개의 정수를 입력하세요 : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("두 수중 큰 값은 " + num1 + "입니다.");
        } else {
            System.out.println("두 수중 큰 값은 " + num2 + "입니다.");
        }

    }

    public void minNumber() {
        System.out.print("두 개의 정수를 입력하세요 : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 < num2) {
            System.out.println("두 수중 작은 값은 " + num1 + "입니다.");
        } else {
            System.out.println("두 수중 작은 값은 " + num2 + "입니다.");
        }
    }

    public void threeMaxMin() {
        System.out.print("세 개의 정수를 입력하세요 : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int max = num1;
        int min = num1;

        if(num2 > max)
            max = num2;
        else if(num3 > max)
            max = num3;

        if(num2 < min)
            min = num2;
        else if(num3 < min)
            min = num3;

        System.out.println("세 수중 가장 큰수는 " + max + ", 가장 작은 수는 " + min + "입니다.");
    }

    public void checkEven() {
        System.out.print("정수를 입력하세요 : ");
        num1 = sc.nextInt();

        if(num1 % 2 == 0)
            System.out.println("짝수입니다.");
        else
            System.out.println("홀수입니다.");
    }

    public void isPassFail() {
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();

        double avg = (kor + eng + math) /3;

        if(kor < 40 || eng < 40 || math < 40 || avg < 60){
            if(avg < 60)
                System.out.println("평균 점수 미달로 불합격입니다.");

            if(kor < 40)
                System.out.println("국어 점수 미달로 불합격입니다.");

            if(eng < 40)
                System.out.println("영어 점수 미달로 불합격입니다.");

            if(math < 40)
                System.out.println("수학 점수 미달로 불합격입니다.");
        } else
            System.out.println("합격입니다!");
    }

    public void scoreGrade() {
        System.out.print("점수를 입력하세요 : ");
        num1 = sc.nextInt();

        if(num1 >= 90)
            System.out.println("A");
        else if(num1 >= 80)
            System.out.println("B");
        else if(num1 >= 70)
            System.out.println("C");
        else if(num1 >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }

    public void checkPlusMinusZero() {
        System.out.print("정수를 입력하세요 : ");
        num1 = sc.nextInt();

        if(num1 > 0)
            System.out.println("양수입니다.");
        else if(num1 < 0)
            System.out.println("음수입니다.");
        else
            System.out.println("0입니다.");
    }

    public void whatCharacter() {
        System.out.print("문자를 입력하세요 : ");
        int ch = (int) sc.next().charAt(0);

        if (ch >= 65 && ch <= 90)
            System.out.println("대문자입니다.");
        else if (ch >= 97 && ch <= 122)
            System.out.println("소문자입니다.");
        else if (ch >= 48 && ch <= 57)
            System.out.println("숫자문자입니다.");
        else
            System.out.println("기타문자입니다.");
    }
}
