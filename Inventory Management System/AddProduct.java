import java.util.*;
public class AddProduct { 
    public static void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the product name:");
        String name = sc.nextLine();

        System.out.println("Enter the price of the product:");
        double price = sc.nextDouble();

        System.out.println("Enter the number of products:");
        int quantity = sc.nextInt();

        Inventory.products[Inventory.count] = new Product(id, name, price, quantity);
        Inventory.count++;
        System.out.println("Product added successfully");
    }
   
    
}
 

