package codechallenge;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/72412
public class Solution27_1 {

    public int[] solution(String[] infos, String[] querys) {

        // infos 배열을 엔티티로 변환
        List<PersonInfo> personInfos = Arrays.stream(infos)
                .map(PersonInfo::parseToEntity)
                .collect(Collectors.toList());

        // querys 배열을 엔티티로 바꾼후 필터링
        return Arrays.stream(querys)
                .map(PersonInfo::parseToOption)
                .map(
                        (option) -> personInfos.stream()
                                .filter((info) -> option.language.equals("-") || info.language.equals(option.language))
                                .filter((info) -> option.position.equals("-") || info.position.equals(option.position))
                                .filter((info) -> option.work.equals("-") || info.work.equals(option.work))
                                .filter((info) -> option.food.equals("-") || info.food.equals(option.food))
                                .filter((info) -> option.point <= info.point)
                                .count()
                )
                .mapToInt(Long::intValue)
                .toArray();
    }

    static class PersonInfo {
        String language;
        String position;
        String work;
        String food;
        int point;

        public PersonInfo(String language, String position, String work, String food, int point) {
            this.language = language;
            this.position = position;
            this.work = work;
            this.food = food;
            this.point = point;
        }

        public static PersonInfo parseToEntity(String str) {
            String[] splitedInfo = str.split(" ");
            String language = splitedInfo[0];
            String position = splitedInfo[1];
            String work = splitedInfo[2];
            String food = splitedInfo[3];
            int point = Integer.parseInt(splitedInfo[4]);
            return new PersonInfo(language, position, work, food, point);
        }

        public static PersonInfo parseToOption(String str) {
            String[] splitedInfo = str.split(" and ");
            String language = splitedInfo[0];
            String position = splitedInfo[1];
            String work = splitedInfo[2];
            String food = splitedInfo[3].split(" ")[0];
            int point = Integer.parseInt(splitedInfo[3].split(" ")[1]);
            return new PersonInfo(language, position, work, food, point);
        }
    }


    public static void main(String[] args) {
        Solution27_1 solution26 = new Solution27_1();
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

