public class ViewProduct {
    public static void viewProduct(){
        for(int i = 0; i< Inventory.count; i++ ){
            Product p = Inventory.products[i];

            System.out.println("ID: " + p.id);
            System.out.println("Name: " + p.name);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
        }
    }
    
}
