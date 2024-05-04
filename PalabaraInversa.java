class PalabraInversa{
private String Palabra;

public String getInversa(){
    return new StringBuilder(Palabra).reverse().toString();
}

public String getPalabra() {
    return Palabra;
}

public void setPalabra(String palabra) {
    Palabra = palabra;
}

@Override
public String toString() {
    return "PalabraInversa [Palabra=" + Palabra + "]";
}
}











