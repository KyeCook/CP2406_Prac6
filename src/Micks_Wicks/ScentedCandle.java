package Micks_Wicks;

/**
 * Created by jc319912 on 12/09/16.
 */
public class ScentedCandle extends Candle {
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    @Override

    public void setCandleHeight(float candleHeight) {
        super.setCandleHeight(candleHeight);
        final double COST_PER_INCH = 3;
        candleCost = candleHeight * COST_PER_INCH;
    }
}
