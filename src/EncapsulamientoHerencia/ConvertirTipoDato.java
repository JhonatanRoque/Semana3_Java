package EncapsulamientoHerencia;


public class ConvertirTipoDato {
    public static void main(String[] args) {
        ConvertirTipoDato polimorfismo = new ConvertirTipoDato();
        System.out.println("Valor de int a String       : " + polimorfismo.ConvertirAString(10));
        System.out.println("Valor de double a String    : " + polimorfismo.ConvertirAString(10.0));
        System.out.println("Valor de float a String     : " + polimorfismo.ConvertirAString(10.12));
    }
    
    public String ConvertirAString(int valorInt){ //Convertir de Int a String
        String conversion = String.valueOf(valorInt);
        return conversion;
    }

    public String ConvertirAString(double valorDouble){ //Convertir de Double a String
        String conversion = String.valueOf(valorDouble);
        return conversion;
    }
    
    public String ConvertirAString(float valorFloat){ //Convertir de Float a String
        String conversion = String.valueOf(valorFloat);
        return conversion;
    }
}
