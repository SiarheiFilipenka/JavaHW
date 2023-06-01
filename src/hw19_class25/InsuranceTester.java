package hw19_class25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTester {
    public static void main(String[] args) {

        List<Insurance> insuranceList = new ArrayList<>();
        insuranceList.add(new Car("Tahoe"));
        insuranceList.add(new Pet("Cat"));
        insuranceList.add(new Health());

        for (int i = 0; i < insuranceList.size(); i++) {
            insuranceList.get(i).getQuote();
            insuranceList.get(i).cancelInsurance();
        }

        System.out.println("==========================================================");

        for (Insurance insurance : insuranceList) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }

        System.out.println("==========================================================");

        Iterator<Insurance> iterator = insuranceList.iterator();
        while (iterator.hasNext()) {
            Insurance insurance = iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}