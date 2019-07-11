package exceptions;

public class Bottle {

    private int quantity;

    public Bottle() {
        this.quantity = 10;
    }


    public void spray() throws OutOfLiquidException  {
        if (quantity<=0){
            throw new OutOfLiquidException("Bottle is empty!");
        }
        quantity--;
    }


    public void reFill(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
