package com.jspiders.Shopping.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.Shopping.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long>{


}
