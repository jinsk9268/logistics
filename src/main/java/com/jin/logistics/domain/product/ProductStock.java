package com.jin.logistics.domain.product;

import com.jin.logistics.domain.util.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ProductStock extends BaseEntity {

  @Id
  private String productCode;
  @MapsId
  @OneToOne(optional = false)
  @JoinColumn(name = "product_code")
  private Product product;
  @Column(nullable = false)
  private int stockBoxes;
  @Column(nullable = false)
  private int stockUnits;
}
