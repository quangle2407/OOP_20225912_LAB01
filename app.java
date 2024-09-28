import javax.swing.JOptionPane;

public class app {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null,"hi " +  result + "!");
		System.exit(0);
	}
}
