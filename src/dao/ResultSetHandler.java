package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetHandler {
	/**
	 * ��������, ����һ��java����, �ö���Ҳ����ʵ�� / ʵ�弯 / integer / long / .....
	 * @param rs
	 * @return
	 */
	Object handle(ResultSet rs) throws SQLException;

}
