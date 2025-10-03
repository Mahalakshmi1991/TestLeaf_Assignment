package week3.day2;

public class Chrome extends Browser{

	public void openIncognito()
	{
		System.out.println("open Incognito");
	}
	public void clearCache()
	{
		System.out.println("clear the Cache");
		
	}
	public static void main(String[] args) {
		Chrome browserActions = new Chrome();
		browserActions.openURL();
		browserActions.closeBrowser();
		browserActions.navigateBack();
		browserActions.openIncognito();
		browserActions.clearCache();
	}

}
