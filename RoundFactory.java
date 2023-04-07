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
public class RoundFactory extends AbstractFactory{
    @Override
    public IFigure giveFigure(String figureName){
        if (figureName.equalsIgnoreCase("Ball"))
            return new Ball();
        else if(figureName.equalsIgnoreCase("Ellipsoid"))
            return new Ellipsoid();
        else 
            return null;
    
}
}
