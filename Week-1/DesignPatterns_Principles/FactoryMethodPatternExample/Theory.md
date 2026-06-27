# Exercise: Factory Method Pattern

## Sample Output
Opening Word Document
Opening PDF Document
Opening Excel Document
## Concept
The Factory Method Pattern defines an interface for creating objects but lets subclasses decide which class to instantiate.  
It helps in decoupling object creation from usage.

## Why I used it
I used the Factory Method Pattern because it allows me to create different types of documents without changing the client code.  
This makes my program flexible and easy to extend if I want to add more document types later.

## My Example
In this exercise, I created factories for different document types:
- **WordDocumentFactory** → creates WordDocument
- **PdfDocumentFactory** → creates PdfDocument
- **ExcelDocumentFactory** → creates ExcelDocument

Instead of directly writing `new WordDocument()`, I used the factory like this:
```java
DocumentFactory wordFactory = new WordDocumentFactory();
Document word = wordFactory.createDocument();
word.open();
