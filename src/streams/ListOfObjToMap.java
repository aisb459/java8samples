package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfObjToMap {
    public static void main(String[] args) {
        //How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
        List<Notes> notesList = new ArrayList<>();
        notesList.add(new Notes(1, "notes1", 11));
        notesList.add(new Notes(2, "notes2", 11));
        notesList.add(new Notes(3, "notes3", 13));
        notesList.add(new Notes(4, "notes4", 14));
        notesList.add(new Notes(5, "notes5", 15));
        Map<Integer, String> notesMap = notesList.stream()
                .sorted(Comparator.comparingLong(Notes::getTagId).reversed())
                .collect(Collectors.toMap(Notes::getTagId, Notes::getNotes, (oldValue, newValue) -> newValue, LinkedHashMap::new));
        notesMap
                .entrySet()
                .stream()
                .forEach(x->System.out.println("key "+x.getKey()+" Value "+x.getValue()));
        List<String> stringList = Arrays.asList("AA","BB","AA","CC");
        stringList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(x->System.out.println("key="+x.getKey()+" value="+x.getValue()));

        String str = "Aishwarya";
        str.chars()
                .mapToObj(x->Character.toLowerCase((char)x))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .forEach(x->System.out.println("key="+x.getKey()+" value="+x.getValue()));

    }
}
