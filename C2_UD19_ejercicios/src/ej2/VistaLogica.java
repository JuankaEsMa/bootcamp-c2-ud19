package ej2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VistaLogica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> comboBox;

	public VistaLogica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una película");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 60, 180, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(50, 90, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(210, 60, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(210, 90, 100, 20);
		contentPane.add(comboBox);
		
		JButton btnAddFilm = new JButton("Añadir");
		btnAddFilm.setBounds(60, 150, 85, 21);
		contentPane.add(btnAddFilm);
		btnAddFilm.addActionListener(a->addFilm());
		repaint();

	}
	public void addFilm() {
		if(!textField.getText().isEmpty()) {
			comboBox.addItem(textField.getText());
		}
	}
}
