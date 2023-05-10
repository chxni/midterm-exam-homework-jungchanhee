package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {

    int sum;
    Scanner sc = new Scanner(System.in);
    public void sum1To10() {
        sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }

        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void sumEven1To100() {
        sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0)
                sum += i;
        }

        System.out.println("1부터 100까지 짝수의 합 " + sum);
    }

    public void oneGugudan() {
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public void sumMinToMax() {
        sum = 0;
        System.out.print("두 개의 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = num1;
        int min = num2;

        if(num1 < num2){
            max = num2;
            min = num1;
        }

        for(int i = min; i <= max; i++){
            sum += i;
        }

        System.out.println(min + "에서 " + max + "까지의 합 : " + sum);
    }

    public void printStar() {
        System.out.print("줄수와 칸수를 입력하세요 : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printNumberStar() {
        for(int i = 0; i <= 7; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleStar() {
        System.out.print("줄 수를 입력하세요 : ");
        int row = sc.nextInt();

        if(row > 0){
            for(int i = 0; i <= row; i++){
                for(int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            for(int i = Math.abs(row); i >= 0; i--){
                for(int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void guguDan() {
        for(int i = 2; i <= 9; i++){
            System.out.println(i + "단");
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
