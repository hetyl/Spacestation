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
            case R.id.english: information.setText("  INFORMATION!"+"\n"+" Your task is to protect the station from the flying asteroids, quickly and correctly solving mathematical sums.");
                break;
            case R.id.russian: information.setText ("  ИНФОРМАЦИЯ!"+"\n"+" Ваша задача - защищать станцию от летящих на нее астероидов, максимально быстро и правильно решая математические примеры.");
                break;
            case R.id.french: information.setText ("  INFORMATION!"+"\n "+" Votre tâche est de protéger la station contre les astéroïdes volants, rapidement et correctement résoudre des exemples mathématiques.");
                break;
            case R.id.german: information.setText ("  INFORMATION!"+"\n"+" Ihre Aufgabe ist es, die Station vor fliegenden Asteroiden zu schützen und mathematische Beispiele schnell und korrekt zu lösen.");
                break;
            case R.id.spanish: information.setText ("  ¡INFORMACIÓN!" + "\n" +" Su tarea es proteger la estación de volar asteroides, resolviendo rápida y correctamente ejemplos matemáticos.");
                break;
            case R.id.italian: information.setText ("  INFORMAZIONI!" + "\n" + " Il tuo compito è proteggere la stazione da asteroidi volanti, risolvendo rapidamente e correttamente esempi matematici.");
                break;
            case R.id.chinese: information.setText ("  信息！" + "\n"+" 你的任務是保護電台免受小行星的影響，快速並正確地解決數學例子。");
                 break;
            case R.id.hindi: information.setText ("  सूचना!" + "\n" + " आपका कार्य स्टेशन को क्षुद्रग्रहों से उड़ाने से बचाने के लिए है, गणितीय उदाहरणों को जल्दी और सही तरीके से हल करने के लिए");
                 break;
            case R.id.arabic: information.setText (" المعلومات!  " + "\n"+ " مهمتك هي لحماية المحطة من تحلق الكويكبات ، وحل بسرعة أمثلة الرياضيات.");
                break;
            default:
                break;
        }
    }
}
