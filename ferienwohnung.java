/**
 * Created by jhasse on 26.04.2017.
 */
public class ferienwohnung {

    public static String[][] neukunde(String kunden[][], int u_KANZ, int u_KATTR) {
        String u_kunde[][] = new String[kunden.length+1][u_KATTR];
        if (kunden.length >= u_KANZ) {
            u_kunde = kunden;
            System.out.println("Maximale Kundenanzahl erreicht!");
        } // end of if
        else {
            for (int i = 0; i < kunden.length; i++) {
                for (int j = 0; j < u_KATTR; j++) {
                    u_kunde[i][j] = kunden[i][j];
                } // end of for
            } // end of for

            System.out.print("Nachname: ");
            u_kunde[kunden.length][0] = Tastatur.liesString();
            System.out.print("\nVorname:  ");
            u_kunde[kunden.length][1] = Tastatur.liesString();
            System.out.print("\nAdresse:  ");
            u_kunde[kunden.length][2] = Tastatur.liesString();
        } // end of if-else

        return u_kunde;
    }

    public static void allekunden(String u_kunden[][], int u_KATTR) {
        if (u_kunden.length > 0) {
            for (int i = 0; i < u_kunden.length; i++) {
                System.out.println("\nKundenummer: " + (i + 1));
                System.out.println(u_kunden[i][0] + ", " + u_kunden[i][1]);
                System.out.println(u_kunden[i][2]);
            } // end of for
        }
        else    {
            System.out.print("Keine Kunden vorhanden!");
        }
    }

    public static void kusuche(String u_kunden[][], int u_KATTR) {

        System.out.print("\nSuchbegriff: ");
        String suche = Tastatur.liesString();
        boolean erfolg = false, doppel;
        for (int i=0; i<u_kunden.length; i++) {
            doppel = false;
            if (u_kunden[i][0].contains(suche) == true) {
                System.out.println("\nKundennummer: " + (i+1));
                System.out.println(u_kunden[i][0] + ", " + u_kunden[i][1]);
                System.out.println(u_kunden[i][2]);
                erfolg = true;
                doppel = true;
            } //end of if

            if (u_kunden[i][1].contains(suche) == true && doppel == false) {
                System.out.println("\nKundennummer: " + (i+1));
                System.out.println(u_kunden[i][0] + ", " + u_kunden[i][1]);
                System.out.println(u_kunden[i][2]);
                erfolg = true;
            } //end of if
        } //end of for
        if (erfolg == false) {
            System.out.println("\nKeine passenden Eintraege gefunden");
        } //end of if
    } //end of method

    public static String[][] kuedit(String u_kunden[][], int u_KATTR) {
        boolean ex;
        do {
            System.out.print("Kundenummer: ");
            int wahl = Tastatur.liesInt();
            ex = true;

            if (wahl <= u_kunden.length && wahl != 0) {
                System.out.println(u_kunden[wahl-1][0]+", "+u_kunden[wahl-1][1]);
                System.out.println(u_kunden[wahl-1][2]+"\n");
                System.out.print("Nachname: ");
                u_kunden[wahl-1][0] = Tastatur.liesString();
                System.out.print("Vorname: ");
                u_kunden[wahl-1][1] = Tastatur.liesString();
                System.out.print("Adresse: ");
                u_kunden[wahl-1][2] = Tastatur.liesString();
            }
            else if (wahl == 0) {
                ex = true;
            }
            else    {
                System.out.println("Kundennummer existiert nicht");
                ex = false;
            }
        } while (ex == false);
        return u_kunden;
    }

    public static String[][] wohnung(String u_kategorie[][],int u_ANZ, int u_ATTR)  {
        for (int i=0; i<u_ANZ; i++) {
            if (i<3) {
                u_kategorie[i][0] = "20";
                u_kategorie[i][1] = "15";
            } // end of if
            else {
                if (i<5) {
                    u_kategorie[i][0] = "30";
                    u_kategorie[i][1] = "25";
                } // end of if
                else {
                    u_kategorie[i][0] = "40";
                    u_kategorie[i][1] = "35";
                } // end of if-else
            } // end of if-else
        } // end of for
        return u_kategorie;
    }

    public static void menu()   {
        System.out.println("\nNeukunde (2)");
        System.out.println("Ausgabe (3)");
        System.out.println("Suche (4)");
        System.out.println("Beenden (5)");
    }

    public static void main(String[] args) {
        int wahl, i = 0;
        final int WOHNANZ = 10, WOHNATTR = 2, KANZ = 50, KATTR = 3;

        String kategorie[][] = new String[WOHNANZ][WOHNATTR];
        String kunden[][] = new String[0][KATTR];

        System.out.println("Arraysize: "+kunden.length);

        kategorie = ferienwohnung.wohnung(kategorie, WOHNANZ, WOHNATTR);

        do {

            //Beginn Menüauswahl
            ferienwohnung.menu();
            wahl = Tastatur.liesInt();
            switch (wahl) {
                case 1: //Verfügbarkeit einer Wohnung zu Tag oder Zeitraum

                    break;
                case 2: //
                    kunden = ferienwohnung.neukunde(kunden, KANZ, KATTR);
                    System.out.println("Array size: "+kunden.length);
                    break;
                case 3: //
                    ferienwohnung.allekunden(kunden, KATTR);
                    break;
                case 4: //
                    ferienwohnung.kusuche(kunden, KATTR);
                    break;
                case 5: //
                    kunden = ferienwohnung.kuedit(kunden, KATTR);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Fehleingabe!");
            }
        } while (wahl != 6); // end of do-while
    } // end of main

} // end of class ferienwohnung