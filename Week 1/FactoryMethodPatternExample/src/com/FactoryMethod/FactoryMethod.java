package com.FactoryMethod;

import com.Document.Document;
import com.Document.DocumentFactory;
import com.Document.ExcelFactory;
import com.Document.PdfFactory;
import com.Document.WordFactory;

public class FactoryMethod {

    public static void main(String[] args) {

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}