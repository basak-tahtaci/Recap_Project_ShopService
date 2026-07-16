import java.util.ArrayList;
import java.util.List;

public class ShopService {

    //eigenschaften
    ProductRepo productRepo;
    OrderRepo orderRepo;

    public int orderCounter = 1;

    // Konstruktoren
   public ShopService(){

       this.productRepo = new ProductRepo();
       this.orderRepo = new OrderRepo();
   }


   //methode bestellung aufgeben
   public Order addOrder(List<String> productId){

       List<Product> productsToOrder = new ArrayList<>();

       for (String id : productId) {

           // wir suchen das produkt in unserem productRepo
           Product product = productRepo.getById(id);

           // Wwnn das Produkt existiert pack es auf die liste
           if (product != null) {
               productsToOrder.add(product);
           } else {

               System.out.println("Produkt mit ID " + id + " wurde nicht gefunden.");
           }
       }

       String uniqId = String.valueOf(orderCounter);
       orderCounter++;

       Order newOrder = new Order(uniqId, productsToOrder);
       orderRepo.add(newOrder);

       return newOrder;

   }

}
