package hw19_class25;

public abstract class Insurance {
    private String insuranceName;

    public abstract void getQuote();

    public abstract void cancelInsurance();
}

class Car extends Insurance {
    private String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("The Quote for " + carModel + " is 210$/month");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Insurance for " + carModel + " is canceled");
    }
}

class Pet extends Insurance {
    private String petType;

    public Pet(String petType) {
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("The Quote for " + petType + " is 5$/month");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Insurance for " + petType + " is canceled");
    }
}

class Health extends Insurance {
    @Override
    public void getQuote() {
        System.out.println("Health insurance quote is 150$/month");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Health insurance is canceled");
    }
}