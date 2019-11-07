package service.prototype;

import java.util.List;
import entity.Account;
import util.MiniPager;

/**
 * Account业务接口
 * @author RanJi
 *
 */
public interface IAccountService {
	void transfer(Account from, Account to, double money);
	@MiniPager(tableName="account")
	Account searchAccount(int id);
	List<Account> listAccounts(int pageNo, int pageSize);
	@MiniPager(tableName="account")
	List<Account> listPaged(int pageNo, int pageSize);
}
