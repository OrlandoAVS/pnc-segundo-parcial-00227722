package dto;

import entity.Genre;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class BookResponseDTO {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Genre genre;
    private Integer totalCopies;
    private Integer availableCopies;
    private Boolean available;
    private LocalDate publishedDate;
    private String description;
}