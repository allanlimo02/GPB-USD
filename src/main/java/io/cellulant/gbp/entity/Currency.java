package io.cellulant.gbp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Table(name = "table")
public class Currency {
    private  int amount;
    private String currencyCode;
}
