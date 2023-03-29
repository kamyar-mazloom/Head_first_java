class Dog {
  private int size;
  private String name;

  public int getSize() {
    return size;
  }

  public void setSize(int s) {
    if(s > 0){
      size = s;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    if(n.length() != 0){
      name = n;
    }
  }

  void bark(int numOfBarks) {
    while (numOfBarks > 0) {
      if (size > 60) {
        System.out.println("Woof! Woof!");
      } else if (size > 14) {
        System.out.println("Ruff! Ruff!");
      } else {
        System.out.println("Yip! Yip!");
      }
      numOfBarks = numOfBarks - 1;
    }
  }
}

class DogTestDrive {
  public static void main (String[] args) {
    Dog one = new Dog();
    one.setName("pablo");
    one.setSize(70);

    Dog two = new Dog();
    two.setName("milo");
    two.setSize(8);

    Dog three = new Dog();
    three.setName("sparky");
    three.setSize(35);

    System.out.println(one.getName() + "'s size is: " + one.getSize());
    one.bark(3);

    System.out.println(two.getName() + "'s size is:" + two.getSize());
    two.bark(3);

    System.out.println(three.getName() + "'s size is:" + three.getSize());
    three.bark(3);
  } 
}