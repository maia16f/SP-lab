package splab;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(text);
        } else {
            System.out.println(text);
        }
    }

    @Override
    public void add(Element e) { }

    @Override
    public void remove(Element e) { }

    @Override
    public Element get(int index) {
        return null;
    }
}