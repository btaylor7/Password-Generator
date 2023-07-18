import java.util.Random;

public class Generator {

    public static final String UPPERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowers = "abcdefghijklmnopqrstuvwxyz";
    public static final String numbers = "1234567890";
    public static final String punctuation = "-,./?!%^*()";

    public static final String characters = UPPERS + lowers + numbers + punctuation;


    public static String generate1(int length){
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }
        return password.toString();

    }

    public static String generate2(int length){
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        String LettersAndNumbers = UPPERS + lowers + numbers;
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(LettersAndNumbers.length());
            password.append(LettersAndNumbers.charAt(randomIndex));
        }
        return password.toString();

    }

    public static String generate3(int length){
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(UPPERS.length());
            password.append(UPPERS.charAt(randomIndex));
        }
        return password.toString();
    }

    public static String generate4(int length){
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(lowers.length());
            password.append(lowers.charAt(randomIndex));
        }
        return password.toString();
    }

    public static String generate5(int length){
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(numbers.length());
            password.append(numbers.charAt(randomIndex));
        }
        return password.toString();
    }

    public static String generate6(int length){
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        String UppersAndNumbers = UPPERS + lowers;
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(UppersAndNumbers.length());
            password.append(UppersAndNumbers.charAt(randomIndex));
        }
        return password.toString();
        }
    }

