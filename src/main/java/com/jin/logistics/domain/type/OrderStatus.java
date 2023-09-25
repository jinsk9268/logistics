package com.jin.logistics.domain.type;

public enum OrderStatus {

  PENDING, // 주문 확인중
  CONFIRMED, // 주문 확정
  DISPATCHED, // 배차 완료
  SHIPPING_COMPLETED, // 출고 완료
  CANCELLED, // 주문 취소
  RETURN // 반품
}
