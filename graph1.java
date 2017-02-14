import java.util.*;
class graph1
{private int V;
    private LinkedList<Integer> adj[];
    
    graph1(int v)
    {V=v;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {adj[i]=new LinkedList();
        }
    }
    
    void addEdge(int v,int w)
    {adj[v].add(w);
    }
    
    void BFS()
    {boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        
        for(int i=0;i<V;i++)
        {  if(visited[i]==false)
             {  visited[i]=true;
                  queue.add(i);
                   while(queue.size()!=0)
                   {  i=queue.poll();
                       System.out.println(i);
                       
                       Iterator<Integer> it=adj[i].listIterator();
                       while(it.hasNext())
                       { int n=it.next();
                           if(!visited[n]) 
                           {visited[n]=true;
                               queue.add(n);
                            }
                        }
                    }
                }
            }
        }
        
        public static void main(String arg[])
        {graph1 g=new graph1(4);
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(1,2);
            g.addEdge(2,0);
            g.addEdge(3,1);
            g.addEdge(3,3);
            g.BFS();
        }
    }
       
        
            
