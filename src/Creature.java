/**
 * Created by k1763969 on 30/10/17.
 */
public class Creature {

    int energy, fullness, happiness;
    String name;

    public Creature(String name) {
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }

    public void eat() {
        if (fullness >= 12) {
            System.out.println("Woops, " + this.getName() + " is already full");
        } else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;

            if (fullness > 15) {fullness = 15;}
            System.out.println("Yum!");
        }
    }

    public void sleep() {
        if (energy >= 12) {
            System.out.println("Woops, " + this.getName() + " is not tired");
        } else {
            energy += 8;
            happiness -= 5;
            fullness -= 5;

            if (energy > 15) {energy = 15;}
            System.out.println( this.getName() + "has had a great Nap!");
        }
    }

    public void play() {
        if (happiness <= 7) {
            happiness += 8;
        } else {
            happiness = 15;
        }
        energy -= 6;
        fullness -= 4;
        System.out.println("Fun!");
    }

    public string checkstatus() {
        String status = "";

        if (happiness <= 0 || energy <= 0 || fullness <= 0) {
            System.out.println(this.getName() + "has died! You are a failure");
            Systen.exit( status:0 );

        }

        if (happiness <= 6) {
            status += "Oh, " + this.getName() + " is feeling sad! \n";
        }
        if (energy <= 6) {
            status += "Hmm, " + this.getName() + " is feeling tired!\n";
        }
        if (fullness <= 6) {
            status += "Oops, " + this.getName() + " is feeling hungry!\n";
        }

    }
    public String getName() {
        return name;
    }


}