import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValid {
    public static void main(String[] args) {
        try{
        String email = "example@mail.com";
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+[.][A-Za-z]{2,}\\b");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address!"); }else{
            throw new CustomEmailFormatException("Invalid email adress" + email);
        }
    }
    catch (CustomEmailFormatException e){
        System.out.println(e.getMessage());}
        catch (Exception e) {
            System.out.println("Произошла ошибка при обработке данных: " + e.getMessage());
        }
    }


}
