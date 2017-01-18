package example.codeclan.com.rps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;
    TextView textView;
    RockPaperScissors rockPaperScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRock = (Button)findViewById(R.id.button_rock);
        buttonPaper = (Button)findViewById(R.id.button_paper);
        buttonScissors = (Button)findViewById(R.id.button_scissors);
        textView = (TextView)findViewById(R.id.result);
    }

    public void setButtonRock(View buttonRock){
        String playerAnswer = "Rock";
        rockPaperScissors = new RockPaperScissors(playerAnswer);
        String result = rockPaperScissors.play();
        textView.setText(result);
    }

    public void setButtonPaper(View buttonPaper){
        String playerAnswer = "Paper";
        rockPaperScissors = new RockPaperScissors(playerAnswer);
        String result = rockPaperScissors.play();
        textView.setText(result);
    }

    public void setButtonScissors(View buttonScissors){
        String playerAnswer = "Scissors";
        rockPaperScissors = new RockPaperScissors(playerAnswer);
        String result = rockPaperScissors.play();
        textView.setText(result);
    }



}



