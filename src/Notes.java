import java.util.Scanner;

public class Notes {

    String s, note;

    public Notes(String note){
        this.note = note;
        s = " ";
    }

    public void add(String i){
        s= s+i;
    }

    public String toString(){
        return "This is a note: "+ note + "and these are words " + s;
    }

    public static void main(String[] args) {
        Notes note1 = new Notes("Note 1: ");
        note1.add("More words");

        Notes note2 = new Notes("Note 2: ");
        note2.add("More words on noote two");


        System.out.println(note1);
        System.out.println(note2);

    }
}
