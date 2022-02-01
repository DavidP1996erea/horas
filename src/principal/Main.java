package principal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner sc = new Scanner(System.in);

    int segundos=0;
    int segundosExtras=0;
    int horas=0;
    int minutos=0;


        Hora hora1 = new Hora();
        LocalDate fecha = LocalDate.now();

        System.out.println("Introduce las horas");
        horas=sc.nextInt();

        System.out.println("Introduce los minutos");
        minutos=sc.nextInt();

        System.out.println("Introduce los segundos");
        segundos=sc.nextInt();



    try{

        hora1.setSegundos(segundos);

    }catch (Exception e){

        System.out.println("Introduzca un valor válido, entre 0 y 60");
        segundos=sc.nextInt();

        hora1.setSegundos(segundos);
    }


        hora1.setHoras(horas);

        hora1.setMinutos(minutos);



        System.out.println("Hoy es: " + fecha.getDayOfMonth() +"/" + fecha.getMonthValue() + "/" + fecha.getYear()  + " y " + hora1.toString());


        System.out.println("Introduce los segundos que quieres añadir");
        segundosExtras=sc.nextInt();


        for (int i=0; i<segundosExtras ; i++){

            hora1.aumentoSegundos();
            System.out.println(hora1.toString());

        }






    }
}
