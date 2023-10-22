import java.util.Arrays;

public class Vetores {
  public static void main(String[] args) {
    
    /*
     * Arrays de números
     * não misturar strings e números num mesmo array
     */
    // int[] numeros = new int[5];
 
    // /*[0] [1] [2] [3] [4] */
    // numeros[0] = 1;
    // numeros[1] = 2;
    // numeros[2] = 3;
    // numeros[3] = 4;
    // numeros[4] = 5;
    
    // for(int i = 0; i < numeros.length; i++){
    //    System.out.println(numeros[i]);
    // }

    /*------------------------------------------ */
    /*
     * Array de letras
     */

    //  String[] letras = new String[5];

    //   letras[0] = "J";
    //   letras[1] = "A";
    //   letras[2] = "C";
    //   letras[3] = "I";
    //   letras[4] = "L";

    // for(int i = 0; i < letras.length; i++){
    //    System.out.println(letras[i]);
    // }

    /*Versao simplificada */

    /*  String[] letras = {"J", "A", "C", "I", "L ",};
    for(int i = 0; i < letras.length; i++){
      System.out.println(letras[i]);
    } */

    // /*Versao melhorada, já traz em formato array */
    String[] letras = {"J", "A", "C", "I", "L ",};
    
      System.out.println(Arrays.toString(letras));

  }
  
  }

 

