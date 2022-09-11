package aulas;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();

        //System.out.printf("Nome Inicial %s\n\n",myAccount.getName()); // Exibe o valor inicial do nome (null) 

        System.out.println("Entre Com seu Nome : ");
        String theName = input.nextLine(); 
        myAccount.setName(theName); // Define theName em myAccount
        System.out.println();

        System.out.printf("O Nome do Cliente É %s\n\n",myAccount.getName()); // exibe o nome armazenado no objeto myaccount
    
    
    }
}