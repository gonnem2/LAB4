import java.io.IOException;

class Main {
    public static void main(String[] arr) {
        int sum = 0;
        try{
            for (int i = 0; i <= arr.length; i++){
                sum += Integer.parseInt(arr[i]);
            }
            System.out.println(sum / arr.length);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(sum / arr.length);
        }
        catch (NumberFormatException e){
            System.out.println("Плохое число");
        }
    }

}