// Exam0230.java
// 주제 : 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;

class Exam0230 {

    public static void main(String[] args) {
        // 출력 명령문
            // - System.out.println(값);
        
        // 자바 정수값을 저장하는 메모리 기본 크기 : 4byte
        System.out.println(21_4748_3647);
        System.out.println(-21_4748_3648);

        //8byte 메모리를 사용하는 정수 리터럴
        System.out.println(21_4748_3648L); // 뒤에 l이나 L를 붙이도록 한다.
        System.out.println(-21_4748_3649L);

        System.out.println(1); // 4바이트 메모리를 사용하는 1
        System.out.println(1L); // 8바이트 메모리를 사용하는 1

        System.out.println(Integer.MAX_VALUE); // 4바이트 정수 최대값
        System.out.println(Integer.MIN_VALUE); // 4바이트 정수 최소값

        System.out.println(Long.MAX_VALUE); // 8바이트 정수 최대값
        System.out.println(Long.MIN_VALUE); // 8바이트 정수 최소값
    }
}