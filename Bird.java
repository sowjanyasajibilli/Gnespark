package Birds;

public class Bird {
    private int weight;
    private String name;
    private String color;

    public void setColor(String newColor) {
              this.color = newColor;
    }

    public void setWeight(int newWeight) {
             this.weight = newWeight;
    }

    public void setName(String newName) {
             this.name = newName;
    }


    public String getColor(String color) {
        return color;
    }

    public String getName(String name){
        return name;
    }

    public int getWeight(int weight){
        return weight;
    }
}



