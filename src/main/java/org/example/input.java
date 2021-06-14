/*
 *  UCF COP3330 Summer 2021 Assignment 27 Solution
 *  Copyright 2021 RAYME PERSAD
 */

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.
 */



package org.example;
import java.util.Scanner;
import java.util.regex.Pattern;

public class input {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        while(true){

            //entering name
            System.out.print("Enter your first and last name:");
            String fname=sc.next();
            String lname=sc.next();

            //check loop for name and numbers
            if(fname.length()>2){
                if(lname.length()>2){
                    if(Pattern.compile( "[0-9]" ).matcher( fname ).find() || Pattern.compile( "[0-9]" ).matcher( lname ).find()){
                        System.out.println("Enter your first and last name and cannot contain digits");
                    }else{
                        System.out.println("Met name requirements!");
                        break;

                    }

                }

                else{
                    System.out.println("Enter a last name with more than 2 letters!");
                }
            }
            else{
                System.out.println("Enter a first name with more than 2 letters!");
            }

        }

    }

}

