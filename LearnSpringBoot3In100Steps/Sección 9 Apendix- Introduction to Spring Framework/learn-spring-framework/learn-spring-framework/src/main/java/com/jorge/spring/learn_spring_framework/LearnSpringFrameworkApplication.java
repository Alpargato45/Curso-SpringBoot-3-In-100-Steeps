package com.jorge.spring.learn_spring_framework;

import com.jorge.spring.learn_spring_framework.enterprise.web.MyWebController;
import com.jorge.spring.learn_spring_framework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//PacmanGame game = new PacmanGame();
		//GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBussinessService());
	}
}
