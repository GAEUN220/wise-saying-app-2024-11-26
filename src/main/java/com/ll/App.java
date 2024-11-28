package com.ll;

import com.ll.domain.system.controller.SystenController.SystemController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private final SystemController systemController;

    public App(Scanner scanner) {
        this.scanner = scanner;
        this.systemController = new SystemController();
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.println("명령) ");
            String cmd = scanner.nextLine();

            if ("종료".equals(cmd)) {
                systemController.actionExit();
                break;
            } else if ("등록".equals(cmd)) {
                System.out.print("명언 : ");

                System.out.print("작가 : ");


            }
        }

    }
}
