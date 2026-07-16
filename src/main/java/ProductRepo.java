import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> productList = new ArrayList<>();


  ProductRepo(List<Product> productList){

      this.productList = productList;
  }


  // methode um alle produkte aufzurufen
  public List<Product> list() {
      return productList;
  }


  //methode um nach id suchen und einzelnes produkt anzeigen
  public Product get(String id){
      for (Product product : productList){
          if (product.id().equals(id)){
              return product;
          }
      }

      return null;
  }

  //methode produkte hinzufügen
  public void add(Product newProduct){
      productList.add(newProduct);
  }


  // methode product entfernen
  public void remove(String id) {
      for (int i = 0; i < productList.size(); i++) {

          Product currentProduct = productList.get(i);

          if (currentProduct.id().equals(id)) {

              productList.remove(i);

              return;
          }
      }
  }
}
