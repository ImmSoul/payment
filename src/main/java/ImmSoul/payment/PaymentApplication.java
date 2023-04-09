package ImmSoul.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(PaymentApplication.class, args);
		try {
			TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
			api.registerBot(new Bot());
		}
		catch (TelegramApiException e) {
			throw e;
		}
	}

}
