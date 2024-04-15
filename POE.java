/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

/**
 *
 * @author Admin
 */import java.util.Scanner;

public class POE{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Username, Password, FirstName, LastName;

        System.out.println("Welcome to Account Login");
        System.out.println("Please enter your details below:");
// user can enter their details here
        System.out.print("Username: ");
        Username = scanner.nextLine();

        System.out.print("Password: ");
        Password = scanner.nextLine();

        System.out.print("FirstName: ");
        FirstName = scanner.nextLine();

        System.out.print("LastName: ");
        LastName = scanner.nextLine();

        System.out.println("\nAccount created successfully!");
        System.out.println("Username: " + Username);
        System.out.println("Password: " + Password);
        System.out.println("FirstName: " + FirstName);
        System.out.println("LastName: " + LastName);
//username should have underscore and be no more than 5 characters
        if (Username.contains("_") && Username.length() <= 5) {
            System.out.println("Username successfully Captured ");
        } else {
            System.out.println("Username is not entered correctly, Username must have an underscore and not be more than 5 characters");
        }   
//password should be uppercase, have numbers , be around 8 character or more and have special characters+
        if (Password.length() >= 8 && containsUppercase(Password) && containsNumbers(Password) && containsSpecialCharacters(Password)) {
            System.out.println("Password successfully Captured");
        } else {
            System.out.println("Password is not entered correctly, Password must have 8 characters, capital letter, Number, and Special character");
        }

        System.out.println("Enter Username to Login");
        String LoginUsername = scanner.nextLine();
        System.out.println("Enter Password to Login");
        String LoginPassword = scanner.nextLine();

        if (LoginUsername.equals(Username) && LoginPassword.equals(Password)) {
            System.out.println("Welcome Back " + FirstName + " " + LastName + "! Long time no see");
        } else {
            System.out.println("Username Or Password is not correct, Retry Login");
        }

        scanner.close();
    }

    private static boolean containsNumbers(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacters(String password) {
        String specialCharacter = "!@#$%^&*()-+";
        for (char c : password.toCharArray()) {
            if (specialCharacter.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}

