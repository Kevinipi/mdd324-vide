package com.ipiecoles.java.mdd324.homepage.model;

import com.owlike.genson.annotation.JsonProperty;

import java.util.Objects;

public class Key {

    private String key;

    public Key(String key) {
        this.key = key;
    }

    public Key() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return Objects.equals(key, key1.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
