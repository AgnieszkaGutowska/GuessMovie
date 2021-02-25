
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GuessTheMovie {

    public static void main(String [] args ) throws Exception{
        File file=new File ("movies.txt");
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file);

        int count=0;
        while(scanner.hasNextLine()){
            scanner.nextLine();
            count++;
        }
        System.out.println(count);// wyświetli listę

        String films[] = new String[count];

        count = 0;
        while(scanner2.hasNextLine()){
            String line = scanner2.nextLine();
            films[count] = line;
            count++;

        }

        Random random= new Random();
        String cinema=films[random.nextInt(count)];

        System.out.println(cinema);
        char[] cinemaArray = cinema.toCharArray();
        System.out.println(cinemaArray);

        System.out.println("System wybrał tytuł filmu: ");
        String zmiana = cinema.replaceAll("[a-z]","_");
        char[] zmianaArray = zmiana.toCharArray();
        System.out.println( "Spróbuj zgadnąć:  ");

        Scanner scanner1 = new Scanner(System.in);
        for (int i=10; i>0; i--) {
            System.out.println("Masz " + i + " prób.");
            String guess = scanner1.nextLine();
            char[] guessArray = guess.toCharArray();
            int a = cinema.indexOf(guess);
            // System.out.println(a);


            if (guess.equals(cinema)) {
                System.out.print("Gratuluję wygranej!");

            }
            else if(i == 1 && !guess.equals(cinema)) {

                System.out.println("Przegrana");
            }
            else if (a == -1) {
                System.out.println("Brak litery, spróbuj ponownie");
            }

            else if(a!=-1) {
                System.out.println(a);
                zmianaArray[a] = guess.charAt(0);
                System.out.println(zmianaArray);


                int b = cinema.indexOf(guess, a + 1);
                if (b != -1) {
                    System.out.println(b);
                    zmianaArray[b] = guess.charAt(0);
                    System.out.println(zmianaArray);


                }
            }

        }

        }

        }












