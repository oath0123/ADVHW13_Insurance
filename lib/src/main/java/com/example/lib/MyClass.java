package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        int select=0;
        Scanner scanner = new Scanner(System.in);
        EnterpriseInsurance enterpriseInsurance=new EnterpriseInsurance();
        IndividualInsurance individualInsurance=new IndividualInsurance();
        while (true){
    System.out.println("�п�J�n����~����N�~�O�I�άO�ӤH�N�~�O�I(���~����N�~�O�I��1�A�ӤH�N�~�O�I��2):");
try {
    select = Integer.parseInt(scanner.next());
}
catch (Exception e){
    System.out.println("�u���J1��2");
}

    switch (select){
        case 1:
            enterpriseInsurance.Enterprise();
            break;
        case 2:
            individualInsurance.Individual();
            break;
    }

    }
}
}
