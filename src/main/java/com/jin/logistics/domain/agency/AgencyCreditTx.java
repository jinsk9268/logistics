package com.jin.logistics.domain.agency;

import com.jin.logistics.domain.type.CreditChange;
import com.jin.logistics.domain.util.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "agency_credit_transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class AgencyCreditTx extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne(optional = false)
  @JoinColumn(name = "agency_code")
  private Agency agency;
  @Column(nullable = false)
  private long creditAmount;
  @Column(nullable = false, length = 50)
  @Enumerated(EnumType.STRING)
  private CreditChange creditChange;
  @Column(length = 3000)
  private String notes;
}
