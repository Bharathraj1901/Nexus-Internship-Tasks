import java.util.*;  
import java.util.stream.Stream;  

class Product{  
    int ph_id;  
    String ph_name;  
    float ph_price;  
    public Product(int ph_id, String ph_name, float ph_price) {  
        super();  
        this.ph_id = ph_id;  
        this.ph_name = ph_name;  
        this.ph_price = ph_price;  
    }  
}  

public class LambdaExpression
{
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A14 5G",19999f));  
        list.add(new Product(3,"Iphone 13",55990f));  
        list.add(new Product(2,"Vivo Y36",14999f));  
        list.add(new Product(4,"Nokia 2660",4990f));  
        list.add(new Product(5,"Redmi Note 12 5G",17499f));  
        list.add(new Product(6,"Oneplus 11R 5G",39999f));  
          
        Stream<Product> filtered_data = list.stream().filter(p -> p.ph_price > 20000);              // using lambda to filter data
          
        filtered_data.forEach(  
                product -> System.out.println(product.ph_name+": "+product.ph_price));              // using lambda to iterate through collection
    }  
}
