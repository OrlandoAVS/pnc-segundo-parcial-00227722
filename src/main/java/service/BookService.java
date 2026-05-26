package service;

import dto.*;
import entity.Genre;

import java.util.List;

public interface BookService {

    BookResponseDTO create(BookRequestDTO dto);

    List<BookResponseDTO> getAll(Genre genre, Boolean available);

    BookResponseDTO getById(Long id);

    BookResponseDTO update(Long id, BookRequestDTO dto);

    void delete(Long id);
}