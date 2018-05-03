package com.info.aggregator.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @Column(name = "UUID")
    private String uuid;

    public static abstract class AbstractBuilder<T extends AbstractEntity, B extends AbstractBuilder<T, B>> {
        public abstract B getThis();
        public abstract T build();
    }
}
