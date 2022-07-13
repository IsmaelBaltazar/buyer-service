package com.nttdata.buyer.event;

import com.nttdata.buyer.model.document.Buyer;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BuyerCreatedEvent extends Event<Buyer> {

}
