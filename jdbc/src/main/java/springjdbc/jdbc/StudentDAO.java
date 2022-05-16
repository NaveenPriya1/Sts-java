package springjdbc.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO implements StudentCRUD{
	
	JdbcTemplate temp;
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	
	/*Jdbc-driver,connection,statement,execution-insert,update,delete->executeUpdate,close
	 * Table need to be created by the user
	 *JdbcTemplate- driver,connection- xml file
	 * */
	
	public int insert(StudentBean s) {
		String sql="insert into student values("+s.getSid()+",'"+s.getSname()+"')";
		return temp.update(sql);
	}
	
	

	
	/*Jdbc-driver,connection,statement,execution-select->executeQuery-ResultSet,close
	 * Table need to be created by the user
	 *JdbcTemplate- driver,connection- xml file
	 * */
	public List<StudentBean> getallstudents() {
		String sql="select * from student";
		return temp.query(sql,new ResultSetExtractor<List<StudentBean>>() {

			public List<StudentBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<StudentBean> list=new ArrayList<StudentBean>();
				while(rs.next()) {
					StudentBean sb=new StudentBean();
					sb.setSid(rs.getInt(1));
					sb.setSname(rs.getString(2));
					list.add(sb);
				}
				return list;
			}
			
			
		});
	
	}

}








