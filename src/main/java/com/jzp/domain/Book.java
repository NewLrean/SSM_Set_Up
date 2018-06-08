package com.jzp.domain;

/**
 * Created by 蒋志鹏 on 2018/6/8.
 */
public class Book extends Category{
    private String id;
    private String title;
    private String author;
    private String publisherId;
    private String publishDate;
    private String isbn;
    private int wordsCount;
    private float unitPrice;
    private String contentDescription;
    private String aurhorDescription;
    private String editorComment;
    private String toc;
    private String categoryId;
    private int clicks;
    private String booksImages;
    private int quantity;
    private String souhuo;
    private String address;
    private String baoyou;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getAurhorDescription() {
        return aurhorDescription;
    }

    public void setAurhorDescription(String aurhorDescription) {
        this.aurhorDescription = aurhorDescription;
    }

    public String getEditorComment() {
        return editorComment;
    }

    public void setEditorComment(String editorComment) {
        this.editorComment = editorComment;
    }

    public String getToc() {
        return toc;
    }

    public void setToc(String toc) {
        this.toc = toc;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public String getBooksImages() {
        return booksImages;
    }

    public void setBooksImages(String booksImages) {
        this.booksImages = booksImages;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSouhuo() {
        return souhuo;
    }

    public void setSouhuo(String souhuo) {
        this.souhuo = souhuo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBaoyou() {
        return baoyou;
    }

    public void setBaoyou(String baoyou) {
        this.baoyou = baoyou;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisherId='" + publisherId + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", isbn='" + isbn + '\'' +
                ", wordsCount=" + wordsCount +
                ", unitPrice=" + unitPrice +
                ", contentDescription='" + contentDescription + '\'' +
                ", aurhorDescription='" + aurhorDescription + '\'' +
                ", editorComment='" + editorComment + '\'' +
                ", toc='" + toc + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", clicks=" + clicks +
                ", booksImages='" + booksImages + '\'' +
                ", quantity=" + quantity +
                ", souhuo='" + souhuo + '\'' +
                ", address='" + address + '\'' +
                ", baoyou='" + baoyou + '\'' +
                '}';
    }
}