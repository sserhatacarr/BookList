public class Book {
    String bookName;
    String authorName;
    int pageNumber;
    int publishDate;
    public Book(String bookName, String authorName, int pageNumber, int publishDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public int getPublishDate() {
        return publishDate;
    }
}