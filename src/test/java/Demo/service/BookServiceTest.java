package Demo.service;

import Demo.config.SpringConfig;
import Demo.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService service;

    @Test
    public void getById(){
        Book book = service.getById(1);
        System.out.println(book);
    }

    @Test
    public void getAll() {
        List<Book> all = service.getAll();

        System.out.println(all);
    }
}
