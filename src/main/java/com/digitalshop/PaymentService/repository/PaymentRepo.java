package com.digitalshop.PaymentService.repository;

import com.digitalshop.PaymentService.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<TransactionEntity, Long> {
    TransactionEntity findByOrderId(long orderId);
}
