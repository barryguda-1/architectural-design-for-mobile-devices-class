/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa;

/**
 *
 * @author student
 */
public class Ball implements IFigure{
    @Override
    public void createFigure(){
        System.out.println("I am that famous BALL!");
    }

    @Override
    public void figureColor(){
        System.out.println("New figure color!!");
    }
}
