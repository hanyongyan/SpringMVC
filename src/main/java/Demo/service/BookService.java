package Demo.service;

import Demo.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 添加
     *
     * @param book
     * @return
     */
    boolean add(Book book);

    /**
     * 修改
     *
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 根据id获取
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 获取全部
     *
     * @return
     */
    List<Book> getAll();
}
