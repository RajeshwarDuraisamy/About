import java.util.*;

public class Main_1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    
        Scanner s= new Scanner (System.in);
      
        String str;
    
        char arr[]=new char[3];
        
        char[] a1;
        a1 = new char[] {'A','B','C'};
        
        char[] a2;
        a2 = new char[] {'D','E','F'};
        
        char[] a3;
        a3 = new char[] {'G','H','I'};
        
        char[] a4;
        a4 = new char[] {'J','K','L'};
        
        char[] a5;
        a5 = new char[] {'M','N','O'};
        
        char[] a6;
        a6 = new char[] {'P','Q','R','S'};
        
        char[] a7;
        a7 = new char[] {'T','U','V'};
        
        char[] a8;
        a8 = new char[] {'W','X','Y','Z'};
        
        str=s.next();
    
        arr=str.toCharArray();
        for(int k=0;k<arr.length;k++){
            if((arr[k]=='A')||(arr[k]=='B')||(arr[k]=='C')){
                
            for(int j=0;j<a1.length;j++){
            if(arr[k] == a1[j]){
               if(j==0){
                    System.out.print(" "+2);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+2);
                temp--;
               }while(temp >0);
                         }
                                }                 
                                       }                              
                                              }
                             
             else if((arr[k]=='D')||(arr[k]=='E')||(arr[k]=='F')){
                
            for(int j=0;j<a2.length;j++){
            if(arr[k] == a2[j]){
               if(j==0){
                    System.out.print(" "+3);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+3);
                temp--;
               }while(temp >0);
                         }
                               }
                                       }      
                                                  }
          
            else if((arr[k]=='G')||(arr[k]=='H')||(arr[k]=='I')){
                
            for(int j=0;j<a3.length;j++){
            if(arr[k] == a3[j]){
               if(j==0){
                    System.out.print(" "+4);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+4);
                temp--;
               }while(temp >0);
                        }
                                }
                                          }      
                                                  }
            
            else if((arr[k]=='J')||(arr[k]=='K')||(arr[k]=='L')){
                
            for(int j=0;j<a4.length;j++){
            if(arr[k] == a4[j]){
               if(j==0){
                    System.out.print(" "+5);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+5);
                temp--;
               }while(temp >0);
                         }
                                }
                                        }      
                                              }
            else if((arr[k]=='M')||(arr[k]=='N')||(arr[k]=='O')){
                
            for(int j=0;j<a5.length;j++){
            if(arr[k] == a5[j]){
               if(j==0){
                    System.out.print(" "+6);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+6);
                temp--;
               }while(temp >0);
                         }
                                }
                                        }      
                                              }
            else if((arr[k]=='P')||(arr[k]=='Q')||(arr[k]=='R')||(arr[k]=='S')){
                
            for(int j=0;j<a6.length;j++){
            if(arr[k] == a6[j]){
               if(j==0){
                    System.out.print(" "+7);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+7);
                temp--;
               }while(temp >0);
                         }
                                }
                                        }      
                                              }
            else if((arr[k]=='T')||(arr[k]=='U')||(arr[k]=='V')){
                
            for(int j=0;j<a7.length;j++){
            if(arr[k] == a7[j]){
               if(j==0){
                    System.out.print(" "+8);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+8);
                temp--;
               }while(temp >0);
                         }
                                }
                                        }      
                                              }               
        else if((arr[k]=='W')||(arr[k]=='X')||(arr[k]=='Y')||(arr[k]=='Z')){
                
            for(int j=0;j<a8.length;j++){
            if(arr[k] == a8[j]){
               if(j==0){
                    System.out.print(" "+9);
                }
               if(j != 0){
                    int temp=j+1;
            do{
                System.out.print(" "+9);
                temp--;
               }while(temp >0);
                         }
                                }
                                        }      
                                              }    
        }
        System.out.println("\n");
        }
    }
        
        
       
            
    
    
    

