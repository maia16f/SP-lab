package splab;

public class AlignLeft implements splab.AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("+++++ " + text);
    }
}