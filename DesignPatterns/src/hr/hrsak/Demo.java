package hr.hrsak;

import java.lang.reflect.Proxy;

public class Demo {

    public static <T> T withLogging(T target, Class<T> itf){
        return (T) Proxy.newProxyInstance(
            itf.getClassLoader(),
            new Class<?>[] {itf},
            new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {

        final Car car = new CarProxy(new Driver(12));
        car.drive();

        Creature creature = new Creature();
        creature.setAgility(12);

        System.out.println(creature.getAgility());

        final Person person = new Person();
        final Human logged = withLogging(person, Human.class);
        logged.talk();
        logged.walk();
        logged.walk();
        System.out.println(logged);


    }
}
