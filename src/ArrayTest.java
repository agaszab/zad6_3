public class ArrayTest {

    public static void main(String[] args) {

        ArrayComparator arrays=new ArrayComparator();

        int [][] tab1= {{12345},{12345}};
        int [][] tab2= {{12345},{12345}};

        String[][] tab3={{"Ala","Zosia","Kasia"}, {"Marek", "Tomek", "Piotrek"}};
        String[][] tab4={{"Ala","Gosia","Kasia"}, {"Marek", "Tomek", "Piotrek"}};

        if (arrays.compare(tab1, tab2)) System.out.println("Tablice są równe");
        else System.out.println("Tablice nie są równe");

        if (arrays.compare(tab3, tab4)) System.out.println("Tablice są równe");
        else System.out.println("Tablice nie są równe");
    }


}
