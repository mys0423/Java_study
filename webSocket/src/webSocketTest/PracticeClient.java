package webSocketTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class PracticeClient {
	public static void main(String[] args) {
		String serverIp = "";
		int port = 1100;
		String clientmessage = null, serverMessage = null;
		
		try (
				Socket socket = new Socket(serverIp, port);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);
				){
			System.out.println("서버에 연결되었습니다.");
			while(true) {
				System.out.println("서버로 메시지 보내기 >> ");
				clientmessage = sc.nextLine();
				bufferedWriter.write(clientmessage + "\n");
				bufferedWriter.flush();
				System.out.println("[클라이언트]: " + clientmessage);
				
				serverMessage = bufferedReader.readLine();
				System.out.println("[서버]: " + serverMessage);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
