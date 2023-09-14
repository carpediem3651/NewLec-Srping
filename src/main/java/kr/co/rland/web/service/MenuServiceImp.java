package kr.co.rland.web.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.rland.App;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public class MenuServiceImp implements MenuService {

	public MenuRepository repository;
	
	public MenuServiceImp() {
		try (SqlSession session = App.sqlSessionFactory.openSession()) {
			repository = session.getMapper(MenuRepository.class);
		}
	}
	
	@Override
	public List<Menu> getList() {
		List<Menu> list = repository.findAll();
		return list;
	}

	@Override
	public List<Menu> getListByCategoryId(long category) {

		return null;
	}

	@Override
	public List<Menu> getListByName(String name) {

		return null;
	}

	@Override
	public Menu getById(long id) {
		Menu menu = repository.findById(id);
		return menu;
	}

	@Override
	public List<Menu> getRecommendListById(long id) {

		return null;
	}

	@Override
	public void like(long id, Long memberId, boolean on) {

	}

	@Override
	public void addToCart(long id, Long memberId) {

	}

	@Override
	public void addToCart(long id, Long memberId, boolean small, boolean hot, int amount) {

	}

}