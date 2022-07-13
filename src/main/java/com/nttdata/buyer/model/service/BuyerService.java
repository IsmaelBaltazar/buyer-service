package com.nttdata.buyer.model.service;

import com.nttdata.buyer.model.document.Buyer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BuyerService {
    Flux<Buyer> getAll();
    Mono<Buyer> save(Buyer buyer);
    Mono<Buyer> getOne(Long idBuyer);
    Mono<Buyer> update(Buyer buyer);
}
