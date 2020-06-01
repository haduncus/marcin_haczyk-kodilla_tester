package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item drumKit = new Item("Drum kit", 5000.50);
    Item electricGuitar = new Item("Electric guitar", 3500.99);
    Item bassGuitar = new Item("Bass guitar", 3000.00);

    @Test
    public void shouldAddItemsToInvoice() {
        // When
        int result = invoice.getSize();
        // Then
        assertEquals(3, result);
    }

    @Test
    public void shouldGetExistingItem() {
        // When
        Item result = invoice.getItem(1);
        // Then
        assertEquals("Electric guitar", result.getName());
        assertEquals(3500.99, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        // When
        Item result = invoice.getItem(-1);
        // Then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        // When
        Item result = invoice.getItem(3);
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        // When
        invoice.clear();
        // Then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(drumKit);
        invoice.addItem(electricGuitar);
        invoice.addItem(bassGuitar);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}