package com.redhat.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.redhat.training.books.Book;

import org.junit.jupiter.api.Test;

public class BookStatsTest {

    @Test
    public void countWords_returns0_whenBookEmpty() {
        // Given
        Book book = new Book("someISBN");

        // When
        double wordCount = BookStats.countWords(book);

        // Then
        assertEquals(0, wordCount);
    }

    @Test
    public void countWords_returnsNumberOfWords() {
        // Given
        Book book = new Book("someISBN", "this is the content");

        // When
        double wordCount = BookStats.countWords(book);

        // Then
        assertEquals(4, wordCount);
    }
}