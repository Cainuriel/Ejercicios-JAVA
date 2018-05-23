/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gildedrose;

/**
 *
 * @author SOIB1A07
 */
public class Itemnormal extends Item {

    public Itemnormal(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
  
    

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    
  @Override
    public String toString(){
        
        return "Este objeto se llama"+ this.getName()+"y tiene la calidad de: "+this.getQuality();
        
        
    }
    
     public void update_Quality(){
        
    }

    
    
    
}
