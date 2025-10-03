package week3.day2;

public class Edge extends Browser{

	public void takeSnap()
	{
		System.out.println("take Snap");
	}
	public void clearCookies()
	{
		System.out.println("Cookies are cleared");
	}
	public static void main(String[] args) {
		Edge browserActions = new Edge();
		browserActions.openURL();
		browserActions.closeBrowser();
		browserActions.navigateBack();
		browserActions.takeSnap();
		browserActions.clearCookies();
	}

}
