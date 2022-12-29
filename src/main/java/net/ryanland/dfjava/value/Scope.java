package net.ryanland.dfjava.value;

public enum Scope {

    LOCAL("local"),
    GAME("unsaved"),
    SAVED("saved")
    ;

    private String id;

    Scope(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
