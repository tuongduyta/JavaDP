public class Client {
    public static void main(String[]args){
        NameRepository namerepo = new NameRepository();
        namerepo.addName("Tan");
        namerepo.addName("Huong");
        namerepo.addName("Lien");


        for(Iterator iterator = namerepo.getAlphabeticalIterator();iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name: " + name);

        }
    }
}
