/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 24.03.2017
  * @author 
  */
  
import java.util.*;
public class ferienwohnung {
  public static int kunden(int u_kndnr) {
    u_kndr = u_kndr+1;
    return u_kndr;
  }
  public static void main(String[] args) {
    //Date dt = new Date();
    int wahl, i, kndnr = 0;
    final int WOHNANZ = 10, MAXPERSONEN = 50, WOHNATTR = 2;
    
    String kategorie[][] = new String[WOHNANZ][WOHNATTR];
    
    for (i=0; i<WOHNANZ; i++) {
      if (i<3) {
        kategorie[i][0] = "20";
        kategorie[i][1] = "15";
      } // end of if
      else {
        if (i<5) {
          kategorie[i][0] = "30";
          kategorie[i][1] = "25";
        } // end of if
        else {
          kategorie[i][0] = "40";
          kategorie[i][1] = "35";
        } // end of if-else
      } // end of if-else
    } // end of for
    
    for (i=0; i<WOHNANZ; i++) {
      System.out.print(kategorie[i][0]+", ");
      System.out.println(kategorie[i][1]);
    } // end of for
    
    //wahl = Tastatur.liesInt();
    switch (wahl) {
      //Einsicht und Ver�ndern der Wohnungen
      case  1:
       
        kndnr = ferienwohnung.kunden(kndnr);
        break;                                                               
      case  2: 
        
        break;
      default: 
        
    } // end of switch 
  } // end of main

} // end of class ferienwohnung
