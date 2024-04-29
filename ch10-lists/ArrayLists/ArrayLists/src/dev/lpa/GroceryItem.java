package dev.lpa;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 1); // call constructor with three fields
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}