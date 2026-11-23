package ro.info.uvt.splab;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Book book);
}