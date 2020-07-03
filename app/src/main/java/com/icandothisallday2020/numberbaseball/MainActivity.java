package com.icandothisallday2020.numberbaseball;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText[] editTexts=new EditText[3];
    Button button;
    TextView explain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Guess The Number!");

        button=findViewById(R.id.button);

        Random rnd=new Random();
        while(true){
            int n1=rnd.nextInt(10);
            int n2=rnd.nextInt(10);
            int n3=rnd.nextInt(10);
            if(n1!=n2&&n1!=n3&&n2!=n3) break;       }

        for(int i=0;i<editTexts.length;i++){
            editTexts[i]=findViewById(R.id.editText1+i);
        }

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] s=new String[3];
                int[] user= new int[3];
                for(int i=0;i<s.length;i++){
                    s[i]=editTexts[i].getText().toString();
                    user[i]=Integer.parseInt(s[i]);
                }




                for(int i=0;i<user.length;i++){
                    editTexts[i].setText("");
                }
            }
        };
        button.setOnClickListener(listener);




        int a=10;
        double b=3.14;
        //Random rnd=new Random();
//        int h;
//        while(true) {
//            h=rnd.nextInt(899)+100;
//            if (h/100!=(h%100)/10 && h/100!=h%10) {
//                if((h%100)/10 != (h%10)) break;
//            }
//        }//while


//        Scanner scan=new Scanner(System.in);
//        int h100=h/100,  h10=h%100/10,  h1=h%10;
//
//        for(int i=1;i<11;i++)
//        {
//            if (i==10) {System.out.println("~LOSE~"); break;}
//            System.out.println("[ "+i+"회 ]");
//            System.out.print("중복되지 않는 3자리 입력 :");
//            int user=scan.nextInt();
//            if (user==h) {System.out.println("HOMERUN!!!");	break;}
//
//            int strike=0,ball=0;
//
//            //strike
//            int u100=user/100,  u10=user%100/10,  u1=user%10;
//            if (u100==h100) strike++;
//            if (u10==h10) strike++;
//            if (u1==h1) strike++;
//            //ball
//            if(u100==h10||u100==h1) ball++;
//            if(u10==h100||u10==h1) ball++;
//            if(u1==h100||u1==h10) ball++;
//
//            //출력
//            System.out.println(strike+" strike\t"+ball+" ball");
//            System.out.println();
//        }


    }
}
