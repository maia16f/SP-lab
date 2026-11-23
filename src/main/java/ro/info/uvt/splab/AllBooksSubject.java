package ro.info.uvt.splab;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject implements Subject {

    private final List<Observer> observerCollection = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerCollection.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerCollection.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observerCollection) {
            observer.update(book);
        }
    }

    public void add(Book book) {
        notifyObservers(book);
    }
}