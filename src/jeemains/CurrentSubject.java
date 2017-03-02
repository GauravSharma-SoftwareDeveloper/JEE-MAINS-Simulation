/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeemains;

import jeemains.TestFrame.Subject;

/**
 *
 * @author gaurav
 */
public class CurrentSubject extends Object{
    Subject subject ;
    Question question[]= new Question[30];
    

    public CurrentSubject(Subject s) {
        subject =s;
        for(int i=0;i<30;++i){
            question[i]=new Question(i+1);
        }
    }
    
    
    
}
