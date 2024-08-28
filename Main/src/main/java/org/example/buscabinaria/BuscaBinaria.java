package org.example.buscabinaria;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuscaBinaria {

        private String[] names = {
                "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hank", "Ivy", "Jack",
                "Kathy", "Leo", "Mona", "Nathan", "Olivia", "Paul", "Quincy", "Rachel", "Steve", "Tina",
                "Uma", "Victor", "Wendy", "Xander", "Yara", "Zane", "Aaron", "Bella", "Carl", "Diana",
                "Edward", "Fiona", "George", "Holly", "Ian", "Judy", "Kevin", "Liam", "Mia", "Noah",
                "Oscar", "Penny", "Quinn", "Rita", "Sam", "Tara", "Ursula", "Vince", "Will", "Xena",
                "Yosef", "Zoey", "Amber", "Brian", "Claire", "Derek", "Elena", "Fred", "Gloria", "Harry",
                "Isla", "James", "Karen", "Lucas", "Megan", "Nate", "Olga", "Peter", "Queen", "Rob",
                "Sara", "Tom", "Ulysses", "Val", "Wanda", "Ximena", "Yuri", "Zara", "Adam", "Brianna",
                "Chris", "Daisy", "Ethan", "Faith", "Gabe", "Hannah", "Isaac", "Jenny", "Kyle", "Lola",
                "Mark", "Nina", "Owen", "Paula", "Quentin", "Ralph", "Sophie", "Tyler", "Una", "Vinny"
        };

         private String[] phones = {
                "123-456-7890", "234-567-8901", "345-678-9012", "456-789-0123", "567-890-1234",
                "678-901-2345", "789-012-3456", "890-123-4567", "901-234-5678", "012-345-6789",
                "123-567-8901", "234-678-9012", "345-789-0123", "456-890-1234", "567-901-2345",
                "678-012-3456", "789-123-4567", "890-234-5678", "901-345-6789", "012-456-7890",
                "123-678-9012", "234-789-0123", "345-890-1234", "456-901-2345", "567-012-3456",
                "678-123-4567", "789-234-5678", "890-345-6789", "901-456-7890", "012-567-8901",
                "123-789-0123", "234-890-1234", "345-901-2345", "456-012-3456", "567-123-4567",
                "678-234-5678", "789-345-6789", "890-456-7890", "901-567-8901", "012-678-9012",
                "123-890-1234", "234-901-2345", "345-012-3456", "456-123-4567", "567-234-5678",
                "678-345-6789", "789-456-7890", "890-567-8901", "901-678-9012", "012-789-0123",
                "123-901-2345", "234-012-3456", "345-123-4567", "456-234-5678", "567-345-6789",
                "678-456-7890", "789-567-8901", "890-678-9012", "901-789-0123", "012-890-1234",
                "123-012-3456", "234-123-4567", "345-234-5678", "456-345-6789", "567-456-7890",
                "678-567-8901", "789-678-9012", "890-789-0123", "901-890-1234", "012-901-2345",
                "123-345-6789", "234-456-7890", "345-567-8901", "456-678-9012", "567-789-0123",
                "678-890-1234", "789-901-2345", "890-012-3456", "901-123-4567", "012-234-5678",
                "123-456-7891", "234-567-8902", "345-678-9013", "456-789-0124", "567-890-1235",
                "678-901-2346", "789-012-3457", "890-123-4568", "901-234-5679", "012-345-6780",
                "123-567-8903", "234-678-9014", "345-789-0125", "456-890-1236", "567-901-2347",
                "678-012-3458", "789-123-4569", "890-234-5670", "901-345-6781", "012-456-7892"
        };

        public String[] getOrderNamesAndNumbers(String[] orderNames, String[] orderNumbers) throws Exception {
                String[] vetorDeVetores = new String[orderNames.length];
                if(orderNames.length != orderNumbers.length){
                        throw new Exception("Os vetores digitados não tem o mesmo tamanho");
                }
                for(int i = 0; i < orderNames.length; i++){
                        vetorDeVetores[i] = orderNumbers[i] + " : " + orderNames[i];
                }
                Arrays.sort(vetorDeVetores);
                return vetorDeVetores;

        }

        public String getBuscaBinaria(String phone) throws Exception {
                String[] orderNamesAndNumbers = getOrderNamesAndNumbers(names, phones);
                int low = 0;
                int max = orderNamesAndNumbers.length - 1;

                while(low <= max){

                        int mid = (low + max) / 2;
                        String midString = orderNamesAndNumbers[mid];
                        String midPhone = midString.split(" : ")[0];

                        int compare = midPhone.compareTo(phone);

                        if(compare == 0){
                                String midName = midString.split(" : ")[1];
                                return "Nome: " + midName + ", Número de telefone: " + phone + ", Posição: " + (mid + 1);
                        }else if(compare < 0){
                                low = mid + 1;
                        }else{
                                max = mid - 1;
                        }
                }
                return "Não foi possivel encontrar o nome digitado";
        }



}
