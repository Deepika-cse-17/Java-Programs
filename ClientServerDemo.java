
//Name: DEEPIKA S
//Reg no: 2117240020063
import java.io.*;
import java.net.*;
class Server implements Runnable {
 public void run() {
 try (ServerSocket serverSocket = new ServerSocket(8000)) {
 System.out.println("Server started. Waiting for clients...");
 while (true) { // Handle multiple clients sequentially
 Socket socket = serverSocket.accept();
 System.out.println("Client connected."); // TC1
 BufferedReader in = new BufferedReader(new
InputStreamReader(socket.getInputStream()));
 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
 // Receive message from client
 String clientMsg = in.readLine();
 System.out.println("Client: " + clientMsg); // TC3
 // Send reply to client
 out.println("Hello Client, I received: " + clientMsg); // TC4
 socket.close(); // Close connection
 }
 } catch (IOException e) {
 System.out.println("Server error: " + e.getMessage());
 }
 }
}
class Client implements Runnable {
	private final String message;
	 public Client(String message) {
	 this.message = message;
	 }
	 public void run() {
	 try {
	 Thread.sleep(500); // Ensure server starts first
	 Socket socket = new Socket("localhost", 8000); // Connect to server
	 System.out.println("Connected to server."); // TC1
	 BufferedReader in = new BufferedReader(new
	InputStreamReader(socket.getInputStream()));
	 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	 // Send message to server
	 out.println(message); // TC3
	 // Receive reply from server
	 String serverMsg = in.readLine();
	 System.out.println("Server: " + serverMsg); // TC4
	 socket.close();
	 } catch (ConnectException ce) {
	 System.out.println("Connection refused"); // TC2
	 } catch (Exception e) {
	 System.out.println("Client error: " + e.getMessage());
	 }
	 }
	}
	public class ClientServerDemo {
	 public static void main(String[] args) {
	 
	 System.out.println("Name: DEEPIKA S");
	System.out.println("Reg no: 2117240020063");
	// Start server thread
	 Thread serverThread = new Thread(new Server());
	 serverThread.start();
	 // Start multiple clients sequentially (TC5)
	 new Thread(new Client("Hello Server!")).start();
	 new Thread(new Client("How are you?")).start();
	 new Thread(new Client("Goodbye Server!")).start();
	 
	 
	 
	 }
	}


