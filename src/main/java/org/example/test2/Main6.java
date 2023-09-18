package org.example.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] parent = new int[n + 1];
        int[] size = new int[n + 1];
        Arrays.fill(size, 1);

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                union(parent, size, x, y);
            } else if (type == 2) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                result.append(find(parent, x) == find(parent, y) ? "YES\n" : "NO\n");
            } else if (type == 3) {
                int x = Integer.parseInt(st.nextToken());

                result.append(size[find(parent, x)]).append("\n");
            }
        }

        System.out.println(result);
    }

    private static void union(int[] parent, int[] size, int a, int b) {
        int rootA = find(parent, a);
        int rootB = find(parent, b);

        if (rootA != rootB) {
            if (size[rootA] < size[rootB]) {
                parent[rootA] = rootB;
                size[rootB] += size[rootA];
            } else {
                parent[rootB] = rootA;
                size[rootA] += size[rootB];
            }
        }
    }

    private static int find(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = find(parent, parent[node]);
        }
        return parent[node];
    }
}