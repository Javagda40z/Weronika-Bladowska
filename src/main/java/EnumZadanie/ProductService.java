package EnumZadanie;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private final List<Product> products;

    public ProductService(List<Product> products) {
        this.products = products;
    }
    List<Product> owoce=new ArrayList<>();

    public List<Product> retrieveFruits(){
        for(Product product:products){
            if(ProductType.OWOCE==product.getProductType()){
                owoce.add(product);
            }
        }
        return owoce;

    }



}
