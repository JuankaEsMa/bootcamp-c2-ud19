package ej3;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ResultadoEncuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public ResultadoEncuesta(ArrayList<String> respuestas) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistema = new JLabel("Sistema Operativo: ");
		lblSistema.setBounds(40, 30, 101, 13);
		contentPane.add(lblSistema);
		
		JLabel lblEspecialidad = new JLabel("Especialidad/es:");
		lblEspecialidad.setBounds(40, 60, 100, 13);
		contentPane.add(lblEspecialidad);
		
		JLabel lblHoras = new JLabel("Horas dedicadas:");
		lblHoras.setBounds(40, 90, 100, 13);
		contentPane.add(lblHoras);
		
		JLabel lblSistemaRespuesta = new JLabel("");
		lblSistemaRespuesta.setBounds(151, 30, 101, 13);
		contentPane.add(lblSistemaRespuesta);
		
		JLabel lblEspecialidadRespuesta = new JLabel("");
		lblEspecialidadRespuesta.setBounds(150, 60, 276, 13);
		contentPane.add(lblEspecialidadRespuesta);
		
		JLabel lblHorasRespuesta = new JLabel("");
		lblHorasRespuesta.setBounds(150, 90, 45, 13);
		contentPane.add(lblHorasRespuesta);
		
		lblSistemaRespuesta.setText(respuestas.get(0));
		for (int i = 1; i < respuestas.size()-1; i++) {
			if(i == 1) {
				lblEspecialidadRespuesta.setText(respuestas.get(i));
			}else {
				lblEspecialidadRespuesta.setText(lblEspecialidadRespuesta.getText() + ", " + respuestas.get(i));
			}
		}
		lblHorasRespuesta.setText(respuestas.get(respuestas.size()-1));
	}

}
