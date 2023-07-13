package Algorithms;

import java.util.*;

class MstAlgorithms {

  int V, E;
  int[][] edges;

  MstAlgorithms(int v, int e) {
    V = v;
    E = e;
    edges = new int[E][3];
  }

  int find(int[] parent, int i) {
    if (parent[i] != i) parent[i] = find(parent, parent[i]);
    return parent[i];
  }

  void union(int[] parent, int[] rank, int x, int y) {
    int xroot = find(parent, x);
    int yroot = find(parent, y);

    if (rank[xroot] < rank[yroot]) parent[xroot] = yroot; else if (
      rank[xroot] > rank[yroot]
    ) parent[yroot] = xroot; else {
      parent[yroot] = xroot;
      rank[xroot]++;
    }
  }

  void kruskalMST() {
    int[] parent = new int[V];
    int[] rank = new int[V];
    int[][] result = new int[V - 1][2];

    for (int i = 0; i < V; ++i) {
      parent[i] = i;
      rank[i] = 0;
    }

    Arrays.sort(edges, Comparator.comparingInt(a -> a[2]));

    int e = 0;
    int i = 0;
    while (e < V - 1) {
      int[] nextEdge = edges[i++];
      int x = find(parent, nextEdge[0]);
      int y = find(parent, nextEdge[1]);

      if (x != y) {
        result[e][0] = nextEdge[0];
        result[e][1] = nextEdge[1];
        union(parent, rank, x, y);
        e++;
      }
    }

    System.out.println("Kruskal's Algorithm:");
    for (i = 0; i < V - 1; ++i) System.out.println(
      result[i][0] + " - " + result[i][1]
    );
  }

  void primMST(int[][] graph) {
    int[] parent = new int[V];
    int[] key = new int[V];
    boolean[] mstSet = new boolean[V];

    for (int i = 0; i < V; i++) {
      key[i] = Integer.MAX_VALUE;
      mstSet[i] = false;
    }

    key[0] = 0;
    parent[0] = -1;

    for (int count = 0; count < V - 1; count++) {
      int u = minKey(key, mstSet);
      mstSet[u] = true;

      for (int v = 0; v < V; v++) {
        if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
          parent[v] = u;
          key[v] = graph[u][v];
        }
      }
    }

    System.out.println("\nPrim's Algorithm:");
    for (int i = 1; i < V; i++) System.out.println(parent[i] + " - " + i);
  }

  int minKey(int[] key, boolean[] mstSet) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;

    for (int v = 0; v < V; v++) {
      if (!mstSet[v] && key[v] < min) {
        min = key[v];
        minIndex = v;
      }
    }

    return minIndex;
  }

  public static void main(String[] args) {
    int V = 4; // Number of vertices
    int E = 5; // Number of edges
    MstAlgorithms graph = new MstAlgorithms(V, E);

    // Add edges
    graph.edges[0] = new int[] { 0, 1, 10 };
    graph.edges[1] = new int[] { 0, 2, 6 };
    graph.edges[2] = new int[] { 0, 3, 5 };
    graph.edges[3] = new int[] { 1, 3, 15 };
    graph.edges[4] = new int[] { 2, 3, 4 };

    graph.kruskalMST();

    int[][] adjMatrix = {
      { 0, 10, 6, 5 },
      { 10, 0, 0, 15 },
      { 6, 0, 0, 4 },
      { 5, 15, 4, 0 },
    };

    graph.primMST(adjMatrix);
  }
}
