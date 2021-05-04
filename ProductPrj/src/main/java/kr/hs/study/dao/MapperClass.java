package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.ProductDTO;

@Component
public class MapperClass implements RowMapper<ProductDTO>{
	
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDTO bean = new ProductDTO();
		bean.setPname(rs.getString("pname"));
		bean.setPlace(rs.getString("place"));
		bean.setLoca(rs.getString("loca"));
		bean.setPcnt(rs.getInt("pcnt"));
		bean.setPprice(rs.getInt("pprice"));
		bean.setSprice(rs.getInt("pprice"), rs.getInt("pcnt"));
		return bean;
	}

}
