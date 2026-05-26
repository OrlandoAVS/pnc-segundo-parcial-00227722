package dto;

import entity.Genre;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookRequestDTO {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String isbn;

    @NotNull
    private Genre genre;

    @NotNull
    @Min(1)
    private Integer totalCopies;

    private LocalDate publishedDate;

    private String description;
}