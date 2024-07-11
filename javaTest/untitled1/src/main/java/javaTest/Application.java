package javaTest;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("고객관리 프로그램 실행");
        System.out.println("1. 고객 등록");
        System.out.println("2. 고객 정보수정");
        System.out.println("3. 고객 정보 보기");
        System.out.println("4. 고객 정보 삭제");
        System.out.println("0. 프로그램 종료");

        System.out.println("번호를 입력하세요.");

        int number = sc.nextInt();

        switch(number){
            case 1:
                System.out.println("고객 정보를 등록합니다.");
                break;
            case 2:
                System.out.println("고객 정보를 수정합니다.");
                break;
            case 3:
                System.out.println("고객 정보를 열람합니다.");
                break;
            case 4:
                System.out.println("고객 정보를 삭제합니다.");
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                break;
            default:
                System.out.println("잘못된 정보를 입력하셨습니다.");
                break;
        }
    }
}
