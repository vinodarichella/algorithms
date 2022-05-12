package com.arichella.algorithm.bfs;

import java.util.*;

public class BreadthFirstSearch {

    private static final Map<String, List<String>> GRAPH = new HashMap<>();

    public static void main(String[] args) {
        GRAPH.put("you", Arrays.asList("bob", "alice", "claire"));
        GRAPH.put("bob", Arrays.asList("anuj", "peggy"));
        GRAPH.put("alice", Arrays.asList("peggy"));
        GRAPH.put("claire", Arrays.asList("thom", "jonny"));
        GRAPH.put("peggy", Collections.EMPTY_LIST);
        GRAPH.put("anuj", Collections.EMPTY_LIST);
        GRAPH.put("thom", Collections.EMPTY_LIST);
        GRAPH.put("jonny", Collections.EMPTY_LIST);

        search("you");
    }

    private static void search(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(GRAPH.get(name));

        List<String> alreadySearched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            if (!alreadySearched.contains(person)) {
                if (isMangoSeller(person)) {
                    System.out.println(person + " is a mango seller");
                } else {
                    searchQueue.addAll(GRAPH.get(person));
                    alreadySearched.add(person);
                }
            }
        }
    }

    private static boolean isMangoSeller(String person) {
        return person.endsWith("m");
    }
}
