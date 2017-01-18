package example.codeclan.com.rps;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 18/01/2017.
 */

public class RockPaperScissors {

    private String player;
    private String cpuAnswer;
    private ArrayList<String> computer;

    public RockPaperScissors(String player) {

        this.player = player;
        computer = new ArrayList<>();
    }

    private void setUpComputer() {
        computer.add("Rock");
        computer.add("Paper");
        computer.add("Scissors");
    }

    private void computerAnswer() {
        Collections.shuffle(computer);
        cpuAnswer = computer.get(0);

    }

    public String checkWin() {


        if (player == "Rock" && cpuAnswer == "Scissors") {
            return "You win (CPU played " + cpuAnswer + ").";
        } else if (player == "Scissors" && cpuAnswer == "Paper") {
            return "You win (CPU played " + cpuAnswer + ").";
        } else if (player == "Paper" && cpuAnswer == "Rock") {
            return "You win (CPU played " + cpuAnswer + ").";
        } else if (player == "Rock" && cpuAnswer == "Paper") {
            return "You lose (CPU played " + cpuAnswer + ").";
        } else if (player == "Scissors" && cpuAnswer == "Rock") {
            return "You lose (CPU played " + cpuAnswer + ").";
        } else if(player == "Paper" && cpuAnswer == "Scissors") {
            return "You lose (CPU played " + cpuAnswer + ").";
        }
        else return "You both chose " + cpuAnswer + "...draw.";
    }

    public String play() {
        setUpComputer();
        computerAnswer();
        String result = checkWin();
        return result;
    }


}

