package entities;

public class Livro {
    private String name;
    private String description;
    private Author author;
    private String isbn;

   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro() {
    }

    public Livro(String name, String description, Author author, String isbn) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.isbn = isbn;
    }

    
}
