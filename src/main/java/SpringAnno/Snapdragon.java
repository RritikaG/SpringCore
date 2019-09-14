package SpringAnno;

public class Snapdragon implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("Snapdragon cpu used");
    }
}
