package object1;

public class Chair {
    private String material;
    private String color;
    public Chair(String material, String color){
        this.material= material;
        this.color= color;

    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    public String toString(){
        return "material"+this.material+" color "+this.color;
    }

}
