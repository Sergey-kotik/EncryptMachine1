import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encrypt encrypt = new Encrypt();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        boolean isExit = false;
        while (!isExit) {
            try {
                System.out.println("Что будем шифровать? М? если надо выйти просто введи \"s\"");
                String str = scanner.nextLine();
                if(str.equals("s")) {
                    isExit = false;
                    break;
                }
                System.out.println("А теперь задай мне сдвиг от 0 до 32");
                int i = scanner.nextInt();
                String resEnc = encrypt.enCrypt(str, i);
                System.out.print("Вот твой шифр --> ");
                System.out.println(resEnc + " , и время совершения сей операции "
                        + dateFormat.format(calendar.getTime()));
                    System.out.print("Вот твой исходник --> ");
                    String resDec = encrypt.deCrypt(resEnc, i);
                    System.out.println(resDec + " , и время совершения сей операции "
                            + dateFormat.format(calendar.getTime()));
            } catch (Exception e) {
                System.out.println("Выход за пределы сдвига, введите от 0 до 32");
            }
        }
    }
}
