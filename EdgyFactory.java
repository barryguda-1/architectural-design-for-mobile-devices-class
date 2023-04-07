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
public class EdgyFactory extends AbstractFactory{
    @Override
    public IFigure giveFigure(String figureName){
        if (figureName.equalsIgnoreCase("Cube"))
            return new Cube();
        else if (figureName.equalsIgnoreCase("Cuboid"))
            return new Cuboid();
        else
            return null;
    }
}
