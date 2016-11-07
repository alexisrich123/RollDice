package cis;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class rollfx {
	// the number for rolling the dice.
	int num2;
	int num1 ;
	int Sum;
	Random rand;

	public void initialize() {
		rand = new Random();
		
	}

	 @FXML
	    private Rectangle dice1;

	    @FXML
	    private Rectangle dice2;

	    @FXML
	    private Circle d1ul;

	    @FXML
	    private Circle d1ur;

	    @FXML
	    private Circle d1mr;

	    @FXML
	    private Circle d1lr;

	    @FXML
	    private Circle d1ml;

	    @FXML
	    private Circle d1ll;

	    @FXML
	    private Circle d2ul;

	    @FXML
	    private Circle d2ml;

	    @FXML
	    private Circle d2ll;

	    @FXML
	    private Circle d2ur;

	    @FXML
	    private Circle d2mr;

	    @FXML
	    private Circle d2lr;

	    @FXML
	    private RadioButton roll;

	    @FXML
	    private Circle d1mm;

	    @FXML
	    private Circle d2mm;

	    @FXML
	    private TextField output;
	   

	@FXML
	void rolldice(MouseEvent event) {
		num1 = rand.nextInt(5) + 1;
		num2 = rand.nextInt(5) + 1;
		Sum = num1 + num2;
		
		
		d1ul.setVisible(false);
		d1lr.setVisible(false);
		d1ur.setVisible(false);
		d1ll.setVisible(false);
		d1ml.setVisible(false);
		d1mr.setVisible(false);
		d1mm.setVisible(false);
		d2ul.setVisible(false);
		d2lr.setVisible(false);
		d2ur.setVisible(false);
		d2ll.setVisible(false);
		d2ml.setVisible(false);
		d2mr.setVisible(false);
		d2mm.setVisible(false);
		
		// showing the dots
		
		if (num1 == 1) {
			d1mm.setVisible(true);
			
		} else if (num1 == 2) {
			d1ul.setVisible(true);
			d1lr.setVisible(true);
			
		} else if (num1 == 3) {
			d1ul.setVisible(true);
			d1lr.setVisible(true);
			d1mm.setVisible(true);
			
		} else if (num1 == 4) {
			d1ul.setVisible(true);
			d1lr.setVisible(true);
			d1ur.setVisible(true);
			d1ll.setVisible(true);
		
		} else if (num1 == 5) {
			d1ul.setVisible(true);
			d1lr.setVisible(true);
			d1ur.setVisible(true);
			d1ll.setVisible(true);
			d1mm.setVisible(true);
			
		} else if (num1 == 6) {
			d1ul.setVisible(true);
			d1lr.setVisible(true);
			d1ur.setVisible(true);
			d1ll.setVisible(true);
			d1ml.setVisible(true);
			d1mr.setVisible(true);
			
		}

		if (num2 == 1) {
			d2mm.setVisible(true);
		} else if (num2 == 2) {
			d2ul.setVisible(true);
			d2lr.setVisible(true);
		} else if (num2 == 3) {
			d2ul.setVisible(true);
			d2lr.setVisible(true);
			d2mm.setVisible(true);
		} else if (num2 == 4) {
			d2ul.setVisible(true);
			d2lr.setVisible(true);
			d2ur.setVisible(true);
			d2ll.setVisible(true);
		} else if (num2 == 5) {
			d2ul.setVisible(true);
			d2lr.setVisible(true);
			d2ur.setVisible(true);
			d2ll.setVisible(true);
			d2mm.setVisible(true);
		} else if (num2 == 6) {
			d2ul.setVisible(true);
			d2lr.setVisible(true);
			d2ur.setVisible(true);
			d2ll.setVisible(true);
			d2ml.setVisible(true);
			d2mr.setVisible(true);
		}

		output.setText(Integer.toString(Sum));

	}


}

