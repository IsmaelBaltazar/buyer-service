package com.nttdata.buyer.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "buyer")
public class Buyer {
    private long idBuyer;
    private String documentType;
    private String documentNumber;
    private String phoneNumber;
    private String email;
}
