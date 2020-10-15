public class Dog{
  
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;

  public Dog(String name, String breed, double weight, String color, boolean houseTrained){
      this.name = name;
      this.breed = breed;
      this.weight = weight;
      this.color = color;
      this.houseTrained = houseTrained;
  }

  public String getName(){
    return this.name;
  }

  public String getBreed(){
    return this.breed;
  }

  public double getWeight(){
    return this.weight;
  }

  public String getColor(){
    return this.color;
  }

  public boolean getTrained(){
    return this.houseTrained;
  }



  public String toString(){
    return this.name + "🐶";
  }


}