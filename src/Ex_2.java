import java.io.*;

public class Ex_2 {

    public static void main(String[] args) {
        String str = "";
        try {
            FileReader read = new FileReader("exp.txt");
            int c;
            while ((c = read.read()) != -1){
                str += (char)(c);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файла - НЕТ!");
        } catch (IOException e) {
            System.out.println("Возникла ошибка при чтении файла");
        }

        try {
            FileWriter write = new FileWriter("exp2.txt");
            write.write(str);
            write.close();
        } catch (IOException e) {
            System.out.println("Фозникла ошибка при записи в файл");
        }

    }
}
