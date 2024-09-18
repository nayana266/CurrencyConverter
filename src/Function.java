import javax.swing.*;

public class Function {

    public boolean check(String input){
        try{
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public void dollarToPounds(double Minput){
        double pounds = Minput * 0.76;
        JOptionPane.showMessageDialog(null, "Amount of pounds: " + pounds + " pounds");
    }

    public void dollarToRupees(double Minput){
        double rupees = Minput * 83.78;
        JOptionPane.showMessageDialog(null, "Amount of rupees: " + rupees + " rupees");
    }
}
