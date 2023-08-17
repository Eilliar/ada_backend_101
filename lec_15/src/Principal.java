public class Principal {

    public static void main(String[] args) {
        ArrayLista myList = new ArrayLista();

        myList.add("primeiro elemento");
        myList.add("segundo elemento");
        myList.add(3);
        myList.add(5);

        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
