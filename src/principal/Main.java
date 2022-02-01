package principal;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

    int segundos=0;


        Hora hora1 = new Hora();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date1= new Date();

        LocalTime hora = LocalTime.now();




        hora1.setSegundos(hora.getSecond());
        hora1.setHoras(hora.getHour());
      // hora1.setMinutos(hora.getMinute());

        System.out.println("Hoy es: " + formatoFecha.format(date1) + " y " + hora1.toString());

        System.out.println("Introduzca los segundos");
        segundos=sc.nextInt();






    }
}
