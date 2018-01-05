package com.economia.bravos.braapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** Capital de cada casa de Poniente */
    private int monedas_lannister = 456;
    private int monedas_stark = 238;
    private int monedas_targaryen = 987;

    /** Definición de los TextView de los capitales para poder modificarlos */
    private TextView tv_monedas_lannister;
    private TextView tv_monedas_stark;
    private TextView tv_monedas_targaryen;

    /** Definición de los Button para sumar y restar monedas */
    private Button btn_menos_lannister;
    private Button btn_mas_lannister;

    private Button btn_menos_stark;
    private Button btn_mas_stark;

    private Button btn_menos_targaryen;
    private Button btn_mas_targaryen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Asignamos al TextView definido anteriormente el TextView correspondiente en el
         * activity_main.xml
         */
        tv_monedas_lannister = findViewById(R.id.monedas_lannister);
        /** Establecemos en el TextView la variabla previamente definida */
        tv_monedas_lannister.setText(Integer.toString(monedas_lannister));

        tv_monedas_stark = findViewById(R.id.monedas_stark);
        tv_monedas_stark.setText(Integer.toString(monedas_stark));

        tv_monedas_targaryen = findViewById(R.id.monedas_targaryen);
        tv_monedas_targaryen.setText(Integer.toString(monedas_targaryen));

        /** Asignamos al botón de restar monedas correspondiente el botón definido en activity_main.xml */
        btn_menos_lannister = findViewById(R.id.menos_lannister);
        /** Capturamos el evento del click en el botón de restar monedas a los Lannister */
        btn_menos_lannister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monedas_lannister -= 97;
                tv_monedas_lannister.setText(Integer.toString(monedas_lannister));
            }
        });

        /** Asignamos al botón de sumar monedas correspondiente el botón definido en activity_main.xml */
        btn_mas_lannister = findViewById(R.id.mas_lannister);
        /** Capturamos el evento del click en el botón de sumar monedas a los Lannister */
        btn_mas_lannister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monedas_lannister += 148;
                tv_monedas_lannister.setText(Integer.toString(monedas_lannister));
            }
        });

        btn_menos_stark = findViewById(R.id.menos_stark);
        btn_menos_stark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monedas_stark -= 126;
                tv_monedas_stark.setText(Integer.toString(monedas_stark));
            }
        });

        btn_mas_stark = findViewById(R.id.mas_stark);
        btn_mas_stark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monedas_stark += 254;
                tv_monedas_stark.setText(Integer.toString(monedas_stark));
            }
        });

        btn_menos_targaryen = findViewById(R.id.menos_targaryen);
        btn_menos_targaryen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monedas_targaryen -= 67;
                tv_monedas_targaryen.setText(Integer.toString(monedas_targaryen));
            }
        });

        btn_mas_targaryen = findViewById(R.id.mas_targaryen);
        btn_mas_targaryen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monedas_targaryen += 289;
                tv_monedas_targaryen.setText(Integer.toString(monedas_targaryen));
            }
        });

    }
}
