package Classes.hw2;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    
    Fighter startingFighter;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            if(startingFighter == f1){
                if(f2.dodge()) System.out.println(f1.name+" is missed!");
                else f2.health = f1.hit(f2);
            }
            if(startingFighter == f2){
                if(f1.dodge()) System.out.println(f2.name+" is missed!");
                else f1.health = f2.hit(f1);
            }
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                if(f2.dodge()) System.out.println(f1.name+" is missed!");
                else {
                    f2.health = f1.hit(f2);
                    if(isWin()) break;
                }
                if(f1.dodge()) System.out.println(f2.name+" is missed!");
                else {
                    f1.health = f2.hit(f1);
                    if(isWin()) break;
                }
                printScore();
            }

        } else {
            System.out.println("Fighter's weights are not matches!");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner is : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Winner is : " + f2.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " HP Left \t:" + f1.health);
        System.out.println(f2.name + " HP Left \t:" + f2.health);
    }

    public void setStarterFighter(){
        double randomStarter = Math.random();
        if (randomStarter<0.5){
            startingFighter = f1;
        }
        else startingFighter = f2;
        System.out.println("Starting Fighter is : "+startingFighter.name);
    }
}