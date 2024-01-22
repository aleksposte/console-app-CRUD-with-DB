package com.app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Integer id;
    private String name;
    private Date created;
    private Date updated;
    private List<Label> labels;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setName(String name, Date created, Date updated, List<Label> labels) {
        this.name = name;
        this.created = created;
        this.updated =updated;
        this.labels = labels;
    }

    public void addLabelToPost(Label label) {
        labels = (labels == null)
                ? new ArrayList<>()
                : labels;
        labels.add(label);
    }
}
