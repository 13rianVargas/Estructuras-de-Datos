import java.util.*;

public class Grafitos {
    static int nodos = 8;

    static int matriz_ady [][]=new int[nodos][nodos];

    @SuppressWarnings("unchecked")
    static ArrayList<Integer> lista_ady[] = new ArrayList[nodos];

    static ArrayList<Arista> lista_arc=new ArrayList<>();

    static boolean[] visitiadoAnchura = new boolean[nodos];
    static boolean[] visitiadoProfunidad = new boolean[nodos];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("\n<> <> <> <> <> <> <> <> <> <> <> <> <> <> <>");

        // MATRIZ DE ADYACENCIA //
        
        // Iniciar en ceros
        for (int i=0;i<nodos;i++)
            for (int j=0;j<nodos;j++)
            matriz_ady[i][j]=0;

        // Datos matríz de adyacencia
        matriz_ady[0][1]=1;
        matriz_ady[0][4]=1;
        matriz_ady[0][6]=1;

        matriz_ady[1][0]=1;
        matriz_ady[1][3]=1;
        matriz_ady[1][5]=1;

        matriz_ady[2][4]=1;
        matriz_ady[2][6]=1;

        matriz_ady[3][1]=1;
        matriz_ady[3][7]=1;

        matriz_ady[4][0]=1;
        matriz_ady[4][2]=1;
        matriz_ady[4][5]=1;

        matriz_ady[5][1]=1;
        matriz_ady[5][4]=1;
        matriz_ady[5][7]=1;

        matriz_ady[6][0]=1;
        matriz_ady[6][2]=1;

        matriz_ady[7][3]=1;
        matriz_ady[7][5]=1;
        //*/

        System.out.println("\n<> Matríz de Adyacencia <>");
        for (int i=0;i<nodos;i++){
            for (int j=0;j<nodos;j++){
                System.out.print(matriz_ady[i][j]+"  ");
            }
            System.out.println("  ");
        } 

        // LISTA DE ADYACNECIA //
        
        // Iniciar en ceros
        for (int i=0;i<nodos;i++)
        lista_ady[i] =new ArrayList<Integer>();

        // Datos lista de adyacencia
        lista_ady[0].add(1);
        lista_ady[0].add(4);
        lista_ady[0].add(6);
        
        lista_ady[1].add(0);
        lista_ady[1].add(3);
        lista_ady[1].add(5);

        lista_ady[2].add(4);
        lista_ady[2].add(6);

        lista_ady[3].add(1);
        lista_ady[3].add(7);

        lista_ady[4].add(0);
        lista_ady[4].add(2);
        lista_ady[4].add(5);

        lista_ady[5].add(1);
        lista_ady[5].add(4);
        lista_ady[5].add(7);

        lista_ady[6].add(0);
        lista_ady[6].add(2);

        lista_ady[7].add(3);
        lista_ady[7].add(5);

        System.out.println("\n<> Lista de Adyacencia <>");
        for (int i=0;i<nodos;i++){
            System.out.println("Nodo |"+i+"| -> "+lista_ady[i].toString());
        }

        // LISTA DE ARCOS //
        
        //Datos lista de arcos
        lista_arc.add(new Arista(0,1));
        lista_arc.add(new Arista(0,4));
        lista_arc.add(new Arista(0,6));

        lista_arc.add(new Arista(1,0));
        lista_arc.add(new Arista(1,3));
        lista_arc.add(new Arista(1,5));

        lista_arc.add(new Arista(2,4));
        lista_arc.add(new Arista(2,6));

        lista_arc.add(new Arista(3,1));
        lista_arc.add(new Arista(3,7));

        lista_arc.add(new Arista(4,0));
        lista_arc.add(new Arista(4,2));
        lista_arc.add(new Arista(4,5));

        lista_arc.add(new Arista(5,1));
        lista_arc.add(new Arista(5,4));
        lista_arc.add(new Arista(5,7));

        lista_arc.add(new Arista(6,0));
        lista_arc.add(new Arista(6,2));

        lista_arc.add(new Arista(7,3));
        lista_arc.add(new Arista(7,5));

        System.out.println("\n<>  Lista de Arcos <>");
        for (int i=0;i<lista_arc.size();i++){
            System.out.println(lista_arc.get(i).toString());
        }

        System.out.println("\n<> <> <> <> <> <> <> <> <> <> <> <> <> <> <>");

        System.out.print("\n >> Ingrese un nodo para ver sus vértices adyacentes: ");
        int nodoSel = sc.nextInt();

        System.out.println("Vértices Adyacentes del nodo |"+nodoSel+"| -> "+lista_ady[nodoSel].toString());

        System.out.print("\n >> Ingrese un nodo para ver su grado: ");
        nodoSel = sc.nextInt();
        System.out.println("Grado del nodo |"+nodoSel+"| -> "+lista_ady[nodoSel].size());

        // Recorre los vértices
        int gradoMax = 0;
        int gradoMin = 0;
        boolean primeraVez = true;

        for (int i=0;i<nodos;i++){
            int grado = lista_ady[i].size();
            gradoMax =  Math.max(gradoMax,grado);
            if (primeraVez){
                gradoMin = gradoMax;
                primeraVez = false;
            }
            gradoMin =  Math.min(gradoMin,grado);
        }

        System.out.println("\n >> El grado máximo del grafo es -> " + gradoMax);
        System.out.println(" >> El grado mínimo del grafo es -> " + gradoMin);

        System.out.print("\n >> Ingrese un nodo para recorrer por anchura: ");
        nodoSel = sc.nextInt();

        ArrayList<Integer> anchura = recorridoAnchura(nodoSel);
        System.out.print("\nRecorrido en anchura del grafo iniciando en |" + nodoSel + "| -> ");
        for(int i=0;i<anchura.size();i++){
            System.out.print(""+anchura.get(i)+" ");
        }
        System.out.println(" ");

        System.out.print("\n >> Ingrese un nodo para recorrer por profundidad: ");
        nodoSel = sc.nextInt();

        ArrayList<Integer> profundidad = recorridoProfunidad(nodoSel);
        System.out.print("\nRecorrido en profundidad del grafo iniciando en |" + nodoSel + "| -> ");
        for(int i=0;i<profundidad.size();i++){
            System.out.print(""+profundidad.get(i)+" ");
        }
        System.out.println(" ");

        System.out.println("\n<>   < F >   < I >   < N >   <>");

        sc.close();
    }

    public static ArrayList<Integer> recorridoAnchura(int nodoI) {
        
        ArrayList<Integer> recorridos = new ArrayList<>(); //Lista donde guardan los nodos recorridos
        visitiadoAnchura[nodoI] = true;  //El nodo inicial se establece como visitado
        ArrayList<Integer> cola = new ArrayList<>();  //Cola de visitas de los nodos adyacentes
        recorridos.add(nodoI);  //se guarda el nodo como ya recorrido
        cola.add(nodoI);       //Se agrega el nodo a la cola de visitas
        while (!cola.isEmpty()) //Hasta que visite todos los nodos
          {
            int j = cola.remove(0); //Se saca el primero nodo de la cola
            for (int i = 0; i < matriz_ady.length; i++)  //Se busca en la matriz que representa el grafo los nodos adyacentes
             {
                if (matriz_ady[j][i] != 0 && !visitiadoAnchura[i]) //Si es un nodo adyacente y no está visitado entonces
                   {
                    cola.add(i);//Se agrega a la cola de visitas
                    recorridos.add(i);//Se marca como recorrido
                    visitiadoAnchura[i] = true;//Se marca como visitado
                  }
             }
           }
        return recorridos;//Devuelvo el recorrido del grafo en anchura
    }

    public static ArrayList<Integer> recorridoProfunidad(int nodoI) {

        ArrayList<Integer> recorridos = new ArrayList<>(); //Lista donde guardo los nodos recorridos
        visitiadoProfunidad[nodoI] = true;  //El nodo inicial ya está visitado
        ArrayList<Integer> cola = new ArrayList<>();  //Cola de visitas de los nodos adyacentes
        recorridos.add(nodoI);//Listo el nodo como ya recorrido
        cola.add(nodoI);//Se agrega el nodo a la cola de visitas
        while (!cola.isEmpty()) //Hasta que visite todos los nodos
          {
            int j = cola.remove(0);//Se saca el primer nodo de la cola
            for (int i = 0; i < matriz_ady.length; i++)   //Se busca en la matriz que representa el grafo los nodos adyacentes
              { 
                if (matriz_ady[j][i] == 1 && !visitiadoProfunidad[i]) //Si es un nodo adyacente y no está visitado entonces
                     {
                       cola.add(i);//Se agrega a la cola de visita
                       recorridos.addAll(recorridoProfunidad(i));  
                       visitiadoProfunidad[i] = true;//Se marca como visitado
                     }
               }
           }
        return recorridos;//Se devuelve el recorrido del grafo en profundidad
    }
       
}
