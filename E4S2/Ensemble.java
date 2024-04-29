interface Ensemble {

    int taille();

    void ajouter(Object element) throws EnsembleException;

    void retirer(Object element) throws EnsembleException;

    boolean contenir(Object element) throws EnsembleException;

    Ensemble union(Ensemble autre) throws EnsembleException;

    Ensemble intersection(Ensemble autre) throws EnsembleException;

}