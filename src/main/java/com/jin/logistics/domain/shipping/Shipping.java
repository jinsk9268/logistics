package com.jin.logistics.domain.shipping;

import com.jin.logistics.domain.order.Order;
import com.jin.logistics.domain.util.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Shipping extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne(optional = false)
  @JoinColumn(name = "order_id")
  private Order order;
  @Column(nullable = false)
  private LocalDate shippingCompleteDate;
  @Column(nullable = false)
  private int totalBoxes;
  @Column(nullable = false)
  private int totalUnits;
  @Column(nullable = false)
  private long totalSupplyPrice;
  @Column(nullable = false, columnDefinition = "DECIMAL(10, 1)")
  private BigDecimal totalVat;
  @Column(nullable = false)
  private long totalAmount;
  @Column(length = 3000)
  private String notes;
}
