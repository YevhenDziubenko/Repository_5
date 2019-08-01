public class Main {
    public static void main(String[] args) {

        MyType city1 = new MyType("Odesa");
        MyType city2 = new MyType("Odesa");
        MyType city3 = new MyType("Kyiv");

        System.out.println("The First city - is " + city1.toString());
        System.out.println("The Second city - is " + city2.toString());
        System.out.println("The Third city - is " + city3.toString());


        String cityname1 = (city1.toString());
        String cityname2 = (city2.toString());
        String cityname3 = (city3.toString());

        System.out.println(cityname1 + " = " + cityname2 + " - it's a " + city1.equals(city2));
        System.out.println(cityname1 + " = " + cityname3 + " - it's a " + city1.equals(city3));



    }



}