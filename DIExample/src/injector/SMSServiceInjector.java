package injector;

import consumer.Consumer;
import consumer.DIApplication;
import service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new DIApplication(new SMSServiceImpl());
    }

}
