import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 16.2));
    }
    public static String permission(int age,double temperature) {
        if(20 <= age && age <= 45 && -20<=temperature&&temperature<=30){
            return "Можно идти гулять";
        }
        else if (age < 20) {
            if (0 <= temperature && temperature <= 28) {
                return "Можно идти гулять";
            }
        } else if (age > 45) {
            if (-10 <= temperature && temperature <= 25) {
                return "Можно идти гулять";
            }
        }
        return "Оставайтесь дома";
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(80);
    }


}