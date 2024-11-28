package com.ll.domain.wiseSaying.contro;

import java.util.Scanner;

public class WiseSayingController {
    private final Scanner scanner;
    private int lastID;

    public WiseSayingController(Scanner scanner) {
        this.scanner = scanner;
        this.lastID = 0;
    }

    public void actionAdd() {
        System.out.print("명언 : ");
        System.out.print("작가 : ");

        int id = ++lastID;

        System.out.print(id +"번 명언이 등록되었습니다.");


    }

}
