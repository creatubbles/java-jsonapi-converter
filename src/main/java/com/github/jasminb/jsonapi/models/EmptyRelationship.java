package com.github.jasminb.jsonapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EmptyRelationship implements IEmptyRelationship {

    private boolean isEmpty;

    @JsonIgnore
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    @JsonIgnore
    public void setIsEmpty(boolean isIncluded){
        this.isEmpty = isIncluded;
    }
}
