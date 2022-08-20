public class QuackCouter implements Quackable{
    Quackable duck;
    static int numberOfQuack;

    public QuackCouter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getNumberOfQuack() {
        return numberOfQuack;
    }
}
