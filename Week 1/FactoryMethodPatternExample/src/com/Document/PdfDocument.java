package com.Document;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("PDF Document Created");
    }
}