package week3.day2;

public class CheckBoxButton extends Button
{
	public void clickCheckButton()
	{
		System.out.println("Click check box button");
	}
	public static void main(String[] args) {
		CheckBoxButton cb= new CheckBoxButton();
		cb.clickCheckButton();
		cb.click();
		cb.setText("hii");
		cb.submit();
	}

}
