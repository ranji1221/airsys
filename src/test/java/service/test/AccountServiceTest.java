package service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import entity.Account;
import service.prototype.IAccountService;
import util.Pager;

/**
 * AccountService测试
 * @author RanJi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class AccountServiceTest {
	@Autowired
	private IAccountService actService;
	
	@Test
	public void testSearchAccount(){
		System.out.println(actService.searchAccount(1));
	}
	@Test  //-- 动态代理设计模式
	public void test01(){
		Pager<Account> pager = (Pager<Account>)actService.listPaged(5, 5);
		for (Account act : pager.getData()) {
			System.out.println(act);
		}
		System.out.println(pager.getTotal());
	}
	
}
