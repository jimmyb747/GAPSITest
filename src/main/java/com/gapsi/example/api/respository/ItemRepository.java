package com.gapsi.example.api.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gapsi.example.api.bo.ItemDataBO;

@Repository
public interface ItemRepository extends JpaRepository<ItemDataBO, Serializable>{

	@Query("select itm from ItemDataBO itm"
			+ " where itm.id=:itemId")
	ItemDataBO findItemDataById(@Param(value = "itemId") String itemId);
}
