package com.demo.book_service.model;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Document
@Builder
public class Book {
	@Id

	private int bookId;
	private String bookTitle;
	private String bookPrice;
	private LocalDate bookPublished;
	private String bookImageUrl;
	private String bookAuthurId;
}
