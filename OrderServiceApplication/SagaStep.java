package com.food.orderring.system.saga;

public interface SagaStep<T> {
    void process (T data);
    void rollback (T dara);
}
