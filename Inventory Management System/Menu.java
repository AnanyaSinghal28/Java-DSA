import java.util.*;
public class Menu {
    Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("================");
        System.out.println("Inventory Management System");
        System.out.println("================");
        String[] Menu = {
            "1. Add Product",
            "2. View Product",
            "3. Search product",
            "4. Update Product",
            "5. Delete Product",
            "6. Exit"};
            for(int i = 0; i<Menu.length; i++){
        System.out.println(Menu[i]);
            }
        System.out.println("Enter your choice:");
    }


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(true){
                showMenu();
                int button = sc.nextInt();
                sc.nextLine();
                switch(button){
                    case 1:{
                        AddProduct.addProduct();
                    }
                    break;
                    case 2:{
                        System.out.println("View product");
                        ViewProduct.viewProduct();
                    }
                    break;
                    case 3:{
                        System.out.println("Search product");
                    }
                    break;
                    case 4:{
                        System.out.println("Update product");
                    }
                    break;
                    case 5:{
                        System.out.println("Delete product");
                    }
                    break;
                    case 6:{
                        System.out.println("Thank You!");
                    }
                    return;


                        default:
                            System.out.println("Invalid Choice! Please enter a number from 1 to 6.");
                }

        }
            
        }
        }


        




    
    
