package practicaMultiverse;

public class Spiderman {
    private String universe;
    private String name;
    private int durability, energy, fightSkills, intelligence, speed, strength;
    private String gender;
    private String url;
    private double heigth, weigth;

    public Spiderman(String universe, String name, int dusrability, int energy, int fightSkills, int intelligence, int speed, int strength, String gender, double heigth, double weight, String url){
        this.universe = universe;
        this.name = name;
        this.durability = dusrability;
        this.energy = energy;
        this. fightSkills = fightSkills;
        this.intelligence = intelligence;
        this.speed = speed;
        this.strength = strength;
        this.gender = gender;
        this.heigth = heigth;
        this.weigth = weight;
        this.url = url;
    }


    public String getUniverse(){  return universe;  }
    public String getName(){  return name;  }
    public String getGender(){  return gender;  }
    public String getUrl(){  return url;  }
    public int getDurability(){  return durability;  }
    public int getEnergy(){  return energy;  }
    public int getFightSkills(){  return fightSkills;  }
    public int getIntelligence(){  return intelligence;  }
    public int getSpeed(){  return speed;  }
    public int getStrength(){  return strength;  }
    public double getHeigth(){  return heigth;  }
    public double getWeigth(){  return  weigth;  }

    public boolean setUniverse(){
        if(!universe.isEmpty()){
            this.universe = universe;
            return true;
        }else
            return false;
    }

    public boolean setUrl(){
        if(!universe.isEmpty()){
            this.url = url;
            return true;
        }else
            return false;
    }

    public boolean setName(){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setGender(){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setDurability(){
        if(durability >= 0){
            this.durability = durability;
            return true;
        }else
            return false;
    }

    public boolean setEnergy(){
        if(durability >= 0){
            this.energy = energy;
            return true;
        }else
            return false;
    }

    public boolean setFigthSkills(){
        if(durability >= 0){
            this.fightSkills = fightSkills;
            return true;
        }else
            return false;
    }

    public boolean setIntelligence(){
        if(durability >= 0){
            this.intelligence = intelligence;
            return true;
        }else
            return false;
    }

    public boolean setSpeed(){
        if(durability >= 0){
            this.speed = speed;
            return true;
        }else
            return false;
    }

    public boolean setStrength(){
        if(durability >= 0){
            this.strength = strength;
            return true;
        }else
            return false;
    }

    public boolean setHeigth(){
        if(durability >= 0){
            this.heigth = heigth;
            return true;
        }else
            return false;
    }

    public boolean setWeigth(){
        if(durability >= 0){
            this.weigth = weigth;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Name: "+name+
                        "\nUniverse: "+universe+
                        "\nGender: "+gender+
                        "\nHeigth: "+heigth+" m"+
                        "\nWeigth: "+weigth+" kg"+
                        "\nStrength: "+strength+
                        "\nSpeed: "+speed+
                        "\nIntelligence: "+intelligence+
                        "\nFight Skills: "+fightSkills+
                        "\nEnergy: "+energy+
                        "\nDurability: "+durability+
                        "\n";

    }

}

