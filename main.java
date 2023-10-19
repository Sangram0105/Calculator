import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class abc {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abc window = new abc();
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
	public abc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 400, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(38, 11, 284, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String number =textField.getText()+btn1.getText();
		textField.setText(number);
			}
		});
		
		
		btn1.setBounds(26, 65, 71, 33);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(113, 65, 71, 33);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String number =textField.getText()+btn2.getText();
		textField.setText(number);
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(204, 65, 71, 33);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String number =textField.getText()+btn3.getText();
		textField.setText(number);
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(26, 117, 71, 33);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String number =textField.getText()+btn4.getText();
		textField.setText(number);
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(113, 117, 71, 33);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(204, 117, 71, 33);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(26, 172, 71, 33);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(113, 172, 71, 33);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(205, 172, 71, 33);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);
		
		JButton btndot = new JButton(".");
		btndot.setBounds(26, 216, 71, 33);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btndot);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(113, 216, 71, 33);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn0);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Answer;
				second=Double.parseDouble(textField.getText());
				
				if(operation=="+") {
					result=first+second;
					Answer=String.format("%.2f", result);
					textField.setText(Answer);
				}
				else if(operation=="-") {
						result=first-second;
						Answer=String.format("%.2f", result);
						textField.setText(Answer);
					}
				else if(operation=="*") {
					result=first*second;
					Answer=String.format("%.2f", result);
					textField.setText(Answer);
				}
				else if(operation=="/") {
					result=first/second;
					Answer=String.format("%.2f", result);
					textField.setText(Answer);
				}
					
				
				
				
			}
		});
		btnequal.setBounds(204, 216, 71, 33);
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnequal);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnadd.setBounds(290, 65, 71, 33);
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setBounds(290, 117, 71, 33);
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnsub);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setBounds(290, 172, 71, 33);
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btndivide);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.setBounds(290, 216, 71, 33);
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnmultiply);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(157, 260, 71, 33);
		frame.getContentPane().add(btnClear);
	}
}
