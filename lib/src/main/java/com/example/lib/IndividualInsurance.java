package com.example.lib;

import java.util.Scanner;

public class IndividualInsurance {
    String  individualName, individualPhone;
    int sumInsured;
    Scanner scanner=new Scanner(System.in);
    public void Individual(){
        System.out.println("�A��ܤF�ӤH�N�~�O�I\n�п�J�ӤH�m�W:");
        individualName = scanner.next();
        System.out.println("�п�J�ӤH�q��:");
       individualPhone=scanner.next();
        System.out.println("�п�J��O�B��:");
        try {
            sumInsured = Integer.parseInt(scanner.next());
        }
        catch (Exception e){
            System.out.println("�u���J���!");
           Individual();
        }
        System.out.println("�ӤH�m�W:"+individualName+"\n�ӤH�q��:"+individualPhone+"\n��O�B��:"+sumInsured+"��");
    }
}
