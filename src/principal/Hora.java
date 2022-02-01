package principal;

public class Hora {
    private int segundos;
    private int minutos;
    private int horas;

    public Hora(){

    }







    public void aumentosegundos(){

        segundos++;
        if(segundos==60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                horas++;

                if (horas == 24) {
                    horas = 0;
                }
            }
        }

    }



    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60){
            this.segundos = segundos;
      }else if(segundos==60){
            this.segundos=0;
        }else {
            System.out.println("Número inválido");
        }
    }


    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) throws Exception {

        if (minutos >= 0 && minutos < 60){
            this.minutos = minutos;
        }else if(minutos==60){
            this.minutos=0;
        }else {
            throw new Exception("Número inválido");
            //System.out.println("Número inválido");
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23){
            this.horas = horas;
        }else if(horas==24){
            this.horas=00;
        }else {
            System.out.println("Número inválido");
        }
    }

    public String toString(){

        return "son las -> " + getHoras() + ":" +getMinutos() + ":" + getSegundos();
    }
}
