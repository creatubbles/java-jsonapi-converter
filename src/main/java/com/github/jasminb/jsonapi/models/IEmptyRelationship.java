package com.github.jasminb.jsonapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IEmptyRelationship {
    @JsonIgnore
    void setIsEmpty(boolean isIncluded);
}
