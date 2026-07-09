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
            System.out.println("Enter your choice:");
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
            return sum;

        }

        //Maximum Element
        public static int maxElement(int[] arr){
            int max = arr[0];
            for(int i = 0; i<arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            } 
         return max;
        }

        // Minimum Element:
        public static int minElement(int[] arr){
            int min = arr[0];
            for(int i = 0; i<arr.length; i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            return min;
        }

        // Average Calculation
        public static double calculateAverage(int[] arr){
            int sum = sumArray(arr);
            double average = (double)sum/arr.length;
            return average;
        }

        // Searching an element
        public static boolean searchElement(int[] arr, int key){
            boolean found = false;
            for(int i = 0; i<arr.length; i++){
                if(arr[i] == key){
                found = true;
                }
            }
            return found;
        }

        // Count the number of elements
        public static int countElements(int[] arr){
             int count = 0;
             for(int i = 0; i<arr.length; i++){
                count++;
             }
             return count;
        }

        // Array Reverse
        public static void arrayReverse(int[] array){
            int temp;
            for(int i = 0; i<array.length/2; i++){
               temp = array[i];
               array[i] = array[array.length-i-1];
               array[array.length-i-1] = temp;
            }
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
                }
                break;

                case 2:{
                    System.out.println("Enter the size of the array: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements in the array: ");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
                    printArray(arr);
                    int sum = sumArray(arr);
                    System.out.println("Sum = " + sum);
                }
                break;

                case 3:{
                    System.out.println("Enter the size of the array: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements in the array: ");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
                    int max = maxElement(arr); 
                    System.out.println("The maximum element is " + max); 
                }
                break;

                
                case 4:{
                    System.out.println("Enter the size of the array");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements in the array");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
                    int min = minElement(arr);
                    System.out.println("The minimum element is: " + min);
                }     
                break; 
                
                case 5:{
                    System.out.println("Enter the size of the array");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements in the array");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
                    double avg = calculateAverage(arr);
                    System.out.println("The average of the given array is " + avg);
                }
                break;

                case 6:{
                    System.out.println("Enter the size of the array");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements in the array");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
                System.out.println("Enter the element to be found");
                int key = sc.nextInt();
                if(searchElement(arr, key)){
                    System.out.println("The element is found");
                }
                else{
                    System.out.println("Element not found");
                }
             }
             break;

                case 7:{
                    System.out.println("Enter the size of the array: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements you want to reverse:");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                    }
                    arrayReverse(arr);
                    System.out.println("Reversed Array");
                    for(int i = 0; i<arr.length; i++){
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
                break;
                
             
                case 8:{
                     System.out.println("Enter the size of the array");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements in the array");
                    for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
                int count = countElements(arr);
                System.out.println("The number of elements in the array is " + count);
                }

                case 9:
                    System.out.println("Exit");
                    break;
                    
            }
        }
    }
}
        
        
        

    
    

