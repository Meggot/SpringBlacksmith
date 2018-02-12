package com.smith.model.gameModels;

import java.util.Date;

public class Audit {
    private Date date;
    private String data;

    public Audit(String auditData) {
        this.date = new Date();
        this.data = auditData;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public void setData(final String data) {
        this.data = data;
    }

    public Date getDate() {
        return this.date;
    }

    public String getData() {
        return this.data;
    }
}
