package Micks_Wicks;

/**
 * Created by jc319912 on 12/09/16.
 */
public class DemoCandles {
    public static void main(String[] args)
    {
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();

        candle1.setCandleColour("Yellow");
        candle1.setCandleHeight(20);

        candle2.setCandleColour("Red");
        candle2.setCandleHeight(20);
        candle2.setScent("Thyme");

        System.out.println("The Candle is " + candle1.getCandleColour() + " with a height of " +
                candle1.getCandleHeight() + "inches and a cost of $" + candle1.getCandleCost());

        System.out.println("The Candle is " + candle2.getCandleColour() + " and smells of " + candle2.getScent() +
                " with a height of " + candle2.getCandleHeight() + "inches and a cost of $" + candle2.getCandleCost());
    }
}
