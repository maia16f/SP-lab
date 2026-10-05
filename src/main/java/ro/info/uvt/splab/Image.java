package splab;

public class Image implements Element {
    private String url;
    public Image(String url) { this.url = url; }
    @Override public void print() { System.out.println("Image with name: " + url); }
    @Override public void add(Element e) {}
    @Override public void remove(Element e) {}
    @Override public Element get(int index) { return null; }
    @Override public Element clone() { return new Image(this.url); }
}