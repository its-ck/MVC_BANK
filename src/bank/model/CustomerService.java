package bank.model;

import bank.db.Customer;

public class CustomerService {

	public static int updateDeposit(Customer c)
	{
		// TODO Auto-generated method stub
		int status = 0;
		
		int db_amount = CustomerDao.getAmount(c);
			if (db_amount == -1)
			{
				status = -1;
				return status;
			} 
			int total_amount = db_amount + c.getAmount();
			c.setAmount(total_amount);
			status = CustomerDao.updateAmount(c);
		
		return status;
	}

	
}
