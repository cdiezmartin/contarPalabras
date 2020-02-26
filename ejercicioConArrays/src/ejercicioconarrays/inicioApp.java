package ejercicioconarrays;

public class inicioApp {

    private char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    int [] contadorTotal=new int[letras.length];
    int contadorPalabras(String frase) {
        int contador = frase.length();
        return contador;
    }

    void mostrarResultado(String frase) {
        int contador = 0;
        for (int i = 0; i < letras.length; i++) { //Recorro el array y muestro todo.
            char letra = letras[i];
            for (int j = 0; j < frase.length(); j++) {
                char letraas = frase.charAt(j);

                if (letra == letraas) {
                    contadorTotal[i]++;
                }
               
            }
        }
        for (int i = 0; i < letras.length; i++) {
         if (contadorTotal[i]==1){
                 System.out.println("" + letras[i] + " esta repitida " + contadorTotal[i] + " vez");   
                }else if (contadorTotal[i]>1){
                    System.out.println("" +letras[i] + " esta repetida " + contadorTotal[i] + " veces");
                }
        }
    }
}