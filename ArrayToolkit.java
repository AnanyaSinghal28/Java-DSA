import java.util.*;
public class ArrayToolkit {
    public static void showMenu(){
        // Menu
        String[] menu = {
            "1. Print Array",
            "2. Sum of elements",
            "3. Maximum Elements",
            "4. Minimum Element",
            "5. Average",
            "6. Linear Search",
            "7. Array Reverse",
            "8. Count elements in the array ",
            "9. Exit"
        };

            System.out.println("========================");
            System.out.println("Java Array Toolkit");
            System.out.println("========================");

            for(int i = 0; i<menu.length; i++){
                System.out.println(menu[i]);
            }
        }
        // Taking an input from the user:
        public static void inputArray(int[] arr){
            Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the size of the array: ");
                    int n = sc.nextInt();
                    arr = new int[n];
                    System.out.println("Enter the elements in the array: ");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
            }

        // Printing an array
         public static void printArray(int[] arr){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Sum of All the elements in an array
        public static int sumArray(int[] arr){
            int sum = 0;
            for(int num: arr){
                sum += num;
            }
            System.out.println("Sum = " + sum);
            return sum;

        }
            
        public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        while(true){
            showMenu();
            int button = sc.nextInt();
            switch(button){
                case 1:{
                    System.out.println("Enter the size of the array: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements: ");
                    for(int i=0; i < arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
                    printArray(arr);
                    break;
                }

                case 2:{
                    System.out.println("Enter the size of the array: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements in the array: ");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
                    printArray(arr);
                    sumArray(arr);
                }
            
                    

                    }
                    

                }
                    
            }
        }
        
        
        

    
    

