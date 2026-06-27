import java.util.*;
public class NumberFrenchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        int num = sc .nextInt();
        // Spy number check
        int sum = 0;
        int product = 1;
       
        while (num > 0) {
            int lastDigit = num % 10;
            
            sum += lastDigit;
            product *= lastDigit;
            
            num /= 10;
        }
//Neon number check
        int neon = num *num; 
        int last = 0;
        while(neon>0){}
        int lastDigit = neon % 10;
        last+= lastDigit;
        neon /= 10;
        int neonSum = last;
 
   // Automorphic Number Check
long square = (long) num * num;

int temp =num;
long divisor = 1;

while (temp > 0) {
    divisor *= 10;
    temp /= 10;
}

        if (square % divisor == num) {
            System.out.println("The number is an Automorphic Number.");
        } else {
            System.out.println("The number is not an Automorphic Number.");
        }

        
        if (sum == product) {
            System.out.println("The number is a spy number.");
        } else {
            System.out.println("The number is not a spy number.");
        }
        if (neonSum == num) {
            System.out.println("The number is a neon number.");
        } else {
            System.out.println("The number is not a neon number.");
            
        }

         
    }
    
}
