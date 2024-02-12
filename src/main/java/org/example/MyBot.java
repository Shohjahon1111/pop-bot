package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMediaGroup;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.print.SimpleDoc;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    private MyBotServis myBotServis=new MyBotServis();

    @Override
    public void onUpdateReceived(Update update) {


        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();
            Long id = update.getMessage().getChat().getId();


            info(firstName, lastName, id, text);

            if (text.equals("/photos")) {

                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto();
                InputMediaPhoto inputMediaPhoto1 = new InputMediaPhoto();
                InputMediaPhoto inputMediaPhoto2 = new InputMediaPhoto();
                List<InputMedia> photos = new ArrayList<>();

                photos.add(inputMediaPhoto);
                photos.add(inputMediaPhoto1);
                photos.add(inputMediaPhoto2);

                SendMediaGroup sendMediaGroup = new SendMediaGroup();
                sendMediaGroup.setChatId(update.getMessage().getChatId());
                sendMediaGroup.setMedias(photos);

                try {
                    execute(sendMediaGroup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }


            if (text.equals("/start")) {
                try {
                    execute(myBotServis.replyMarkub(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }

            if (text.equals("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili")) {
                try {
                    execute(myBotServis.replyMark2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCCDManzilimiz")) {
                try {
                    execute(myBotServis.sendLocation(chatId));
                    execute(myBotServis.locationmessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qaytadan tilni tanlash")) {
                try {
                    execute(myBotServis.replyMarkub(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDFE2Biz haqimizda")) {
                try {
                    execute(myBotServis.sendPhoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FOrqaga")) {
                try {
                    execute(myBotServis.replyMark2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Contact")) {
                try {
                    execute(myBotServis.replyMark2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCDEBiz bilan boglaning")) {
                try {
                    execute(myBotServis.raqam(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83E\uDDD1\u200D\uD83C\uDFEBUstozlar haqida")) {
                try {
                    execute(myBotServis.ustozlarhaqda(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Orqaga")) {
                try {
                    execute(myBotServis.replyMark2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("IT fan")) {
                try {
                    execute(myBotServis.itFan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDCB8Narxlar haqida")) {
                try {
                    execute(myBotServis.narxlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDDFA\uD83C\uDDFF\uD83C\uDDF7\uD83C\uDDFATilni ozgartirish")) {
                try {
                    execute(myBotServis.replyMarkub(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Java")) {
                try {
                    execute(myBotServis.sendPhoto2(chatId));
                    execute(myBotServis.ustozlarhaqida4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Python")){
                try {
                    execute(myBotServis.ustozlarhaqida3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Frontend")){
                try {
                    execute(myBotServis.ustozlarhaqida5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Oshxona muxidi")) {
                try {
                    execute(myBotServis.sendVideo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Royxatdan otish")) {
                try {
                    execute(myBotServis.qabul(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tolov qilish")) {
                try {
                    execute(myBotServis.tolov(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Davom eting")) {
                try {
                    execute(myBotServis.summa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCB7Foundation")) {
                try {
                    execute(myBotServis.sendPhoto7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCB4Oddiy")) {
                try {
                    execute(myBotServis.sendPhoto8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDD54Kun tartibi")) {
                try {
                    execute(myBotServis.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Toshkent Shahri")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Surxondaryo Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Andijon Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Farg'ona Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Namangan Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Sirdaryo Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Jizzax Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Samarqand Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qashqadaryo Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Matematika")){
                try {
                    execute(myBotServis.ustozlarhaqida2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Buxoro Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Xorazm Viloyati")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qoraqolpog'iston Rispublikasi")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();
            Message message = callbackQuery.getMessage();

            if (data.equals("toshId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("surId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("anId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("farId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("namId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("sirId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("jizId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("samId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qashId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("buxId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("xorazmId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("qoraId")) {
                try {
                    execute(myBotServis.ism(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "pdpjava_bot";
    }

    @Override
    public String getBotToken() {
        return "6770532415:AAHyvvWDvKcOcWlifSaGO6u4KZ4Zrj-mL6Y";
    }

    private void info(String firstName,String lastName,Long id,String text){
        System.out.println("---------------");

        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");




        System.out.println("FirstName" + firstName+"\n"+"LastName"+"\n"+"ID"+id+"\n"+"text"+text );
    }
}
