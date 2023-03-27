public class PhraseOMatic {
  public static void main(String[] args){
    String[] wordListOne = {"agnostic","opinionated","voice activated","haptically driven"};
    String[] wordListTwo = {"agnostic","opinionated","voice activated","haptically driven"};
    String[] wordListThree = {"agnostic","opinionated","voice activated","haptically driven"};

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    java.util.Random randomGenerator = new java.util.Random();
    int rand1 = randomGenerator.nextInt(oneLength);
    int rand2 = randomGenerator.nextInt(twoLength);
    int rand3 = randomGenerator.nextInt(threeLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    System.out.println("what we need is a " + phrase + " person");
  }
}
