package me.samfreeman.graphtheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class ShortestReach {
	
	static BufferedReader in;
	static PrintStream out;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		
		int q = Integer.parseInt(in.readLine()); // Number of queries
		while (q-- > 0) {
			String[] l1 = in.readLine().split(" ");
			int n = Integer.parseInt(l1[0]); // number of nodes
			int m = Integer.parseInt(l1[1]); // number of edges;
			
			Graph graph = new Graph(n);
			for (int i = 0; i < m; i++) {
				String[] l_i = in.readLine().split(" ");
				graph.addEdge(Integer.parseInt(l_i[0]) - 1, Integer.parseInt(l_i[1]) - 1);
			}
			int start = Integer.parseInt(in.readLine());
			int[] res = graph.shortestReach(graph.getNode(start-1));
			for (int i : res) {
				if (i == 0) continue;
				else out.print(i + " ");
			}
			out.println();
		}
		
		//out.close();
	}
	
	public static class Graph {

		private Node[] nodes;
		private static int distance_edge = 6;
		
		public Graph(int size) {
			nodes = new Node[size];
			for (int i = 0; i < size; i++) nodes[i] = new Node(i);
		}
		
		private class Node {
			private int id; 
			LinkedList<Node> adjacent = new LinkedList<Node>();
			private Node(int id) {
				this.id = id;
			}
		}
		
		private Node getNode(int id) {
			return nodes[id];
		}
		
		public void addEdge(int source, int end) {
			Node src = getNode(source);
			Node dest = getNode(end);
			src.adjacent.add(dest);
			dest.adjacent.add(src);
//			System.out.println("Added adj " + end + " to " + source);
		}
		
		public int[] shortestReach(Node startID) {
			LinkedList<Node> n2V = new LinkedList<Node>();
			n2V.add(startID);
			
			int[] nDist = new int[nodes.length];
			Arrays.fill(nDist, -1);
			nDist[startID.id] = 0;
			
			while (!n2V.isEmpty()) {
				Node node = n2V.poll();
//				System.out.println("id: " + node.id);
//				System.out.println("ad length " + nodes[node.id].adjacent.size());
				for (Node n : nodes[node.id].adjacent) {
					if (nDist[n.id] == -1) {
						nDist[n.id] = nDist[node.id] + distance_edge;
//						System.out.println("nD: " + nDist[n.id] + " nDn: " + nDist[node.id]);
						n2V.add(n);
					}
				}
				
			}
			
			
			
			return nDist;
			
		}
		
	}
	
	
	
}
