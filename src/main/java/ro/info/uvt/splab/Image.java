package ro.info.uvt.splab;

import jakarta.persistence.Entity;

@Entity
public class Image extends BaseElement {

    private String url;

    public Image() {
    }

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void add(Element e) {}

    @Override
    public void remove(Element e) {}

    @Override
    public Element get(int index) { return null; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}