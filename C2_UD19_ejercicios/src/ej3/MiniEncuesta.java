package ej3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class MiniEncuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ButtonGroup buttonGroup;
	JCheckBox chBoxProgramacion;
	JCheckBox chBoxDiseño;
	JCheckBox chBoxAdministracion;
	String rbSelected ="";
	JSlider slider;
	ArrayList<String> resultados;
	
	public MiniEncuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setVisible(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdBtnWindows = new JRadioButton("Windows");
		rdBtnWindows.setBounds(25, 36, 103, 21);
		contentPane.add(rdBtnWindows);
		
		JRadioButton rdBtnLinux = new JRadioButton("Linux");
		rdBtnLinux.setBounds(25, 59, 103, 21);
		contentPane.add(rdBtnLinux);
		
		JRadioButton rdBtnMac = new JRadioButton("Mac");
		rdBtnMac.setBounds(25, 82, 103, 21);
		contentPane.add(rdBtnMac);
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdBtnWindows);
		buttonGroup.add(rdBtnLinux);
		buttonGroup.add(rdBtnMac);
		
		chBoxProgramacion = new JCheckBox("Programación");
		chBoxProgramacion.setBounds(249, 36, 93, 21);
		contentPane.add(chBoxProgramacion);
		
		chBoxDiseño = new JCheckBox("Diseño gráfico");
		chBoxDiseño.setBounds(249, 59, 93, 21);
		contentPane.add(chBoxDiseño);
		
		chBoxAdministracion = new JCheckBox("Administración");
		chBoxAdministracion.setBounds(249, 82, 93, 21);
		contentPane.add(chBoxAdministracion);
		
		slider = new JSlider();
		slider.setPaintTrack(false);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(1);
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(90, 140, 200, 22);
		contentPane.add(slider);
		
		JButton btnEnviar = new JButton("Enviar encuesta");
		btnEnviar.setBounds(115, 180, 150, 25);
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(a->enviarEncuesta());
		repaint();
	}
	
	public void enviarEncuesta() {


		if(verificarDatosEncuesta()) {
			ResultadoEncuesta resultadoEncuesta = new ResultadoEncuesta(resultados);
			this.setVisible(false);
		}else {
			JOptionPane.showMessageDialog(null, "Has de seleccionar un sistema operativo");
		}
	}
	public boolean verificarDatosEncuesta() {
		Enumeration<AbstractButton> radioButtons = buttonGroup.getElements();
		resultados = new ArrayList<String>();

		while(radioButtons.hasMoreElements()) {
			JRadioButton rb = (JRadioButton)radioButtons.nextElement();
			if(rb.isSelected()) {
				rbSelected = rb.getText();
			}
		}
		if(rbSelected.isEmpty()) {
			return false;
		}else {
			resultados.add(rbSelected);
		}
		if(chBoxProgramacion.isSelected()) {
			resultados.add(chBoxProgramacion.getText());
		}
		if(chBoxDiseño.isSelected()) {
			resultados.add(chBoxDiseño.getText());
		}
		if(chBoxAdministracion.isSelected()) {
			resultados.add(chBoxAdministracion.getText());
		}
		resultados.add(slider.getValue()+"");
		return true;
	}
}
