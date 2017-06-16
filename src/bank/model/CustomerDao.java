package bank.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bank.db.Customer;
import bank.db.Provider;

public class CustomerDao
{

	public static int getAmount(Customer c) {
		// TODO Auto-generated method stub
		
		int amount = 0;
		String sql = "select amount from Customer where actno=?";
		
		try {
			Connection con = Provider.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, c.getActno());
			
			ResultSet rs = pst.executeQuery();
			if (rs.next())
			{
				amount= rs.getInt(1);
				
			} else {
					amount=-1;
			}
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		return amount;
	}

	public static int updateAmount(Customer c)
	{
		// TODO Auto-generated method stub
		int status = 0;
		String sql = "Update Customer set amount=? where actno=?";
		
		try {
			Connection con = Provider.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, c.getAmount());
			pst.setInt(2, c.getActno());
			status = pst.executeUpdate();
		}
			catch (Exception e) 
			{
				e.printStackTrace();
				// TODO: handle exception
			}
		return status;
	}
	
}
