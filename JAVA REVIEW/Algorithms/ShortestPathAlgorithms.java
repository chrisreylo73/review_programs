package Algorithms;

import java.util.Arrays;

public class ShortestPathAlgorithms {

  private static final int INF = Integer.MAX_VALUE;

  // Dijkstra's Algorithm
  public static int[] dijkstra(int[][] graph, int source) {
    int V = graph.length;
    int[] dist = new int[V];
    boolean[] visited = new boolean[V];

    Arrays.fill(dist, INF);
    dist[source] = 0;

    for (int count = 0; count < V - 1; count++) {
      int u = minDistance(dist, visited);
      visited[u] = true;

      for (int v = 0; v < V; v++) {
        if (
          !visited[v] &&
          graph[u][v] != 0 &&
          dist[u] != INF &&
          dist[u] + graph[u][v] < dist[v]
        ) {
          dist[v] = dist[u] + graph[u][v];
        }
      }
    }

    return dist;
  }

  private static int minDistance(int[] dist, boolean[] visited) {
    int min = INF;
    int minIndex = -1;
    int V = dist.length;

    for (int v = 0; v < V; v++) {
      if (!visited[v] && dist[v] <= min) {
        min = dist[v];
        minIndex = v;
      }
    }

    return minIndex;
  }

  // Floyd's Algorithm
  public static int[][] floydWarshall(int[][] graph) {
    int V = graph.length;
    int[][] dist = new int[V][V];

    for (int i = 0; i < V; i++) {
      for (int j = 0; j < V; j++) {
        dist[i][j] = graph[i][j];
      }
    }

    for (int k = 0; k < V; k++) {
      for (int i = 0; i < V; i++) {
        for (int j = 0; j < V; j++) {
          if (
            dist[i][k] != INF &&
            dist[k][j] != INF &&
            dist[i][k] + dist[k][j] < dist[i][j]
          ) {
            dist[i][j] = dist[i][k] + dist[k][j];
          }
        }
      }
    }

    return dist;
  }

  public static void main(String[] args) {
    int[][] graph = {
      { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
      { 0, 0, 2, 0, 0, 0, 6, 7, 0 },
    };

    int source = 0;
    int[] dijkstraResult = dijkstra(graph, source);
    int[][] floydWarshallResult = floydWarshall(graph);

    System.out.println("Dijkstra's Algorithm:");
    for (int i = 0; i < dijkstraResult.length; i++) {
      System.out.println(
        "Shortest distance from " +
        source +
        " to " +
        i +
        ": " +
        dijkstraResult[i]
      );
    }

    System.out.println("\nFloyd's Algorithm:");
    for (int i = 0; i < floydWarshallResult.length; i++) {
      for (int j = 0; j < floydWarshallResult.length; j++) {
        System.out.println(
          "Shortest distance from " +
          i +
          " to " +
          j +
          ": " +
          floydWarshallResult[i][j]
        );
      }
    }
  }
}
