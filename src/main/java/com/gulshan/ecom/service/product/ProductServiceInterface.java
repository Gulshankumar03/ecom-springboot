package com.gulshan.ecom.service.product;

import com.gulshan.ecom.dto.ProductDto;
import com.gulshan.ecom.entity.Product;
import com.gulshan.ecom.request.AddProductRequest;
import com.gulshan.ecom.request.UpdateProductRequest;

import java.util.List;

public interface ProductServiceInterface {
    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(UpdateProductRequest request, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
