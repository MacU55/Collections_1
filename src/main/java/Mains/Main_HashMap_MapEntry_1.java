package Mains;

import Maps.HashMap_MapEntry_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main_HashMap_MapEntry_1 {

    public static void main(String[] args) {

        HashMap_MapEntry_1 hme_1 = new HashMap_MapEntry_1();
        hme_1.hm = new HashMap();
        hme_1.hm.put("Mark", new Double(58.97));
        hme_1.hm.put("Leon", new Double(-01.599));
        hme_1.hm.put("Katy", new Double(44.52));
        hme_1.hm.put("Mary", new Double(45.15));

        // получаем вид элементов
        Set set  = hme_1.hm.entrySet();

        // получаем итератор
        Iterator i = set.iterator();

        //отображаем элементы
        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + "\t");
            System.out.println(me.getValue());
        }

        // add 1000 to Mark
        Double aDouble = ((Double)hme_1.hm.get("Mark")).doubleValue();
        hme_1.hm.put("Mark", new Double(aDouble + 1000));
        System.out.println("new value for Mark: " + hme_1.hm.get("Mark"));

    }

}
