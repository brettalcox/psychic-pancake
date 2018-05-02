package com.info.aggregator.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {
    public static abstract class AbstractBuilder<T extends AbstractEntity, B extends AbstractBuilder<T, B>> {
        public abstract B getThis();
        public abstract T build();
    }
}
