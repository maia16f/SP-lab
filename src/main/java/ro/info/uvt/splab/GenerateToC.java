package splab;

public class GenerateToC implements Visitor {
    private TableOfContents toc = new TableOfContents();
    private int page = 1;

    public TableOfContents getToc() {
        return toc;
    }

    @Override
    public void visit(Book book) {}

    @Override
    public void visit(Section section) {
        toc.addEntry(section.getTitle() + " .................... Page " + page);
    }

    @Override
    public void visit(TableOfContents tableOfContents) {}

    @Override
    public void visit(Paragraph paragraph) {
        page++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        page++;
    }

    @Override
    public void visit(Image image) {
        page++;
    }

    @Override
    public void visit(Table table) {
        page++;
    }
}