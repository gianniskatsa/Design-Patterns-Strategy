package models;

public enum Size {
    XS(12.4f), S(11.5f), M(4.5f), L(2.4f), XL(3.5f), XXL(17.5f), XXXL(15.6f);

    private final float unitPrice;
    Size( float unitPrice){
        this.unitPrice= unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

}
