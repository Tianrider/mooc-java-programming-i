/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand milliseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliseconds = new ClockHand(100);
    }

    public void advance() {
        this.milliseconds.advance();

        if (this.milliseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + milliseconds;
    }
}
