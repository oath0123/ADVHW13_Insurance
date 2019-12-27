package com.example.lib;

import java.util.Scanner;

public class EnterpriseInsurance {
    Scanner scanner = new Scanner(System.in);
    String enterpriseName, employeeName;
    int sumInsured;

    public void Enterprise() {
        System.out.println("你選擇了企業團體意外保險\n請輸入企業名稱:");
        enterpriseName = scanner.next();
        System.out.println("請輸入員工姓名:");
        employeeName=scanner.next();
        System.out.println("請輸入投保額度:");
        try {
            sumInsured = Integer.parseInt(scanner.next());
        }
        catch (Exception e){
            System.out.println("只能輸入整數!");
            Enterprise();
        }
        System.out.println("企業名稱:"+enterpriseName+"\n員工姓名:"+employeeName+"\n投保額度:"+sumInsured+"元");
        }
}
