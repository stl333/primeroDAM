package application;

import ahorcado.Ahorcado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;

public class AhorcadoController
{
	@FXML
	private Pane _pnAhorcado;

	@FXML
	private Pane _pnLetras;

	@FXML
	private PasswordField _pfFrase;

	@FXML
	private Label _lbFrase;



	private int _numeroFallos;


	private Ahorcado _ahorcado;

	public AhorcadoController()
	{
		_numeroFallos = 0;
		_ahorcado = new Ahorcado();
	}



	@FXML
	public void onActionJugar(ActionEvent ae)
	{

		// Si no hay nada escrito
		if(_pfFrase.getText().trim().length() == 0)
			return;

		_numeroFallos = 0;
		// Habilitar las letras
		for(int i = 0; i < _pnLetras.getChildren().size(); i++)
			_pnLetras.getChildren().get(i).setDisable(false);

		// Hacer invisible el ahorcado
		for(int i = 0; i < _pnAhorcado.getChildren().size(); i++)
			_pnAhorcado.getChildren().get(i).setVisible(false);

		// Iniciar una partida
		_ahorcado.partidaNueva(_pfFrase.getText());

		// Poner el panel inicial
		_lbFrase.setText(_ahorcado.getPanel());

	}

	@FXML
	public void onActionLetra(ActionEvent ae)
	{
		Button btLetra = (Button) ae.getSource();
		btLetra.setDisable(true);
		if(!_ahorcado.ponerLetra(btLetra.getText().charAt(0)))
		{
			fallo();
			if(_ahorcado.getNumeroFallos() == 10)
			{
				_lbFrase.setText("Has perdido");
				// Deshabilitar letras
				// Habilitar las letras
				for(int i = 0; i < _pnLetras.getChildren().size(); i++)
					_pnLetras.getChildren().get(i).setDisable(true);
			}
		}
		else
		{
			_lbFrase.setText(_ahorcado.getPanel());
			if(_ahorcado.panelCompleto())
			{
				_lbFrase.setText("Ganaste");
			}
		}
	}

	private void fallo()
	{
		_pnAhorcado.getChildren().get(_numeroFallos++).setVisible(true);
	}

}
