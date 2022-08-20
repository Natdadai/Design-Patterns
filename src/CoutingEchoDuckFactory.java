public class CoutingEchoDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return new QuackCouter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCouter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCouter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCouter(new QuackEcho(new RubberDuck()));
    }
}
