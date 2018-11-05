package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class BuyItemCompleteAction extends ActionSupport implements SessionAware {

	private int id;
	private String itemName;
	private String itemPrice;
	public Map<String, Object> session;
	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {
		userCreateCompleteDAO.createUser(session.get("id").toString(), session.get("itemName").toString(),
				session.get("itemPrice").toString());

		String result = SUCCESS;

		return result;
	}

	public int id() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}