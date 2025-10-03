package week3.day2;

public class RadioButton extends Button
{
	public void selectRadioButton()
	{
		System.out.println("select the radio button");
	}
	public static void main(String[] args) {
		RadioButton radiobutton = new RadioButton();
		radiobutton.selectRadioButton();
		radiobutton.click();
		radiobutton.submit();
		radiobutton.setText("Hi");
	}

}
