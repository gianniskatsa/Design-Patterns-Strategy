package models;

public enum  Fabric {
    WOOL(12.4f), COTTON(25.5f), POLYESTER(24.6f), RAYON(21.8f), LINEN(12.9f), CASHMERE(50.76f), SILK(60.54f);

    private final float unitPrice;
    Fabric( float unitPrice){
        this.unitPrice= unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
}
