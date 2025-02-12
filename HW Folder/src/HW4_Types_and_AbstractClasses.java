public class HW4_Types_and_AbstractClasses {
    public static void main(String args[]) {

    }
}

class Zoo {
    public Zoo() {

    }
}

abstract class Animal {
    public abstract void makeSounds();
    public abstract String getDiet();
}

class Mammal extends Animal {
    String furType;

    public Mammal(String furType) {
        this.furType = furType;
    }

    @Override
    public void makeSounds() {
        System.out.println("Generic Mammal Sound");
    }

    @Override
    public String getDiet() {
        return "Omnivore";
    }
}

class Bird extends Animal implements Trainable {
    double Wingspan;

    @Override
    public void makeSounds() {
        System.out.println("CAW CAW");
    }

    @Override
    public String getDiet() {
        return "Insectivore";
    }

    @Override
    public void performTrick() {
        System.out.println("Fly Eagles Fly");
    }
}
