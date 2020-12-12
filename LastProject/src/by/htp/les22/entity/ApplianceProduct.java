package by.htp.les22.entity;

import java.util.Objects;

public abstract class ApplianceProduct {
    private String nameProduct;

    public ApplianceProduct(String nameProduct) {
        this.nameProduct = nameProduct;

    }


    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplianceProduct that = (ApplianceProduct) o;
        return Objects.equals(nameProduct, that.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct);
    }

}
