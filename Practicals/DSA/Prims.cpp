#include <bits/stdc++.h>
#include <climits>
using namespace std;
#define V 5
int minKey(int key[], bool mstSet[])
{
    int min = INT_MAX;
    int min_in;
    for (int v = 0; v < V; v++)
    {
        if (mstSet[v] == false && key[v] < min)
        {
            min = key[v];
            min_in = v;
        }
    }
    return min_in;
}
void printMst(int parent[], int graph[V][V])
{
    cout << "Edge: \t Weight\n";
    for (int i = 1; i < V; i++)
    {
        cout << parent[i] << "-"<<i
             << "\t" << graph[i][parent[i]] << endl;
    }
}
void primMST(int graph[V][V])
{
    int parent[V];
    int key[V];
    bool mstSet[V];
    for (int i = 0; i < V; i++)
    {
        key[i] = INT_MAX;
        mstSet[i] = false;
    }
    key[0] = 0;
    parent[0] = -1;
    for (int i = 0; i < V - 1; i++)
    {
        int u = minKey(key, mstSet);
        mstSet[u] = true;
        for (int j = 0; j < V; j++)
        {
            if (graph[u][j] && mstSet[j] == false && graph[u][j] < key[j])
            {
                parent[j] = u;
                key[j] = graph[u][j];
            }
        }
    }
    printMst(parent, graph);
}
int main()
{
    int graph[V][V] = {{0, 2, 0, 6, 0},
                       {2, 0, 3, 8, 5},
                       {0, 3, 0, 0, 7},
                       {6, 8, 0, 0, 9},
                       {0, 5, 7, 9, 0}};
    primMST(graph);
    return 0;
}