public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory coutingEchoDuckFactory = new CoutingEchoDuckFactory();
        AbstractDuckFactory coutingDuckFactory = new CoutingDuckFactory();
        AbstractDuckFactory duckFactory = new DuckFactory();
        duckSimulator.simulate(duckFactory);
        duckSimulator.simulate(coutingDuckFactory);
        duckSimulator.simulate(coutingEchoDuckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        boolean check = true;
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
//        ถ้าทำการ echo ก่อน counter จะทำให้ count ได้ 8 เนื่องจาก echo ไปเรียก counter 8 ครั้ง
//        Quackable mallardDuck = new QuackEcho(new QuackCouter(new MallardDuck()));
//        Quackable redheadDuck = new QuackEcho(new QuackCouter(new RedheadDuck()));
//        Quackable duckCall = new QuackEcho(new QuackCouter(new DuckCall()));
//        Quackable rubberDuck = new QuackEcho(new QuackCouter(new RubberDuck()));
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);


//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
        System.out.println("\nDuck Simulator:Whole Flock Simulation");
        simulate(flockOfDucks);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("he ducks quacked " + QuackCouter.getNumberOfQuack() + " times");
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
