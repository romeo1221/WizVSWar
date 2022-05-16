
public class App {
    public static void main(String[] args) {
        System.out.println("Wizards and Warlocks");

        //Wizard and Warlock object class inheriting Character Class
        Wizard Wiz = new Wizard("Wizard", 1, 300, 200);
        Warlock War = new Warlock("Warlock",1,300,200);

        //character actions sequence
        //1 skill required per round
        System.out.print("\n");
        //Displaying Character name and details
        Wiz.displayName();
        Wiz.displaydetails();
        War.displayName();
        War.displaydetails();

        //first round match
        System.out.println("\n-------------------");
        System.out.println("Let The Game Star!\n");
        System.out.println("Round 1\n");
        System.out.println("FIGHT!");
        //skill casts
        Wiz.SuntokniManny(War,Wiz);
        War.Friendzone(Wiz,War);
        //displaying current character details
        System.out.print("\n");
        Wiz.displaydetails();
        War.displaydetails();

        //second round match
        System.out.println("Round 2\n");
        System.out.println("FIGHT!");
        //skill casts
        War.EverlastingAnglit(Wiz,War);
        Wiz.GripoSaTagiliran (War,Wiz);
        //displaying current character details
        System.out.print("\n");
        Wiz.displaydetails();
        War.displaydetails();

        //Third round match
        System.out.println("Round 3\n");
        System.out.println("FIGHT!");
        //skill casts
        Wiz.HealingGaling();
        War.Friendzone(Wiz,War);
        //displaying current character details
        System.out.print("\n");
        Wiz.displaydetails();
        War.displaydetails();

        //Fourth round match
        System.out.println("Round 4\n");
        System.out.println("FIGHT!");
        //skill casts
        War.EverlastingAnglit(Wiz,War);
        Wiz.SuntokniManny(War,Wiz);
        //displaying current character details
        System.out.print("\n");
        Wiz.displaydetails();
        War.displaydetails();

        //Displaying the Winner



    }
}