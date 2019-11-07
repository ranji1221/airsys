package service.prototype;

import java.util.List;
import entity.User;
import util.MiniPager;
/**
 * 业务接口
 * @author RanJi
 *
 */
public interface IUserService {
	@MiniPager(tableName="user")
	List<User> listUsers(int pageNo, int pageSize);
}
