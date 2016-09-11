package Francis_Pet_supply;

/**
 * Created by ACfan on 11/09/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        PetSold pet1 = new PetSold();

        item1.setInvoiceNo(1);
        item1.setDescription("Flea Pills");
        item1.setPrice(15.00);

        pet1.setInvoiceNo(2280);
        pet1.setDescription("Black Panther");
        pet1.setPrice(50000.00);
        pet1.setVaccinated(true);
        pet1.setNeutered(true);
        pet1.setHouseBroken(false);

        System.out.println("Item with invoice No. " + item1.getInvoiceNo() + " has the description " +
                item1.getDescription() + " and a price of " + item1.getPrice());

        System.out.println("\n\nItem with invoice No. " + pet1.getInvoiceNo() + " has the description " +
                pet1.getDescription() + " and a price of " + pet1.getPrice() + "\nIs this pet vaccinated?\n" +
        pet1.getVaccinated() + "\nIs this pet neutered?\n" + pet1.getNeutered() + "\nIs this pet housebroken?\n" +
                pet1.getHouseBroken());
    }
}
