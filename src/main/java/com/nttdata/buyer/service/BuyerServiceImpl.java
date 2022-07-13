package com.nttdata.buyer.service;

import com.nttdata.buyer.model.document.Buyer;
import com.nttdata.buyer.model.repository.BuyerRepository;
import com.nttdata.buyer.model.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    BuyerRepository repository;

    @Autowired
    BuyerEventsService buyerEventsService;
    @Override
    public Flux<Buyer> getAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Buyer> save(Buyer buyer) {
        return repository.save(buyer).doOnSuccess(b->{
            buyerEventsService.publish(b);
        });
    }

    @Override
    public Mono<Buyer> getOne(Long idBuyer) {
        return repository.findById(idBuyer);
    }

    @Override
    public Mono<Buyer> update(Buyer buyer) {
        return save(buyer);
    }
}
