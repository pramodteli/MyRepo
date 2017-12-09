package com.dtcc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.dao.ProductDaoImpl;
import com.dtcc.model.ProductBean;

@RestController
@RequestMapping("api/v1")
public class ProductController {

	ProductDaoImpl productDaoImpl = new ProductDaoImpl();

	@CrossOrigin("")
	@RequestMapping(value = "productList", method = RequestMethod.GET)
	public List<ProductBean> getProductList() {
		ArrayList<ProductBean> list = productDaoImpl.getProductList();
		return list;

	}

	@RequestMapping(value = "product/{id}", method = RequestMethod.GET)
	public ProductBean getProduct(@PathVariable("id") String id) {
		ProductBean ProductBean = productDaoImpl.getProduct(id);
		return ProductBean;

	}



}
