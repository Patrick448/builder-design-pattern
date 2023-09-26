package product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBuilderTest {

    @Test
    void deveRetornarProduto(){
        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder
                .setName("Shampoo")
                .setAmount(50)
                .setPrice(10.99)
                .setCategory("Higiene Pessoal");

        Product product = productBuilder.build();

        assertEquals("Shampoo,10.99,Higiene Pessoal,50", product.toString());
    }
    @Test
    void deveRetornarExcecaoNomeInvalido(){
        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder
                .setName("")
                .setAmount(50)
                .setPrice(10.99)
                .setCategory("Higiene Pessoal");

        try{
        Product product = productBuilder.build();
        fail();
        }
        catch (Exception e){
            assertEquals("Name cannot be empty", e.getMessage());
        }

    }


}