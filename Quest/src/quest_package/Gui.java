package quest_package;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField input;
	private JTextArea output;
	private JButton submit;

	public Gui() {
		super("Quest");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		input = new JTextField();
		output = new JTextArea();
		submit = new JButton("Send");
		add(input, BorderLayout.SOUTH);
		add(output, BorderLayout.CENTER);
		add(submit, BorderLayout.NORTH);
		submit.addActionListener(this);
	}

	public void addTextGui(String add) {
		output.append(add);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			String inputs = input.getText();
			new Vocab(inputs);
		}
	}
}
