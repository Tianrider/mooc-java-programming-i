/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Counter {

    private int Value;

    public Counter(int startValue) {
        this.Value = startValue;
    }

    public Counter() {
    }

    public void increase() {
        this.Value += 1;
    } 
    
    public int value(){
        return this.Value;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.Value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.Value -= decreaseBy;
        }
    }

    public void decrease() {
        this.Value -= 1;
    }
}
