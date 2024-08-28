package org.example.buscabinaria;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuscaBinaria {

        private String[] names = {
                "Aaron", "Alice", "Bella", "Bob", "Carl", "Charlie", "Diana", "David",
                "Edward", "Eva", "Fiona", "Frank", "George", "Grace", "Harry", "Holly",
                "Ian", "Ivy", "Jack", "James", "Judy", "Karen", "Katie", "Leo",
                "Liam", "Mia", "Mona", "Nathan", "Olivia", "Oscar", "Paul", "Quincy",
                "Rachel", "Steve", "Tina", "Uma", "Victor", "Wendy", "Xander",
                "Yara", "Zane", "Zoe"
        };
        public String[] getOrderNamesString(String[] orderNames){
                this.names = orderNames;
                Arrays.sort(orderNames);
                return orderNames;
        }

        public String getBuscaBinaria(String name){
                String[] orderNames = getOrderNamesString(names);
                int low = 0;
                int max = orderNames.length - 1;

                while(low <= max){

                        int mid = (low + max) / 2;
                        String midString = orderNames[mid];

                        int compare = midString.compareTo(name);

                        if(compare == 0){
                                return "Nome " + name + " no " + mid + 1;
                        }else if(compare < 0){
                                low = mid + 1;
                        }else{
                                max = mid - 1;
                        }
                }
                return "Não foi possivel encontrar o nome digitado";
        }



}
