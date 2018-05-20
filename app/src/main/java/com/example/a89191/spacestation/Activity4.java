package com.example.a89191.spacestation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    Button english;
    Button russian;
    Button french;
    Button german;
    Button spanish;
    Button italian;
    Button chinese;
    Button hindi;
    Button arabic;


    ImageButton question2;

    TextView information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        english= (Button) findViewById(R.id.english);
        english.setOnClickListener(this);

        russian= (Button) findViewById(R.id.russian);
        russian.setOnClickListener(this);

        french= (Button) findViewById(R.id.french);
        french.setOnClickListener(this);

        german= (Button) findViewById(R.id.german);
        german.setOnClickListener(this);

        spanish= (Button) findViewById(R.id.spanish);
        spanish.setOnClickListener(this);

        italian= (Button) findViewById(R.id.italian);
        italian.setOnClickListener(this);

        chinese= (Button) findViewById(R.id.chinese);
        chinese.setOnClickListener(this);

        hindi= (Button) findViewById(R.id.hindi);
        hindi.setOnClickListener(this);

        arabic= (Button) findViewById(R.id.arabic);
        arabic.setOnClickListener(this);

        question2= (ImageButton) findViewById(R.id.question2);
        question2.setOnClickListener(this);

        information= (TextView) findViewById(R.id.information);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.question2:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.english: information.setText("  INFORMATION!"+"\n"+" Your task is to protect the station from the flying asteroids, quickly and correctly solving mathematical sums."+"\n"+"  If you want to start the game, click on 'play', and then on the 'start' button in the lower left corner of the screen. You have three lives, with each wrong answer one of them is taken away. If you want to end the game before, click on the 'finish' button in the lower left corner of the screen." +"\n"+"  The game ends in three cases: " +"\n"+"  1) you have expended all lives; " +"\n"+"  2) you answered all the questions; " + "\n" + "  3) you have completed the game yourself." +"\n"+" We wish good luck and pleasant pastime!");
                break;
            case R.id.russian: information.setText ("  ИНФОРМАЦИЯ!"+"\n"+" Ваша задача - защищать станцию от летящих на нее астероидов, максимально быстро и правильно решая математические примеры."+"\n"+"  Если вы хотите начать игру, нажмите на 'play', а затем на кнопку 'start' в левом нижнем углу экрана. У вас есть три жизни, при каждом неправильном ответе одна из них отнимается. Если вы хотите завершить игру раньше, нажмите на кнопку 'finish' в левом нижнем углу экрана." +"\n"+"  Игра заканчивается в трёх случаях: " +"\n"+"  1) вы израсходовали все жизни; " +"\n"+"  2)вы ответили на все вопросы; " + "\n" + "  3)вы самостоятельно завершили игру." +"\n"+"  Желаем удачи и приятного времяпрепровождения!");
                break;
            case R.id.french: information.setText ("  INFORMATION!"+"\n "+" Votre tâche est de protéger la station contre les astéroïdes volants, rapidement et correctement résoudre des exemples mathématiques." +"\n"+"  Si vous voulez démarrer le jeu, cliquez sur 'play', puis sur le bouton 'start' dans le coin inférieur gauche de l'écran. Vous avez trois vies, avec chaque mauvaise réponse, l'une d'elles est enlevée. Si vous voulez terminer le jeu avant, cliquez sur le bouton 'terminer' dans le coin inférieur gauche de l'écran." +"\n"+"   Le jeu se termine dans trois cas: " +"\n"+" 1) vous avez dépensé toutes les vies; " +"\n"+" 2) vous avez répondu à toutes les questions; " + "\n" + "  3) vous avez terminé le jeu vous-même." +"\n"+"  Nous souhaitons bonne chance et passe-temps agréable!");
                break;
            case R.id.german: information.setText ("  INFORMATION!"+"\n"+" Ihre Aufgabe ist es, die Station vor fliegenden Asteroiden zu schützen und mathematische Beispiele schnell und korrekt zu lösen." +"\n"+"  Wenn Sie das Spiel starten möchten, klicken Sie auf 'Play' und dann auf 'Start' in der unteren linken Ecke des Bildschirms. Du hast drei Leben, mit jeder falschen Antwort wird einer von ihnen weggenommen. Wenn Sie das Spiel vorher beenden möchten, klicken Sie auf die Schaltfläche 'Fertig stellen' in der unteren linken Ecke des Bildschirms." +"\n"+"  Das Spiel endet in drei Fällen: " +"\n"+"  1) du hast alle Leben verbraucht; " +"\n"+"  2) Sie haben alle Fragen beantwortet; " + "\n" + "  3) Sie haben das Spiel selbst abgeschlossen." +"\n"+"  Wir wünschen viel Glück und angenehmen Zeitvertreib!");
                break;
            case R.id.spanish: information.setText ("  ¡INFORMACIÓN!" + "\n" +" Su tarea es proteger la estación de volar asteroides, resolviendo rápida y correctamente ejemplos matemáticos."+"\n"+"  Si quieres comenzar el juego, haz clic en 'jugar' y luego en el botón 'iniciar' en la esquina inferior izquierda de la pantalla. Tienes tres vidas, con cada respuesta incorrecta, una de ellas es quitada. Si quieres terminar el juego antes, haz clic en el botón 'finalizar' en la esquina inferior izquierda de la pantalla." +"\n"+"  El juego termina en tres casos: " +"\n"+"  1) has gastado todas las vidas; " +"\n"+"  2) respondiste todas las preguntas; " + "\n" + "  3) has completado el juego tú mismo." +"\n"+"  ¡Deseamos buena suerte y pasatiempo agradable!");
                break;
            case R.id.italian: information.setText ("  INFORMAZIONI!" + "\n" + " Il tuo compito è proteggere la stazione da asteroidi volanti, risolvendo rapidamente e correttamente esempi matematici."+"\n"+"  Se vuoi iniziare il gioco, clicca su 'gioca' e poi sul pulsante 'start' nell'angolo in basso a sinistra dello schermo. Hai tre vite, con ogni risposta sbagliata una di queste viene portata via. Se vuoi terminare la partita prima, fai clic sul pulsante 'Fine' nell'angolo in basso a sinistra dello schermo." +"\n"+"   Il gioco termina in tre casi: " +"\n"+"  1) hai speso tutte le vite; " +"\n"+"  2) hai risposto a tutte le domande; " + "\n" + "  3) hai completato il gioco da solo." +"\n"+"  Auguriamo buona fortuna e passatempo piacevole!");
                break;
            case R.id.chinese: information.setText ("  信息！" + "\n"+" 你的任務是保護電台免受小行星的影響，快速並正確地解決數學例子。"+"\n"+" 如果你想開始遊戲，點擊'play'，然後點擊屏幕左下角的'start'按鈕。 你有三條生命，每個錯誤的答案都被帶走。 如果您想要結束遊戲，請點擊屏幕左下角的“完成”按鈕。" +"\n"+"  遊戲結束於三種情況： " +"\n"+"  1）你花費了所有的生命; " +"\n"+"  2）你回答了所有問題; " + "\n" + "  3）你自己完成了遊戲。" +"\n"+"  我們祝愿好運和愉快的消遣！");
                 break;
            case R.id.hindi: information.setText ("  सूचना!" + "\n" + " आपका कार्य स्टेशन को क्षुद्रग्रहों से उड़ाने से बचाने के लिए है, गणितीय उदाहरणों को जल्दी और सही तरीके से हल करने के लिए"+"\n"+"  यदि आप खेल शुरू करना चाहते हैं, तो स्क्रीन के निचले बाएं कोने में 'play' पर क्लिक करें और फिर 'स्टार्ट' बटन पर क्लिक करें। आपके पास तीन जिंदगी हैं, प्रत्येक गलत उत्तर के साथ उनमें से एक को हटा दिया जाता है। यदि आप पहले गेम को समाप्त करना चाहते हैं, तो स्क्रीन के निचले बाएं कोने में 'फिनिश' बटन पर क्लिक करें।" +"\n"+"  खेल तीन मामलों में समाप्त होता है: " +"\n"+"  1) आपने सभी जिंदगी व्यय की है; " +"\n"+"   2) आपने सभी सवालों का जवाब दिया; " + "\n" + " 3) आपने गेम को स्वयं पूरा कर लिया है।" +"\n"+"  हम शुभकामनाएं और सुखद शगल की कामना करते हैं!");
                 break;
            case R.id.arabic: information.setText (" المعلومات!  " + "\n"+ " مهمتك هي لحماية المحطة من تحلق الكويكبات ، وحل بسرعة أمثلة الرياضيات."+"\n"+" إذا كنت ترغب في بدء اللعبة ، انقر فوق \"تشغيل\" ، ثم على زر \"ابدأ\" في الزاوية السفلية اليسرى من الشاشة."+"\n"+"  لديك ثلاثة أشخاص ، مع كل إجابة خاطئة يتم أخذ واحد منهم بعيدا." +"\n"+ "   إذا كنت ترغب في إنهاء اللعبة من قبل ، انقر فوق الزر \"إنهاء\" في الزاوية السفلية اليسرى من الشاشة." +"\n"+"    تنتهي اللعبة في ثلاث حالات: " +"\n"+"  1) لقد أنفقت كل الأرواح ؛ " +"\n"+"  2) أجبت على جميع الأسئلة. " + "\n" + "  3) كنت قد أكملت اللعبة بنفسك." +"\n"+"  نتمنى حظا سعيدا وهواية ممتعة!");
                break;
            default:
                break;
        }
    }
}
