package Micks_Wicks;

/**
 * Created by jc319912 on 12/09/16.
 */
public class Candle {
    private String candleColour;
    private float candleHeight;
    protected double candleCost;

    public String getCandleColour() {
        return candleColour;
    }

    public float getCandleHeight() {
        return candleHeight;
    }

    public double getCandleCost() {
        return candleCost;
    }

    public void setCandleColour(String candleColour) {
        this.candleColour = candleColour;
    }

    public void setCandleHeight(float candleHeight) {
        final double COST_PER_INCH = 2;
        this.candleHeight = candleHeight;
        candleCost = candleHeight * COST_PER_INCH;
    }
}
