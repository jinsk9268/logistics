package com.jin.logistics.domain.type;

public enum CreditChange {
  DEPOSIT, // 입금
  WITHDRAWAL, // 출금
  ORDER, // 주문
  ADJUSTMENT, // 주문, 매출에 의한 조정
  RETURN // 반품, 반입
}
