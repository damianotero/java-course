package exceptions;

public class Cleaner {

    private Bottle bottle;

    public Cleaner() {
        this.bottle = new  Bottle();
    }

    public void clean()  {

        System.out.println("Sprays a dose. " + bottle.getQuantity() + " remains.");
        try {
            bottle.spray();
        } catch (OutOfLiquidException e){
            System.out.println("Bottle out of liquid, refilling to half.");
            bottle.reFill(5);
        }
    }

    public Bottle getBottle() {
        return bottle;
    }
}
