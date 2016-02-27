/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccioneslab;

/**
 *
 * @author Monica
 */
public class Eleccioneslab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, c;
        java.util.Scanner lectura =
                new java.util. Scanner(System.in);
        System.out.println("Ingrese la cantidad de municipios");
        n = lectura.nextInt();
       System.out.println("Ingrese la cantidad de candidatos");
        c = lectura.nextInt();
        int A[][] = new int [n][c];
        String Mn[] = new String [n];
        String Cn[] = new String[c];
        int C[]= new int [c];
        int Vxc[]= new int [c];
        int i, j;
        //
        for(i=0;i<n;i++){
            java.util.Scanner sc = 
              new java.util. Scanner(System.in);
            System.out.println("Ingrese nombre del municipio " + (i+1));
            Mn[i]= sc.nextLine();
        }
        for(i=0;i<c;i++){
            java.util.Scanner sc = 
              new java.util. Scanner(System.in);
            System.out.println("Ingrese nombre del candidato " + (i+1));
            Cn[i]= sc.nextLine();
        }
        //
        
        for(i=0; i<n; i=i+1){
            for(j=0; j<c; j=j+1){
                new java.util. Scanner(System.in);
                System.out.println("Numero de votos en el municipio " + Mn[i] + " para el candidato " + Cn[j]);
                A[i][j] = lectura.nextInt();
            }
        }
        //
        
        for(j=0;j<c;j++){
            int l=0;
            for(i=0;i<n;i++){
                l=l+A[i][j];    
            }
            C[j]=l;
        }
        //
        int posm= 0;
        int vmay = C[0];
        for(i=1;i<c;i++){
            if (C[i]>vmay){
                vmay = C[i];
                posm = i;
            } 
        }
         System.out.println("El candidato mas votado es: " + Cn[posm]);
        //
        int vt;
        vt=sumvoto(A,n,c);
        for(i=0;i<n;i++){
            Vxc[i]=(C[i]*100)/vt;
            System.out.println("El candidato " + Cn[i] + " obtuvo " + C[i] + " votos con un porcentaje del " + Vxc[i] +"%");
        }
        for(i=0;i<n;i++){
            if(Vxc[i]>50){
                System.out.println("El candidato ganador es: " + Cn[posm] + " con " + C[posm] + " votos " + " y el " + Vxc[posm] + "% del total de los votos ");
                break;
            }
        }
        

        
        // TODO code application logic here }
    }    
      
    public static int sumvoto(int A[][], int n, int c){
        int i,j,k=0;
        for(i=0;i<n;i++){
            for(j=0;j<c;j++){
                k=k+A[i][j];
            }
        }
        return k;    
    }
    
    
 
}

    
    
