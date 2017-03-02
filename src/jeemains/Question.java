/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeemains;

/**
 *
 * @author gaurav
 */
public class Question extends Object{
    int qNo;
    public enum State{unseen,guessed,answered,seen}; 
    State state;
    
    public Question(int x){
        qNo= x;
        state = State.unseen;
    }
    
    
}
