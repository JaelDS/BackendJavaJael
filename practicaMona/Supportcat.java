package practicaMona;

import imonsh.Colors;
import imonsh.Screen;

public class Supportcat extends FemaleCodertocat{
    public Supportcat(String type, String action, String url, String gender) {
        super(type, action, url, gender);
    }

    public String showMessage(){
        return
                "\nThe "+species+
                        " have "+octo+ " and " +cat+"."+
                        "\nThis "+species+
                        " is a "+type+
                        " and it's "+action+
                        "\nThis "+species+" could be a "+gender+" or male."+
                        "\nAnd also a "+type+" is a FemaleCodercat.";
    }

    public void show(){
        Screen s = new Screen();
        s.setVisible(true);
        s.showImage(url);
        s.out(showMessage(), "Times New Roman", 28, Colors.BeniukonBronze);
        s.setBounds(200, 100, 1100, 900);
    }
}
