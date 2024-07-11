package javaTest;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===========고객 관리 프로그램 =============");
        System.out.println("===실행하고자 하는 기능의 버튼을 입력하세요===");
        System.out.println("===1. 고객 등록==========================");
        System.out.println("===2. 고객 조회==========================");
        System.out.println("===3. 고객 수정==========================");
        System.out.println("===4. 고객 삭제==========================");
        System.out.println("===0. 프로그램 종료=======================");

        int number = sc.nextInt();

        switch(number){
            case 1:
                System.out.println("고객등록을 실시합니다.");
                break;
            case 2:
                System.out.println("고객 조회를 실시합니다.");
                break;
            case 3:
                System.out.println("고객 정보를 수정합니다.");
                break;
            case 4:
                System.out.println("고객 정보를 삭제합니다.");
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                break;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다.");
                break;
        }

    }
}
