package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.ProductDTO;

@Component
public class ProductDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private MapperClass mapper;

	//insert_product
	public void insert_product(ProductDTO dto) {
		String sql = "insert into product values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, dto.getPname(), dto.getPlace(), dto.getLoca(), dto.getPcnt(), dto.getPprice(), dto.getSprice());
	}
	
	//update_placeNloca
	public void update_placeNloca(ProductDTO dto) {
		String sql = "update product set place=?, loca=? where pname=?";
		jdbcTemplate.update(sql, dto.getPlace(), dto.getLoca(), dto.getPname());
	}
	
	//update_priceNstock
	public void update_priceNstock(ProductDTO dto) {
		String sql = "update product set pcnt=?, pprice=?, sprice=? where pname=?";
		jdbcTemplate.update(sql, dto.getPcnt(), dto.getPprice(), dto.getSprice(), dto.getPname());
	}
	
	//delete_product
	public void delete_product(ProductDTO dto) {
		String sql = "delete from product where pname=? and place=? and loca=?";
		jdbcTemplate.update(sql, dto.getPname(), dto.getPlace(), dto.getLoca());
	}
	
	//select_product
	public List<ProductDTO> select_product() {
		String sql = "select * from product";
		List<ProductDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}

}
