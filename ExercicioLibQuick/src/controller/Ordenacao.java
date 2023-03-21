package controller;

import sp.fateczl.lucas.QuickSort.QuickSortController;

public class Ordenacao {
	public Ordenacao () {
		super ();
	}
	
	public void OPQuick (int vetor []) {
		QuickSortController qs = new QuickSortController();
		qs.ordenarVetor(vetor);
	}
}
