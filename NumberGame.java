public class NumberGame extends JFrame implements ActionListener
{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 500;
	private JTextArea display;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	
	public NumberGame()
	{
		super("Find odd numbers, win a prize!");
		setSize(WIDTH, HEIGHT):
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLayout(new GridLayout(3, 3));
		JButton button1 = new JButton("");
		JButton button2 = new JButton("");
		JButton button3 = new JButton("");
		JButton button4 = new JButton("");
		JButton button5 = new JButton("");
		JButton button6 = new JButton("");
		JButton button7 = new JButton("");
		JButton button8 = new JButton("");
		JButton button9 = new JButton("");
		button1.setActionCommand("b1");
		button2.setActionCommand("b2");
		button3.setActionCommand("b3");
		button4.setActionCommand("b4");
		button5.setActionCommand("b5");
		button6.setActionCommand("b6");
		button7.setActionCommand("b7");
		button8.setActionCommand("b8");
		button9.setActionCommand("b9");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		add(buttonPanel);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(Color.WHITE);
		displayPanel.setLayout(new FlowLayout());
		display = new JTextArea(7, 30);
		displayPanel.add(display);
		add(displayPanel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
		Switch (actionCommand)
		{
			case "b1":
				button1.setClickable(false);
				button1.setText(getRandonNumber());
				display.setText(display.getText() + " " + button1.getText());
				break;
			case "b2":
				
				break;
			case "b3":
				
				break;
			case "b4":
				
				break;
			case "b5":
				
				break;
			case "b6":
				
				break;
			case "b7":
				
				break;
			case "b8":
				
				break;
			case "b9":
				
				break;
			default:
				System.out.println("System error!");
				System.exit(0);
		}
	}
	
}