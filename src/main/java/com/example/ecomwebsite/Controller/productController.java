package com.example.ecomwebsite.Controller;

import com.example.ecomwebsite.Model.Product;
import com.example.ecomwebsite.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class productController {

    @Autowired
    private productService service;

    @RequestMapping("/")
    public String hell0(){
        return " Hello World";
    }
    @GetMapping ("/products")
    public ResponseEntity<List<Product>> getAllProducts(){

        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") int id){

        Product product = service.getById(id);
        if(product!=null)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
      }

      @PostMapping("/product")
    public ResponseEntity<?>  addProduct(@RequestPart Product prod, @RequestPart("") MultipartFile imageFile)
      {
         try{
             Product product1 = service.addProduct(prod,imageFile);
             return new ResponseEntity<>(product1,HttpStatus.OK);
         }
         catch (Exception e ){
             return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
         }
      }
//      @PostMapping("/product1")
//    public ResponseEntity<?> addProduct( @RequestBody Product prod)
//      {
//          try{
//              Product product1 = service.addProduct(prod);
//              return new ResponseEntity<>(product1,HttpStatus.OK);
//          }
//          catch (Exception e ){
//              return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//          }



//      @PostMapping("/product")
//      public void addProduct(@RequestBody product)
//
////    @PostMapping("/product")
//    public void addProduct (@RequestParam("name") String name, @RequestParam("desc") String desc, @RequestParam("brand") String brand, @RequestParam("category") String category, @RequestParam("price")BigDecimal price, @RequestParam("releaseDate")Date releaseData,@RequestParam("available") boolean avail,@RequestParam("quantity") int quant)
//    {
//        service.addProduct(name,desc,brand,category,price,releaseData,avail,quant);
//
//    }


}

