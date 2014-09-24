package bankWeb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

/**
 * @author hash
 *
 */
public class IOTxt implements InputOutput {
	private static Storage storage = Storage.getInstance();
	private static List<Customer> custs = storage.getCusts();
	private static List<Account> accs = storage.getAccs();

	/* (non-Javadoc)
	 * @see com.valentyn_tymku.bank.InputOutput#read()
	 */
	public void read() throws IOException {
		BufferedWriter cw = new BufferedWriter(new FileWriter("src/cust99999999omersW.txt"));
		cw.write("111");
	
		//URL file1 = this.getClass().getResource("/Bank11/WebContent/WEB-INF/customers.txt");
		//BufferedReader custReader = new BufferedReader(new FileReader(file1);
		//BufferedReader custReader = new BufferedReader(new FileReader("C:\\Users\\vtymktc\\git\\BankWEB\\Bank11\\WebContent\\WEB-INF\\customers.txt"));
		/*BufferedReader custReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("./WEB_INF/customers.txt")));
		String str;
		while ((str = custReader.readLine()) != null) {
			custs.add(Customer.parseCust(str));
		}

		//BufferedReader accReader = new BufferedReader(new FileReader("C:\\Users\\vtymktc\\git\\BankWEB\\Bank11\\WebContent\\WEB-INF\\accounts.txt"));
		BufferedReader accReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("./WEB-INF/accounts.txt")));

		while ((str = accReader.readLine()) != null) {
			accs.add(Account.parseAcc(str));
		}

		custReader.close();
		accReader.close();*/

	}

	/* (non-Javadoc)
	 * @see com.valentyn_tymku.bank.InputOutput#write()
	 */
	public void write() throws IOException {
		BufferedWriter cw = new BufferedWriter(new FileWriter("customersW.txt"));
		BufferedWriter ca = new BufferedWriter(new FileWriter("accountsW.txt"));
		for (Customer cust : custs) {
			cw.write(cust.toString());
			cw.newLine();
		}

		for (Account acc : accs) {
			ca.write(acc.toString());
			cw.newLine();
		}

		cw.close();
		ca.close();

	}

}
