
import java.util.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class atmMachinee {
    static Date date = new Date();
    static List<String> hist =  new ArrayList<String>();
    static int pinCode, userPin = 6996, OtherUsers = 1234, Usernom, counter =0, newPIN;
    static double UserBalance = 5000.00, maintainingBalance = 1500.00,depositAmount, WithdrawAmount, TransferAmount;
    static String Sure = "", History, HistoryAction, Name;
    static Scanner s = new Scanner(System.in),g = new Scanner(System.in);
    public static void main(String[] args) {
        greeting();
    }
    public static void greeting() {
        System.out.println("╒════════════════════════════════╕"+"\n"+"| WELCOME TO HANSONG BANK SYSTEM |"+ "\n" + "╘════════════════════════════════╛" + "\n" + "=> Enter your Pin");
        pinCode = s.nextInt();
        if (pinCode == userPin || pinCode == OtherUsers) {
            transaction();
        }else {
            System.out.println("Invalid PIN Code" + "\n" + "Do you want to change your PIN? Y/N");
                Sure = g.nextLine();
                switch(Sure) {
                    case "y":
                    ChangePin();
                    break;
                    case "n":
                        greeting();
                    break;
                    default:
                    System.out.println("Invalid Choice Try Again");
                    break;
                }
        }
    }
    public static void ChangePin(){
        while(1 > 0){
            System.out.println("\n"+"Confirmation Message Sent to 0975***7*00" + "\n" +"Enter Confirmation Code Sent to your phone");
            Usernom = s.nextInt();
            if(Usernom == 2304){
                System.out.println("Enter Your new PIN");
                newPIN = s.nextInt();
                userPin = newPIN;
                greeting();
            }else
                System.out.println("Invalid Confirmation Code");
        }
    }
    public static void transaction(){
        System.out.printf("\n" +"===WELCOME TO HANSONG ATM SYSTEM==="+ "\n" +"       Enter Your Choice 1-4:"
                    + "\n" + "1. Deposit"
                    + "\n" + "2. Withdraw"
                    + "\n" + "3. Check Balance"
                    + "\n" + "4. Transfer Funds"
                    + "\n" + "5. Check History"
                    + "\n" + "6. Exit");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    Deposit();
                    break;
                case 2:
                    WithDraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    TransferFunds();
                    break;
                case 5:
                    History();
                    break;
                case 6:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Choice Please Try again");
                    transaction();
                    break;
            }
    }
    public static void Deposit() {
        System.out.println("\n"+"=====Deposit======" + "\n" + "Enter Amount:   ");
        depositAmount = s.nextDouble();
        System.out.println("=> About to Deposit $" + depositAmount + " Confirm? Y/N");
        Sure = g.nextLine();
        if(depositAmount >= 500){
        switch (Sure) {
            case "y":
                System.out.printf("%-10S %10s\n", "DEPOSIT", "AMOUNT");
                System.out.printf("%-10S %10s\n","Savings", depositAmount);
                History = "Deposited $" + depositAmount;

                break;
            case "n":
                System.out.println("Cancelled Deposit");
                History = "Cancelled Deposit";
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
        HistoryAction = "You have " + History +"==>  "+ date;
        UserBalance = UserBalance + depositAmount;
        hist.add(HistoryAction);
    }else
        System.out.println("Sorry the Minimum Deposit is 500");
        looper();
    }
    public static void WithDraw() {
        System.out.println("\n"+"=======Withdrawal========" + "\n" +"(Please note that the minimum limit is 500.00 Pesos)");
        System.out.println("Enter Withdrawal Amount: ");
        WithdrawAmount = s.nextDouble();
        if (WithdrawAmount >= 500) {
            System.out.println("About to withdraw $" + WithdrawAmount + " Confirm? Y/N");
            Sure = g.nextLine();
            switch (Sure) {
                case "y":  
                    if (WithdrawAmount <= UserBalance - maintainingBalance && WithdrawAmount >= 500){
                        System.out.printf("%-10S %10S\n", "WITHDRAW STATUS", "AMOUNT");
                        System.out.printf("%10S %15S\n","Successful", WithdrawAmount);
                         UserBalance = UserBalance - WithdrawAmount;
                         History = "Withdrawed $" + WithdrawAmount;
                    }else
                     System.out.println("\n"+"Apologies, Withdrawal Unsuccessful insufficient balance");
                    break;
                case "n":
                    System.out.println("Cancelled Withdrawal");
                    History = "Cancelled Withdrawal";
                    break;
            }
            HistoryAction = "You have " + History +"==> "+ date;
            hist.add(HistoryAction);
        } else
            System.out.println("\n"+"You can not withdraw an amount less than $500.00!");

            looper();
    }
    public static void checkBalance() {
        System.out.println("\n"+"========Check Balance========");
        System.out.printf("%-10S  %10S\n" , "Balance","Maintaining Balance");
        System.out.printf("%-10S %6S\n" , UserBalance, "$" + maintainingBalance);
        looper();
    }
    public static void TransferFunds() {
        System.out.println("\n"+"=========Transfer Funds========");
        System.out.println("Enter Account name of the person you want to transfer your funds to:");
        Name = g.nextLine();
        System.out.println("Enter Account number:");
        Usernom = s.nextInt();
        if (Usernom == OtherUsers) {
            System.out.println("Enter Amount to transfer:");
            TransferAmount = s.nextDouble();
            System.out.println("About to transfer $" + TransferAmount + " to " + Name + "\n" + "Confirm? Y/N");
            Sure = g.nextLine();
            switch (Sure) {
                case "y":
                if (TransferAmount < UserBalance - maintainingBalance) {
                    System.out.printf("%-10S %S %10S\n ","STATUS" ,"AMOUNT","TRANSFERRED TO");
                    System.out.printf("%-12S %S %10S\n  ","Success", TransferAmount, Name);
                    History = "Transferred funds to " + Name;
                    UserBalance = UserBalance - TransferAmount;
                }else
                    System.out.println("Cannot Transfer insufficient funds");
                    break;
                case "n":
                    System.out.println("Cancelled Transfer ");
                    History = "Cancelled a transfer";
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
                }
            HistoryAction = "You have " + History +"==>"+ date;
            hist.add(HistoryAction);
            looper();
        }else if(Usernom != OtherUsers){
            System.out.println("Incorrect Account Number");
            TransferFunds();
        }
    }  
    public static void History() {
        System.out.println("\n"+"=======Your History========" + "\n");
        hist.stream().forEach(System.out::println);
        looper();
    }
    public static void looper(){
        System.out.println("\n"+"=> Do you want to make another transaction? Y/N");
        Sure = g.nextLine();
        if(Sure.equalsIgnoreCase("y")){
            transaction();
        }else
            exit();
    }  
    public static void exit() {
    System.out.println("\n"+"See you again next time user!" + "\n"+"=> Press ENTER To Make Another Transaction");
    Sure = g.nextLine();
    if(Sure == ""){
       greeting();
    }
 }
}