package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {

    Scanner sc = new Scanner(System.in);
    public void printUniCode() {
        char ch;
        do{
            System.out.print("문자 하나를 입력하세요 : ");
            ch = sc.next().charAt(0);

            System.out.println(ch + "의 유니코드 : " + (int)ch);
        } while (ch != '0');
    }

    public void sum1To100() {
        int sum = 0;
        int i = 1;
        while(i <= 100){
            sum += i;
        }

        System.out.println("1~100까지의 합 : " + sum);
    }

    public void numberGame() {
        int random = (int)(Math.random()*100 + 1);
        int num;
        int cnt = 0;
        boolean flag = false;

        while(!flag) {
            cnt++;
            System.out.print("정수를 입력하세요 : ");
            num = sc.nextInt();

            if(num == random) {
                System.out.println("정답입니다. " + cnt + "회만에 정답을 맞추셨습니다.");
                flag = true;
            } else if (num > random) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else if (num < random) {
                System.out.println("입력하신 정수보다 큽니다.");
            }
        }
    }

    public void countCharacter() {
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.next();

        System.out.println("입력하신 문자열의 글자 갯수는 " + str.length() + "개입니다.");
    }

    public void countInChar() {
        System.out.println("문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기");
    }
}
