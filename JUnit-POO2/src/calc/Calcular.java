package calc;

import java.util.Arrays;

public class Calcular {
    public double Media(double[] v) {
        double sum = 0;
        for (double value : v) {
            sum += value;
        }
        return sum / v.length;
    }
    
    public double Moda(double[] v) {
    	Arrays.sort(v);
    	
        double moda = v[0]; 
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < v.length; i++) {
            if (v[i] == v[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                moda = v[i];
            }
        }
        return moda;
    }
    
    public double Mediana(double[] v) {
        Arrays.sort(v);

        int tamanho = v.length;
        if (tamanho % 2 == 0) {
            double m1 = v[tamanho / 2 - 1];
            double m2 = v[tamanho / 2];
            return (m1 + m2) / 2.0;
        } else {
            return v[tamanho / 2];
        }
    }
    
    public double Variancia(double[] v) {
    	double media = Media(v);
    	double somatorio = 0;
    	for (double elem : v) {
			somatorio += Math.pow(elem - media, 2);
		}
    	double variancia = somatorio/(v.length);
    	return variancia;
    }
    
    public double DesvioPadrao(double[] v) {
    	double desvio = Math.sqrt(Variancia(v));
    	return desvio;
    }
}
