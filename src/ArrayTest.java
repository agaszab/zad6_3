public class ArrayTest {

    public static void main(String[] args) {

        ArrayComparator arrays=new ArrayComparator();

        int [][] tab1= {{1,4,3,4,5},{1,2,3,4,5}};
        int [][] tab2= {{1,4,3,4,5},{1,2,5,4,5}};

        String[][] tab3={{"Ala","Zosia","Kasia"}, {"Marek", "Tomek", "Piotrek"}};
        String[][] tab4={{"Ala","Zosia","Kasia"}, {"Marek", "Tomek", "Piotrek"}};

        if (arrays.compare(tab1, tab2)) System.out.println("Tablice są równe");
        else System.out.println("Tablice nie są równe");

        if (arrays.compare(tab3, tab4)) System.out.println("Tablice są równe");
        else System.out.println("Tablice nie są równe");
    }


}
