package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        com.company.Main leer = new com.company.Main();
        leer.getdoc();
        com.company.Main crea = new com.company.Main();
        crea.crear();


    }


    public void getdoc() {

        try {

            File doc = new File("C:\\Users\\wade079\\Desktop\\Classifica ip\\ip\\ips.txt");
            Scanner obj;
            obj = new Scanner(doc);

            while (obj.hasNext()) {
                String bf = obj.next();
                String[] addrArray = bf.split("\\.");
                long ipDecimal = 0;
                for (int i = 0; i < addrArray.length; i++) {

                    long power = 3 - i;
                    ipDecimal += ((Integer.parseInt(addrArray[i]) % 256 * Math.pow(256, power)));
                }
                ipDecimal = ipDecimal / 10;

                int an = 16777216;
                int a = 214748364;
                int bn = 214748364;
                int b = 322122547;
                int cn = 322122547;
                int c = 375809638;
                int dn = 375809638;
                int d = 402653183;
                int en = 402653184;
                int e = 429496729;

                if (ipDecimal > an && ipDecimal < a) {
                    System.out.print(bf);
                    System.out.println(" es del tipo A");
                    FileWriter myWriter = new FileWriter("C:\\Users\\wade079\\Desktop\\Classifica ip\\ip\\ips_privados.txt");
                    myWriter.write(bf);
                    myWriter.write("\n");
                    myWriter.close();
                }
                if (ipDecimal > bn && ipDecimal < b) {
                    System.out.print(bf);
                    System.out.println(" es del tipo B");
                    FileWriter myWriter = new FileWriter("C:\\Users\\wade079\\Desktop\\Classifica ip\\ip\\ips_privados.txt");
                    myWriter.write(bf);
                    myWriter.write("\n");
                    myWriter.close();
                }
                if (ipDecimal > cn && ipDecimal < c) {
                    System.out.print(bf);
                    System.out.println(" es del tipo C");
                    FileWriter myWriter = new FileWriter("C:\\Users\\wade079\\Desktop\\Classifica ip\\ip\\ips_privados.txt");
                    myWriter.write(bf);
                    myWriter.write("\n");
                    myWriter.close();
                }
                if (ipDecimal > dn && ipDecimal < d) {
                    System.out.print(bf);
                    System.out.println(" es del tipo D");
                    FileWriter myWriter = new FileWriter("C:\\Users\\wade079\\Desktop\\Classifica ip\\ip\\ips_privados.txt");
                    myWriter.write(bf);
                    myWriter.write("\n");
                    myWriter.close();
                }
                if (ipDecimal > en && ipDecimal < e) {
                    System.out.print(bf);
                    System.out.println(" es del tipo E");
                    FileWriter myWriter = new FileWriter("C:\\Users\\wade079\\Desktop\\Classifica ip\\ip\\ips_privados.txt");
                    myWriter.write(bf);
                    myWriter.write("\n");
                    myWriter.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void crear() {
        try {
            File myObj = new File("C:\\Users\\wade079\\Desktop\\Classifica ip\\ip\\ips_privados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }




}
