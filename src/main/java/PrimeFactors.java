import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        generate(30);

    }

    public static void generate(int number){
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int divisor = 2;
        while (number > 1){
            if (number % divisor == 0){
                primeFactors.add(divisor);
                number = number / divisor;
            }
            else{
                divisor++;
            }
        }

        if (primeFactors.size() >= 1){
            System.out.print(primeFactors.get(0));
            for (int i = 1; i < primeFactors.size(); i++){
                System.out.print("," + primeFactors.get(i));
            }
        }

    }
}
