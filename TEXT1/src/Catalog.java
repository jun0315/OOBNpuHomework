import java.util.ArrayList;
import java.util.Iterator;

public class Catalog implements Iterable<Product> {
    private ArrayList<Product> products ;
    public Iterator<Product> iterator(){
        return this.products.iterator();
    }
    public void addProduct(Product product){
        products.add(product) ;
    }
    public Product getProduct(String code){
        for(Product product:products){
            if(product.getCode().equals(code)){
                return product ;
            }
        }
        return null ;
    }
    public int getNumberOfProduct(){
        return this.products.size();
    }
}
