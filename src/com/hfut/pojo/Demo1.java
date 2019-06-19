package com.hfut.pojo;

import java.util.List;

public class Demo1 {
    private List<People> peo;

    public List<People> getPeo() {
        return peo;
    }

    public void setPeo(List<People> peo) {
        this.peo = peo;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "peo=" + peo +
                '}';
    }
}
