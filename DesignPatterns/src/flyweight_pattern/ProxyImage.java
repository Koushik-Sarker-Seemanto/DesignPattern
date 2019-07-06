/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight_pattern;

import proxy_pattern.*;
import java.util.HashMap;

/**
 *
 * @author koushik
 */
public class ProxyImage implements Image{

    private String fileName;
    private RealImage realImage;
    private static final HashMap imageStore = new HashMap();

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        realImage = (RealImage)imageStore.get(fileName);
        if(realImage==null){
            realImage = new RealImage(fileName);
            imageStore.put(fileName, realImage);
        }
        realImage.display();
    }
    
}
