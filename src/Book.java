public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author.toString();
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Title: " +
                title +
                "; Author: " +
                author.toString() +
                "; Year of publication: " +
                yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(getClass() != o.getClass()) return false;

        Book book = (Book)o;

        return this.title == book.title && this.author == book.author && this.yearOfPublication == book.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return (title.length() * author.hashCode() * yearOfPublication) >>> 3;
    }
}
