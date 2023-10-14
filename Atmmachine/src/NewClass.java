
    import java.util.Scanner;  
     
    public class NewClass  
    {   
        public static void main(String args[] )  
        {   
            int balance = 5000, withdraw, deposit,transfer=0;  
            String name ,name1; 
            String mypincode = "246810";
            String pin="";
            String accnum="";
            String accnum2;
            String condition;
            Scanner sc = new Scanner(System.in);  
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Your Account Name : ");
            
            name = sc.nextLine();
            System.out.println("");
            System.out.println("enter your account number :");
            accnum = sc.nextLine();
            
            System.out.print("enter your  pin code :'246810'");
            System.out.print("entter pin number here:");
            while(!pin.equals(mypincode)) {
            pin = sc.next();
            if(pin.equals(mypincode)){
                break;
            }
            System.out.println("");
            System.out.println("you input wrong pin \ntry again:  ");
           
            
        
       }
            
            
              
            while(true)  
            {  
                System.out.println("ATM Machine\n");  
                System.out.println("Choose 1 for Withdraw");  
                System.out.println("Choose 2 for Deposit");  
                System.out.println("Choose 3 for Check Balance");  
                System.out.println("Choose 4 for EXIT"); 
                System.out.println("Choose 5 for Fund transfer ");
                System.out.print("Choose the operation:");  
                  
                
                
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
        System.out.println("how much you want to withdraw?:");
        System.out.print("enter ammount Here:");
        withdraw = sc.nextInt();  
        
        
        while(withdraw <=499){
            withdraw = 0;
            System.out.println("");
            System.out.println("500 is the minimum to withdraw");
            break;
        }
 
         while(balance >= 1500 && withdraw >=0)  
        {  
           balance = balance-withdraw;
           if(balance>=1500 && withdraw >=499){
           System.out.println("");
           System.out.println("you withdraw Get your money");
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
           System.out.println("Sorry You Cannot Withdraw that ammount:");
           System.out.println("maintaining balance = 1,500:");
 
           }            
            break;
          }
          
            System.out.print("DO you want to try another transaction? y,n ");
                     while(true) {
                         condition = sc.nextLine();
                        if (condition.equals("y")){
                        break;
                    }
                        else if (condition.equals("n")){
                        System.exit(0);
                        }
        }
          break;
                    case 2:  
                          
            System.out.print("Enter money to be deposited:");  
            deposit = sc.nextInt();   
            System.out.println(""); 
             while(deposit <=499){
            deposit = 0;
            System.out.println("");
            System.out.println("500 is the minimum to Deposit");
            if(deposit>=500){
               balance = balance + deposit;  
            System.out.println("Your Money has dopsited"); 
            }
            break;
             }
            System.out.print("DO you want to try another transaction? y,n ");
            while(true) {
                         condition = sc.nextLine();
                        if (condition.equals("y")){
                        break;
                    }
                        else if (condition.equals("n")){
                        System.exit(0);
                        }
        }
            break;  
       
                    case 3:   
            System.out.println("Balance : "+balance);  
            System.out.println("");  
            
            System.out.print("DO you want to try another transaction? y,n ");
            while(true) {
                         condition = sc.nextLine();
                        if (condition.equals("y")){
                        break;
                    }
                        else if (condition.equals("n")){
                        System.exit(0);
                        }
        }
            break;  
       
                    case 4:   
            System.exit(0);  
                    case 5:
           System.out.print("Hi! "+ name);
           System.out.print("");   
           System.out.print("transfer funds to?");
           System.out.print("Enter account name");
           name1 = sc1.nextLine();
           System.out.print("transfer funds to?");
           System.out.print("Enter account pin");
           name1 = sc1.nextLine();
             
            while(balance >=1500 && transfer >=0 ){
           System.out.print("Enter money to be transfer:");   
            transfer = sc.nextInt();
            balance = balance-transfer; 
            if(balance>=1500){
               System.out.println("you transfer money"); 
           }else if(balance <= 1499 && transfer>=balance){
           System.out.println("sorry insuficient ammount is to big:");
           }            
            break;
          }
            while(balance<=1499){
                balance=transfer+balance;
                System.out.println("maintaining balance = 1,500:");
                break;
            }
       
          
            System.out.println(""); 
            System.out.println("your total balance"+ balance); 
            
             System.out.print("DO you want to try another transaction? y,n ");
            while(true) {
                         condition = sc.nextLine();
                        if (condition.equals("y")){
                        break;
                    }
                        else if (condition.equals("n")){
                        System.exit(0);
                        }
        }
            break;  
                    
                }  
            }  
        }  
    }  