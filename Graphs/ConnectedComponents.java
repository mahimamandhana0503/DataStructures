package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConnectedComponents {

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] visited = new boolean[vtces];

        for (int i = 0; i < vtces; i++) {
            if (!visited[i]) {
                ArrayList<Integer> vertices = new ArrayList<>();
                paths(graph, i, visited, i + "", vertices);
                comps.add(vertices);
            }
        }

        // write your code here

        System.out.println(comps);
    }

    static void paths(ArrayList<Edge>[] graph, int src, boolean[] visited, String psf, ArrayList<Integer> vertices) {

        visited[src] = true;
        vertices.add(src);
        for (Edge edge : graph[src]) {
            if (!visited[edge.nbr]) {
                paths(graph, edge.nbr, visited, psf + edge.nbr, vertices);

            }
        }
    }
}