package com.jin.logistics.domain.shipping;

import com.jin.logistics.domain.product.Product;
import com.jin.logistics.domain.util.DetailCompositeKey;
import com.jin.logistics.domain.util.DetailEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ShippingDetail extends DetailEntity {

  @MapsId("id")
  @ManyToOne(optional = false)
  @JoinColumn(name = "shipping_id")
  private Shipping shipping;

  @Builder
  public ShippingDetail(
      DetailCompositeKey id, Product product, int productBoxes, int productUnits,
      long productSupplyPrice, BigDecimal productVat, long productAmount, Shipping shipping
  ) {
    super(id, product, productBoxes, productUnits, productSupplyPrice, productVat, productAmount);
    this.shipping = shipping;
  }
}
