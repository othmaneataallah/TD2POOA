class Positif {
    public Positif(int n) throws ErrConst {
        if (n <= 0)
            throw new ErrConst("Positif: valeur négative ou nulle.");
    }
}
