package com.example.lib;

import java.util.Scanner;

public class EnterpriseInsurance {
    Scanner scanner = new Scanner(System.in);
    String enterpriseName, employeeName;
    int sumInsured;

    public void Enterprise() {
        System.out.println("�A��ܤF���~����N�~�O�I\n�п�J���~�W��:");
        enterpriseName = scanner.next();
        System.out.println("�п�J���u�m�W:");
        employeeName=scanner.next();
        System.out.println("�п�J��O�B��:");
        try {
            sumInsured = Integer.parseInt(scanner.next());
        }
        catch (Exception e){
            System.out.println("�u���J���!");
            Enterprise();
        }
        System.out.println("���~�W��:"+enterpriseName+"\n���u�m�W:"+employeeName+"\n��O�B��:"+sumInsured+"��");
        }
}
