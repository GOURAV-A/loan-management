
package com.loantogo.mailingservices;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {

	static String mailContents = "<html><body><h1 style=\"color: #5e9ca0;\">Mail Confirmation  from Loans To Go <span style=\"color: #2b2301;\">Web Application</span> </h1>\r\n"
			+ "<h2 style=\"color: #2e6c80;\">Dear Customer,</h2>\r\n"
			+ "<p>Congratulations & Welcome to the business of Loans To Go. <br />We are committed to provide you the best services.&nbsp;</p>\r\n"
			+ "<p>Login into Loans to Go Application for more business requirements. Your Userid is registered emalid and password is in passord column of registration table. Please contact data admin.  </p>\r\n"
			+ "<h2 style=\"color: #2e6c80;\">Our useful Services:</h2>\r\n"
			+ "<ol style=\"list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;\">\r\n"
			+ "<li style=\"clear: both;\"><img style=\"float: left;\" src=\"https://html-online.com/img/01-interactive-connection.png\" alt=\"interactive connection\" width=\"45\" /> Education Loan</li>\r\n"
			+ "<li style=\"clear: both;\"><img style=\"float: left;\" src=\"https://html-online.com/img/02-html-clean.png\" alt=\"html cleaner\" width=\"45\" /> Home Loan</li>\r\n"
			+ "<li style=\"clear: both;\"><img style=\"float: left;\" src=\"https://html-online.com/img/03-docs-to-html.png\" alt=\"Word to html\" width=\"45\" /> Personal Loan</li>\r\n"
			+ "<li style=\"clear: both;\"><img style=\"float: left;\" src=\"https://html-online.com/img/04-replace.png\" alt=\"replace text\" width=\"45\" /> Gold Loan</li>\r\n"
			+ "<li style=\"clear: both;\"><img style=\"float: left;\" src=\"https://html-online.com/img/05-gibberish.png\" alt=\"gibberish\" width=\"45\" /> Two wheeler Loan</li>\r\n"
			+ "<li style=\"clear: both;\"><img style=\"float: left;\" src=\"https://html-online.com/img/6-table-div-html.png\" alt=\"html table div\" width=\"45\" /> Four wheeler Loan  </li>\r\n"
			+ "</ol>\r\n" + "\r\n" + "<p><strong>&nbsp;</strong></p>\r\n"
			+ "<p><strong>Thanks and Regards,</strong><br /><strong>Nikhat Khalil</strong><br><strong>Mob: 9304229192</strong></p>\r\n"
			+ "<p><strong>&nbsp;</strong></p></body></html>" ;

	//public static void main(String[] args) {

public void sendMail1(String Userid, String password) {
		MailSender.send("nikhat.khalil@gmail.com", "zaroonjunaid", "nikhat.khalil@gmail.com",
				"Congratulation for Business with LoansToGo, Loging with userId:" +Userid +"  and  Pasword: "+password, mailContents);
	}

public void sendMail() {
	MailSender.send("nikhat.khalil@gmail.com", "zaroonjunaid", "nikhat.khalil@gmail.com",
			"Congratulation for Business with LoansToGo", mailContents );
}

	public static void send(final String from, final String password, String to, String sub, String msg) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
               //FOR MULTIPLE RECIPENTS
               //message.addRecipient(Message.RecipientType.CC, "abc@abc.com,abc@def.com,ghi@abc.com");
			message.setSubject(sub);
           //message.setText(msg); // send message

			message.setContent(mailContents, "text/html");

			Transport.send(message);

			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}