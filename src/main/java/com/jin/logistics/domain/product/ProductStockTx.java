package com.jin.logistics.domain.product;

import com.jin.logistics.domain.type.StockChange;
import com.jin.logistics.domain.util.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product_stock_transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ProductStockTx extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne
  @JoinColumn(name = "product_code")
  private Product product;
  @Column(nullable = false)
  private int stockBoxes;
  @Column(nullable = false)
  private int stockUnits;
  @Column(nullable = false, length = 50)
  @Enumerated(EnumType.STRING)
  private StockChange stockChange;
  @Column(length = 3000)
  private String notes;
}
