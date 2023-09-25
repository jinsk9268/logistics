package com.jin.logistics.domain.util;

import com.jin.logistics.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DetailEntity extends BaseEntity {

  @EmbeddedId
  private DetailCompositeKey id;
  @MapsId("productCode")
  @ManyToOne(optional = false)
  @JoinColumn(name = "product_code")
  private Product product;
  @Column(nullable = false)
  private int productBoxes;
  @Column(nullable = false)
  private int productUnits;
  @Column(nullable = false)
  private long productSupplyPrice;
  @Column(nullable = false, columnDefinition = "DECIMAL(10, 1)")
  private BigDecimal productVat;
  @Column(nullable = false)
  private long productAmount;
}
