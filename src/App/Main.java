import org.w3c.dom.ranges.Range;

import javax.swing.JOptionPane;
public class scratch {
    public static void main(String[] args) {

        String pr1 = JOptionPane.showInputDialog(null, "Please input front right tire pressure: ");
        String pr2 = JOptionPane.showInputDialog(null, "Please input front left tire pressure: ");
        String pr3 = JOptionPane.showInputDialog(null, "Please input rear right tire pressure: ");
        String pr4 = JOptionPane.showInputDialog(null, "Please input rear right tire pressure: ");

        int intPr1 = Integer.parseInt(pr1);
        int intPr2 = Integer.parseInt(pr2);
        int intPr3 = Integer.parseInt(pr3);
        int intPr4 = Integer.parseInt(pr4);

        boolean frontPressure = intPr1 == intPr2;
        boolean rearPressure = intPr3 == intPr4;

   /*     if (frontPressure && rearPressure ) {
            if (intPr1 >= 35 && intPr1 <= 45 && intPr3 >= 35 && intPr3 <= 45){
                JOptionPane.showMessageDialog(null, "the pressure in your tires is OK");
            } else if ( intPr1 <= 35 || intPr1 >= 45 && intPr3 >= 35 || intPr3 <= 45) {
                JOptionPane.showMessageDialog(null, "Warning! the pressure in your front tires is lower than recommended! Please check it quickly.");

            }  else if (intPr3 <= 35 || intPr3 >= 45 && intPr1 >= 35 || intPr1 <= 45) {
                JOptionPane.showMessageDialog(null, "Warning! the pressure in your rear tires is lower than recommended! Please check it quickly.");
            } else if (intPr1 <= 35 || intPr1 >= 45 && intPr3 <= 35 || intPr3 >= 45){
                JOptionPane.showMessageDialog(null, "the pressure in all 4 tires is not within the norms, please check it quickly.");

            }
        } else if (!frontPressure && rearPressure) {
            JOptionPane.showMessageDialog(null, "Please check the pressure in your front tires, their pressure isn't equal.");
        }  else if (!rearPressure && frontPressure) {
            JOptionPane.showMessageDialog(null, "Please check the pressure in your rear tires, their pressure isn't equal.");
        }  else {
            JOptionPane.showMessageDialog(null, "Please check the pressure in all of your tires, their pressure isn't equal.");
        }
    */
        if (frontPressure && rearPressure) {
            JOptionPane.showMessageDialog(null, "Tire pressure:front GOOD; rear GOOD;");
        } else if (!frontPressure && rearPressure) {
            JOptionPane.showMessageDialog(null, "Tire pressure: front BAD; rear GOOD;");
        }  else if (frontPressure && !rearPressure) {
            JOptionPane.showMessageDialog(null, "Tire pressure: front GOOD; rear BAD;");
        } else {
            JOptionPane.showMessageDialog(null, "Tire pressure: front BAD; rear BAD;");

        }

    }



}