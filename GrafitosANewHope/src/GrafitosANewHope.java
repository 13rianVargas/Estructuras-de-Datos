import java.util.*;

public class GrafitosANewHope {
    
    private static Scanner sc = new Scanner(System.in);
    private int vertices;
    private static List<List<Edge>> adjList;

    public GrafitosANewHope (int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public static void mostrarAristas() {
        int  i = 0;
        for (List<Edge> edge : adjList) {
            System.out.println("» Nodo "+i+" -> " + edge.toString());
            i++;
        }
    }

    public void añadirArista(int origen, int destino, int distancia) {
        Edge edge = new Edge(destino, distancia);
        adjList.get(origen).add(edge);
    }

    public void encontrarCaminos(int origen, int destino) {
        boolean[] visitado = new boolean[vertices];
        List<Integer> listaCamino = new ArrayList<>();
        listaCamino.add(origen);

        encontrarCaminosUtil(origen, destino, visitado, listaCamino);
    }

    private void encontrarCaminosUtil(int actual, int destino, boolean[] visitado, List<Integer> listaCamino) {
        visitado[actual] = true;

        if (actual == destino) {
            System.out.println(listaCamino);
        } else {
            for (Edge edge : adjList.get(actual)) {
                if (!visitado[edge.destino]) {
                    listaCamino.add(edge.destino);
                    encontrarCaminosUtil(edge.destino, destino, visitado, listaCamino);
                    listaCamino.remove(listaCamino.size() - 1);
                }
            }
        }

        visitado[actual] = false;
    }

    public void encontrarMenorDistancia(int origen, int destino) {
        int[] distMin = new int[vertices];
        boolean[] visitado = new boolean[vertices];
        int[] anterior = new int[vertices];
        Arrays.fill(distMin, Integer.MAX_VALUE);
        Arrays.fill(anterior, -1);
        distMin[origen] = 0;
    
        for (int i = 0; i < vertices - 1; i++) {
            int u = obtenerNodoMenor(distMin, visitado);
            visitado[u] = true;
    
            if (u == destino) break;
    
            for (Edge edge : adjList.get(u)) {
                int v = edge.destino;
                int newDist = distMin[u] + edge.distancia;
    
                if (!visitado[v] && newDist < distMin[v]) {
                    distMin[v] = newDist;
                    anterior[v] = u;
                }
            }
        }
    
        if (distMin[destino] == Integer.MAX_VALUE) {
            System.out.println("\nNo hay camino desde el nodo " + origen + " al nodo " + destino);
        } else {
            // Imprimimos la distancia mínima
            System.out.println("\nLa menor distancia desde " + origen + " hasta " + destino + " es -> " + distMin[destino]);
    
            // Reconstruimos e imprimimos el camino usando el arreglo anterior
            List<Integer> camino = new ArrayList<>();
            for (int x = destino; x != -1; x = anterior[x]) {
                camino.add(x);
            }
            Collections.reverse(camino);
    
            System.out.println("El camino más corto es -> " + camino);
        }
    }
    
    // Método auxiliar para encontrar el nodo no visitado con la distancia mínima
    private int obtenerNodoMenor(int[] dist, boolean[] visitado) {
        int minDist = Integer.MAX_VALUE;
        int minIndex = -1;
    
        for (int i = 0; i < vertices; i++) {
            if (!visitado[i] && dist[i] < minDist) {
                minDist = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        
        GrafitosANewHope g = new GrafitosANewHope(10);
        
        g.añadirArista(0, 1, 80);
        g.añadirArista(0, 5, 33);
        g.añadirArista(1, 2, 25);
        g.añadirArista(2, 3, 42);
        g.añadirArista(2, 7, 24);
        g.añadirArista(3, 4, 28);
        g.añadirArista(4, 5, 11);
        g.añadirArista(4, 9, 96);
        g.añadirArista(5, 6, 46);
        g.añadirArista(6, 7, 84);
        g.añadirArista(7, 8, 60);
        g.añadirArista(8, 9, 14);
        g.añadirArista(8, 3, 20);
        g.añadirArista(9, 0, 90);

        System.out.println("\n\n\n\n\n"
                            + " » Ciudades de Colombia «\n"
                            +"  Nodo 0 -> BOGOTÁ\n"
                            +"  Nodo 1 -> MEDELLÍN\n"
                            +"  Nodo 2 -> BUCARAMANGA\n"
                            +"  Nodo 3 -> PEREIRA\n"
                            +"  Nodo 4 -> CALI\n"
                            +"  Nodo 5 -> BARRANQUILLA\n"
                            +"  Nodo 6 -> CARTAGENA\n"
                            +"  Nodo 7 -> CÚCUTA\n"
                            +"  Nodo 8 -> MANIZALES\n"
                            +"  Nodo 9 -> IBAGUÉ\n");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(" » Selecciona la ciudad «\n");
        mostrarAristas();

        System.out.println("\n » Caminos que permitan llegar de un nodo A hasta un nodo B «");
        System.out.print("\n >> Ingrese un nodo A como origen:");
        int origen = sc.nextInt();
        System.out.print("\n >> Ingrese un nodo B como destino:");
        int destino = sc.nextInt();

        System.out.println("\n » Caminos de " + origen + " a " + destino + " «\n");
        g.encontrarCaminos(origen, destino);

        System.out.println("\n » Camino con menor distancia «");
        g.encontrarMenorDistancia(origen, destino);

        System.out.println("\n <> <> <>  F  I  N  <> <> <>\n");
        sc.close();
    }
    //main
}
//class