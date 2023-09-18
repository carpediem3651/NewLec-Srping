package kr.co.rland.web.repository.mb;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Repository
public class MbMenuRepository implements MenuRepository {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List<Menu> findAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
		List<Menu> list = repository.findAll();
		
		return list;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Menu findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
