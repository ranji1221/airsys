package dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import config.AppConfig;
import dao.prototype.IAccountDao;
import entity.Account;

/**
 * Spring单元测试
 * @author RanJi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class TestAccountDao {
	@Autowired
	private IAccountDao actDao;
	
	@Test
	public void testFindByID(){
		Account act = actDao.find(1);
		System.out.println(act);
	}
}
