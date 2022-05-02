package practicaMona;

import imonsh.Colors;
import imonsh.Screen;
import imonsh.Dialog;

public class Octocat {
    public String species = "Octocat";
    public String type;
    public String octo= "tentacles";
    public String cat = "cat ears";
    public String action;
    public String url;

    public Octocat (String type, String action, String url){
        this.type = type;
        this.action = action;
        this.url = url;
    }

    public String getType(){  return type;  }
    public String getAction(){  return action;  }
    public String getUrl(){  return url;  }

    public boolean setType(String type){
        if(!type.isEmpty()){
            this.type = type;
            return true;
        }else
            return false;
    }

    public boolean setUrl(){
        if(!url.isEmpty()){
            this.url = url;
            return true;
        }else
            return false;
    }

    public boolean setAction(String action){
        if(!action.isEmpty()){
            this.action = action;
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
                        " and it's "+action;
    }

    public void show(){
        Screen s = new Screen();
        s.setVisible(true);
        s.showImage(url);
        s.out(showMessage(), "Times New Roman", 28, Colors.BeniukonBronze);
        s.setBounds(200, 100, 1100, 900);
    }

}
