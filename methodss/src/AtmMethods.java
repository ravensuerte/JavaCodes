import java.util.Scanner;
public class AtmMethods{
    static int balance = 5000;
    public static void Greetings(){
        Scanner sc = new Scanner(System.in);
        String name1;
        int account;
        String account1;
        String pin1 = "";
        String pinnum ="0000";
        System.out.println("===========================");
        System.out.println("Enter Your Account Name : ");
        name1 = sc.nextLine();
        System.out.println("");
        System.out.println("enter 6 Digit account number :");
        try{
            while((account1 =sc.next()).length() <=5){
                account = Integer.parseInt(account1);
                System.out.println("");
                System.out.println("your account is to short");
                System.out.println("enter 6 Digit account number :");
                System.out.print("NO:");
            }
        }catch(Exception e){
            System.out.println("Sorry Wrong Input Try again");
            
        }

        System.out.println("");
        System.out.print("enter your 4 Digit pin code :\nyour PIN CODE is '0000'\nPIN:");
        while(!pin1.equals(pinnum)) {
            try{
                pin1 = sc.next();
                if(pin1.equals(pinnum)){
                    break;
                }
                System.out.println("");
                System.out.println("you input wrong pin \ntry again:  ");
                System.out.println("enter 4 Digit pin code :\nyour pincode is '0000': ");
                System.out.print("PIN:");
            }catch(Exception e){
                System.out.println("you Input Invalid variable Try again");
                System.exit(0);
            }
        }
    }
    public static void WhatOperator(){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("");
        System.out.println("===========================");
        System.out.println("ATM machine");
        System.out.println("===========================");
        System.out.println("WELCOME TO ATM MACHINE");
        System.out.println("Type '1' to Withdraw");
        System.out.println("Type '2' to Deposit");
        System.out.println("Type '3' to Check Balance");
        System.out.println("Type '4' Fund Transfer");
        System.out.println("Type '5' to EXIT");
        System.out.println("Choose Operation you want to Use");
        try{
            System.out.print("Type The Number here:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    Withdraw();
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                    Balance();
                    break;
                case 4:
                    Transfer();
                    break;
                case 5 :
                    Ex();
                    break;
            }
        }catch(Exception e){
            System.out.println("you input a wrong Input");
            WhatOperator();
        }
    }
    public static int Withdraw(){
        Scanner sc = new Scanner(System.in);
        int withdraw ;
        String again;
        System.out.println("=================================");
        System.out.println("WITHDRAW");
        System.out.println("===============================");
        System.out.println("Your total Balance :"+ balance+" Pesos");
        System.out.println("=================================");
        System.out.println("");
        System.out.println("how much you want to withdraw?:");
        System.out.print("enter ammount Here:");
        try{
            withdraw = sc.nextInt();
            if(withdraw<=499&&withdraw>=balance){
            }
            else if(withdraw >=balance){
            }
            else{

            }

            while(withdraw <=499){
                withdraw = 0;
                System.out.println("");
                System.out.println("SORRY,  🙁");
                System.out.println("500 is the minimum to withdraw");
                break;
            }
            while(balance >= 1500 && withdraw >=0)
            {
                balance = balance-withdraw;
                if(balance>=1500 && withdraw >=499){
                    System.out.println("");
                    System.out.println("you withdraw Ammount of " + withdraw+ " Pesos");

                    System.out.println("");
                }else if(balance <= 1499){
                    System.out.println("Transaction Imcomplte");

                }
                break;

            }
            while(balance <=1499 ){
                balance = withdraw+balance;
                if(balance>=1500){

                }else if(balance <= 1499 && withdraw>=balance){

                    withdraw=0;
                    System.out.println("");
                    System.out.println("Transaction Imcomplte");

                }
                System.out.println("");
                System.out.println("SORRY "+" You Cannot Withdraw that ammount:");
                System.out.println("maintaining balance = 1,500:");
                break;
            }
            System.out.println("=================================");
            System.out.println("");
            System.out.println("total Remaining balance: " + balance+" Pesos");
            System.out.println("=================================");
            System.out.println("");
            System.out.println("");
            System.out.println("=================================");
            System.out.println("Try another transaction ? [y,n]");
        }catch(Exception e){
            System.out.println("Sorry Wrong Input Try again");
            System.exit(0);
        }
        while(true){
            again = sc.nextLine();
            if(again.equals("y")) {
                WhatOperator();
                break;
            }
            while(again.equals("n")){
                System.out.println("Thankyou Come again");
                System.exit(0);
            }
        }
        return 0;
    }
    static int Deposit(){
        String again;
        Scanner sc = new Scanner(System.in);
        int deposit;
        System.out.println("=================================");
        System.out.println(" DEPOSIT");
        System.out.println("===============================");
        System.out.println("Your total Balance :"+ balance+" Pesos");
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Enter money to be deposited:");
        try{
            deposit = sc.nextInt();
            while(deposit <=499){
                deposit = 0;
                System.out.println("");
                System.out.println("SORRY, 🙁");
                System.out.println("500 is the minimum to Deposit");
                break;
            }
            if(deposit<=499){
            }
            else if(deposit >= 500){
                balance = balance + deposit;
                System.out.println("");
                System.out.println("Your Money has been successfully deposited!");
                System.out.println("=================================");
                System.out.println("");
                System.out.println("You Deposited an Amount of "+deposit+" Pesos 🙂");
                System.out.println("");
                System.out.println("=================================");
                System.out.println("");
                System.out.println("Your Total Balance now is : " + balance+" Pesos");
                System.out.println("=================================");
            }
            else{

            }

            System.out.println("");
            System.out.println("=================================");
            System.out.println("Try another transaction ? [y,n]");
        }catch(Exception e){
            System.out.println("Sorry Wrong Input Try again");
            System.exit(0);
        }
        while(true){

            again = sc.nextLine();
            if(again.equals("y")) {
                WhatOperator();
                break;
            }
            while(again.equals("n")){
                System.out.println("come again");
                System.exit(0);
            }
        }
        return 0;
    }
    public static int Balance(){
        Scanner sc = new Scanner(System.in);
        String again;
        System.out.println("=================================");
        System.out.println(" BALANCE");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("Your total Balance : "+ balance+" Pesos");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("================================");
        System.out.println("Try another transaction ? [y,n]");
        while(true){
            again = sc.nextLine();
            if(again.equals("y")) {
                WhatOperator();
                break;
            }
            while(again.equals("n")){
                System.out.println("come again");
                System.exit(0);
            }
        }
        return 0;
    }
    public static int Transfer(){
        String again;
        int deposit1 =0;
        String name2="";
        int account2;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println(" TRANSFER FUNDS");
        System.out.println("===============================");
        System.out.println("Your total Balance :"+ balance+" Pesos");
        System.out.println("====================================");
        System.out.println("");
        System.out.println("who whould you like to transfer Funds To?");
        System.out.println("Enter His,Her account Name Here:");
        name2= sc1.nextLine();
        System.out.println("===========================");
        System.out.print("Now Enter his/her Acount Number Here :");
        account2 = sc.nextInt();
        System.out.println("===========================");
        System.out.println("Your total Balance :"+ balance+" Pesos");
        System.out.println("");
        System.out.println("how much Amount you want to Transfer?:");
        System.out.print("Enter Amount Here:");
        System.out.println("");
        try{
            deposit1 = sc.nextInt();

            while(balance >= 1500)
            {
                balance = balance-deposit1;
                if(balance>=1500){
                    System.out.println("");
                    System.out.println("Hello! .");
                    System.out.println("");
                    System.out.println("you have transfered a total ammount of "+deposit1+" Pesos: ");
                    System.out.println("To Account Name "+ name2);
                    System.out.println("Account NO: "+account2);
                }
                break;
            }
            while(balance <=1499 ){
                balance = deposit1+balance;
                if(balance<=1499 && deposit1>=balance){
                    deposit1 = 0;
                    System.out.println("transaction Incomplete");
                }
                System.out.println("");
                System.out.println("SORRY ! you cannot  transfer funds with that ammount:");
                System.out.println("maintaining balance = 1,500:");
                break;
            }
            System.out.println("");
            System.out.println("=================================");
            System.out.println("Your total Remaining Balance :"+ balance+" Pesos");
            System.out.println("");
            System.out.println("=================================");
        }catch(Exception e){
            System.out.println("Sorry Wrong Input Try again");
            System.exit(0);
        }
        System.out.println("Try another transaction ? [y,n]");
        while(true){
            again = sc.nextLine();
            if(again.equals("y")) {
                WhatOperator();
                break;
            }
            while(again.equals("n")){
                System.out.println(" Thank You Come Again");
                System.exit(0);
            }
        }
        return 0;
    }
    public static void Ex(){
        System.out.println("Thank you Come Again");
        System.exit(0);
    }
    public static void main(String args[] ){
        Greetings();
        WhatOperator();
    }
}