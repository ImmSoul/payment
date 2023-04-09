package ImmSoul.payment;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;

public class Bot implements LongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        String text = update.getMessage().getText();
        SendMessage message = new SendMessage();
        message.setText(text);
        message.setChatId(update.getMessage().getChatId());
        execute(message);

    }

    @Override
    public BotOptions getOptions() {
        return null;
    }

    @Override
    public void clearWebhook() throws TelegramApiRequestException {

    }

    @Override
    public String getBotUsername() {
        return "PaymentSibSet_bot";
    }

    @Override
    public String getBotToken() {
        return "5957008125:AAEKwo0J6R7Xt_1KWKhWEPrB2wLqpkpW-UI";
    }
}
