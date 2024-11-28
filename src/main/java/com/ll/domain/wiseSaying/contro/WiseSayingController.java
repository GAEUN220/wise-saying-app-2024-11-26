package com.ll.domain.wiseSaying.contro;

import java.util.Scanner;

public class WiseSayingController {
    private final Scanner scanner;
    public WiseSayingController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void actionAdd() {
        System.out.print("명언 : ");
        System.out.print("작가 : ");

        System.out.print("1번 명언이 등록되었습니다.");
    }

}
