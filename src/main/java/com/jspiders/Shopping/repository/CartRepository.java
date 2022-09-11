package com.jspiders.Shopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.Shopping.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long>{

	

}
