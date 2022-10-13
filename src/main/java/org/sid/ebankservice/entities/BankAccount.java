package org.sid.ebankservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankservice.enums.AccountType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
    @Id
    private String id;
    private Date createAt;
    private Double balance;
    @Enumerated(EnumType.STRING)
    @Column(length = 16)
    private AccountType type;
    private  String currency;


}
