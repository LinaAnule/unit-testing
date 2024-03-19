package com.academy2024.task3;

import com.academy2024.task2.LettersCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @InjectMocks
    private Library library;

    public ArrayList<Book> setupBookList() {
        return new ArrayList<>(Arrays.asList(
                new Book("Shuggie Bain", "Douglas Stuart", 480),
                new Book("White Noise", "Don DeLillo", 384),
                new Book("American Psycho", "Bret Easton Ellis", 416),
                new Book("Blood Meridian", "Cormac McCarthy", 384),
                new Book("Catechismvsa", "Martjnvs Masvjdjvs", 79)));
    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListNotEmpty() {
        int expectedValue = 5;
        ArrayList<Book> bookList = setupBookList();
        library.setBooks(bookList);
        int actualValue = library.countTheNumberOfBooks();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListEmpty() {
        int expectedValue = 0;
        ArrayList<Book> bookList = new ArrayList<>();
        library.setBooks(bookList);
        int actualValue = library.countTheNumberOfBooks();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findBookByTitle_returnBookObject_whenBookListContainsBookWithEnteredStringTitle() throws BookNotFoundException {
        Book expectedValue = new Book("Shuggie Bain", "Douglas Stuart", 480);
        ArrayList<Book> bookList = setupBookList();
        library.setBooks(bookList);
        Book actualValue = library.findBookByTitle("Shuggie Bain");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void findBookByTitle_throwsBookNotFoundException_whenBookListDoesNotContainBookWithEnteredTitle() throws BookNotFoundException {
        ArrayList<Book> bookList = setupBookList();
        library.setBooks(bookList);
        assertThrows(BookNotFoundException.class, () -> library.findBookByTitle("La la"));
    }

    @Test
    public void findBookWithHighestPageCount_returnBookPageInt_whenBookListNotEmpty() throws BookNotFoundException {
        Book expectedValue = new Book("Shuggie Bain", "Douglas Stuart", 480);
        ArrayList<Book> bookList = setupBookList();
        library.setBooks(bookList);
        Book actualValue = library.findBookWithHighestPageCount();
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void findBookWithHighestPageCount_throwsBookNotFoundException_whenBookListEmpty() throws BookNotFoundException {
        ArrayList<Book> bookList = new ArrayList<>();
        library.setBooks(bookList);
        assertThrows(BookNotFoundException.class, () -> library.findBookWithHighestPageCount());
    }

}