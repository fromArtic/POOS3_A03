package Ex02;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] args){
        double tempo_em_dias = 624, t = tempo_em_dias;
        
        System.out.println("Tempo de gestação em anos: " + ConversaoDeUnidadesDeTempo.getAnoConv(t) + 
                "\nEm meses: " + ConversaoDeUnidadesDeTempo.getMesConv(t) +
                "\nEm semanas: " + ConversaoDeUnidadesDeTempo.getSemanaConv(t) +
                "\nEm dias: " + ConversaoDeUnidadesDeTempo.getDiaConv(t) +
                "\nEm horas: " + ConversaoDeUnidadesDeTempo.getHoraConv(t) +
                "\nEm minutos: " + ConversaoDeUnidadesDeTempo.getMinutoConv(t) +
                "\nEm segundos: " + ConversaoDeUnidadesDeTempo.getSegundoConv(t));
    }
}
