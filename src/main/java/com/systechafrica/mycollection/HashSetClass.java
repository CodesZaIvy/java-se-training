package com.systechafrica.mycollection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSetClass {
    //!HashSet
  // stores elements using a Hash table

  public static void main(String[] args) {
    HashSet<String> hset = new HashSet<String>();
    // Popular Web Servers
    hset.add("Nginx");
    hset.add("TomCat");
    hset.add("Jetty");
    hset.add("Apache HTTP Server");
    hset.add("Mongrel");
    hset.add("Tornado");
    hset.add("Xitami");
    hset.add("Resin");
    hset.add(null);
    // HashSet allows null elements and does not follow any order to store the elements.
    System.out.println(hset);


    //!SortedMap Interface
    //A Sorted map interface maintains the mappings of elements in ascending critical order.

    TreeMap<String, Double> t = new TreeMap<String, Double>();

    t.put("Nginx", new Double(80.0));
    t.put("Tomcat", new Double(8080.0));
    t.put("Jetty", new Double(8080.0));
    t.put("Apache HTTP Server", new Double(80.0));
    t.put("Mongrel", new Double(3000.0));
    t.put("Tornado", new Double(8080.0));
    t.put("Resin", new Double(8080.0));
    t.put("Xitami", new Double(89.0));

    Set<?> set = t.entrySet();

    Iterator<?> i = set.iterator();

    while (i.hasNext()) {

      @SuppressWarnings("rawtypes")

      java.util.Map.Entry me = (java.util.Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }

    System.out.println();

    double percentage = ((Double) t.get("Tomcat")).doubleValue();

    t.put("Tomcat", new Double(percentage));

    System.out.println("Server of choice is " + t.get("Tomcat"));

    //!TreeSet
    //?TreeSet Class is a NavigableSet implementation based on TreeMap
    //The elements are ordered using their natural ordering

     TreeSet<Integer> treeset = new TreeSet<Integer>();

     treeset.add(80);
     treeset.add(8080);
     treeset.add(8080);
     treeset.add(80);
     treeset.add(3000);
     treeset.add(8080);
     treeset.add(8080);
     treeset.add(89);

     System.out.println(treeset);
     



  }
}