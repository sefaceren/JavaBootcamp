public class ProductValidator {

    //instance oluşturmaya gerek yok .
    static {
        System.out.println("Statik Yapıcı Blok.");
    }

    // instance oluşmazsa çalışmaz.
    public ProductValidator(){
        System.out.println("Yapıcı Blok.");
    }

    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){

    }


}
