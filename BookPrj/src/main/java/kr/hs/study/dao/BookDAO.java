package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class BookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Autowired
	private MapperClass mapper;

	//insert
	public void insert_data(BookDTO dto) {
		String sql = "insert into book values(?,?,?,?)";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getEmail());
		System.out.println("INSERT 완료!");
	}
	
	//update
	public void update_data(BookDTO dto) {
		String sql = "update book set author=?, price=?, email=? where title=?";
		jdbcTemplate.update(sql, dto.getAuthor(), dto.getPrice(), dto.getEmail(), dto.getTitle());	;
		System.out.println("UPDATE 완료!");
	}
	
	//delete
	public void delete_data(BookDTO dto) {
		String sql = "delete from book where title=? and author=? and price=? and email=?";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getEmail());
		System.out.println("DELETE 완료!");
	}
	
	//select
	public List<BookDTO> select_data() {
		String sql = "select * from book";
		List<BookDTO> list = jdbcTemplate.query(sql, mapper);
		System.out.println("SELECT 완료!");
		return list;
	}
	
}
