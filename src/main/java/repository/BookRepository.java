package repository;

import entity.Book;
import entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByTitleIgnoreCase(String title);

    Optional<Book> findByIsbn(String isbn);

    List<Book> findByGenreAndAvailable(Genre genre, Boolean available);
}