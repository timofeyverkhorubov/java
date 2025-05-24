package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class t1837 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, List<String>> teams = new HashMap<>();
        Set<String> participants = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] team = line.split(" ");
            participants.addAll(Arrays.asList(team));

            for (String member : team) {
                teams.putIfAbsent(member, new ArrayList<>());
                for (String teammate : team) {
                    if (!member.equals(teammate)) {
                        teams.get(member).add(teammate);
                    }
                }
            }
        }

        Map<String, Integer> isenbaevNumbers = new HashMap<>();
        Queue<String> queue = new LinkedList<>();

        if (teams.containsKey("Isenbaev")) {
            queue.add("Isenbaev");
            isenbaevNumbers.put("Isenbaev", 0);

            while (!queue.isEmpty()) {
                String current = queue.poll();
                int currentNumber = isenbaevNumbers.get(current);

                if (teams.containsKey(current)) {
                    for (String neighbor : teams.get(current)) {
                        if (!isenbaevNumbers.containsKey(neighbor)) {
                            isenbaevNumbers.put(neighbor, currentNumber + 1);
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }

        for (String participant : participants) {
            System.out.print(participant + " ");
            if (isenbaevNumbers.containsKey(participant)) {
                System.out.println(isenbaevNumbers.get(participant));
            } else {
                System.out.println("undefined");
            }
        }
    }
}