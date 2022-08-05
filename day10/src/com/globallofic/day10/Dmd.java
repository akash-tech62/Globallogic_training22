package com.globallofic.day10;
import java.util.*;

class Dmd{
    public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       
        float n = sc.nextFloat();
        float f = sc.nextFloat();
        
        if(n%5==0 && f>=n+0.5f)
        {	float q = f-n-0.5f;
            System.out.printf("%.2f",q);
        }
        else{
            System.out.println(f);
        }
        
    }
}

