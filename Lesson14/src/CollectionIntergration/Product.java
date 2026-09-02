package CollectionIntergration;

import java.util.Objects;

public final class Product implements Comparable<Product>{
    public Integer sku;
    public String name;
    public int priceCents;

    public Product(String name, int sku, int priceCents) {
        this.name = name;
        this.sku = sku;
        this.priceCents = priceCents;
    }

    @Override
    public String toString() {
        return String.valueOf(this.sku);
    }

    @Override
    public boolean equals(Object obj) {
        Product p = (Product) obj;
        return (Objects.equals(p.sku, this.sku));
    }

    @Override
    public int hashCode() {
        return sku;
    }

    @Override
    public int compareTo(Product pr) {
        int compared = this.name.compareToIgnoreCase(pr.name);
        if (compared != 0) {
            return compared;
        }
        return this.sku.compareTo(pr.sku);
    }

}

