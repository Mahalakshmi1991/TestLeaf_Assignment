package week3.day2;

public class APIClient 
{
	public void sendRequest(String endPoint)
	{
		System.out.println("Single Parameter: endpoint = "+endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, Boolean requestStatus)
	{
		System.out.println("Multiple Parameter: 1.endpoint = "+endPoint+ "2.Request body= "+requestBody+ "3.Request status = "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("http://www.amazon.com");
		api.sendRequest("http://www.amazon.com", "<html>...</html>", true);
	}

}
