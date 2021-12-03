package reto4_webjdfb.reto4_webjdfb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import reto4_webjdfb.reto4_webjdfb.interfaces.InterfaceCleaningProduct;
import reto4_webjdfb.reto4_webjdfb.interfaces.InterfaceUser;

@Component
@SpringBootApplication
public class Reto4WebjdfbApplication implements CommandLineRunner{

    
    @Autowired
    private InterfaceCleaningProduct interfaceProduct;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto4WebjdfbApplication.class, args);
	}
        
          @Override
    public void run(String... args) throws Exception {
        interfaceProduct.deleteAll();
        interfaceUser.deleteAll();
    }

}
