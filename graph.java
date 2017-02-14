import java.util.*;
class graph
{ private int V;
    private LinkedList<Integer> adj[];
    graph(int v)
    {V=v;
      adj=new LinkedList[v];  
          for(int i=0;i<v;i++)
          adj[i]=new LinkedList();
        }
        
        void addEdge(int v,int w)
        { adj[v].add(w);
        }
         
        void DfsUtil(int v,boolean visited[])
        { visited[v]=true;
            System.out.println(v);
            Iterator<Integer> it=adj[v].listIterator();
            while(it.hasNext())
            { int n=it.next();
                if(!visited[v])
                DfsUtil(n,visited);
            }
        }
        
        void Dfs()
        { boolean visited[] =new boolean[V];
            for(int i=0;i<V;i++)
              { if(visited[i]==false)
                DfsUtil(i,visited);
            }
        }
         
        public static void main(String arg[])
        {
            
            graph g=new graph(4);
            g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal");
 
        g.Dfs();}
    }