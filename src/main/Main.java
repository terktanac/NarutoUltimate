package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	private Stage stage ;
	IntroScreen intro = new IntroScreen(this);
	MainMenuScreen mainmenu = new MainMenuScreen(this);
	LoadScreen loadscreen = new LoadScreen(this);
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.stage = primaryStage;

		stage.setTitle("Naruto Ultimate Ninja by C&T");
		stage.setScene(intro);
		stage.setResizable(false);
		stage.show();
		
		stage.setTitle("Naruto Ultimate Ninja by C&T");
		stage.setScene(intro);
		stage.setResizable(false);
		stage.show();
	}
	public void ChangeScene(Scene nextScene) {
		stage.setScene(nextScene);
	}

	public static void main(String[] args) {
		launch(args);

	}

}