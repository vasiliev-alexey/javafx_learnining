package com.av.domain;

import javafx.beans.property.StringProperty;

/**
 * Created by vasiliev-alexey on 14.12.16.
 */
public class Dummy {

    private StringProperty prs;

    public String getPrs() {
        return prs.get();
    }

    public StringProperty prsProperty() {
        return prs;
    }

    public void setPrs(String prs) {
        this.prs.set(prs);
    }

    private  int id;

}
