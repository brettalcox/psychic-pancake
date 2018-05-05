package com.info.aggregator.model;

/**
 * Base model class for DTO's
 */
public abstract class AbstractModel {
    public static abstract class AbstractBuilder<T extends AbstractModel, B extends AbstractBuilder<T, B>> {
        public abstract B getThis();
        public abstract T build();
    }
}
