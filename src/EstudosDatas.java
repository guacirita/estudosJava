import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class EstudosDatas {

  public static void main(String[] args) {

    /*
     * strings e datas
     */
    /* Olá, {nome}. Hoje é {dia-da-semana}. Bom dia. */

    String nome = "Jacira";
    System.out.println(nome);

    // ISO 8601
    /* importa o LocalDate */
    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale("pt", "BR");
    // Locale brasil = new Locale(language: "pt", country: "BR");
    System.out.println(hoje); /* aparece em ingles a informacao */
    System.out.println(hoje.getDayOfWeek());
    System.out.println(hoje.getDayOfMonth());
    System.out.println(hoje.getMonthValue());
    System.out.println(hoje.getDayOfYear());

    System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
    String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
    String saudacao;

    LocalDateTime agora = LocalDateTime.now();
    if (agora.getHour() >= 0 && agora.getHour() < 12) {
      saudacao = "Bom dia";      
    } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
      saudacao = "Boa tarde";
    } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
      saudacao = "boa noite";
    } else {
      saudacao = "Olá, ";
    }

    System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaDaSemana, saudacao.toUpperCase());
  }
}
