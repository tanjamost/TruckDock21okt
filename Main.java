import java.util.*;

public class Main {

    static final List<String> station = new ArrayList<>();  //key ord konstant, kommer inte att ändras

    static final List<Vehicle> kaj = new ArrayList<>();


    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        station.add("A");  //har index 0 osv
        station.add("B");
        station.add("C");//lägger kajplatser i List station
        station.add("D");
        station.add("E");

        for (int i = 0; i < 5; i++) {
            kaj.add(null);                    //skapar fem toma lastkajer i List kaj
        }

        int HuvudMeny;
        System.out.println("Välkommen!");

        while (true) {
            System.out.println("1 - Se parkerade lastbilar");           // Menu val från användaren
            System.out.println("2 - Registrera ny avlastande lastbil");
            System.out.println("3 - Avsluta");

            HuvudMeny = sc.nextInt();

            if (HuvudMeny == 1) {                               //val att se parkerade bilar
                {
                    for (int i = 0; i < 5; i++) {
                        if (kaj.get(i) != null) {
                            System.out.println("Lastkaj " + station.get(i));
                            System.out.println(kaj.get(i));                     //(i)= return "Skåpbil, vikt = " + vikt; från barnClass
                        }
                    }
                }
            } else if (HuvudMeny == 2) {

                {
                    Vehicle vehicle;                              // initialiserar var klass Vehicle med namn vehicle
                    int typ;

                    while (true) {

                        System.out.println("Typer av lastbilar:");          // val typ av bil från användaren
                        System.out.println("1. Skåpbil ");
                        System.out.println("2. Lätt lastbil");
                        System.out.println("3. Tung lastbil");
                        System.out.print("Väl typ av lastbil: ");

                        typ = sc.nextInt();
                        if (typ < 1 || typ > 3) {
                            System.out.println("\nFel val av typ, \nvälj igen!\n");
                        } else {
                            break;
                        }
                    }


                    System.out.println("Mata in vikt: ");
                    int vikt = sc.nextInt();

                    if (typ == 1) {
                        vehicle = new MiniVan(vikt);            //skapar objekt MiniVan
                    } else if (typ == 2) {
                        vehicle = new LitenLastbil(vikt);
                    } else {
                        vehicle = new StorLastbil(vikt);
                    }

                    int  kajIndex = -1;                          // sätter in utgångs värde, alla kajer är upptagna (om villkor på typ/vikt inte utförs)

                    if (vehicle.getTyp() == 1) {                // om vald biltyp 1
                        if (kaj.get(0) == null) {               // ==null-> kaj är ej upptagen
                            kajIndex = 0;                       // skriver kajIndex 0, som får värde "A" från list "station"
                        } else if (kaj.get(1) == null) {
                            kajIndex = 1;                        //...och kan få kajIndex "В" från list "station" osv
                        }
                    } else if (vehicle.getTyp() == 2) {
                        if (kaj.get(2) == null) {
                            kajIndex = 2;
                        } else if (kaj.get(3) == null) {
                            kajIndex = 3;
                        } else if (vehicle.getVikt()<5000 && kaj.get(0) == null) {
                            kajIndex = 0;
                        }
                    } else if (vehicle.getTyp() == 3) {
                        if (kaj.get(4) == null) {
                            kajIndex = 4;
                        } else if (vehicle.getVikt()<9000 && kaj.get(3) == null) {
                            kajIndex = 3;
                        }
                    }

                    if (kajIndex == -1) {                   // om alla kajIndex upptagna
                        System.out.println("Tyvärr är det fullt, du hänvisas till stationen \"Dumpa mest!\"");
                    } else {
                        System.out.println("Lastbil registrerad för kaj " + station.get(kajIndex));     //...+ "värdet" som tillhör index i list "kaj"
                        kaj.set(kajIndex, vehicle);             //enligt kajIndex tillsätter Typ av bil
                    }
                }
            } else if (HuvudMeny == 3) {
                break;
            } else {
                System.out.println("\nFel val, \nbörja igen!\n");
            }
        }
        System.out.println("Avslutat");
    }

}
