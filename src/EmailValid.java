import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValid {
    public static void main(String[] args) {
        String email = "example@mailcom";
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher matcher = pattern.matcher(email);

        try {
            if (matcher.matches()) {
                System.out.println("Valid email address!");
            } else {
                throw new CustomEmailFormatException("Invalid email address: " + email);
            }
        } catch (CustomEmailFormatException e) {
            logError(e.getMessage());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка при обработке данных: " + e.getMessage());
            logError(e.getMessage());
        }
    }

    private static void logError(String message) {
        try (FileWriter log = new FileWriter("logs.txt")) {
            log.write(message);
        } catch (IOException ex) {
            throw new RuntimeException("Ошибка при записи в лог файл: " + ex.getMessage());
        }
    }
}