package product;

public class ProductBuilder {

    private Product product;

    public ProductBuilder(){
        this.product = new Product();
    }

    public Product build(){
        if(product.getName().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        return product;
    }

    public ProductBuilder setName(String name) {
        product.setName(name);
        return this;
    }


    public ProductBuilder setPrice(double price) {
        product.setPrice(price);
        return this;

    }


    public ProductBuilder setCategory(String category) {
        product.setCategory(category);
        return this;

    }


    public ProductBuilder setAmount(int amount) {
        product.setAmount(amount);
        return this;

    }
}
