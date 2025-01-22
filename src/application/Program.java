package application;

import java.sql.SQLException;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws SQLException {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test number 1: seller findById ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

	}

}
