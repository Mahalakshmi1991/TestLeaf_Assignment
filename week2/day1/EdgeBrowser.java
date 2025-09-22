package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		Browser objBrowser = new Browser();
		objBrowser.launchBrowser("Firefox");
		objBrowser.loadUrl();
		String str = objBrowser.loadUrl();
		System.out.println(str);

	}

}
