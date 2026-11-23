package ro.info.uvt.splab.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.info.uvt.splab.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}