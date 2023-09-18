package org.example.test2;

import java.io.*;
import java.util.*;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Edge> edges = new ArrayList<>();
        int maxEdge = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edges.add(new Edge(u, v, w));
            maxEdge = Math.max(maxEdge, w);
        }

        int left = 0;
        int right = maxEdge;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(edges, n, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    static class Edge {
        int u, v, w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    static int find(int[] parent, int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]);
    }

    static boolean isPossible(List<Edge> edges, int n, int x) {
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (Edge edge : edges) {
            if (edge.w <= x) {
                int parentU = find(parent, edge.u);
                int parentV = find(parent, edge.v);
                if (parentU != parentV) {
                    parent[parentU] = parentV;
                }
            }
        }

        int numSets = 0;
        for (int i = 1; i <= n; i++) {
            if (parent[i] == i) {
                numSets++;
            }
        }

        return numSets == 1;
    }
}
