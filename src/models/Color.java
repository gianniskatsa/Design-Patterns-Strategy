package models;

public enum Color {
    RED(20.5f), ORANGE(15.5f), YELLOW(12.7f), GREEN(12.4f), BLUE(21.4f), INDIGO(4.6f), VIOLET(6.7f);

    private final float unitPrice;
    Color( float unitPrice){
        this.unitPrice= unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
}
