import eTicaretSistemi.business.abstracts.EmailValidatorService;
import eTicaretSistemi.business.abstracts.InsiderService;
import eTicaretSistemi.business.concretes.EmailValidatorManager;
import eTicaretSistemi.business.concretes.InsiderManager;
import eTicaretSistemi.core.GoogleConnectionAdapter;
import eTicaretSistemi.dataAccess.abstracts.InsiderDao;
import eTicaretSistemi.dataAccess.concretes.HibernateInsiderDao;
import eTicaretSistemi.entities.abstracts.Entity;
import eTicaretSistemi.entities.concretes.Insider;

public class Main {

	public static void main(String[] args) {
		Entity insiderIrem=new Insider("Ýrem Aliye","Akman","irem123","irem@gmail.com",true);
		
		EmailValidatorService emailValidationManager =new EmailValidatorManager();
		InsiderDao hiberInsiderDao =new HibernateInsiderDao(emailValidationManager);
		
		InsiderService insiderService =new InsiderManager(insiderIrem,hiberInsiderDao);
		insiderService.login("irem@gmail.com","irem123");
		
		System.out.println("*****************");
		
		Entity insiderUfuk =new Insider("Ufuk","Akman","ufuk123","ufuk@gmail.com",true);
		InsiderService insiderServiceGoogle =new GoogleConnectionAdapter(insiderUfuk, hiberInsiderDao);
		insiderServiceGoogle.login("ufuk@gmail.com", "ufuk123");
		
		
		
		
		
		
		

	}

}
