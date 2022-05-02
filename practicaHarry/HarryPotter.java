package practicaHarry;

public class HarryPotter {
    private String born = "31 July 1980";
    private String name = "Harry Potter";
    private String bogart = "Dementor";
    private String species = "Human";
    private String gender = "Male";
    private String patronus = "Stag";
    private String house = "Gryffindor";


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
