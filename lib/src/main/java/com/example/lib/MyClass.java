package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        int select=0;
        Scanner scanner = new Scanner(System.in);
        EnterpriseInsurance enterpriseInsurance=new EnterpriseInsurance();
        IndividualInsurance individualInsurance=new IndividualInsurance();
        while (true){
    System.out.println("請輸入要投企業團體意外保險或是個人意外保險(企業團體意外保險填1，個人意外保險填2):");
try {
    select = Integer.parseInt(scanner.next());
}
catch (Exception e){
    System.out.println("只能輸入1或2");
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
