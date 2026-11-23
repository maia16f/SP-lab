package ro.info.uvt.splab;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TableOfContents extends BaseElement {

    @ElementCollection
    private List<String> entries = new ArrayList<>();

    public TableOfContents() {
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    @Override
    public void add(Element e) {}

    @Override
    public void remove(Element e) {}

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}