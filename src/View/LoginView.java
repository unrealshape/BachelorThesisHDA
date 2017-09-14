package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private final JLabel lblUsername = new JLabel("");
	private final JLabel lblPassword = new JLabel("");
	private final JLabel lblLogin = new JLabel("");
	private final JTextField txtUsername = new JTextField();
	private final JPasswordField pwdPassword = new JPasswordField();
	private final JLabel lblDregerschriftzug = new JLabel("");
	private final JButton btnLogin = new JButton("Login");
	private final JButton btnCancel = new JButton("Cancel");
	private final JButton btnForgotPw = new JButton("Forgot PW");

	/**
	 * Launch the application.
	 */
	public LoginView() {
		txtUsername.setText("username");
		txtUsername.setBounds(44, 203, 174, 20);
		txtUsername.setColumns(10);
		createContents();
	}
	private void createContents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblUsername.setBounds(10, 199, 24, 24);
		lblUsername.setIcon(new ImageIcon(LoginView.class.getResource("/Imports/avatar (2).png")));
		
		contentPane.add(lblUsername);
		lblPassword.setIcon(new ImageIcon(LoginView.class.getResource("/Imports/key (2).png")));
		lblPassword.setBounds(10, 234, 24, 24);
		
		contentPane.add(lblPassword);
		lblLogin.setIcon(new ImageIcon(LoginView.class.getResource("/Imports/login (1).png")));
		lblLogin.setBounds(60, 42, 128, 128);
		
		contentPane.add(lblLogin);
		
		contentPane.add(txtUsername);
		pwdPassword.setText("password");
		pwdPassword.setBounds(44, 234, 174, 20);
		
		contentPane.add(pwdPassword);
		lblDregerschriftzug.setIcon(new ImageIcon(LoginView.class.getResource("/Imports/DREGERIT-Schriftzug.jpg")));
		lblDregerschriftzug.setBounds(60, 11, 126, 20);
		
		contentPane.add(lblDregerschriftzug);
		btnLogin.setBounds(30, 269, 89, 23);
		
		contentPane.add(btnLogin);
		btnCancel.setBounds(129, 269, 89, 23);
		
		contentPane.add(btnCancel);
		btnForgotPw.setBounds(30, 302, 89, 23);
		
		contentPane.add(btnForgotPw);
	}
}
