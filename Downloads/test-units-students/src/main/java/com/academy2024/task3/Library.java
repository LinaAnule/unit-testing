package com.academy2024.task3;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private ArrayList<Book> books;

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public int countTheNumberOfBooks() {
        return books.size();
    }

    public Book findBookByTitle(String bookTitle) throws BookNotFoundException {
        for (Book book : books) {
            if (book.title.equals(bookTitle)) {
                return book;
            }
        }
        throw new BookNotFoundException("Sorry, but book with title " + bookTitle + " has not been found");
    }

    public Book findBookWithHighestPageCount() throws BookNotFoundException {
        try {
            Book bookWithHighest = books.stream().max(Comparator.comparingInt(b -> b.numberOfPages)).orElseThrow(null);

            if (bookWithHighest != null) {
                return bookWithHighest;
            }
        } catch (NullPointerException exception) {
            throw new BookNotFoundException(exception.getMessage());
        }
        throw new BookNotFoundException("Book not found");
    }

}
