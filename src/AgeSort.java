import java.util.*;

public class AgeSort {
    public static void main(String[] args) {

        // 회원 수 N
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        member[] members = new member[N];

        for (int i=0;i<N;i++) {

            members[i] = new member(scanner.nextInt(), scanner.next());
        }

        Arrays.sort(members, new Comparator<member>() {
            @Override
            public int compare(member o1, member o2) {
                return o1.Age - o2.Age;
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i<N;i++){
            stringBuilder.append(members[i]);
        }

        System.out.println(stringBuilder);


        /**       Map<Integer, String> ageName = new HashMap<>();
         //        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         key는 중복될 수 있어서 안됨
         for (int i=0;i<N;i++){

         int Age = scanner.nextInt();
         scanner.close();

         String Name = scanner.nextLine();

         scanner.close();

         ageName.put(Age, Name);

         }



         Iterator<Integer> iter = ageName.keySet().iterator();

         while (iter.hasNext()){
         Integer age = iter.next();
         String name = (String) ageName.get(age);

         System.out.println(age + " " + name);
         }

         */

    }

    public static class member {
        int Age;
        String Name;

        public member(int age, String name) {
            Age = age;
            Name = name;
        }

        @Override
        public String toString() {
            return Age + " " + Name + "\n";
        }
    }

}

