package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Autowired
	private MapperClass mapper;

	//insert
	public void insert_data(LoginDTO dto) {
		String sql = "insert into login values(?,?)";
		jdbcTemplate.update(sql, dto.getUserid(), dto.getUserpass());
		System.out.println("INSERT 완료!");
	}
	
	//update
	public void update_data(LoginDTO dto) {
		String sql = "update login set userpass=? where userid=?";
		jdbcTemplate.update(sql, dto.getUserpass(), dto.getUserid());
		System.out.println("UPDATE 완료!");
	}
	
	//delete
	public void delete_data(LoginDTO dto) {
		String sql = "delete from login where userid=? and userpass=?";
		jdbcTemplate.update(sql, dto.getUserid(), dto.getUserpass());
		System.out.println("DELETE 완료!");
	}
	
	//select
	public List<LoginDTO> select_data() {
		String sql = "select * from login";
		List<LoginDTO> list = jdbcTemplate.query(sql, mapper);
		System.out.println("SELECT 완료!");
		return list;
	}
	
}
