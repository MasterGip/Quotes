package ru.kpfu.itis.entities;

public class Type {
    private String type;
    private String definition;

    public Type(String type, String definition) {
        this.type = type;
        this.definition = definition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
