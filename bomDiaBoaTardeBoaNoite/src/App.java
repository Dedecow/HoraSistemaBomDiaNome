import java.util.Scanner;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        // Obter o horário atual do sistema
        LocalTime currentTime = LocalTime.now();

        // Exibir as horas do sistema
        int hours = currentTime.getHour();
        int minutes = currentTime.getMinute();
        int seconds = currentTime.getSecond();

        System.out.printf("Horário atual: %02d:%02d:%02d%n", hours, minutes, seconds);
        if (hours < 12 ){
            System.out.println("Bom dia, " + nome + ", como você está? ");
        }else{
            if(hours > 18 && hours <24){
            System.out.println("Boa tarde, " + nome + ", como você está? ");
            }else{
                System.out.println("Boa noite, " + nome + ", como você está? ");
            }
        }


        System.out.println("~Codado por Andreh Silveira para o curso Lets Code - Santander aula algorítmos,a fração que usa hora do sistema em java peguei da internet");
    }
}
