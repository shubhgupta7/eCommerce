package com.example.ecomwebsite.Service;

import com.example.ecomwebsite.Model.Product;
import com.example.ecomwebsite.Repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class productService {

    @Autowired
    private productRepo repo;

    public Product addProduct(Product prod, MultipartFile imageFile) throws IOException {
        prod.setImageName(imageFile.getOriginalFilename());
        prod.setImageType(imageFile.getContentType());
        prod.setImageData(imageFile.getBytes());
        return repo.save(prod);
    }

    public List<Product> getAllProducts(){
        return repo.findAll();
    }
    public Product getById(int id) {
        return repo.findById(id).orElse(null);
    }

//    public Product addProduct(Product prod) {
//        repo.save(prod);
//        return prod;
//    }
//    public void addProduct(){
//        repo.save();
//    }

}
