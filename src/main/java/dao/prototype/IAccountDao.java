package dao.prototype;

import java.util.List;
import entity.Account;
import util.Pager;

/**
 * AccountDao
 * @author RanJi
 *
 */
public interface IAccountDao {
	Account find(int id);
	void saveOrUpdate(Account act);
	void delete(int id);	
	List<Account> findAll();
	List<Account> find(int offset, int pageSize); 
	int totalItems();
}
