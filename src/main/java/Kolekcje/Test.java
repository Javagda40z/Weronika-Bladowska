package Kolekcje;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<String> lista;
        lista=new ArrayList<>();
        lista=new LinkedList<>();

        Stack <String>stack=new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        String pop=stack.pop();
        System.out.println(pop);

        Queue<String>queue=new ArrayDeque<>();//DE znaczy double ended
        queue.poll();

        Map<String, String>mapa=new HashMap<>();
        mapa.put("jakisKlucz","jakasWartosc");

//        String wartosc=mapa.get("jakisKlucz");
//        System.out.println(wartosc);

        List<String>listaKluczyKtorychWartosciSiePowtarzaly=new ArrayList<>();

        String powtarzajacaSie="jakasWartosc";

        for (String s : mapa.keySet()) {

            String wartosc=mapa.get(s);
            if(wartosc.equals(powtarzajacaSie)){
                listaKluczyKtorychWartosciSiePowtarzaly.add(s);
            }

        }


        Set<String>zbior=new HashSet<>();
        zbior.add("mateusz");
        zbior.add("mateusz");

        System.out.println(zbior.size());

        TreeMap<String,String>posortowanaMapa=new TreeMap<>(Comparator.reverseOrder()); //treemapa jest posortowana, w hashmapie nie musi tak byc

        posortowanaMapa.put("1","jeden");
        posortowanaMapa.put("3","trzy");
        posortowanaMapa.put("2","dwa");

        System.out.println(posortowanaMapa.keySet());
    }
}
