package codechallenge;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/72412
public class Solution27_2 {
    public int[] solution(String[] infos, String[] querys) {

        List<Person> infosList = Arrays.stream(infos)
                .map((info) -> {
                    String[] s = info.split(" ");
                    String language = s[0];
                    String position = s[1];
                    String work = s[2];
                    String food = s[3];
                    int point = Integer.parseInt(s[4]);
                    return new Person(language, position, work, food, point);
                }).collect(Collectors.toList());

        List<Person> querysList = Arrays.stream(querys)
                .map((query) -> {
                    String[] s = query.split(" and ");
                    String language = s[0];
                    String position = s[1];
                    String work = s[2];
                    String food = s[3].split(" ")[0];
                    int point = Integer.parseInt(s[3].split(" ")[1]);
                    return new Person(language, position, work, food, point);
                }).collect(Collectors.toList());

        return querysList.stream()
                .map((query) -> (int) infosList.stream()
                        .filter((info) -> info.language.equals(query.language) || query.language.equals("-"))
                        .filter((info) -> info.position.equals(query.position) || query.position.equals("-"))
                        .filter((info) -> info.work.equals(query.work) || query.work.equals("-"))
                        .filter((info) -> info.food.equals(query.food) || query.food.equals("-"))
                        .filter((info) -> info.point >= query.point)
                        .count()).mapToInt(value -> value)
                .toArray();
    }

    class Person {
        String language;
        String position;
        String work;
        String food;
        int point;

        public Person(String language, String position, String work, String food, int point) {
            this.language = language.substring(0,1);
            this.position = position.substring(0,1);
            this.work = work.substring(0,1);
            this.food = food.substring(0,1);
            this.point = point;
        }
    }


    public static void main(String[] args) {
        Solution27_2 solution26 = new Solution27_2();
        String[] info = {"java backend junior pizza 150"
                , "python frontend senior chicken 210"
                , "python frontend senior chicken 150"
                , "cpp backend senior pizza 260"
                , "java backend junior chicken 80"
                , "python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100"
                , "python and frontend and senior and chicken 200"
                , "cpp and - and senior and pizza 250"
                , "- and backend and senior and - 150"
                , "- and - and - and chicken 100"
                , "- and - and - and - 150"};

        int[] solution = solution26.solution(info, query);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

