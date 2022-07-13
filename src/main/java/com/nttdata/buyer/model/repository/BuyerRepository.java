package com.nttdata.buyer.model.repository;

import com.nttdata.buyer.model.document.Buyer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends ReactiveMongoRepository<Buyer, Long> {
}
