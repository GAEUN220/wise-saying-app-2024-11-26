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

    public void actionList() {

        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        System.out.println("2 / 작자미상 / 과거에 집착하지 마라.");
        System.out.println("1 / 작자미상 / 현재를 사랑하라.");

    }
}
