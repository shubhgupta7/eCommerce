package com.example.ecomwebsite.Repo;

import com.example.ecomwebsite.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface productRepo extends JpaRepository<Product,Integer> {


}

