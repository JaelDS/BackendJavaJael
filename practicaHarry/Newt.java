package practicaHarry;

public class Newt {

    private String born = "24 February 1897";
    private String name = "Newton Artemis Fido Scamander";
    private String bogart = "Office job";
    private String species = "Human";
    private String gender = "Male";
    private String patronus = "None";
    private String house = "Hufflepuff";


    public String getBorn(){  return born;  }
    public String getName(){  return name;  }
    public String getBogart(){  return bogart;  }
    public String getSpecies(){  return species;  }
    public String getGender(){  return gender;  }
    public String getPatronus(){  return patronus;  }
    public String getHouse(){  return house;  }

    public boolean setBorn(String born){
        if (!born.isEmpty()){
            this.born = born;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setBogart(String bogart){
        if (!bogart.isEmpty()){
            this.bogart = bogart;
            return true;
        }else
            return false;
    }

    public boolean setSpecies(String species){
        if (!species.isEmpty()){
            this.species = species;
            return true;
        }else
            return false;
    }

    public boolean setGender(String gender){
        if (!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public boolean setHouse(String house){
        if (!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Birthday: "+born+
                        "\nName: "+name+
                        "\nGender: "+gender+
                        "\nSpecies: "+species+
                        "\nHose: "+house+
                        "\nBogart: "+bogart+
                        "\nPatronus: "+patronus;

    }
}
