package week4.day1;

public class JavaConnection implements DatabaseConnection
{
	@Override
	public void connect() {
		System.out.println("Data base connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Data base disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updates are executed");
	}
	
	public static void main(String[] args) 
	{
		JavaConnection connectionOption = new JavaConnection();
		connectionOption.connect();
		connectionOption.disconnect();
		connectionOption.executeUpdate();
	}

}
