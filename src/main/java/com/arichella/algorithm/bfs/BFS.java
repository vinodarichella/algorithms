package com.arichella.algorithm.bfs;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * Created by vinod on 10/16/17.
 */
public class BFS {

    private int vertices;
    private LinkedList<Integer> queue[];

    public BFS(int vertices) {
        this.vertices = vertices;
        queue = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            queue[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        queue[v].add(w);
    }

    public void bfs(int node) {
        boolean visited[] = new boolean[vertices];

        Queue<Integer> q = new LinkedList<>();
        visited[node] = true;
        q.add(node);

        while (q.size() != 0) {
            node = q.poll();
            System.out.print(node + " ");
            ListIterator<Integer> iterator = queue[node].listIterator();

            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS b = new BFS(4);
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 3);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 2);

        b.bfs(1);
    }
}
