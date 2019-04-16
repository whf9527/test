package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetHandler {
	/**
	 * 处理结果集, 返回一个java对象, 该对象也许是实体 / 实体集 / integer / long / .....
	 * @param rs
	 * @return
	 */
	Object handle(ResultSet rs) throws SQLException;

}
