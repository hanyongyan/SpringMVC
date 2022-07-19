package Demo.service.impl;

import Demo.Exception.BusinessException;
import Demo.Exception.SystemException;
import Demo.controller.Code;
import Demo.dao.BookDao;
import Demo.domain.Book;
import Demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookDao bookDao;

    @Override
    public boolean add(Book book) {
        bookDao.add(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
