package org.example.test2;

import java.util.*;
import java.io.*;

public class Main5 {

    static int n, m;
    static List<List<Edge>> graph;

    static class Edge {
        int to, weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static boolean canDestroy(int x) {
        boolean[] visited = new boolean[n + 1];
        int stateCount = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                stateCount++;
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);

                while (!queue.isEmpty()) {
                    int u = queue.poll();
                    visited[u] = true;

                    for (Edge edge : graph.get(u)) {
                        if (edge.weight <= x) {
                            int v = edge.to;
                            if (!visited[v]) {
                                queue.offer(v);
                            }
                        }
                    }
                }
            }
        }

        return stateCount == 1; // Меняется только при одном штате
    }

    public static int findX() {
        int low = 0;
        int high = Integer.MAX_VALUE;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canDestroy(mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] uvw = reader.readLine().split(" ");
            int u = Integer.parseInt(uvw[0]);
            int v = Integer.parseInt(uvw[1]);
            int w = Integer.parseInt(uvw[2]);
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        int x = findX();
        System.out.println(x);
    }
}
