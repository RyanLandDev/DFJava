package net.ryanland.dfjava.selectable.target;

class SelectionTarget implements PlayerTarget, EntityTarget, GameValueTarget {

    @Override
    public String getId() {
        return "Selection";
    }
}
