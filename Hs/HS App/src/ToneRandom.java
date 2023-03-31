import javax.swing.JOptionPane;

public class ToneRandom {


    public ToneRandom(){
        boolean bucle;
        final String[] tone = {"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "Bb", "B"};

        int randomizer = (int) (Math.random() * 13);

        String toneRandom = tone[randomizer];
        
        String y_n = JOptionPane.showInputDialog(null, "Tu tono random es: " + toneRandom +" De nuevo?");
//----------------------------------------------------------------

        if (y_n.equalsIgnoreCase("si")||y_n.equalsIgnoreCase("yes")){
            bucle = true;
        }
        else{
            bucle = false;
        }

        while(bucle){
            randomizer = (int) (Math.random() * 13);
            toneRandom = tone[randomizer];
            y_n = JOptionPane.showInputDialog(null, "Tu tono random es: " + toneRandom +" De nuevo?");

            if (y_n.equalsIgnoreCase("si")||y_n.equalsIgnoreCase("yes")){
                bucle = true;
            }
            
            else{
                bucle = false;
            }
            
        }

    }
}
///poner opcion de salir o volver al menu anterior