package Horse;

/**
 * Created by ACfan on 11/09/2016.
 */
public class DemoHorses {
    public static void main (String[] args)
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();

        horse1.setHorseName("Roach");
        horse1.setHorseColour("Brown");
        horse1.setHorseYear(1997);

        horse2.setHorseName("Lopez");
        horse2.setHorseColour("Ebony");
        horse2.setHorseYear(2002);
        horse2.setNoOfRaces(19);

        System.out.println("The horse " + horse1.getHorseName() + " is of the colour " +horse1.getHorseColour() +
                " and was born in " + horse1.getHorseYear());

        System.out.println("The horse " + horse2.getHorseName() + " is of the colour " +horse2.getHorseColour() +
                " and was born in " + horse2.getHorseYear() + " and has been in " + horse2.getNoOfRaces() + " races");
    }
}
