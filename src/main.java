import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String text = "Hej\nJag heter inte Staffan\nMen däremot heter jag Ismail ;)";
        logikKlass logik = new logikKlass();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();

            System.out.println(text);

            System.out.println();
            
            logik.räknaTecken(text);
            logik.räknaRader(text);

            System.out.println("Skriv 'stop' för att stopa processen");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        }

        scanner.close();
    }
}
