public class LacosNumericos {
  
  public static void main(String[] args) {
    // 1 2 3 4 5 6 7 8 9 10
    /*
     * para uma variável que inicia em 1 e vai até 10
     * mudando 1 po 1, faca:
     */

     /*for(int i = 1; i <= 10; i+=2) soma 2 */

    //  for(int i = 1; i <= 10; i++) { 
    //   System.out.println(i);
    //  }

     /*
      *laços aninhados
      * usando um for dentro do outro para multiplicar
      */
      // o i só muda quando executar o j
      for(int i = 1; i <= 10; i++) { 
        for(int j = 1; j <= 10; j++) {
        // System.out.println(j * i);
        /*
         * melhorando o código para ficar 1 X 1 = 1
         */
        System.out.println(j + " X " + i + " = " + j * i);
     }
    }
  }
}
