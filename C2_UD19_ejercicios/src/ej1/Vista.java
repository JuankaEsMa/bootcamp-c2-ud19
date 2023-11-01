package ej1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 420, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 80, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar ");
		lblNewLabel.setBounds(113, 40, 204, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnSaludar = new JButton("Saludar");
		btnSaludar.setBounds(160, 120, 85, 21);
		contentPane.add(btnSaludar);
		btnSaludar.addActionListener(a->saludar());
		
		repaint();
	}
	
	public void saludar() {
		if(!textField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"¡Hola " + textField.getText() + "!");
		}
	}
}
