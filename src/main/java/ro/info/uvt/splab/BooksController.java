package ro.info.uvt.splab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.info.uvt.splab.persistence.BooksRepository;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksRepository booksRepository;
    private final AllBooksSubject allBooksSubject;

    @Autowired
    public BooksController(BooksRepository booksRepository, AllBooksSubject allBooksSubject) {
        this.booksRepository = booksRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(booksRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
        return booksRepository.findById(id)
                .map(book -> new ResponseEntity<>(book, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book savedBook = booksRepository.save(book);
        allBooksSubject.add(savedBook);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book updatedBook) {
        if (!booksRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Book saved = booksRepository.save(updatedBook);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Integer id) {
        if (!booksRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        booksRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}