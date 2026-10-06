package splab;

public class AlignCenter implements splab.AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("+++" + text + "+++");
    }
}