package ro.info.uvt.splab;

public class AlignCenter implements ro.info.uvt.splab.AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("+++" + text + "+++");
    }
}