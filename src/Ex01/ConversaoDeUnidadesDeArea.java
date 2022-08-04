package Ex01;

/**
 *
 * @author Jv Loreti
 */

public class ConversaoDeUnidadesDeArea{
    public final static double PES = 10.76;
    public final static double CM = 929;
    public final static double ACRES = 43560; 
    
    private static double pesConv;
    private static double cmConv;
    private static double acresConv;
    
    public static double getPesConv(double metros){
        pesConv = metros * PES;
        return pesConv;
    }
    public static double getCentimetrosConv(double metros){
        pesConv = getPesConv(metros);
        cmConv = pesConv * CM;
        return cmConv;
    }
    public static double getAcresConv(double metros){
        pesConv = getPesConv(metros);
        acresConv = pesConv / ACRES;
        return acresConv;
    }
}
