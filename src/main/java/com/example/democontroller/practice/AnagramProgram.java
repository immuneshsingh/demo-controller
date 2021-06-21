package com.example.democontroller.practice;


import java.util.Arrays;


public class AnagramProgram {

    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);
        String s1= "AMAN";         //sc.nextLine(); // s1=AMAN
        String s2= "NaaM";         //sc.nextLine(); // s2=MAAN

        char c1[]=s1.toLowerCase().toCharArray(); //c1= { 'a', 'm', 'a', 'n' }
        char c2[]=s2.toLowerCase().toCharArray(); //c2 ={ 'm', 'a', 'a', 'n' }



        Arrays.sort(c1);           // c1 ={ 'a', 'a', 'm', 'n' }
        Arrays.sort(c2);            //c2 ={ 'a', 'a', 'm', 'n' }

        boolean b= Arrays.equals(c1,c2);

        System.out.println(c1);
        System.out.println(c2);

        if(b){
            System.out.println("anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }
}