package com.dtcc.dao;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;

import com.dtcc.model.ProductBean;

public class ProductDaoImpl {
	static ArrayList<ProductBean> list = new ArrayList<>();
	static {
		list.add(createProductBean("1", "name1", "category1", "10"));
		list.add(createProductBean("2", "name2", "category2", "20"));
		list.add(createProductBean("3", "name3", "category3", "30"));
		list.add(createProductBean("4", "name4", "category4", "40"));
	}

	public ArrayList<ProductBean> getProductList() {
		return list;
	}

	public ProductBean getProduct(String id) {
		ProductBean ProductBean = null;
		for (ProductBean productBean2 : list) {
			if (productBean2.getId().equals(id)) {
				ProductBean = productBean2;
			}
		}
		return ProductBean;
	}

	private static ProductBean createProductBean(String id, String name, String category, String price) {
		ProductBean productBean = new ProductBean();
		productBean.setId(id);
		productBean.setCategory(category);
		productBean.setName(name);
		productBean.setPrice(price);
		return productBean;

	}

}
