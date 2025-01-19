import java.util.Scanner;

public class LoginCredentials {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        //  Username:
        while (true) 
        {
            try 
            {
                System.out.println("Enter your username:");
                String username = scan.nextLine();
                if (username.matches("[a-zA-Z]+")) 
                {
                    System.out.println("Valid Username :" + username);
                    System.out.println("Proceed to Next Step !!! ");
                    break;
                } 
                else 
                {
                    System.out.println("Invalid Username :" + username);
                    System.out.println("Please Enter a Valid Username !!! ");
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }

        //  Email:
        while (true) 
        {
            try 
            {
                System.out.println("Enter your E-mail id :");
                String email = scan.nextLine();
                if (email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) 
                {
                    System.out.println("Valid Email :" + email);
                    System.out.println("Proceed to Next Step !!! ");
                    break;
                } 
                else 
                {
                    System.out.println("Invalid Email :" + email);
                    System.out.println("Please Enter a Valid Email !!! ");
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }

        //  MobileNumber:
        while (true) 
        {
            try 
            {
                System.out.println("Enter your Mobile Number :");
                String mobile = scan.nextLine();
                if (mobile.matches("[0-9]{10}")) 
                {
                    System.out.println("Valid Mobile Number :" + mobile);
                    System.out.println("Proceed to Next Step !!! ");
                    break;
                } 
                else 
                {
                    System.out.println("Invalid Mobile Number :" + mobile);
                    System.out.println("Please Enter a Valid Mobile Number !!! ");
                }
            }
            catch (Exception e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        scan.close();
    }
}
