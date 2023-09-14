package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.Menu;

public interface MenuService {
	List<Menu> getList();
	List<Menu> getListByCategoryId(long category);
	List<Menu> getListByName(String name);
	Menu getById(long id);
	List<Menu> getRecommendListById(long id);
	
	void like(long id, Long memberId, boolean on);
	void addToCart(long id, Long memberId);
	void addToCart(long id, Long memberId, boolean small, boolean hot, int amount);
}