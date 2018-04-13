package com.example.hihi.recycleviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> languages;
    private ArrayList<Locale> locales;
    private RecyclerView rcvLanguage;
    private LanguageAdapter languageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locales = getCountry();
        languages = new ArrayList<>();
        for (int i = 0; i < locales.size(); i++) {
            languages.add(locales.get(i).getDisplayCountry());
        }

        rcvLanguage=findViewById(R.id.rcv_demo);
        languageAdapter=new LanguageAdapter(this,languages);
        rcvLanguage.setLayoutManager(new LinearLayoutManager(this));
        rcvLanguage.setAdapter(languageAdapter);
        rcvLanguage.setItemAnimator(new DefaultItemAnimator());
    }

    private ArrayList<Locale> getCountry() {
        ArrayList<Locale> locales;
        locales = new ArrayList<>();
        locales.add(new Locale("af", "ZA"));
        locales.add(new Locale("ak", "GH"));
        locales.add(new Locale("sq", "AL"));
        locales.add(new Locale("ar", "DZ"));
        locales.add(new Locale("ar", "EG"));
        locales.add(new Locale("ar", "IQ"));
        locales.add(new Locale("ar", "JO"));
        locales.add(new Locale("ar", "LY"));
        locales.add(new Locale("ar", "OM"));
        locales.add(new Locale("ar", "QA"));
        locales.add(new Locale("ar", "SA"));
        locales.add(new Locale("ar", "SD"));
        locales.add(new Locale("ar", "SY"));
        locales.add(new Locale("ar", "TN"));
        locales.add(new Locale("ar", "AE"));
        locales.add(new Locale("hy", "AM"));
        locales.add(new Locale("as", "IN"));
        locales.add(new Locale("eu", "ES"));
        locales.add(new Locale("be", "BY"));
        locales.add(new Locale("bn", "BD"));
        locales.add(new Locale("bg", "BG"));
        locales.add(new Locale("my", "MM"));
        locales.add(new Locale("zh", "CN"));
        locales.add(new Locale("cs", "CZ"));
        locales.add(new Locale("da", "DK"));
        locales.add(new Locale("nl", "NL"));
        locales.add(new Locale("en", "AU"));
        locales.add(new Locale("en", "CA"));
        locales.add(new Locale("en", "HK"));
        locales.add(new Locale("en", "NZ"));
        locales.add(new Locale("en", "PH"));
        locales.add(new Locale("en", "SG"));
        locales.add(new Locale("en", "GB"));
        locales.add(new Locale("en", "US"));
        locales.add(new Locale("fr", "FR"));
        locales.add(new Locale("at", "BE"));
        locales.add(new Locale("de", "DE"));
        locales.add(new Locale("de", "CH"));
        locales.add(new Locale("el", "GR"));
        locales.add(new Locale("hu", "HU"));
        locales.add(new Locale("it", "IT"));
        locales.add(new Locale("ja", "JP"));
        locales.add(new Locale("km", "KH"));
        locales.add(new Locale("ko", "KR"));
        locales.add(new Locale("ms", "MY"));
        locales.add(new Locale("fa", "IR"));
        locales.add(new Locale("pt", "PT"));
        locales.add(new Locale("ru", "RU"));
        locales.add(new Locale("ru", "UA"));
        locales.add(new Locale("es", "AR"));
        locales.add(new Locale("th", "TH"));
        locales.add(new Locale("vi", "VN"));
        locales.add(new Locale("zu", "ZA"));
        return locales;
    }
}
