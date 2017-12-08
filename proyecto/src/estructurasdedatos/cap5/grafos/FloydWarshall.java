/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

/**
 *
 * @author tusk
 */
public  void floyd ( int n, int [] [] W , int [] [] P , int [] [] D )
{
	D  =  W ;
	para ( int i =  0 ; i < n; i ++ )
	 	para (j =  0 ; j < n; j ++ )
	 		P [i] [j] =  0 ;
	 para ( int k =  0 ; k < n; k ++ )
	 	para ( int i =  0 ; i < n; i ++ )
	 		for ( int j =  0 ; j < n; j ++ )
	 		{
	 			if ( D [i] [k] +  D [k] [j] <  D [i] [j])
	 			{
	 				D [i] [j] =  D [i] [k] +  D [k] [j]
	 				P [i] [j] = k
	 			}
	 		}
}

 ruta de vacío pública ( int q, int r)
{
	camino (q, P [q] [r]);
	Sistema . a cabo . println ( " v "  +  P [q] [r]);
	camino ( P [q] [r], r)
}