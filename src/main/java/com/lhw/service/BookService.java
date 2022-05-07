package com.lhw.service;

import com.lhw.domain.Book;
import com.lhw.domain.User;
import entity.PageResult;

public interface BookService {
    PageResult selectNewBooks(Integer pageNum, Integer pageSize);
    Book findById(String id);
    Integer borrowBook(Book book);
    PageResult search(Book book, Integer pageNum, Integer pageSize);
    Integer addBook(Book book);
    Integer editBook(Book book);
    //查询当前借阅的图书
    PageResult searchBorrowed(Book book, User user, Integer pageNum, Integer pageSize);
    //归还图书
    boolean returnBook(String  id,User user);
    //归还确认
    Integer returnConfirm(String id);
}
