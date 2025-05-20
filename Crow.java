
package bird;

public class  Crow extends Bird implements Fly, SaySomething, Eat {
    String color;

    String getColor() {
        return this.color;
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void saySomething() {

    }
}
