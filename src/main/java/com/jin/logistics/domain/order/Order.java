package com.jin.logistics.domain.order;

import com.jin.logistics.domain.agency.Agency;
import com.jin.logistics.domain.type.OrderStatus;
import com.jin.logistics.domain.type.OrderType;
import com.jin.logistics.domain.util.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Order extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne
  @JoinColumn(name = "agency_code")
  private Agency agency;
  @Column(nullable = false, length = 50, columnDefinition = "VARCHAR(50) DEFAULT 'GENERAL'")
  @Enumerated(EnumType.STRING)
  private OrderType orderType;
  @Column(nullable = false)
  private LocalDate orderDate;
  @Column(nullable = false)
  private LocalDate shippingDate;
  @Column(nullable = false, length = 50, columnDefinition = "VARCHAR(50) DEFAULT 'PENDING'")
  @Enumerated(EnumType.STRING)
  private OrderStatus orderStatus;
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
