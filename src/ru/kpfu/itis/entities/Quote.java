package ru.kpfu.itis.entities;


public class Quote {
    private String quote;
    private Type type;
    private Author author;
    private Theme theme;

    public Quote(String quote, Type type, Author author, Theme theme) {
        this.quote = quote;
        this.type = type;
        this.author = author;
        this.theme = theme;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
