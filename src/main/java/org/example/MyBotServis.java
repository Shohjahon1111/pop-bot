package org.example;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class MyBotServis {

    public SendMessage replyMarkub(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Assalom Alaykum\n" +
                "Tilni tanlang\n"+"Привет\n" +
                "Выберите язык");
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili");
        row.add(button);
        rows.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDDF7\uD83C\uDDFARus tili");
        row.add(button1);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    public SendMessage replyMark2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Quyidagi menulardan birini tanlang");

        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("\uD83C\uDFE2Biz haqimizda");
        row.add(button);
        rows.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCCDManzilimiz");
        row1.add(button1);
        rows.add(row1);

        KeyboardButton button0 = new KeyboardButton();
        button0.setText("\uD83D\uDCDEBiz bilan boglaning");
        row1.add(button0);


//    KeyboardButton button2 = new KeyboardButton();
//    button2.setText("\uD83D\uDCD6Fanlar haqida");
//    row1.add(button2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83D\uDCB8Narxlar haqida");
        row3.add(button3);
        rows.add(row3);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDCD6Dars jarayonlari");
        row3.add(button4);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83E\uDDD1\u200D\uD83C\uDFEBUstozlar haqida");
        row4.add(button5);
        rows.add(row4);

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDD54Kun tartibi");
        row4.add(button6);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Oshxona muxidi");
        row5.add(button2);
        rows.add(row5);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Tolov qilish");
        row5.add(button8);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Nega aynan biz");
        row6.add(button10);


        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Oquvchinig bir kuni");
        row6.add(button11);
        rows.add(row6);



        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Royxatdan otish");
        row7.add(button9);
        rows.add(row7);


//    ReplyKeyboardMarkup replyKeyboardMarkup1 = new ReplyKeyboardMarkup();
//    replyKeyboardMarkup1.setResizeKeyboard(true);
//    replyKeyboardMarkup1.setSelective(true);
//    replyKeyboardMarkup1.setOneTimeKeyboard(true);
//    KeyboardRow row4 = new KeyboardRow();
//    KeyboardButton button6 = new KeyboardButton();
//    List<KeyboardRow>rows1=new ArrayList<>();
//    button6.setText("Contact");
//    button6.getRequestContact();
//    row4.add(button6);

//    replyKeyboardMarkup1.setKeyboard(List.of(row));


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83C\uDDFA\uD83C\uDDFF\uD83C\uDDF7\uD83C\uDDFATilni ozgartirish");
        row2.add(button7);
        rows.add(row2);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendLocation sendLocation(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.234840);
        sendLocation.setLongitude(69.215919);
        return sendLocation;

    }
    public SendMessage locationmessage(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("✅ PDP School\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Sergili tumani, Yangi Sergili ko'chasi, 46\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: \n" +
                " +998 (78)-777-74-74\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.");
        sendMessage.setChatId(chatId);

        return sendMessage;
    }

    public SendPhoto sendPhoto(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sWnjfZHdUVF1SG9b6"));
        sendPhoto.setCaption("PDP School haqida qisqacha\n" +
                "Aktual sport mashg‘ulotlariBritaniya ta’lim standarti.\nChuqurlashtirilgan IELTS va matematika dasturi.\n10 sinfdan universitetga kirish imkoniyati.\nIT ta’lim ixtisoslashganOta onalar, \no’z farzandlarini online nazorat qilish\n" +
                "ILK bor O’zbekistonda Britaniya ta’lim tizim Pearson, maktabni bitirb,\n Yevropada 2-kursda o’qishi mumkin.Pearson – 200 ga yaqin mamlakatda mijozlarga raqamli kontent, \nbaholash, malaka va ma’lumotlar bilan xizmat ko‘rsatuvchi taʼlim kompaniyasi.");

        return sendPhoto;
    }

//    public SendMessage contact(Long chatId){
//        ReplyKeyboardMarkup replyKeyboardMarkup1 = new ReplyKeyboardMarkup();
//        replyKeyboardMarkup1.setResizeKeyboard(true);
//        replyKeyboardMarkup1.setSelective(true);
//        replyKeyboardMarkup1.setOneTimeKeyboard(true);
//        KeyboardRow row4 = new KeyboardRow();
//        KeyboardButton button6 = new KeyboardButton();
//        List<KeyboardRow>rows1=new ArrayList<>();
//        button6.
//    }

    public SendMessage raqam(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("✅ PDP School\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Sergili tumani, Yangi Sergili ko'chasi, 46\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: \n" +
                " +998 (78)-777-74-74\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.");
        sendMessage.setChatId(chatId);

        return sendMessage;

    }


    public SendMessage ustozlarhaqda(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Qaysi fadagi ustozning haqidagi malumotlar kerak?\nFanni tanlang");

        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("IT fan");
        row.add(button);
        rows.add(row);


        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Ingliz tili");
        row.add(button6);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Matematika");
        row.add(button1);


        KeyboardButton button3 = new KeyboardButton();
        KeyboardRow row2 = new KeyboardRow();
        button3.setText("Biologiya");
        row2.add(button3);
        rows.add(row2);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Ona tili");
        row2.add(button2);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Tarbiya");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        KeyboardRow row3 = new KeyboardRow();
        button5.setText("Geografiya");
        row3.add(button5);
        rows.add(row3);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Kimyo");
        row3.add(button7);


        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Fizika");
        row3.add(button9);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("⬅\uFE0FOrqaga");
        row5.add(button10);
        rows.add(row5);

        return sendMessage;
    }

    public SendMessage itFan(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Fanlar");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();

        button.setText("Java");
        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Frontend");
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Python");
        row1.add(button2);
        rows.add(row1);


        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Robotexnika");
        row1.add(button3);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Orqaga");
        row2.add(keyboardButton);
        rows.add(row2);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage narxlar(Long chatid) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Turini tanlang");
        sendMessage.setChatId(chatid);


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("\uD83D\uDCB7Foundation");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCB4Oddiy");
        row.add(button1);
        rows.add(row);

        KeyboardButton button2 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        button2.setText("⬅\uFE0FOrqaga");
        row1.add(button2);
        rows.add(row1);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto sendPhoto2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sWnjfZHdUVF1SG9b6"));
        sendPhoto.setCaption("Mas'uliyatli, qat'iyatli, o'z ishining ustasi,\n" +
                "yangi narsalarni o'rganishga qiziqadi va qo'llay oladi\n" +
                "amaliyotda olingan bilimlar. 4+ yildan ortiq\n" +
                "turli veb-saytlar bilan ishlash bo'yicha IT tajribasi\n" +
                "backend, frontend, android ilovalari va SQL\n" +
                "ma'lumotlar bazasi\n\n" +
                "Konikmaliri\n\n" + "C++ Android\n" +
                "Java Core                      Kotlin\n" +
                "Java OOP                       Python\n" +
                "Java Time API                  HTML\n" +
                "Spring MVC CSS\n" +
                "REST API JavaScript\n" +
                "Spring Security Angular\n" +
                "Spring Framework\n" +
                "Postgresql\n" +
                "MySQL");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto ustozlarhaqida2(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sWnjfZHdUVF1SG9b6"));
        sendPhoto.setCaption("Haydarov Temur Erkinovich\n" +
                "2016-2020 yillarda Guliston davlat universitetida tahsil olgan\n" +
                "Fizika -matematika mutaxassisi matematika va Fizika fanlaridan turli olimpiadalari qatnashchisi\n" +
                "6-yillik ish tajribasiga ega\n" +
                "2017- yildan \"Zukko Stady\" oʻquv markazida Fizika matematika fanlaridan dars bera boshlagan.\n" +
                "2- toifali katta oʻqituvchi.\n" +
                "Abdulla Avloniy nomidagi onlayn pedagok kursini tamomlagan.\n" +
                "Kreativ pedagog kursini tugatgan.\n" +
                "Faoliyatim davomida1000 lab oʻquvchilarga Matematika va Fizika fanlaridan dars bergan100 lab oʻquvchilarim Oliy taʼlimda talaba boʻlishga erishdi.\n" +
                "Bir nechta davlat maktablarida va Kasb hunar kollejlarida ish faoliyatini olib borgan.\n" +
                "Mert scoll xususiy maktabida \n" +
                "Matematika va Fizika fani ustozi boʻlib ishlagan.\n" +
                "Hozirda PDP xususiy maktabi Matematika fani oʻqituvchisi va Pdp scoll matematika kafedrasi raxbari");
        return sendPhoto;
    }
    public SendPhoto ustozlarhaqida3(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sWnjfZHdUVF1SG9b6"));
        sendPhoto.setCaption("Ibrogimov Musharraf\n" +
                "Ma'lumotlar bazasi muhandisligi bilan tanish,\n" +
                "ma'lumotlarni saqlash va ma'lumotlarni qayta ishlash. Python bilan bog'liq ma'lumotlarga ega\n" +
                "Django, Django Rest, REST API, MVT kabi ramkalar.");
        return sendPhoto;
    }
    public SendPhoto ustozlarhaqida4(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sWnjfZHdUVF1SG9b6"));
        sendPhoto.setCaption("Javohir Haqberdiyev\n\n" +
                "Oliy ta'lim sohasida ishlashning ko'rsatilgan tarixiga ega bo'lgan tajribali dasturiy ta'minot muhandisi. Spring Boot, Hibernate, PL/SQL, Mongo DB va Core Java dasturlarida malakaga ega. Samarqand davlat universitetining amaliy matematika yo'nalishi bo'yicha bakalavr darajasiga ega kuchli muhandis.");
        return sendPhoto;
    }

    public SendPhoto ustozlarhaqida5(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sWnjfZHdUVF1SG9b6"));
        sendPhoto.setCaption("Nur Muhammad Ikromov \n\n" +
                "“Najot ta’lim” ning Frontend kursini bitirgan, keyinchalik oʻquv markazda dars bergan. \n" +
                "HTML, CSS, SASS, BOOTSTRAP, JS, REACT JS, Rest Api, Mui, Ant design, Styled Components, Git,GitHub texnologiyalarini biladi\n" +
                "10 dan ortiq loyihalarda ishtirok etgan");
        return sendPhoto;
    }


    public SendVideo sendVideo(Long chatid) {
        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatid);
        sendVideo.setVideo(new InputFile("https://www.instagram.com/reel/Cw8AuZCNblv/?igsh=azM4cDkzNHlncmYw"));
        sendVideo.setCaption("SAlom");

        return sendVideo;

    }

    public SendMessage qabul(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Joyingizni aniqlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Toshkent Shahri");
        button.setCallbackData("toshId");
        row.add(button);
        rows.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Surxondaryo Viloyati");
        button.setCallbackData("surId");
        row.add(button);
        rows.add(row);


        button = new InlineKeyboardButton();
        button.setText("Andijon Viloyati");
        button.setCallbackData("anId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Farg'ona Viloyati");
        button.setCallbackData("farId");
        row.add(button);
        rows.add(row);


        button = new InlineKeyboardButton();
        button.setText("Namangan Viloyati");
        button.setCallbackData("namId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sirdaryo Viloyati");
        button.setCallbackData("sirId");
        row.add(button);
        rows.add(row);


        button = new InlineKeyboardButton();
        button.setText("Jizzax Viloyati");
        button.setCallbackData("jizId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Samarqand Viloyati");
        button.setCallbackData("samId");
        row.add(button);
        rows.add(row);


        button = new InlineKeyboardButton();
        button.setText("Qashqadaryo Viloyati");
        button.setCallbackData("qashId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Buxoro Viloyati");
        button.setCallbackData("buxId");
        row.add(button);
        rows.add(row);


        button = new InlineKeyboardButton();
        button.setText("Xorazm Viloyati");
        button.setCallbackData("xorazmId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qoraqolpog'iston Rispublikasi");
        button.setCallbackData("qoraId");
        row.add(button);
        rows.add(row);


        inlineKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;

    }

    public SendMessage ism(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Telifon raqamizni kiriting");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        List<KeyboardRow> rows = new ArrayList<>();


        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("Raqam yuborish");
        button.setRequestContact(true);
        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        button1.setText("Orqaga");
        row1.add(button1);
        rows.add(row1);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;


    }

    public SendMessage xabar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Quyudagi menuni tanlang");
        sendMessage.setChatId(chatId);

        return sendMessage;
    }

    public SendMessage  tolov(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Invoys kiriting");
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Davom eting");
        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        button1.setText("Orqaga");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage summa(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("""
               
                <a href="https://click.uz/uz"> Click bilan to'lang</a>
                <a href="https://payme.uz/uz"> Payme bilan to'lang</a>
                """);
        sendMessage.setChatId(chatId);
        sendMessage.setParseMode(ParseMode.HTML);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows=new ArrayList<>();

//        KeyboardButton button = new KeyboardButton();
//        KeyboardRow row = new KeyboardRow();
//        button.setText("Davom eting");
//        row.add(button);
//        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        button1.setText("Orqaga");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendPhoto sendPhoto7(Long chatid){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatid);
        sendPhoto.setPhoto(new InputFile("https://lichnyj-kabinet.uz/wp-content/uploads/2023/09/bdsfghg.jpg"));
        sendPhoto.setCaption("10-sinflar uchun\n" +
                "Jami to'lov summasi           Tarif              Oylik hisobda kalkulatsiya          \n" +
                "5 200 000                               1 oy                  5 200 000\n" +
                "23 500 000                             5 oy                  4 700 000\n" +
                "43 000 000                             10 oy                4 300 000\n" +
                "\n" +
                "\n" +
                "                      11-sinflar uchun\n" +
                "Jami to'lov summasi           Tarif                 Oylik hisobda kalkulatsiya  \n" +
                "5 400 000                               1 oy                     5 400 000\n" +
                "24 500 000                             5 oy                     4 900 000\n" +
                "45 000 000                             10 oy                   4 500 000 ");

        return sendPhoto;
    }
    public SendPhoto sendPhoto8(Long chatid){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatid);
        sendPhoto.setPhoto(new InputFile("https://lichnyj-kabinet.uz/wp-content/uploads/2023/09/bdsfghg.jpg"));
        sendPhoto.setCaption("            5-6-7-8-9-sinflar uchun\n" +
                "Jami to'lov summasi           Tarif              Oylik hisobda kalkulatsiya          \n" +
                "5 200 000                               1 oy                  3 900 000\n" +
                "23 500 000                             5 oy                  3  500 000\n" +
                "43 000 000                             10 oy                3 200 000\n" +
                "\n" +
                "\n" +
                "                     10 -11-sinflar uchun\n" +
                "Jami to'lov summasi           Tarif                 Oylik hisobda kalkulatsiya  \n" +
                "5 400 000                               1 oy                     3 900 000\n" +
                "24 500 000                             5 oy                     3 500 000\n" +
                "45 000 000                             10 oy                   3 200 000");
        return sendPhoto;
    }
    public SendMessage sendMessage(Long chatid){

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatid);
            sendMessage.setText("Dars jadvalini ko'rish:\n\n" +
                    "\uD83D\uDC69\u200D⚕\uFE0F8.00-8.30 - Qabul vaqti va shifokor nazorati\n\n" +
                    "☕\uFE0F8.30-9.00 - Nonushta\n\n" +
                    "\uD83D\uDD549.00-12.25 - Chuqurlashtirib o'tiladigan asosiy fanlar\n\n" +
                    "\uD83C\uDF5B12.30-13.15 - Tushlik\n\n" +
                    "\uD83D\uDD5413.15-14.00 - Umumta'lim fanlari va tarbiya darslari\n\n" +
                    "☕\uFE0F14.35-14.55 - Tolma cho'y\n\n" +
                    "\uD83D\uDD5414.55-15.40 - Yengil o'zlashtiriluvchi fanlar\n\n" +
                    "\uD83D\uDD5415.45-17.00 - To'garaklar va uyga vazifalar tayyorlash\n\n" +
                    "\uD83E\uDDD1\u200D\uD83C\uDFEB17.00-17.30 - O'quvchilarni kuzatish");
            return sendMessage;
    }
}