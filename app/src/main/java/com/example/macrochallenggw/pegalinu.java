package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class pegalinu extends AppCompatActivity {
    TextView tvDeskripsi;
    TextView textDeskrisi;
    TextView textketerangan;
    TextView textobat;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pegalinu);
        back = (ImageButton) findViewById(R.id.panahpegalinu);

        tvDeskripsi=(TextView) findViewById(R.id.textView23);
        textDeskrisi= (TextView) findViewById(R.id.textView7);
        textketerangan=(TextView) findViewById(R.id.textView10);
        textobat=(TextView) findViewById(R.id.textView12);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pegalinu.this, kategoripenyakit.class);

                startActivity(intent);


            }

        });


        tvDeskripsi.setText("Pegal Linu adalah reaksi tubuh di mana rasa kaku, nyeri dan tidak nayaman terasa pada persediaan dan otot"
        );

        textDeskrisi.setText("Biasanya di tandai dengan adanya sendi yang bengkak, merah,terasa panas saat di pegang, dan timbul nyeri");
        textketerangan.setText("1. Cedera Otot"+
                "\n"+
                "Keseleo atau Cedera otot yang menyerang tendon atau ligamen, biasanya terjadi di area kaki, bisa menjadi pegasl dan linu" +
                "\n"+
                "2. Aktivitas fisik yang berlebihan"+
                "\n"+
                "Olahraga memang baik untuk Kesehatan dan kebugaran tubuh. " +
                "Namun, saat melakukannya secara berlebihan, kegiataan ini justru berpotensi menyebabkan pegal dan linu"+
                "\n"+
                "3. Postur tubuh yang buruk"+
                "\n"+
                "Dalam kegiatan sehari-hari tanpa sadar anda memiliki kebiasaan untuk memperaktekkan postur tubuh yang buruk." +
                "padahal kebiasaan ini dapat menyebabkan tekanan otot tertentu sehingga tubuh mengalami pegal dan linu."+
                "\n"+
                "4. Stress"+
                "\n"+
                "Baik stress maupu mental keduanya sama-sama memicu tekanan pada otot-otot dalam tubuh sehingga tanpa di sadari tubuh anda secara tiba-tiba" +
                "melindungi tubuh dari cedera, hal tersebut menyebabkan otot menjadi tegang sehingga rasa pegal dan linu pun muncul. ");

        textobat.setText("1. Jahe" +
                "\n"+
                "Jahe dapat meningkatkan sirkulasi darah dan bisa menghilangkan pegal linu yang menyerang tubuh, Cara menggunakan jahe sebagai obat pegal linu" +
                "cukup meminum seduhan jahe beberapa kali dalam sehari" +
                "\n"+
                "2.Kunyit" +
                "\n"+
                " Kunyit mengandung anti peradangan, anti septik, dan anti mikroba, kandungan bahan alami ini dapat membantu melawan infeksi " +
                "dan menghilangkan rasa tidak nyaman di badan seperti pegal linu. " +
                "\n"+
                "3. Cuka sari apel " +
                "\n" +
                "cuka sari apel memiliki sifat anti peradangan dan dapat menghilangkan pegal dan nyeri tubuh. cara menggunakannya yakni minum campuran 2" +
                "sendok maka cuka sari apel , 100ml air hangat dan satu sendok makan madu di munum 2 kali sehari. Cara menggunakannya parut seruas kunyit atau sesendok" +
                "kunyit bubuk campurkan 100ml air  dan di minum 2 kali sehari." +
                "\n");
    }
}