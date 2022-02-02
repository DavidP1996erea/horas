package principal;

public class Hora {
    private int segundos;
    private int minutos;
    private int horas;

    public Hora(){

    }






    public void aumentoHoras(){
        if (horas +1 == 24) {
            horas = 0;
        }else{
            horas++;
        }

    }

    public void aumentoMinutos(){

        if (minutos +1 == 60) {
            minutos = 0;
            aumentoHoras();
        }else{
            minutos++;
        }
    }

    public void aumentoSegundos(){

        segundos++;
        if(segundos==60) {
            segundos = 0;
          aumentoMinutos();
        }
    }





    public int getSegundos() {

        return segundos;
    }

    public void setSegundos(int segundos)  throws Exception {
        if (segundos >= 0 && segundos < 60){
            this.segundos = segundos;
      }else if(segundos==60){
            this.segundos=0;
        }else {
            throw new Exception("Número inválido");
        }
    }


    public int getMinutos() {

        return minutos;
    }

    public void setMinutos(int minutos) {

        if (minutos >= 0 && minutos < 60){
            this.minutos = minutos;
        }else if(minutos==60){
            this.minutos=0;
        }else {

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
