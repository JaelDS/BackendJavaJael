package practicaMona;

import imonsh.Colors;
import imonsh.Screen;

public class Collabcats extends Supportcat{
    public int members;

    public Collabcats(String type, String action, String url, String gender, int members) {
        super(type, action, url, gender);
        this.members = members;
    }

    public int getMembers(){  return members;  }

    public boolean setMembers(){
        if(members >= 2){
            this.members = members;
            return true;
        }else
            return false;
    } public String showMessage(){
        return
                "\nThe "+species+
                        " have "+octo+ " and " +cat+"."+
                        "\nTwo or more "+species+"s"+
                        " are "+type+
                        " and they're "+action+
                        "\nAnd also two or more "+species+"s could work together creating groups of "+type+".";
    }

    public void show(){
        Screen s = new Screen();
        s.setVisible(true);
        s.showImage(url);
        s.out(showMessage(), "Times New Roman", 28, Colors.BeniukonBronze);
        s.setBounds(200, 100, 1100, 900);
    }
}
