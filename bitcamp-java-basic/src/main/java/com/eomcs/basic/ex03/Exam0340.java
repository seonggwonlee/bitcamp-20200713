// 주제 : 메모리 크기에 다른 부동소수점의 크기

package com.eomcs.basic.ex03;

class Exam0340 {

    public static void main(String[] args) {
        // 4바이트 메모리에 부동소수점 저장하기(뒤에 f나 F를 붙인다.)
        System.out.println(999.9999f);
        System.out.println(999999.9f);
        System.out.println(999.9999f);

        System.out.println(999.99994f);
        System.out.println(9999999.4f);
        System.out.println(9.9999994f);

        // 메모리 크기를 넘는 값은 반올림 처리되어 저장된다.
        // 4바이트 메모리는 최대 7자리 부동소수점을 저장할 수 있다.
        // 초과하는 경우 반올림 처리되거나 짤린다.
        System.out.println(987654321.1234567f);
        System.out.println(9876543211234567.f);
        System.out.println(9.876543211234567f);

        // 8바이트 메모리에 부동소수점 저장하기 (F를 적지 않으면 기본이 8바이트)
        System.out.println(987654321.1234567);
        System.out.println(987654321123456.7);
        System.out.println(9.876543211234567);

        // 8바이트 메모리에는 최대 16자리의 부동소수점을 저장할 수 있다. 초과시 반올림 처리되거나 짤린다.
        System.out.println(987654321.12345678);
        System.out.println(9876543211234567.8);
        System.out.println(9.8765432112345678);

        // 유효자릿수
        // - 소수점을 제외한 숫자의 개수

        // 4바이트 메모리에는 최대 7자리까지 저장 가능
        // 8바이트 메모리에는 최대 16자리까지저 저장 가능
        // 초과하는 수는 반올림 처리되거나 잘린다.
        // 유효자릿수라 하더라도 100% 정확하지는 않다. --> IEEE 754 규격에 따라 2진수로 전환할 때 일부 값은 완전하게 변환되지 않는 경우도 있다.

        // 부동소수점의 일부는 정확하게 2진수로 변환할 수 없다.
        System.out.println(7 * 0.1); // 예상값 0.7 / 실제값 : 0.7000000000000001 <-- IEEE 754 규격으로 인해
    }
}