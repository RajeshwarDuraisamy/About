import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int num,count=1,num1=7,i=1;
        System.out.println("Input:");
        num=s.nextInt();
        while(count !=num){
           count++; 
           num1=(num1*2)+i;
           i++;
       }
        System.out.println("Output:"+num1);
       
    }
    
}
