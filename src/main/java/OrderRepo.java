import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    public List<Order> orderList;

    OrderRepo(){
        this.orderList = new ArrayList<>();
    }


    // methode um alle bestellungen anzuzeigen
    public List<Order> list(){
        return orderList;
    }

    public Order getById(String id){
        for (Order order : orderList){
            if (order.id().equals(id)){
                return order;
            }
        }

        return null;
    }


    //methode um bestellung hinzufügen
    public void add(Order newOrder){
        orderList.add(newOrder);
    }


    //methode zum entfernen
    public void remove(Order orderToRemove){
        orderList.remove(orderToRemove);
    }

}
