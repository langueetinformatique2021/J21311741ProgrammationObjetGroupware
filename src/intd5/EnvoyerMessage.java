package intd5;

import java.io.*;
import java.net.*;

public class EnvoyerMessage {
	private BufferedReader from = null;
	private PrintWriter to = null;
	private Socket s;

	public EnvoyerMessage (String SMTP, int PORT) {
		 s = new Socket();
		 InetAddress MUA = null;
		 try {
			 MUA = InetAddress.getLocalHost();
		}catch(UnknownHostException exp) {
				System.out.println("machine incounnue");
				 
			 }
		try {
			
			InetSocketAddress saddr1 = new InetSocketAddress(MUA,PORT);
			s.bind(saddr1);
			
			InetAddress MTA = InetAddress.getByName(SMTP);
			InetSocketAddress saddr2 = new InetSocketAddress(MTA, PORT);
			s.connect(saddr2);
			System.out.println("Connection etabli entre " + s.getLocalSocketAddress() + "et" + s.getRemoteSocketAddress());
			
		
		}catch (IOException e) {
			System.out.println("impossible d'ouverture");
		}
		
		try {
			from = new (BufferedReader (new InputStreamReader(s.getInputStream()));
			to = new PrintWriter (s.getOutputStream());
		}catch(IOException e) {
			System.out.println("erreur des flots");
		}
		
	}

	public void envoyer(String in, String out, String sujet, String message) {
		String sMUA, sMTA;
		try {
			sMTA = from.readLine();
			System.err.println(sMTA);
			sMUA = "EHLO" + InetAddress.getLocalHost().getHostName();
			System.err.println(sMUA + " ");
			to.println(sMUA);
			sMTA = from.readLine();
			System.err.println(sMTA);
			sMUA = "MAIL FROM:< " + in + ">";
			System.err.println(sMUA + " ");
			to.println(sMUA);
			sMTA = from.readLine();
			System.err.println(sMTA);
			sMUA = "RCPT TO:< " + in + ">";
			System.err.println(sMUA);
			to.println(sMUA);
			sMTA = from.readLine();
			System.err.println(sMTA);
			sMUA = "DATA";
			System.err.println(sMUA + " ");
			to.println(sMUA);
			sMTA = from.readLine();
			System.err.println(sMTA);
			sMUA = "Subject: " + sujet + "\n" + message + "\n";
			System.err.println(sMUA);
			to.println(sMUA);
			sMTA = from.readLine();
			System.err.println(sMTA);

		} catch (Exception e) {
			System.out.println("erreur réseau");
		}
	}

}
