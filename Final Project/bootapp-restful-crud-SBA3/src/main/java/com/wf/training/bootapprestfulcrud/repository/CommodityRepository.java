package com.wf.training.bootapprestfulcrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wf.training.bootapprestfulcrud.entity.Commodity;


@Repository
public interface CommodityRepository extends JpaRepository<Commodity, Integer>{

	Optional<Commodity> findByCommodityName(String commodityName);

}


