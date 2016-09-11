package Francis_Pet_supply;

/**
 * Created by ACfan on 11/09/2016.
 */
public class PetSold extends ItemSold {
    private boolean vaccinated;
    private boolean neutered;
    private boolean houseBroken;

    public boolean getVaccinated() {
        return vaccinated;
    }

    public boolean getNeutered() {
        return neutered;
    }

    public boolean getHouseBroken() {
        return houseBroken;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public void setHouseBroken(boolean houseBroken) {
        this.houseBroken = houseBroken;
    }
}
