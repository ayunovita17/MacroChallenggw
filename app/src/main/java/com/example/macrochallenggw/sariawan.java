package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class sariawan extends AppCompatActivity {

    TextView tvDeskripsi;
    TextView textDeskrisi;
    TextView textketerangan;
    TextView textobat;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sariawan);
        tvDeskripsi=(TextView) findViewById(R.id.textView23);
        textDeskrisi= (TextView) findViewById(R.id.textView7);
        textketerangan=(TextView) findViewById(R.id.textView10);
        textobat=(TextView) findViewById(R.id.textView12);
        back=(ImageButton) findViewById(R.id.panahsariawan);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sariawan.this, kategoripenyakit.class);

                startActivity(intent);


            }

        });


        tvDeskripsi.setText("sariawan adalah luka atau peradangan di bibir dan dalam mulut" +
                " yang dapat menimbulkan rasa sakit dan tidak nyaman. Sariawan sering kali dianggap sepele," +
                " namun dapat mengganggu saat penderita sedang makan, minum, atau berbicara."
        );

        textDeskrisi.setText("Biasannya, 1-2 hari sebelim muncul, ada sensasi kesemutan atau terbakar si area bibir dan mulut. Setelah itu," +
                "akan muncul kemerahan da luka yang terasa nyeri dan kadang bisa membekak");
        textketerangan.setText("1. Cedera"+
                "\n"+
                "Sariawan dapat di sebabkan oleh cidera bibir dan mulut, yang menyebabkan meningkatnya resiko terjadinya cedera tersebut adalah:" +
                "Menggunakan gigi palsu atau kawat gigi yang tidak pas, Menyikat gigi terlalu keras, kebiasaan menggit mulit,Lidah atau Bibir" +
                "Mengunyah makanan yang yang Keras ataupun bersuhu terlalu panas, Memakai odol yang mengandung SLS, Memiliki gangguan pada struktur gigi" +
                "\n"+
                "2. Infeksi"+
                "\n"+
                "Selain cedera,Sariawan juga bibi di sebabkan oleh infeksi seperti:Infeksi virus,Infejsi jamur dan Bakteri"+
                "\n"+
                "3. Penyakit autoimun"+
                "\n"+
                "Sariawan juga dapat muncul saat seorang mengalami penyakit auto imun, Seperti lupus, lichen planus, penyakit bechet dan" +
                "pemfigus vulgaris");
        textobat.setText("1. Lidah Buaya" +
                "\n" +
                "lidah buaya memiliki fungsi sebagai anti peradangan dan pereda nyeri alami yang dapat meredakan sariawan. cara penggunaannya cukup olosi " +
                "daging lidah buaya pada sariawan lalu biarkan beberapa jam dan ulangi 2 kali sehari." +
                "\n" +
                "2. Minyak kelapa" +
                "\n" +
                "Kelapa memiliki fungsi mencegah peradangan luca semakin memburuk sekaligus mengurangi rasa sakit yang timbut akibat sariawan, kelapa juga dapat " +
                "menyejukkan suhu tubuh, dimana beberapa kasus sariawan dapat menyebabkan suhu tubuh naik akibat sariawan. cara penggunaannya campurkan minyak kelapa dan madu lalu oleskan ke sariawan." +
                "\n" +
                "3. Garam" +
                "\n" +
                "Garam memiliki kandungan antiperadangan dan anti bakteri yang dapat mengatasi sariawan dan mempercepat penyembuhan sariawan. garam juga memiliki" +
                "fungsi untuk mencegah infeksi di mulut. cara penggunaanya cukup campurkan setengah sendok teh garam ke dalam satu gelas air aduk rata dan gunakan untuk berkumur" +
                "\n");
    }
}