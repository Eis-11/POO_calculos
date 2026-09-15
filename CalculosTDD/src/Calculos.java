
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        if(x>y){
           int temp = x;
           x = y;
              y = temp;
        }
        int suma=0;
        for(int i=x; i<=y; i++){
            suma=suma+i;
            return suma;
        }
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        float res=Math.abs(num);
        return res;
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
    int cantidad = 0;

    texto = texto.toLowerCase();

    for (int i = 0; i < texto.length(); i++) {
        char letra = texto.charAt(i);

        if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u') {
            cantidad++;
        }
    }

    return cantidad;
}


    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {

    String[] palabras = texto.split(" ");
    String resultado = "";

    for (int i = 0; i < palabras.length; i++) {

        String palabraInvertida = "";

        for (int j = palabras[i].length() - 1; j >= 0; j--) {
            palabraInvertida += palabras[i].charAt(j);
        }

        resultado += palabraInvertida;

        if (i < palabras.length - 1) {
            resultado += " ";
        }
    }

    return resultado;
}

}
