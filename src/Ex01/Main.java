package Ex01;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] args){
        double medida_em_metros = 8250, m = medida_em_metros;
        
        System.out.println("Área em metros quadrados: " + m + 
                "\nÁrea em pés quadrados: " + ConversaoDeUnidadesDeArea.getPesConv(m) + 
                "\nÁrea em centímetros quadrados: " + ConversaoDeUnidadesDeArea.getCentimetrosConv(m) + 
                "\nÁrea em acres: " + ConversaoDeUnidadesDeArea.getAcresConv(m));
    }
}
