public class Main {

 
  public static void main(String[] args) {

    /**
     * numeros inteiros e float
     * no exemplo da divisao, se colocar int, n~ao sairá decimal
     * se colocar só o float o resultado é 1.0
     * para ter o resulatdo correto usamos depois do igual (float)
     * int a;
     * int b = 2;
     * a = 3;
     * int soma = a + b;
     * int subtracao = a - b;
     * int multiplicacao = a * b;
     * float divisao = (float) a / b;
     * 
     * 
     * System.out.println(soma);
     * System.out.println(subtracao);
     * System.out.println(multiplicacao);
     * System.out.println(divisao);
     */

    /*
     * para boleano
     * 
     * boolean resultado = false;
     * System.out.println(resultado);
     */

    /*
     * operadores lógicos
     */

    // boolean fimDesemana = true;
    // boolean fazendoSol = true;
    // boolean vamosAPraia = fimDesemana && fazendoSol;

    /*
     * tabela verdade
     * operador && (AND)
     * só funciona se todas foram verdadeiras
     * true && true = true
     * true && false = false
     * false && true = false
     * false && false - false
     * 
     * operador || (OR)
     * tabela verdadeira
     * true && true = true
     * true && false = true
     * false && true = true
     * false && false - false
     */
    /*---------------------------------- */
    /*
     * Operador ternário
     * ? (se) : (ou)
     */

    // System.out.println(vamosAPraia);

    // String mensagem = fimDesemana ? "É fim de semana" : "Não é fim de semana";

    // System.out.println(mensagem);

    /*
     * Estrturas condicionais
     */

    /*
     * ----------------------------------
     */
    /*
     * média da nota do aluno
     * nota > ou = 70 - aluno aprovado
     * if / else
     */

    // int nota = 70;

    // if (nota >= 70) {
    // System.out.println("Aluno aprovado");
    // } else {
    // System.out.println("Aluno reprovado");
    // }

    /*
     * A 80 B 70 C 60 D 0
     */

    // if (nota > 80) {
    // System.out.println("Graduacao A");
    // } else if(nota < 80 && nota >= 70) {
    // System.out.println("Graduacao B");
    // } else if(nota < 70 && nota >= 60) {
    // System.out.println("Graduacao C");
    // } else if(nota < 60 && nota >= 0) {
    // System.out.println("Graduacao D");
    // } else {
    // System.out.println("Nota invalida");
    // }

    /*
     * Raforando o código
     */

    // int nota = 100;
    // String graduacao;

    // if (nota > 80) {
    //   graduacao = ("A");
    // } else if (nota < 80 && nota >= 70) {
    //   graduacao = ("B");
    // } else if (nota < 70 && nota >= 60) {
    //   graduacao = ("C");
    // } else if (nota < 60 && nota >= 0) {
    //   graduacao = ("D");
    // } else {
    //   graduacao = ""; /*deixa aspas vazias, pois colocando null dá erro */
    // }

    // switch(graduacao) {
    //   case "A":
    //   case "B":
    //     System.out.println("Aluno Aprovado");
    //     break;
    //   case "C":
    //   case "D":
    //     System.out.println("Aluno reprovado");
    //     break;
    //   default:
    //     System.out.println("Graduação inválida");
    // }

    /*
     * strings e datas
     */

  

    //  String nome = "Jacira";
    //  System.out.println(nome.toLowerCase());
    //  System.out.println(nome.toUpperCase());
    //  System.out.println(nome.length()); /*verifica o tamanho da string /numero caracter */
     
    //  String nomeOutro = "jacira";
    //  System.out.println(nome.equals(nomeOutro)); /*equals = exatamente igual */
    //  System.out.println(nome.equalsIgnoreCase(nomeOutro)); /*ignora se é maiuscula ou minuscula */

    /*------------------------------ */
       /*Olá, {nome}. Hoje é {dia-da-semana}. Bom dia. */
  }
}
