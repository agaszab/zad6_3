public class ArrayComparator {

    boolean compare(int[][] tab1, int[][] tab2) {

      //  boolean rowne = false;
        boolean rowne = true;  // tak lepiej

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {

                if (tab1[i][j] != tab2[i][j]) {

                    rowne=false; break;

                }

               /* if (tab1[i][j] == tab2[i][j]) {             zamiast tego lepiej warunek poniżej
                    rowne = true;
                } else {rowne=false; break;} */

                if (tab1[i][j] != tab2[i][j]) {

                    rowne=false; break;

                }
            }

            if (rowne==false) break;
        }
        return rowne;
    }



    boolean compare(String[][] tab1, String[][] tab2) {

        boolean rowne = false;

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                if (tab1[i][j].equals(tab2[i][j])) rowne = true;
                else {rowne=false; break;}
            }
            if (rowne==false) break;
        }
        return rowne;
    }
}
