import java.util.Scanner;


public class ATM{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

     int choice=0,pin=0;
     long depositAmount,withdraw,transferAmount,balance=0000;
     int id=0;
     int trans=0;
     String trans_history="";
        System.out.println("Login Here");
        System.out.println("Enter your Id:");
        id=sc.nextInt();
        System.out.println("Enter your pin:");
         pin=sc.nextInt();
        if(id>100&&id<999&&pin>1000&&pin<9999)
        {
         
            System.out.println("login successfull");
            do{
                System.out.println("--------------ATM Services------------------");
                System.out.println("1.Transaction history");
                System.out.println("2.Deposit Amount");
                System.out.println("3.Withdraw amount");
                System.out.println("4.Transfer");
                System.out.println("5. Balance Check");
                System.out.println("6.exit");
                System.out.println("Enter your choice:");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
		     
                    if(trans==0)
                    {
                    System.out.println("Empty");
                    }
                    else 
                    {
   			System.out.println("-------------------------------------");
                        System.out.print("\n"+trans_history);
			System.out.println("\n");
                    }
                    break;
                    case 2:
                    System.out.println("Enter amount to Deposit:");
                    depositAmount=sc.nextLong();
                    balance=balance+depositAmount;
                    trans++;
                    System.out.println("Deposited successfully");
                    String str=depositAmount+" deposited.\n";
                    trans_history=trans_history.concat(str);
                    break;
                    case 3:
                    System.out.println("Enter the amount to withdraw:");
                    withdraw=sc.nextLong();
                    if(withdraw%100==0&&withdraw<balance)
                    {
                        balance=balance-withdraw;
                        System.out.println(" withdraw successfully.");
		 	trans++;
                    String str2=withdraw+" Withdrawen.\n";
                    trans_history=trans_history.concat(str2);
                    }
                    else 
                    {
                        System.out.println("Insufficient Balance.");
                    }
                    break;
                    case 4:
		    System.out.println("Enter recepient name:");
		    String name=sc.next();
                    System.out.println("Enter the amount to transfer:");
                    transferAmount=sc.nextLong();
                    if(transferAmount<balance)
                    {
                        balance=balance-transferAmount;
                        System.out.println(" Transferred successfully.");
			trans++;
                    String str1=transferAmount+" transfered.\n";
                    trans_history=trans_history.concat(str1);
                    }
                    else 
                     System.out.println("Can not transfer the amount.");
                     break;
                    case 5:
                    System.out.println("Your balance is "+balance);
                    break;
                }
              }
              while(choice!=6);
         
        }
        else
        {
            System.out.println("Please enter the correct ID and Pin.");
        }
       
       
    }
}