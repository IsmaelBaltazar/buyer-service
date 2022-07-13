package com.nttdata.buyer.api;

import com.nttdata.buyer.model.document.Buyer;
import com.nttdata.buyer.model.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/buyer")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @PostMapping
    public Mono<Buyer> save(@RequestBody Buyer buyer){
        return buyerService.save(buyer);
    }
    @PutMapping
    public Mono<Buyer> update(@RequestBody Buyer buyer){
        return buyerService.update(buyer);
    }
    @GetMapping
    public Flux<Buyer> getAll(){
        return buyerService.getAll();
    }
    @GetMapping("/{idMovement}")
    public Mono<Buyer> getOne(@PathVariable Long idBuyer){
        return buyerService.getOne(idBuyer);
    }

}
