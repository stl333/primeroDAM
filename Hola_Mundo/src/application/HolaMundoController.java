package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HolaMundoController
{
	@FXML
	private Label lbHolaMundo;
	@FXML
	private Button btOk;
	@FXML
	private Button btBorrar;

	// Event Listener on Button[#btOk].onAction
	@FXML
	public void onActionOk(ActionEvent event)
	{
		lbHolaMundo.setText("Hola mundo");
		btBorrar.setDisable(false);
		btOk.setDisable(true);
	}
	@FXML
	public void onActionBorrar(ActionEvent event)
	{
		lbHolaMundo.setText("");
		btBorrar.setDisable(true);
		btOk.setDisable(false);
	}
}
