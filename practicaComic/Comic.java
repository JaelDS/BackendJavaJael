package practicaComic;

public class Comic {
    
    private String draw;
    private String history;
    
    public Comic (String draw, String history){
        this.draw = draw;
        this.history = history;
    }
    
    public String getDraw(){  return draw;  }
    public String getHistory(){  return history;  }
    
    public boolean setDraw(){
        if(!draw.isEmpty()){
            this.draw = draw;
            return true;
        }else
            return false;
    }

    public boolean setHistory(){
        if(!history.isEmpty()){
            this.history = history;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                history;

    }
}
