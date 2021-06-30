package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JLabel;

public class Calculadora {

	private JFrame frame;
	private JLabel textHistorial;
	private JLabel textOperacion;

	public double resultado;
	public char operador;

	private void limpiarOperacion() {

		textOperacion.setText(null);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 300, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 118, 294, 376);
		panel_1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_1);

		JButton C = new JButton("C");
		C.setBorderPainted(false);
		C.setFocusPainted(false);
		C.setBounds(10, 30, 50, 50);
		C.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limpiarOperacion();
			}
		});
		panel_1.setLayout(null);
		C.setPreferredSize(new Dimension(50, 50));
		C.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		C.setHorizontalTextPosition(SwingConstants.CENTER);
		C.setPressedIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		C.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		panel_1.add(C);

		JButton btnCE = new JButton("CE");
		btnCE.setBorderPainted(false);
		btnCE.setFocusPainted(false);
		btnCE.setBounds(80, 30, 50, 50);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarOperacion();
				textHistorial.setText(null);

			}
		});
		btnCE.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnCE.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnCE.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnCE.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnCE.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnCE);

		JButton btnBorrar = new JButton("\u2190");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String cuenta = textOperacion.getText();
				for (int i = 0; i < cuenta.length(); i++) {

					String borrar = cuenta.substring(0, i);

					textOperacion.setText(borrar);

				}
			}
		});

		btnBorrar.setBorderPainted(false);
		btnBorrar.setFocusPainted(false);
		btnBorrar.setBounds(150, 30, 50, 50);
		btnBorrar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnBorrar
				.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnBorrar.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnBorrar.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnBorrar.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnBorrar);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("/");

				} else {
					textOperacion.setText(textOperacion.getText() + "/");

				}

			}
		});

		btnDivision.setBorderPainted(false);
		btnDivision.setFocusPainted(false);
		btnDivision.setBounds(220, 30, 50, 50);
		btnDivision.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnDivision
				.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnDivision.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnDivision.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnDivision.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnDivision);

		JButton btn7 = new JButton("7");
		btn7.setBorderPainted(false);
		btn7.setFocusPainted(false);
		btn7.setBounds(10, 100, 50, 50);
		btn7.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textOperacion.getText() == null) {
					textOperacion.setText("7");

				} else {
					textOperacion.setText(textOperacion.getText() + "7");

				}
			}
		});
		btn7.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn7.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn7.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn7.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("8");

				} else {
					textOperacion.setText(textOperacion.getText() + "8");

				}
			}

		});
		btn8.setBorderPainted(false);
		btn8.setFocusPainted(false);
		btn8.setBounds(80, 100, 50, 50);
		btn8.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn8.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn8.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn8.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn8.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("9");

				} else {
					textOperacion.setText(textOperacion.getText() + "9");

				}
			}
		});
		btn9.setBorderPainted(false);
		btn9.setFocusPainted(false);
		btn9.setBounds(150, 100, 50, 50);
		btn9.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn9.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn9.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn9.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn9.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn9);

		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("*");

				} else {
					textOperacion.setText(textOperacion.getText() + "*");

				}
			}
		});

		btnMultiplicacion.setBorderPainted(false);
		btnMultiplicacion.setFocusPainted(false);
		btnMultiplicacion.setBounds(220, 100, 50, 50);
		btnMultiplicacion.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnMultiplicacion
				.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnMultiplicacion.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnMultiplicacion.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnMultiplicacion.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnMultiplicacion);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("4");

				} else {
					textOperacion.setText(textOperacion.getText() + "4");

				}
			}
		});
		btn4.setBorderPainted(false);
		btn4.setFocusPainted(false);
		btn4.setBounds(10, 170, 50, 50);
		btn4.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn4.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn4.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn4.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn4.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("5");

				} else {
					textOperacion.setText(textOperacion.getText() + "5");

				}
			}
		});
		btn5.setBorderPainted(false);
		btn5.setFocusPainted(false);
		btn5.setBounds(80, 170, 50, 50);
		btn5.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn5.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn5.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn5.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn5.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("6");

				} else {
					textOperacion.setText(textOperacion.getText() + "6");

				}
			}
		});
		btn6.setBorderPainted(false);
		btn6.setFocusPainted(false);
		btn6.setBounds(150, 170, 50, 50);
		btn6.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn6.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn6.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn6.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn6.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn6);

		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("-");

				} else {
					textOperacion.setText(textOperacion.getText() + "-");

				}

			}
		});
		btnResta.setBorderPainted(false);
		btnResta.setFocusPainted(false);
		btnResta.setBounds(220, 170, 50, 50);
		btnResta.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnResta.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnResta.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnResta.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnResta.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnResta);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("1");

				} else {
					textOperacion.setText(textOperacion.getText() + "1");

				}
			}
		});
		btn1.setBorderPainted(false);
		btn1.setFocusPainted(false);
		btn1.setBounds(10, 240, 50, 50);
		btn1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn1.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn1.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn1.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("2");

				} else {
					textOperacion.setText(textOperacion.getText() + "2");

				}
			}
		});
		btn2.setBorderPainted(false);
		btn2.setFocusPainted(false);
		btn2.setBounds(80, 240, 50, 50);
		btn2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn2.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn2.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn2.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn2.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("3");

				} else {
					textOperacion.setText(textOperacion.getText() + "3");

				}
			}
		});
		btn3.setBorderPainted(false);
		btn3.setFocusPainted(false);
		btn3.setBounds(150, 240, 50, 50);
		btn3.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn3.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn3.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn3.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn3.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn3);

		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("0" + "+");

				} else {
					textOperacion.setText(textOperacion.getText() + "+");
				}

			}
		});

		btnSuma.setBorderPainted(false);
		btnSuma.setFocusPainted(false);
		btnSuma.setBounds(220, 240, 50, 50);
		btnSuma.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnSuma.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnSuma.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnSuma.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnSuma.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnSuma);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText("0");

				} else {
					textOperacion.setText(textOperacion.getText() + "0");

				}
			}
		});
		btn0.setBorderPainted(false);
		btn0.setFocusPainted(false);
		btn0.setBounds(10, 310, 50, 50);
		btn0.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btn0.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btn0.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btn0.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btn0.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btn0);

		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOperacion.getText() == null) {
					textOperacion.setText(".");

				} else {
					textOperacion.setText(textOperacion.getText() + ".");

				}
			}
		});

		btnPunto.setBorderPainted(false);
		btnPunto.setFocusPainted(false);
		btnPunto.setBounds(80, 310, 50, 50);
		btnPunto.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnPunto.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn2.png"));
		btnPunto.setRolloverIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));
		btnPunto.setPressedIcon(
				new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));
		btnPunto.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnPunto);

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cuenta = textOperacion.getText();

				for (int i = 0; i < cuenta.length(); i++) {

					char caracter = cuenta.charAt(i);

				
							String primerNumero = cuenta.substring(0, i);
							String segundoNumero = cuenta.substring(i + 1, cuenta.length());

							switch (caracter) {

							case '+':

								resultado = Double.parseDouble(primerNumero) + Double.parseDouble(segundoNumero);

								Double.toString(resultado);
								textHistorial.setText(String.format("%.2f", resultado));
								textOperacion.setText(null);

								break;

							case '-':

								resultado = Double.parseDouble(primerNumero) - Double.parseDouble(segundoNumero);

								Double.toString(resultado);
								textHistorial.setText(String.format("%.2f", resultado));
								textOperacion.setText(null);


								break;

							case '*':
								resultado = (Double.parseDouble(primerNumero) * Double.parseDouble(segundoNumero));

								Double.toString(resultado);
								textHistorial.setText(String.format("%.2f", resultado));
								textOperacion.setText(null);


								break;

							case '/':

								resultado = Double.parseDouble(primerNumero) / Double.parseDouble(segundoNumero);

								Double.toString(resultado);
								textHistorial.setText(String.format("%.2f", resultado));
								textOperacion.setText(null);

								break;
							}
						
						}
				
				
			}}

	);

	btnIgual.setBorderPainted(false);btnIgual.setFocusPainted(false);btnIgual.setBounds(220,310,50,50);btnIgual.setForeground(new Color(255,255,255));btnIgual.setFont(new Font("Segoe UI",Font.PLAIN,24));btnIgual.setIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn3.png"));btnIgual.setRolloverIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1_pressed.png"));btnIgual.setPressedIcon(new ImageIcon("C:\\Users\\Agustin\\Desktop\\Proyectos\\Calculadora\\src\\imagenes\\btn1.png"));btnIgual.setHorizontalTextPosition(SwingConstants.CENTER);panel_1.add(btnIgual);

	JPanel panel = new JPanel();panel.setBounds(0,0,310,123);panel.setBackground(new Color(176,224,230));frame.getContentPane().add(panel);panel.setLayout(null);

	textHistorial=new JLabel();textHistorial.setFont(new Font("Segoe UI",Font.BOLD,30));textHistorial.setBackground(new Color(176,224,230));textHistorial.setHorizontalAlignment(SwingConstants.RIGHT);textHistorial.setBounds(0,0,276,37);panel.add(textHistorial);

	textOperacion=new JLabel();textOperacion.setBounds(0,36,276,76);panel.add(textOperacion);textOperacion.setFont(new Font("Segoe UI",Font.BOLD,30));textOperacion.setBackground(new Color(176,224,230));textOperacion.setHorizontalAlignment(SwingConstants.RIGHT);

}}
