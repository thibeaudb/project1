import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = null;
        Dog dog2 = null;
        Dog dog3 = null;
        boolean repeat = true;
        while (repeat) {
            System.out.println( "Hallo, welkom bij ons hondjes hotel!");
            System.out.println("Wat wil je doen?");
            System.out.println("1. Een hond toevoegen. ");
            System.out.println("2. Een hond verwijderen. ");
            System.out.println("3. Een overzicht van de honden die aanwezig zijn. ");
            System.out.println("4. Programma afsluiten. ");
            System.out.println("Voer uw keuze in (1/2/3/4): ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                if (dog1 != null && dog2 != null && dog3 != null) {
                    System.out.println("Het hotel zit vol. ");
                }
                else {
                    System.out.println("Geef de naam van je hond in: ");
                    String name = scanner.next();

                    System.out.println("Geef het ras van je hond in: ");
                    String race = scanner.next();

                    System.out.println("Geef het kleur van je hond: ");
                    String color = scanner.next();

                    System.out.println("Geef de leeftijd van de hond in: ");
                    int age = scanner.nextInt();

                    System.out.println("Geef het geslacht van de hond in: ");
                    String sex = scanner.next();

                    System.out.println("Is de hond gesteriliseerd (ja/nee)?: ");
                    String sterilized = scanner.next();
                    boolean isSterilized = false;
                    if (sterilized.equals("ja")) {
                        isSterilized = true;
                    }
                    System.out.println("Is de hond gevaccineerd (ja/nee)?: ");
                    String vaccination = scanner.next();
                    boolean isVaccinated = false;
                    if (vaccination.equals("ja")) {
                        isVaccinated = true;
                    }
                    if (dog1 == null) {
                        dog1 = new Dog();
                        dog1.name = name;
                        dog1.race = race;
                        dog1.color = color;
                        dog1.age = age;
                        dog1.sex = sex;
                        dog1.sterilized = isSterilized;
                        dog1.vaccination = isVaccinated;
                    }
                    if (dog2 == null) {
                        dog2 = new Dog();
                        dog2.name = name;
                        dog2.race = race;
                        dog2.color = color;
                        dog2.age = age;
                        dog2.sex = sex;
                        dog2.sterilized = isSterilized;
                        dog2.vaccination = isVaccinated;
                    }
                    if (dog3 == null) {
                        dog3 = new Dog();
                        dog3.name = name;
                        dog3.race = race;
                        dog3.color = color;
                        dog3.age = age;
                        dog3.sex = sex;
                        dog3.sterilized = isSterilized;
                        dog3.vaccination = isVaccinated;
                    }
                    System.out.println("De hond " + name + " is toegevoegd");

                }
            }
            if (choice == 2) {
                System.out.println("Hoe noemt de hond die je wilt verwijderen? ");
                String deleteDog = scanner.next();
                if (dog1 != null) {
                    if (dog1.name == deleteDog) {
                    dog1 = null;
                    System.out.print(dog1.name + " is definitief verwijderd. ");
                    }
                }
                if (dog2 != null) {
                    if (dog2.name == deleteDog) {
                        dog2 = null;
                        System.out.print(dog2.name + " is definitief verwijderd. ");
                    }
                }
                if (dog3 != null) {
                    if (dog3.name == deleteDog) {
                        dog3 = null;
                        System.out.print(dog3.name + " is definitief verwijderd. ");
                    }
                }
            }
            if (choice == 3) {
                System.out.println(dog1.name);
                if (dog1 == null && dog2 == null && dog3 == null) {
                    System.out.println("Op dit moment zijn er geen honden beschikbaar");
                }
                else {
                    if (dog1 != null) {
                        System.out.println("De naam van deze hond is " + dog1.name + ".");
                        System.out.println("Het ras van de hond is een " + dog1.race + ".");
                        System.out.println("De hond heeft als kleur " + dog1.color + ".");
                        System.out.println("De hond is " + dog1.age + " jaar oud.");
                        System.out.println("Het geslacht van de hond is een" + dog1.sex);
                        if (dog1.sterilized) {
                            System.out.println("De hond is gesteriliseerd.");
                        } else System.out.println("De hond is niet gesteriliseerd ");
                        if (dog1.vaccination) {
                            System.out.println("De hond is gevaccineerd");
                        } else System.out.println("De hond is niet gevaccineerd");
                    }
                    if (dog2 != null) {
                        System.out.println("De naam van deze hond is " + dog2.name + ".");
                        System.out.println("Het ras van de hond is een " + dog2.race + ".");
                        System.out.println("De hond heeft als kleur " + dog2.color + ".");
                        System.out.println("De hond is " + dog2.age + " jaar oud.");
                        System.out.println("Het geslacht van de hond is een " + dog2.sex);
                        if (dog2.sterilized) {
                            System.out.println("De hond is gesteriliseerd.");
                        } else System.out.println("De hond is niet gesteriliseerd ");
                        if (dog2.vaccination) {
                            System.out.println("De hond is gevaccineerd");
                        } else System.out.println("De hond is niet gevaccineerd");
                    }

                    if (dog3 != null) {
                        System.out.println("De naam van deze hond is " + dog3.name + ".");
                        System.out.println("Het ras van de hond is een " + dog3.race + ".");
                        System.out.println("De hond heeft als kleur " + dog3.color + ".");
                        System.out.println("De hond is " + dog3.age + " jaar oud.");
                        System.out.println("Het geslacht van de hond is een " + dog3.sex);
                        if (dog3.sterilized) {
                            System.out.println("De hond is gesteriliseerd. ");
                        } else System.out.println("De hond is niet gesteriliseerd. ");
                        if (dog3.vaccination) {
                            System.out.println("De hond is gevaccineerd");
                        } else System.out.println("De hond is niet gevaccineerd");
                    }
                }
            }
            if (choice == 4) {
                System.out.print("Het programma word afgesloten.");
                System.exit(0);
            }
        }
        scanner.close();
    }
}