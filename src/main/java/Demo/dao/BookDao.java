package Demo.dao;

import Demo.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    //添加
//    @Insert("insert into test.book values (null,#{type},#{name},#{description});")
    @Insert("insert into test.book (type,name,description) values(#{type},#{name},#{description})")
    void add(Book book);

    //更新
    @Update("update test.book set name = #{name}, description = #{description}, type = #{type} where id = #{id} ;")
    void update(Book book);

    //删除
    @Delete("delete from test.book where id = #{id} ;")
    void delete(Integer id);

    //根据id查询
    @Select("select * from test.book where id = #{id} ;")
    Book getById(Integer id);

    //查询所有
    @Select("select * from test.book;")
    List<Book> getAll();
}
