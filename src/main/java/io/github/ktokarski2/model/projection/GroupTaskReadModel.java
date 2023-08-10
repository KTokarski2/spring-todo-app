package io.github.ktokarski2.model.projection;

import io.github.ktokarski2.model.Task;

public class GroupTaskReadModel {
    private String description;
    private boolean done;

    GroupTaskReadModel(Task source) {
        description = source.getDescription();
        done = isDone();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(final boolean done) {
        this.done = done;
    }
}
