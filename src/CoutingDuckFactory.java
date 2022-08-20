public class CoutingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCouter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCouter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCouter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCouter(new RubberDuck());
    }
}
