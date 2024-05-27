package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Home");


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    int min=1;
    int max=50;


    int count=0;
public String s="START";

    public void starter(View v) {
        int rand=(int)(Math.random()*(max-min+1))+min;
        switch (rand){
            case 1:
                s = "MANGO";
                break;
            case 2:
                s = "PILOT";
                break;
            case 3:
                s = "MAPLE";
                break;
            case 4:
                s = "FROST";
                break;
            case 5:
                s = "JUMBO";
                break;
            case 6:
                s = "RAZOR";
                break;
            case 7:
                s = "CABIN";
                break;
            case 8:
                s = "REBEL";
                break;
            case 9:
                s = "AMBER";
                break;
            case 10:
                s = "OASIS";
                break;
            case 11:
                s = "JELLY";
                break;
            case 12:
                s = "WAGON";
                break;

            case 13:
                s = "FLORA";
                break;
            case 14:
                s = "SWIRL";
                break;
            case 15:
                s = "QUERY";
                break;
            case 16:
                s = "TEMPO";
                break;
            case 17:
                s = "CHIME";
                break;
            case 18:
                s = "ONION";
                break;
            case 19:
                s = "LOGIC";
                break;
            case 20:
                s = "DUSTY";
                break;
            case 21:
                s = "RADAR";
                break;
            case 22:
                s = "BINGE";
                break;
            case 23:
                s = "CHASE";
                break;
            case 24:
                s = "ANGLE";
                break;

            case 25:
                s = "MELON";
                break;
            case 26:
                s = "PETAL";
                break;
            case 27:
                s = "MOURN";
                break;
            case 28:
                s = "ZEBRA";
                break;
            case 29:
                s = "MESSY";
                break;
            case 30:
                s = "MARKS";
                break;
            case 32:
                s = "GRADE";
                break;
            case 33:
                s = "CRACK";
                break;
            case 34:
                s = "FORGE";
                break;
            case 35:
                s = "CLOWN";
                break;
            case 36:
                s = "SQUID";
                break;
            case 37:
                s = "CHILD";
                break;

            case 38:
                s = "HELIX";
                break;
            case 39:
                s = "INDIA";
                break;
            case 40:
                s = "JAPAN";
                break;
            case 42:
                s = "FABLE";
                break;
            case 43:
                s = "FAIRY";
                break;
            case 44:
                s = "MERRY";
                break;
            case 45:
                s = "HELLO";
                break;
            case 46:
                s = "THERE";
                break;
            case 47:
                s = "VALVE";
                break;
            case 48:
                s = "YACHT";
                break;
            case 49:
                s = "TRUMP";
                break;
            case 50:
                s = "HORSE";
                break;
        }
        TextView w = findViewById(R.id.Win);
        TextView tx = findViewById(R.id.count);
        w.setText((""));
        tx.setText("");
        count=0;

    }

    public void disable(View v) {


        Button btn = findViewById(R.id.button);
        TextView tx = findViewById(R.id.count);
        TextView w = findViewById(R.id.Win);
        TextView Pass = findViewById(R.id.pass);
        TextView Pass2 = findViewById(R.id.pass2);
        TextView Pass3 = findViewById(R.id.pass3);
        TextView Pass4 = findViewById(R.id.pass4);
        TextView Pass5 = findViewById(R.id.pass5);
        //tx.setText("You have taken 1 turn");
        //btn.setEnabled(false);
        String one = String.valueOf(s.charAt(0));
        String two = String.valueOf(s.charAt(1));
        String three = String.valueOf(s.charAt(2));
        String four = String.valueOf(s.charAt(3));
        String five = String.valueOf(s.charAt(4));

        String input = Pass.getText().toString();
        String input2 = Pass2.getText().toString();
        String input3 = Pass3.getText().toString();
        String input4 = Pass4.getText().toString();
        String input5 = Pass5.getText().toString();
        //Toast.makeText(this,"Alert",Toast.LENGTH_LONG).show();
        if (input.equals(one)) {
            Pass.setTextColor(Color.parseColor("#34ac47"));
        } else if (input.equals(two) || input.equals(three) || input.equals(four) || input.equals(five)) {
            Pass.setTextColor(Color.parseColor("#faab09"));
        } else {
            Pass.setTextColor(Color.parseColor("#000000"));
        }
        if (input2.equals(two)) {
            Pass2.setTextColor(Color.parseColor("#34ac47"));
        } else if (input2.equals(one) || input2.equals(three) || input2.equals(four) || input2.equals(five)) {
            Pass2.setTextColor(Color.parseColor("#faab09"));
        } else {
            Pass2.setTextColor(Color.parseColor("#000000"));
        }
        if (input3.equals(three)) {
            Pass3.setTextColor(Color.parseColor("#34ac47"));
        } else if (input3.equals(two) || input3.equals(one) || input3.equals(four) || input3.equals(five)) {
            Pass3.setTextColor(Color.parseColor("#faab09"));
        } else {
            Pass3.setTextColor(Color.parseColor("#000000"));
        }
        if (input4.equals(four)) {
            Pass4.setTextColor(Color.parseColor("#34ac47"));
        } else if (input4.equals(two) || input4.equals(three) || input4.equals(one) || input4.equals(five)) {
            Pass4.setTextColor(Color.parseColor("#faab09"));
        } else {
            Pass4.setTextColor(Color.parseColor("#000000"));
        }
        if (input5.equals(five)) {
            Pass5.setTextColor(Color.parseColor("#34ac47"));
        } else if (input5.equals(two) || input5.equals(three) || input5.equals(four) || input5.equals(one)) {
            Pass5.setTextColor(Color.parseColor("#faab09"));
        } else {
            Pass5.setTextColor(Color.parseColor("#000000"));
        }
        count++;
        tx.setText("You have taken " + count + " turns");
        if (input.equals(one) && input2.equals(two) && input3.equals(three) && input4.equals(four) && input5.equals(five)) {
        w.setText(("Congratulations! You Win!"));
        }

    }   /*Intent i= new Intent(this,Newpage.class);

        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Chut");
        findViewById(R.id.hello);
        t.setText

         */

    /*public void faker(View vr){
        TextView tx = findViewById(R.id.count);
        Button f = findViewById(R.id.fake);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count ++;
                int l=(count+1);
                tx.setText("You have taken "+l+" turns");

            }
        });
    }*/
}
