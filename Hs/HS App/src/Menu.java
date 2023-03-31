import javax.swing.JOptionPane;

public class Menu {

    public  Menu() {

        String opcion = (JOptionPane.showInputDialog(null, "Elige la herramienta que vallas a utilizar\n Tone\n Tempo\n Genere\n Chord Progression "));

        if (opcion.equalsIgnoreCase("tone")) {
            ToneRandom tone = new ToneRandom();     
        }   
        else if (opcion.equalsIgnoreCase("tempo")){
            ////////////////////////////////////////////////////////////////////////
        }
        else if (opcion.equalsIgnoreCase("genere")){
            ////////////////////////////////////////////////////////////////////////
        }
        else if (opcion.equalsIgnoreCase("chord progression")){
            ////////////////////////////////////////////////////////////////////////
        }
         else {
            
        }
    }
    


}
