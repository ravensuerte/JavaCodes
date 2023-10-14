
import java.util.Scanner;  
public class Atmmachine
{  
    public static void main(String args[] )  
    {  
        int balance = 5000, withdraw = 0, deposit=0,deposit1=0;  
        String name1;
        String name2="";
        String account1;
        int account;
        int account2;
        int choice; 
        String pin1 = "";
        String pinnum ="0000";
        String yes = "y";
        String no = "n";
        String again="";
        String st = "";
        String st1 = "";
        String st2 = "";
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);   
            System.out.println("===========================");
            System.out.println("Enter Your Account Name : ");
            name1 = sc.nextLine();
            System.out.println("");
            System.out.println("enter 6 Digit account number :");
            while((account1 =sc.next()).length() <=5){
            account = Integer.parseInt(account1);
            System.out.println("");
            System.out.println("your account is to short");
            System.out.println("enter 6 Digit account number :");
            System.out.print("NO:");
             }
            System.out.println("");
            System.out.print("enter your 4 Digit pin code :\nyour PIN CODE is '0000'\nPIN:");
            
            while(!pin1.equals(pinnum)) {
            pin1 = sc.next();
            if(pin1.equals(pinnum)){
                break;
            }
            System.out.println("");
            System.out.println("you input wrong pin \ntry again:  ");
            System.out.println("enter 4 Digit pin code :\nyour pincode is '0000': ");
            System.out.print("PIN:");
            
        
       }
        
        while(pin1.equals(pinnum)){
            
                
            while(true) 
                
        {   
          
            System.out.println("");
            System.out.println("===========================");
            System.out.println("ATM machine");
            System.out.println("===========================");
            System.out.println("Hello! "+name1);
            System.out.println("No."+ account1); 
            System.out.println("");
            System.out.println("WELCOME TO ATM MACHINE");
            System.out.println("Type '1' to Withdraw");  
            System.out.println("Type '2' to Deposit");  
            System.out.println("Type '3' to Check Balance"); 
            System.out.println("Type '4' Fund Transfer");
            System.out.println("Type '5' transaction History");
            System.out.println("Type '6' to EXIT");
            System.out.println("Choose Operation you want to Use");
            System.out.print("Type The Number here:");
            choice = sc.nextInt();
              
            switch(choice)  
            {  
                case 1:  
        System.out.println("=================================");
        System.out.println(" WITHDRAW");
        System.out.println("===============================");
        System.out.println("Hello! "+name1);
        System.out.println("No."+account1);    
        System.out.println("");
        System.out.println("Your total Balance :"+ balance+" Pesos");
        System.out.println("=================================");
        System.out.println("");
        System.out.println("how much you want to withdraw?:");
        System.out.print("enter ammount Here:");
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
            System.out.println("SORRY, "+account1 +" :(");
            System.out.println("500 is the minimum to withdraw");
            break;
        }

         while(balance >= 1500 && withdraw >=0)  
        {  
           balance = balance-withdraw;
           if(balance>=1500 && withdraw >=499){
               System.out.println("");
           System.out.println("you withdraw Ammount of " + withdraw+ " Pesos");
           st += "\nyou withdraw : "+withdraw;
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
               st += "\nyou withdraw : "+withdraw;
               withdraw=0;
           System.out.println("");    
           System.out.println("Transaction Imcomplte");   
               
           }
            System.out.println("");
            System.out.println("SORRY "+account1+" You Cannot Withdraw that ammount:");
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
        while(true){   
           again = sc.nextLine();
        if(again.equals(yes)) {  
            break;
        }
        while(again.equals(no)){
            System.out.println("Thankyou Come again"); 
            System.exit(0); 
        }
                    }
         break;
        
                case 2:
        System.out.println("=================================");
        System.out.println(" DEPOSIT");
        System.out.println("===============================");
        System.out.println("Hello! "+ name1);
        System.out.println("No. "+account1);    
        System.out.println("");
        System.out.println("Your total Balance :"+ balance+" Pesos");
        System.out.println("");  
        System.out.println("=================================");
        System.out.println("Enter money to be deposited:");     
        deposit = sc.nextInt();
        while(deposit <=499){
            deposit = 0;
            System.out.println("");
            System.out.println("SORRY, "+account1 +" :(");
            System.out.println("500 is the minimum to Deposit");
            break;
        }
        if(deposit<=499){
        }
        else if(deposit >= 500){
        st1 += "\nyou Deposited :"+deposit;
        balance = balance + deposit;  
        System.out.println("");
        System.out.println("Your Money has been successfully deposited!");
        System.out.println("=================================");
        System.out.println("");
        System.out.println("You Deposited an Amount of "+deposit+" Pesos :)");
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
         while(true){   
        
           again = sc.nextLine();
        if(again.equals(yes)) {  
            break;
        }
        while(again.equals(no)){
            System.out.println("come again"); 
            System.exit(0); 
        }
                    }
        break;  
        
   
                case 3: 
        System.out.println("=================================");
        System.out.println(" BALANCE");
        System.out.println("==============================="); 
        System.out.println("Hello ! "+name1);
        System.out.println("No. "+account1);    
        System.out.println("");
        System.out.println("Your total Balance : "+ balance+" Pesos");
        System.out.println("==========================");           
        System.out.println(""); 
        System.out.println("================================");
        System.out.println("Try another transaction ? [y,n]");
         while(true){   
           again = sc.nextLine();
        if(again.equals(yes)) {  
            break;
        }
        while(again.equals(no)){
            System.out.println("come again"); 
            System.exit(0); 
        }
                    }
        break;  
                case 4:  
        System.out.println("=================================");
        System.out.println(" TRANSFER FUNDS");
        System.out.println("===============================");
        System.out.println("Hello "+ name1);
        System.out.println("No. "+account1);    
        System.out.println("");
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
        deposit1 = sc.nextInt();  
        
        while(balance >= 1500)  
        {  
           balance = balance-deposit1;
           if(balance>=1500){
               System.out.println("");
               System.out.println("Hello! "+ name1 +".");
               System.out.println("");
               System.out.println("you have transfered a total ammount of "+deposit1+" Pesos: ");
               System.out.println("To Account Name "+ name2);
               System.out.println("Account NO: "+account2);
               st2 += "\nyou Transfer : "+deposit1;
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
            System.out.println("SORRY !"+account1+" you cannot  transfer funds with that ammount:");
            System.out.println("maintaining balance = 1,500:");
            break;
        }    
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Your total Remaining Balance :"+ balance+" Pesos");
        System.out.println("");
        System.out.println("=================================");
         System.out.println("Try another transaction ? [y,n]"); 
         while(true){   
           again = sc.nextLine();
        if(again.equals(yes)) {  
            break;
        }
        while(again.equals(no)){
            System.out.println(" Thank You Come Again"); 
            System.exit(0); 
        }
                    }
                 break; 
   
                 case 5: 
                     
                     
     while(true){ 
    
      System.out.println("=================================");
      System.out.println("Transaction History");   
      System.out.println("=================================");
      System.out.println("");    
      System.out.println("Hi !"+account1);   
      System.out.println("Here Is your transaction History");
     while(withdraw>=1){
        System.out.println("=================================");
        System.out.println("");
        System.out.println(" press '0' to see recent withdraw  history ");
        withdraw = sc.nextInt();
        System.out.println("=================================");
        break; 
       
        }
     
    System.out.println(""+st);
    
    while(withdraw!= 0){
        System.out.println("you enter wrong Number to see withdraw history");
            break;
        }
       
    
    while(deposit>=1){
        System.out.println("=================================");
        System.out.println("");
        System.out.println("press '0' to see Recent deposit history ");
        deposit = sc.nextInt();
        System.out.println("=================================");
        break; 
    }
    System.out.println(""+st1);
    while(deposit!= 0){
        System.out.println("you enter wrong number to see deposit history");
            break;
        }
    while(deposit1>=1){
        System.out.println("=================================");
        System.out.println("");
        System.out.println("press '0' to see Recent fund transfer history ");
        deposit1 = sc.nextInt();
        System.out.println("=================================");
        break; 
        
    }
    System.out.println(""+st2);
    while(deposit1!= 0){
        System.out.println(" you enter wrong Number to see fund tranfer History");
            break;
        }
    System.out.println("=================================");
    System.out.println("Try another transaction ? [y,n]");
    while(true){   
           again = sc.nextLine();
        if(again.equals(yes)) {  
            break;
        }
        while(again.equals(no)){
            System.out.println("Thank you Come Again"); 
            System.exit(0); 
        }
                    }
   break;

     }
     break;
   

                case 6 :
            System.out.println("Thank you Come Again");
            System.exit(0);
            }
            }    
                
            }  
            
        }
            
         
        }  
