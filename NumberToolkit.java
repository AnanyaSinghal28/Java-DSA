import java.util.*;
public class NumberToolkit {
    // Show Menu
    public static void showMenu(){
        System.out.println("============================");
        System.out.println("Java Number Toolkit");
        System.out.println("============================");
        System.out.println("1. Reverse Number");
        System.out.println("2. Palindrome Number");
        System.out.println("3. Armstrong Number");
        System.out.println("4. Count Digits");
        System.out.println("5. Sum of Digits");
        System.out.println("6.Fibonacci Series");
        System.out.println("7. Prime Number ");
        System.out.println("8. Factorial");
        System.out.println("9. Strong Number");
        System.out.println("10. Exit");

        System.out.println("Enter your choice:");
     }
// Reverse Number
     public static int reverseNumber(int n){
        int rev = 0;
     while(n>0){
        int digit = n%10;
        rev = rev * 10 + digit;
        n = n/10;
     }
     return rev;
     }

     // Palindrome Number
     public static boolean isPalindrome(int n){
     int rev = reverseNumber(n);
     return n == rev;
     }

     // Count digits
     public static int countDigits(int n){
        int count = 0;
        while(n>0){
        n = n/10;
        count++;
        }
        return count;
     }

     // Armstrong Number 
     public static boolean isArmstrong(int n){
        int original = n;
        int count = countDigits(n);
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum += (int)Math.pow(digit, count);
            n = n/10;
        }
        return original == sum;
        }

        // Sum of digits
        public static int calculateSum(int[] array){
            int sum = 0;
            for(int i = 0; i<array.length; i++){
                sum += array[i];
            }
        return sum;
        }

        // Fibonacci Series
        public static void fibonacciSeries(int n){
            int first = 0;
            int second = 1;
            for(int i=0; i<=n; i++){
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
                
            }
        }

        // Prime Number
        public static boolean isPrime(int n){
            int count = 0;
            if(n==1){
                return false;
             }
            for(int i=2; i<n; i++){
                if(n%i == 0){
                count++;
                }
            }
             return count == 0;
        }

        // Factorial 
        public static int calculateFactorial(int n){
            int fact = 1;
            for(int i = 1; i<=n; i++){
                fact = fact*i; 
            }
            return fact;
        }

        // Strong Number 
        public static boolean isStrong(int n){
            int original = n;
            int sum = 0;
            while(n>0){
                int digit = n%10;
                int fact = calculateFactorial(digit);
                sum += fact;
                n = n/10;
            }
            if(sum == original){
                return true;
            }
            else{
                return false;
            }
        }


     // Main
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        showMenu();
     int button = sc.nextInt();
     switch(button){
        case 1:{
            System.out.println("Enter the number to be reversed: ");
            int n = sc.nextInt();
          System.out.println("Reverse Number");
          int answer = reverseNumber(n);
          System.out.println("Reverse Number = " + answer);
           break;
        }

        case 2:{
            System.out.println("Palindrome Number");
            System.out.println("Enter the number n: ");
             int n = sc.nextInt();
            if(isPalindrome(n)){
                System.out.println("The number is palindrome.");
            }
            else{
                System.out.println("The number is not palindrome.");
            }
             break;
            }

        case 3:{
            System.out.println("Enter the number to be checked: ");
            int n = sc.nextInt();
            if(isArmstrong(n)){
                System.out.println("The number is Armstrong.");
            }
            else{
                System.out.println("The number is not Armstrong.");
            }
            break;
        }

        case 4:{
            System.out.println("Enter the number to be counted: ");
            int n = sc.nextInt();
            int count = countDigits(n);
            System.out.println("The number of digits in the given number is " + count);
        break;
        }

        case 5:{
            System.out.println("Enter the size: ");
            int n = sc.nextInt();
            System.out.println("Enter the digits to be added: ");
            int[] arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int sum = calculateSum(arr);
            System.out.println("Sum = " + sum);
            break;
        }

        case 6:{
            System.out.println("Enter the number of terms: ");
            int n = sc.nextInt();
            fibonacciSeries(n);
            System.out.println();
            break;
        }
        case 7:{
            System.out.println("Enter the number to be checked: ");
            int n = sc.nextInt();
            if(isPrime(n)){
                System.out.println("The entered number is prime");
            }
            else{
                System.out.println("The entred number is not prime");
            }
            break;
         }
        case 8:{
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int fact = calculateFactorial(n);
            System.out.println("The factorial of the given number is " + fact);


            break;
        }
        case 9:{
            System.out.println("Enter the number to be checked: ");
            int n = sc.nextInt();
            if(isStrong(n)){
                System.out.println("The entered number is strong in nature.");
            }
            else{
                System.out.println("The given number is not strong in nature.");
            }
            break;
        }
        case 10:
            System.out.println("Exit");
            break;



    }
}

    
}
}
