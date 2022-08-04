package Ex02;

/**
 *
 * @author Jv Loreti
 */

public class ConversaoDeUnidadesDeTempo{
    public final static double ANO = 365.25;
    public final static double MES = 30;
    public final static double SEMANA = 7;
    public final static double HORA = 24;
    public final static double MINUTO = 60;
    public final static double SEGUNDO = 3600;
    
    private static double anoConv;
    private static double mesConv;
    private static double semanaConv;
    private static double diaConv;
    private static double horaConv;
    private static double minutoConv;
    private static double segundoConv;
    
    public static double getAnoConv(double dias){
        anoConv = dias / ANO;
        return anoConv;
    }
    public static double getMesConv(double dias){
        mesConv = dias / MES;
        return mesConv;
    }
    public static double getSemanaConv(double dias){
        semanaConv = dias / SEMANA;
        return semanaConv;
    }
    public static double getDiaConv(double dias){
        return dias;
    }
    public static double getHoraConv(double dias){
        horaConv = dias * HORA;
        return horaConv;
    }
    public static double getMinutoConv(double dias){
        horaConv = getHoraConv(dias);
        minutoConv = horaConv * MINUTO;
        return minutoConv;
    }
    public static double getSegundoConv(double dias){
        horaConv = getHoraConv(dias);
        segundoConv = horaConv * SEGUNDO;
        return segundoConv;
    }
}
