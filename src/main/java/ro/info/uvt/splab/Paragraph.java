package ro.info.uvt.splab;

import jakarta.persistence.Entity;

@Entity
public class Paragraph extends BaseElement {

    private String text;

    public Paragraph() {
    }

    public Paragraph(String text) {
        this.text = text;
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