package week8_FX;
 
//ADD TEXT FIELD AND A PASSWORD FIELD WITH BUTTONS - NO ACTION : EVENT HANDLER
//GRID LAYOUT 
// you need a method to build the stage and a main method, which launches the stage

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static javafx.application.Application.launch;

import java.awt.TextField;

import javafx.geometry.Insets; 
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;  

public class vbCalculatorGrid2 extends Application { 

	public Button logButton;
	Button b1 , b2 ,b3 , b4 , b5 ; 			//Creating Buttons 
    Button b6, b7, b8, b9, b10, badd,bsub,bdiv,bmul,bq,bdot,bcan; 
    String var;
    
    public Button resultText;
   
    public GridPane formatGridPane (GridPane gridPane){
	      gridPane.setMinSize(500, 500); 					//Setting size for the pane 
	      gridPane.setPadding(new Insets(10, 10, 10, 10)); 	//Setting the padding  
	      gridPane.setVgap(5); 								//Setting the vertical and horizontal gaps between the columns 
	      gridPane.setHgap(5);       	      
	      gridPane.setAlignment(Pos.CENTER); 	
	      gridPane.setStyle("-fx-background-color: #000000;");
    	return gridPane;
    }
    
    public void createStuff(){
//    	Button text="Copy as raw" userData="raw" onAction="#copyToClipboard" 
//    	serData="raw" onAction="#copyToClipboard
    	   b1 = new Button("1"); 			//Creating Buttons 
	       b2 = new Button("2");  
	       b3 = new Button("3"); 			//Creating Buttons 
	       b4 = new Button("4");  
	       b5 = new Button("5"); 			//Creating Buttons 
	       b6 = new Button("6");  
	       b7   = new Button("7");  
	       b8   = new Button("8");  
	       b9   = new Button("9");  
	       b10  = new Button("10");  
	       badd = new Button("+");  
	       bsub = new Button("-");  
	       bdiv = new Button("/");
	       bmul = new Button("*");  
	       bq   = new Button("="); 
	       bdot = new Button(".");  
	       bcan = new Button("Clear");  
	       resultText = new Button("");
    }
    
    public GridPane  stuffOnGrid(GridPane gridPane){
    	
	    gridPane.add(b1, 0, 0); 		//Arranging all the nodes in the grid  // col 0 , row 0
	    gridPane.add(b2, 1, 0); 		// col 1 , row 0
	    gridPane.add(b3, 2, 0); 		// col 2 , row 0
	    gridPane.add(badd, 3, 0); 	
	    
	    gridPane.add(b4, 0, 1); 		// col 0 , row 1
	    gridPane.add(b5, 1, 1); 		// col 1 , row 1
	    gridPane.add(b6, 2, 1); 		// col 2 , row 1
	    gridPane.add(bsub, 3, 1); 
	    
	    gridPane.add(b7,  0, 2); 		// col 2 , row 1
	    gridPane.add(b8,  1, 2); 		// col 2 , row 1
	    gridPane.add(b9,  2, 2); 		// col 2 , row 1
	    gridPane.add(bmul,3, 2); 
	    
	    gridPane.add(b10 , 0, 3); 		// col 2 , row 1
	    gridPane.add(bdot, 1, 3); 
	    gridPane.add(bq  , 2, 3); 
	    gridPane.add(bdiv, 3, 3); 
	    GridPane.setColumnSpan(bcan, 4);
	    gridPane.add(bcan, 0, 4);
	    //gridPane.add(resultText, 1,6);
	    GridPane.setColumnSpan(resultText, 4);
	    gridPane.add(resultText, 0,7);  
	    
	    
	    return gridPane;
    }
    
    public void formatGridElements(){
        // colorlist : https://docs.oracle.com/javafx/2/api/javafx/scene/paint/Color.html
    	    b1.setStyle("-fx-background-color: GRAY; -fx-text-fill: white; -fx-font: normal bold 20px 'serif' ");  	//Styling nodes 
    	    b2.setStyle("-fx-background-color: GRAY; -fx-text-fill: white; -fx-font: normal bold 20px 'serif' ");
    	    b3.setStyle("-fx-background-color: GRAY; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");  	 
    	    b4.setStyle("-fx-background-color: GRAY; -fx-text-fill: white; -fx-font: normal bold 20px 'serif' ");
    	    b5.setStyle("-fx-background-color: GRAY; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");   
    	    b6.setStyle("-fx-background-color: GRAY ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    b7.setStyle("-fx-background-color: GRAY; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");  			 
    	    b8.setStyle("-fx-background-color: GRAY ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    b9.setStyle("-fx-background-color: GRAY; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");  			 
    	    b10.setStyle("-fx-background-color:GRAY ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    badd.setStyle("-fx-background-color: DARKORANGE; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");  	
    	    bsub.setStyle("-fx-background-color: DARKORANGE ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    bmul.setStyle("-fx-background-color: DARKORANGE ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    bdiv.setStyle("-fx-background-color: DARKORANGE ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    bdot.setStyle("-fx-background-color: GRAY ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    bq.setStyle("-fx-background-color: LIME ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");
    	    resultText.setStyle("-fx-background-color: BLACK ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");	 
    	    bcan.setStyle("-fx-background-color: GRAY ; -fx-text-fill: white;-fx-font: normal bold 20px 'serif' ");	 
    	    
    	    b1.setPrefWidth(70);
    	    b2.setPrefWidth(70);
    	    b3.setPrefWidth(70);
    	    b4.setPrefWidth(70);
    	    b5.setPrefWidth(70);    	    
    	    b6.setPrefWidth(70);
    	    b7.setPrefWidth(70);
    	 	b8.setPrefWidth(70);
    	 	b9.setPrefWidth(70);
    	    b10.setPrefWidth(70);
    	    badd.setPrefWidth(70); 
    	    bsub.setPrefWidth(70); 
    	    bmul.setPrefWidth(70); 
    	    bdot.setPrefWidth(70);
    	    bq.setPrefWidth(70);
    	    bdiv.setPrefWidth(70);
    	    resultText.setPrefWidth(260);
    	    bcan.setPrefWidth(295);
    	    
    	    b1.setId("1");
    	    b2.setId("2");
    	    b3.setId("3");
    	    b4.setId("4");
    	    b5.setId("5");    	    
    	    b6.setId("6");
    	    b7.setId("7");
    	 	b8.setId("8");
    	 	b9.setId("9");
    	    b10.setId("10");
    	    badd.setId("badd"); 
    	    bsub.setId("bsub"); 
    	    bmul.setId("bmul"); 
    	    bdot.setId("bdot");
    	    bq.setId("bq");
    	    bdiv.setId("bdiv"); 
    			
    }
    
    public void createEH(){
        //calculator
	      //get the value of the box ticker
	  	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{   String s = resultText.getText();
				String [] s2 = s.split(" ");
				double d = 0.0;
				resultText.setText(" button selected " + bq.getId()); 
				if  (s.indexOf("+") >0 ) {d= Double.parseDouble(s2[0])+Double.parseDouble(s2[2]);}
				else if (s.indexOf("/") >0 ) {d= Double.parseDouble(s2[0])/Double.parseDouble(s2[2]);}
				else if(s.indexOf("-") >0 ) {d= Double.parseDouble(s2[0])-Double.parseDouble(s2[2]);}
				else if(s.indexOf("*") >0 ) {d= Double.parseDouble(s2[0])*Double.parseDouble(s2[2]);}
				resultText.setText(Double.toString(d));
			} 
		}; 
		bq.setOnAction(event); 
		
	    b1.setOnAction(action -> { // displays value
  	  	resultText.setText(resultText.getText()+b1.getText());
	    });
	    b2.setOnAction(action -> { //displays and changes value
	        resultText.setText(resultText.getText()+b2.getText());
	    });
	    b3.setOnAction(action -> { // displays value
  	  	resultText.setText(resultText.getText()+b3.getText());
	    });
	    b4.setOnAction(action -> { //displays and changes value
	        resultText.setText(resultText.getText()+b4.getText());
	    });
	    b5.setOnAction(action -> { // displays value
  	  	resultText.setText(resultText.getText()+b5.getText());
	    });
	    b6.setOnAction(action -> { //displays and changes value
	        resultText.setText(resultText.getText()+b6.getText());
	    });
	    b7.setOnAction(action -> { // displays value
  	  	resultText.setText(resultText.getText()+b7.getText());
	    });
	    b8.setOnAction(action -> { //displays and changes value
	        resultText.setText(resultText.getText()+b8.getText());
	    });
	    b9.setOnAction(action -> { // displays value
  	  	resultText.setText(resultText.getText()+b9.getText());
	    });
	    b10.setOnAction(action -> { //displays and changes value
	        resultText.setText(resultText.getText()+b10.getText());
	    });
	    bcan.setOnAction(action -> { //displays and changes value
	        resultText.setText("");
	    });
	    bdot.setOnAction(action -> { //displays and changes value
	    	resultText.setText(resultText.getText()+".");
	    });
	    bmul.setOnAction(action -> { //displays and changes value
	    	resultText.setText(resultText.getText()+" * ");
	    });
	    bdiv.setOnAction(action -> { //displays and changes value
	    	resultText.setText(resultText.getText()+" / ");
	    });
	    bsub.setOnAction(action -> { //displays and changes value
	    	resultText.setText(resultText.getText()+" - ");
	    });
	    badd.setOnAction(action -> { //displays and changes value
	    	resultText.setText(resultText.getText()+" + ");
	    });
    }
	    
    @Override 
	public void start(Stage stage) {  
		  createStuff();
		  GridPane gridPane = new GridPane();
		  gridPane =formatGridPane (gridPane);
	      gridPane = stuffOnGrid( gridPane);
	      formatGridElements();
	      createEH();
		
	      //Scene scene = new Scene(gridPane); 				//Creating a scene object 
	      Scene scene = new Scene(gridPane, 500, 500);
	      stage.setTitle("Calculator Example"); 					//Setting title to the Stage  
	      stage.setScene(scene);							//Adding scene to the stage 
	      stage.show(); 									//Displaying the contents of the stage 
	   }      
	   
    public static void main(String args[]){ 
	      launch(args); 
	} 
	
}