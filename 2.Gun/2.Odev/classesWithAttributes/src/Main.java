public class Main {

    public static void main(String[] args) {

        //Product product = new Product(1,"Laptop","Lenovo",5000,5,"siyah"); // instance -> constructor çalışır.
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Lenovo");
        product.setPrice(500);
        product.setStockAmount(5);



        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }
}
