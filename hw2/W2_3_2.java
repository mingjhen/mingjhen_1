/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author User
 */
public class W2_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Date date=new Date();
        int y, m, d;
        int i;
        while(true){
        do{
        System.out.print("年:");
        y = scanner.nextInt();
        y=date.year(y);
        if(y==-1)
            System.out.println("輸入不合法");
        }while(y==-1);
        do{
        System.out.print("月:");
        m = scanner.nextInt();
        m=date.month(m);
        if(m==-1)
            System.out.println("輸入不合法");
        }while(m==-1);
        do{
        System.out.print("日:");
        d = scanner.nextInt();
        d=date.day(d);
        if(d==-1)
            System.out.println("輸入不合法");
        }while(d==-1);
        System.out.printf("%04d %02d %02d",y,m,d);
        System.out.println();
        }
    }

}
