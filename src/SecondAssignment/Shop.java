package SecondAssignment;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop extends AWeapon{
    public Shop() throws InterruptedException {
        List<AWeapon> cart = new ArrayList<>();
        Axe axe = new Axe();
        Staff staff = new Staff();
        Shield shield = new Shield();



        Scanner sc = new Scanner(System.in);
        System.out.println("This is our armor shop, would you like to purchase anything?");


        boolean isPlaying = true;
        do {
            System.out.println("1. - Axe");
            System.out.println("2. - Shield");
            System.out.println("3. - Staff");
            System.out.println("4. - Show inventory");
            System.out.println("0. - Exit");
            int choice = sc.nextInt();
            switch (choice) {

                case 1 -> {
                    System.out.println("You added an axe to your inventory");
                    cart.add(axe);
                    Thread.sleep(3000);

                }
                case 2 -> {
                    System.out.println("You have added a shield to your inventory");
                    cart.add(shield);
                    Thread.sleep(3000);
                }
                case 3 -> {
                    System.out.println("You have added a Staff to your inventory");
                    cart.add(staff);
                    Thread.sleep(3000);
                }
                case 4 -> {for (AWeapon weapon : cart) {
                    System.out.println(weapon.getClass().getSimpleName());
                    Thread.sleep(3000);
                } }
                case 0 -> {
                    System.out.println("Thank you for adding these items to your inventory, goodbye");
                    Thread.sleep(1500);
                    isPlaying = false;
                }
                default -> {
                    System.out.println("Wrong input, try again");
                    Thread.sleep(3000);
                }
            }

        } while(isPlaying);
    }
}


