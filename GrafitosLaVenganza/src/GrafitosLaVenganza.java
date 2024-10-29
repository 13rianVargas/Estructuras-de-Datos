import java.util.*;

public class GrafitosLaVenganza {
    private int vertices;
    private List<List<Integer>> adjList;

    public GrafitosLaVenganza(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Método para agregar una arista al grafo
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
    }

    // Método para encontrar todos los caminos de A a B
    public void findAllPaths(int start, int end) {
        boolean[] visited = new boolean[vertices];
        List<Integer> pathList = new ArrayList<>();
        pathList.add(start);

        // Llamada a la función recursiva para encontrar los caminos
        findAllPathsUtil(start, end, visited, pathList);
    }

    private void findAllPathsUtil(Integer current, Integer end, boolean[] visited, List<Integer> pathList) {
        // Marca el nodo actual como visitado
        visited[current] = true;

        // Si hemos llegado al nodo de destino, imprime el camino
        if (current.equals(end)) {
            System.out.println(pathList);
        } else {
            // Recorre los nodos adyacentes al nodo actual
            for (Integer neighbor : adjList.get(current)) {
                if (!visited[neighbor]) {
                    pathList.add(neighbor);
                    findAllPathsUtil(neighbor, end, visited, pathList);
                    // Deshacer la elección (backtracking)
                    pathList.remove(neighbor);
                }
            }
        }

        // Marca el nodo actual como no visitado para permitir otros caminos
        visited[current] = false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        GrafitosLaVenganza g = new GrafitosLaVenganza(8);
        
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(0, 7);

        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(1, 6);

        g.addEdge(2, 1);
        g.addEdge(2, 7);
        g.addEdge(2, 5);

        g.addEdge(3, 0);
        g.addEdge(3, 6);
        g.addEdge(3, 4);

        g.addEdge(4, 3);
        g.addEdge(4, 0);
        g.addEdge(4, 7);

        g.addEdge(5, 2);
        g.addEdge(5, 1);
        g.addEdge(5, 6);
        
        g.addEdge(6, 5);
        g.addEdge(6, 3);
        g.addEdge(6, 1);

        g.addEdge(7, 4);
        g.addEdge(7, 2);
        g.addEdge(7, 0);

        int start = 0; // Nodo de inicio
        int end = 0;   // Nodo de destino
    
        System.out.println("Ingrese nodo A");
        start = sc.nextInt();
        System.out.println("Ingrese nodo B");
        end = sc.nextInt();

        System.out.println("Caminos de " + start + " a " + end + ":");
        g.findAllPaths(start, end);

        sc.close();
    }
    //main
}
//class