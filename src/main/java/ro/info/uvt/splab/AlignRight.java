package splab;

public class AlignRight implements splab.AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println(text + " +++++");
    }
}