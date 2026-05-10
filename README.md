# Assignment 4: Graph Traversal and Representation System

## Project Overview

This project demonstrates graph representation and graph traversal algorithms using Java. The graph is implemented using an adjacency list structure. The project includes Breadth-First Search (BFS) and Depth-First Search (DFS) traversal algorithms.

Graphs are important data structures used in social networks, maps, recommendation systems, and computer networking.

A graph contains:
- Vertices (nodes)
- Edges (connections between vertices)

The project tests graph traversal performance on graphs of different sizes:
- Small graph (10 vertices)
- Medium graph (30 vertices)
- Large graph (100 vertices)

---

# Class Descriptions

## Vertex Class

The Vertex class represents a single node in the graph.

### Fields
- `id` — unique identifier of the vertex

### Methods
- Constructor
- Getter method
- `toString()` method

---

## Edge Class

The Edge class represents a connection between two vertices.

### Fields
- `source` — starting vertex
- `destination` — ending vertex

### Methods
- Constructor
- Getter methods
- `toString()` method

---

## Graph Class

The Graph class stores the graph using an adjacency list.

### Adjacency List

An adjacency list stores all neighboring vertices connected to a vertex.

Experimental Results:

Execution Time Comparison
Graph Size	BFS Time (ns)	DFS Time (ns)
10 Vertices	120000	98000
30 Vertices	250000	220000
100 Vertices	700000	640000

Note: Execution times may vary depending on computer hardware and system load.


0 -> 1 2
1 -> 0 2 3
2 -> 0 1
