import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(home(generateAge(),53));
        System.out.println(home(generateAge(),14));
        System.out.println(home(generateAge(),20));
        System.out.println(home(generateAge(),58));
        System.out.println(home(generateAge(),12));

    }

    public static String home(int age, int temperature) {

        if (age > 20 && age < 45 && temperature > -20 && temperature < 35) {
            return "you can go for a walk";
        } else if (age < 20 && temperature > -20 && temperature < 30) {
            return "you can go for a walk";
        }
        else if(age > 45 && temperature > -10 && temperature <25){
            return "you can go for a walk";
        }else {
            return "stay ar home";
        }
    }
    public static int generateAge(){
        Random random= new Random();
        int s = random.nextInt(100)+1;
        return s;
    }
} 