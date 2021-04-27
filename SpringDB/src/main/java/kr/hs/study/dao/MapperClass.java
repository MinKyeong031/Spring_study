package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class MapperClass implements RowMapper<LoginDTO>{

	@Override
	public LoginDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginDTO bean = new LoginDTO();
		bean.setUserid(rs.getString("userid"));
		bean.setUserpass(rs.getInt("userpass"));
		return bean;
	}

}
