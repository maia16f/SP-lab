package splab;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> children = new ArrayList<>();

    public Section(String title) { this.title = title; }

    @Override
    public void print() {
        System.out.println(title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void add(Element e) {
        children.add(e.clone());
    }

    @Override public void remove(Element e) { children.remove(e); }
    @Override public Element get(int index) { return children.get(index); }

    @Override
    public Element clone() {
        Section newSection = new Section(this.title);
        for (Element child : this.children) {
            newSection.add(child);
        }
        return newSection;
    }
}