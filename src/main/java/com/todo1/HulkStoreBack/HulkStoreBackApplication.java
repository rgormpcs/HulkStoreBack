package com.todo1.HulkStoreBack;

import com.todo1.HulkStoreBack.entities.Product;
import com.todo1.HulkStoreBack.service.ProductService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;

@SpringBootApplication
@EnableSwagger2
public class HulkStoreBackApplication  implements CommandLineRunner{

    @Autowired
    ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(HulkStoreBackApplication.class, args);
    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.todo1")).build();
    }

   

    private void saveProducts() {
        Product product = new Product("Scarlet Witch", 160.00, "Marvel", "http://cdn.shopify.com/s/files/1/0863/0758/products/marvel-select-wandavision-scarlet-witch-collectible-action-figure.jpg?v=1615485618", 5);
        Product product2 = new Product("Batman", 123.50, "DC", "https://media.gamestop.com/i/gamestop/11169592/McFarlane-Toys-DC-Multiverse-The-Batman-Wave-1-Batman-7-in-Action-Figure?$pdp$", 5);
        Product product3 = new Product("Aeroman", 100.50, "Marvel", "https://www.mythfactoryshop.com/36132-large_default/Iron-Man-Hot-Toys-The-Origins-CMS07D37-Marvel.jpg", 5);
        Product product4 = new Product("Viuda Negra", 160.00, "Marvel", "https://sc04.alicdn.com/kf/H0f9db2e5a77d4620a68d392b260185bac.jpg", 5);
        Product product5 = new Product("Harley Quinn", 160.00, "DC", "https://i.ebayimg.com/thumbs/images/g/Qs0AAOSw09pd8lNS/s-l300.jpg", 5);
        Product product6 = new Product("Aironman", 100.50, "Marvel", "https://www.mythfactoryshop.com/36132-large_default/Iron-Man-Hot-Toys-The-Origins-CMS07D37-Marvel.jpg", 5);
        
        List<Product> productLis= Arrays.asList(product,product2,product3,product4,product5,product6);
		productLis.stream().forEach(productService::save);
    }
    
     @Override
    public void run(String... args) throws Exception {
        saveProducts();
    }

}
