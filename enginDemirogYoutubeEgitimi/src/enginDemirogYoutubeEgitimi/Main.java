package enginDemirogYoutubeEgitimi;

public class Main {

	public static void main(String[] args) {
		
//		int sayi1 = 10;
//        int sayi2 = 20;
//        sayi1 = sayi2;
//        sayi2 = 100;
//
//        System.out.println(sayi1);
//
//        int[] sayilar1 = { 1, 2, 3 };
//        int[] sayilar2 = { 10, 20, 30 };
//        sayilar1 = sayilar2;
//        sayilar1[0] = 1000;
//
//        System.out.println(sayilar1[0]);
//        
//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//        creditManager.calculate();
//        creditManager.save();
//        
//        Customer customer = new Customer(); //instance creation
//        customer.id = 1;
//        customer.City = "Ankara";
//        
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.save();
//        customerManager.delete();
//        
//        Company company = new Company();
//        company.CompanyName = "Arcelik";
//        company.TaxNumber = "10000";
//        company.id = 100;
//        
//        CustomerManager customerManager2 = new CustomerManager(new Person());
//        
//        Person person = new Person();
//        person.FirstName = "Engin";
//        person.LastName = "Demirog";
//        person.NationalIdentity = "123456";
//        
//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();
		
		CustomerManager customerManager3 = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager3.giveCredit();

	}
	
}
