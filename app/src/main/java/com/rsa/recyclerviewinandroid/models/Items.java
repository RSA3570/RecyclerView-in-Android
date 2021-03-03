package com.rsa.recyclerviewinandroid.models;

public class Items {

    //model class items
    String bookName;
    String authorName;

    //model class constructor
    public Items(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    //model class getter and setter
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}
