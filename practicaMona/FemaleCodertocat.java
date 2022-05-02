package practicaMona;

import imonsh.Colors;
import imonsh.Screen;

public class FemaleCodertocat extends Octocat{
    public String gender = "Female";
    public FemaleCodertocat(String type, String action, String url, String gender) {
        super(type, action, url);
        this.gender = gender;
    }

    public String getGender(){  return gender;  }

    public boolean setGender(){
        if(!gender.isEmpty()){
           this.gender = gender;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "\nThe "+species+
                        " have "+octo+ " and " +cat+"."+
                        "\nThis "+species+
                        " is a "+type+
                        " and it's "+action+
                        "\nThis "+species+" is a "+gender+".";
    }

    public void show(){
        Screen s = new Screen();
        s.setVisible(true);
        s.showImage(url);
        s.out(showMessage(), "Times New Roman", 28, Colors.BeniukonBronze);
        s.setBounds(200, 100, 1100, 900);
    }
}
