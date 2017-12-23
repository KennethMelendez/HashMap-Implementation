/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kmlnd
 */
public class MapExamples {
    public static void main(String[] args) {
        //map is a generic type
        //This creates an empty map
        Map<String, Integer> populations = new HashMap<>();
        
        populations.put("USA", 200000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingdom", 63000000);
        populations.put("Japan", 127000000);
        
        System.out.println("Map size is: " + populations.size());
        
        //grabs the value of map
        Integer usaPopulation = populations.get("USA");
        
        System.out.println(usaPopulation);
        
        //put operation will also replace with new value if assigned and called again
        populations.put("USA", 313000000);
        
        usaPopulation = populations.get("USA");
        
        System.out.println(usaPopulation);
        
        
        //set is a type of collections and a generic type like array list or maps so we have to tell it what we want
        //we want string
        //sets arent ordered it will not come out in order(Noticed it printed out results in different order in for loop)
        Set<String> keys = populations.keySet();                    //Set of keys
        
        for(String currentKey : keys) {
            Integer currentPopulation = populations.get(currentKey);
            System.out.println("The population of " + currentKey + " is " + currentPopulation);
        }
        
        
        //ask for the collection of values
        //collection is a generic type
        //import collection
        Collection<Integer> populationValues = populations.values();
        
        for(Integer currentPopulation : populationValues){
            System.out.println(currentPopulation);
        }
        
    }
}
