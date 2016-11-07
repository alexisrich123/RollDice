package cis;
import java.io.IOException;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class rollMain  extends Application{

	public static void main(String[] args) {
	launch(args);

	}

	

	@Override
	public void start(Stage arg0) {
		//getting scene builder layout
		Parent par=null;
		try {
			par = FXMLLoader.load(getClass().getResource("dice.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// making the graphic 
		Scene se= new Scene(par);
		arg0.setScene(se);
		arg0.show();
	}

}
