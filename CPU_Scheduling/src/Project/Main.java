
package Project;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;

public class Main {


    public static void main(String[] args) {

        OpeatingSystems OS = new OpeatingSystems();
        OS.setVisible(true);
        OS.pack();
        OS.setLocationRelativeTo(null); 
        FlatMacLightLaf.setup();
    }
}
