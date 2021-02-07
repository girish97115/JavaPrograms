import consumer.Consumer;
import injector.EmailServiceInjector;
import injector.MessageServiceInjector;
import injector.SMSServiceInjector;
public class App {
    public static void main(String[] args) throws Exception {
        String msg = "Hi Girish";
		String email = "girish@abc.com";
		String phone = "9182317283";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
    }
}
