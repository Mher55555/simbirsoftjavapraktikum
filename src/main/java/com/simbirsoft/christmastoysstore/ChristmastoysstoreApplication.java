package com.simbirsoft.christmastoysstore;

import com.simbirsoft.christmastoysstore.repository.ItemRepository;
import com.simbirsoft.christmastoysstore.repository.ParentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ChristmastoysstoreApplication {


	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(ChristmastoysstoreApplication.class, args);
		ParentRepository parentRepository =
				configurableApplicationContext.getBean(ParentRepository.class);
		ItemRepository itemRepository=
				configurableApplicationContext.getBean(ItemRepository.class);


	}

}
