package com.example.lib;

import java.util.Scanner;

public class IndividualInsurance {
    String  individualName, individualPhone;
    int sumInsured;
    Scanner scanner=new Scanner(System.in);
    public void Individual(){
        System.out.println("你選擇了個人意外保險\n請輸入個人姓名:");
        individualName = scanner.next();
        System.out.println("請輸入個人電話:");
       individualPhone=scanner.next();
        System.out.println("請輸入投保額度:");
        try {
            sumInsured = Integer.parseInt(scanner.next());
        }
        catch (Exception e){
            System.out.println("只能輸入整數!");
           Individual();
        }
        System.out.println("個人姓名:"+individualName+"\n個人電話:"+individualPhone+"\n投保額度:"+sumInsured+"元");
    }
}
