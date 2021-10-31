package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class malaria extends AppCompatActivity {
    ImageButton back;
    TextView tvdeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaria);
        back = (ImageButton) findViewById(R.id.panahmalaria);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(malaria.this, kategoripenyakit.class);

                startActivity(intent);


            }

        });

        tvdeskripsi = (TextView) findViewById(R.id.pengertianmalaria);
        tvdeskripsi.setText("Malaria adalah penyakit infeksi menular yang menyebar melalui gigitan nyamuk. Penderita malaria akan mengeluhkan gejala demam \n" +
                "dan menggigil");

        tvdeskripsi = (TextView) findViewById(R.id.gejalamalaria);
        tvdeskripsi.setText("Gejala malaria timbul setidaknya 10-15 hari setelah digigit nyamuk. Munculnya gejala melalui tiga tahap selama 6-12 jam, yaitu menggigil, demam dan sakit kepala, lalu mengeluarkan banyak keringat dan lemas sebelum suhu tubuh kembali normal.");

        tvdeskripsi = (TextView) findViewById(R.id.penyebabmalaria);
        tvdeskripsi.setText("Malaria adalah penyakit yang disebabkan oleh parasit bernama Plasmodium. Penyakit ini ditularkan melalui gigitan nyamuk yang terinfeksi parasit tersebut. Di dalam tubuh manusia, parasit Plasmodium akan berkembang biak di organ hati kemudian menginfeksi sel darah merah.");

        tvdeskripsi = (TextView) findViewById(R.id.obatmalaria);
        tvdeskripsi.setText("1. Daun Pepaya\n" +
                "obat malaria dari daun pepaya dengan mengambil 2/3 genggam daun pepaya" +
                " agak muda. Cuci bersih dan tumbuk sampai halus, bisa juga diblender. " +
                "Tambahkan air hangat sebanyak 3/4 cangkir, tambahkan garam. Peras," +
                " kemudian saring airnya dan minum 3 kali sehari.\n"+
                "\n"+
                "2. Sambiloto\n" +
                " ambil setengah genggam daun sambiloto. Cuci dan rebus dengan tiga gelas air. Biarkan mendidih sehingga tersisa seperempat bagian. Dinginkan, saring dan minum 3 kali sehari sebanyak 3/4 gelas minum.");

    }
}