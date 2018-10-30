/**
 * By: Marcos Gil
 */
import java.util.*;
import java.math.*;

public class LlamaCalculator {
  
  public static void main(String[] args) { 
    
    Random rand = new Random();
    Random rand2 = new Random();
    int numberOfSimulations = 100000;
    int countCloseEncounter = 0;
    int maxProximity = 11;
    
    for (int x = 0; x < numberOfSimulations; x++){
      
      int x1 = rand.nextInt(1001) + 1;
      int y1 = rand.nextInt(1001) + 1;
      int x2 = rand2.nextInt(1001) + 1;
      int y2 = rand2.nextInt(1001) + 1;
      int x3 = rand2.nextInt(1001) + 1;
      int y3 = rand2.nextInt(1001) + 1;
      
      if ((Math.abs(x1 - x2) < maxProximity) && (Math.abs(y1 - y2) < maxProximity)){
      
        System.out.println("They spawned together in game #"+ x +"! Llama 1: (" + x1 + "," + y1 +"), Llama 2: (" + x2 + "," + y2 +")");
        
        countCloseEncounter++;
      }
      
       if ((Math.abs(x1 - x3) < maxProximity) && (Math.abs(y1 - y3) < maxProximity)){
      
        System.out.println("They spawned together in game #"+ x +"! Llama 1: (" + x1 + "," + y1 +"), Llama 3: (" + x3 + "," + y3 +")");
        
        countCloseEncounter++;
      }
       
       if ((Math.abs(x2 - x3) < maxProximity) && (Math.abs(y2 - y3) < maxProximity)){
      
        System.out.println("They spawned together in game #"+ x +"! Llama 2: (" + x2 + "," + y2 +"), Llama 3: (" + x3 + "," + y3 +")");
        
        countCloseEncounter++;
      }
    }
    
    System.out.println("They spawned together " + countCloseEncounter + " time(s) in " + numberOfSimulations + " matches.");
  }
}
