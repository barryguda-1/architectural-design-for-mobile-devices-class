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
public class AbFa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFactory figureFactory1 = FactoryProducer.provideFactory(true);
        
        IFigure fig1 = figureFactory1.giveFigure("Cube");
        fig1.createFigure();
        
        IFigure fig2 = figureFactory1.giveFigure("Cuboid");
        fig2.createFigure();
        
        AbstractFactory figureFactory2 = FactoryProducer.provideFactory(false);
        
        IFigure fig3 = figureFactory2.giveFigure("Ball");
        fig3.createFigure();
        
       IFigure fig4 = figureFactory2.giveFigure("Ellipsoid");
       fig4.createFigure(); 
        
       IFigure fig5 = figureFactory2.giveFigure("Ellipsoid");    
       fig4.figureColor(); 
        
    }
    
}
