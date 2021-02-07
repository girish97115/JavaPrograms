package injector;

import consumer.Consumer;
import consumer.DIApplication;
import service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new DIApplication(new EmailServiceImpl());
    }

}