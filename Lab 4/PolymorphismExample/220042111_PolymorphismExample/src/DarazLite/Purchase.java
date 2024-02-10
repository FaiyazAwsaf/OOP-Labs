package DarazLite;

public class Purchase
{
    Products products;
    String discountCode;

    public Purchase(Products products, String discountCode)
    {
        this.products = products;
        this.discountCode = discountCode;
    }

    private double calculateTotal()
    {
        double total = products.getBasePrice() * products.getQuantity();
        total = total * 0.9;

        if(products instanceof Books) {
            if (((Books) products).genre == "Classic Literature") {
                total = total - total * 0.03;
            } else if (((Books) products).genre == "Science Fiction") {
                total = total - total * 0.02;
            }
        }

        if(discountCode == "1234") {
            total = total - 50;
        }

        return total;
    }
}
