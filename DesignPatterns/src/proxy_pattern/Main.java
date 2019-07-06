/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_pattern;

/**
 *
 * @author koushik
 */
public class Main {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("VXD.jpg");
        image.display();
        
        ProxyImage image2 = new ProxyImage("mehedi.jpg");
        image2.display();
        
                    //Here the same file is being load Multiple Time
                    
        ProxyImage image3 = new ProxyImage("VXD.jpg");
        image3.display();
        
        System.out.println("");
        image.display();
        image2.display();
        image3.display();
    }
}
