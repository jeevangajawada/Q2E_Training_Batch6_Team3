package com.wf.training.bootapprestfulcrud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wf.training.bootapprestfulcrud.entity.HistoricalRecordCommodity;


@Repository
public interface CommodityPriceRepository extends JpaRepository<HistoricalRecordCommodity, Long>{
	
	Optional<List<HistoricalRecordCommodity>> findAllByCommodityId(long commodityId);

}
