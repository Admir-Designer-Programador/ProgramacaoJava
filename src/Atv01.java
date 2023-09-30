public class Atv01 {
    public static void main(String[] args) {
        String[] listaprofessores = {"Alana", "Thiago", "Samanta", "Alexia", "Alexia", "Odirlei"};
        for (int contador = 0; contador < listaprofessores.length;contador++){
            System.out.println("O indice atual é  " +contador);
            if (contador == 0){
                System.out.println("O numero de indice do(a) professor(a)"+listaprofessores[contador]+ "é Zero");
            } else if (contador % 2 == 0) {
                System.out.println("O numero de indice do(a) professor(a)"
                        + listaprofessores[contador] + "E par");
            }else{
                System.out.println("O numero de indice do(a) professor(a)"
                        +listaprofessores[contador]+"E impar");
                }
            }
        }
    }
