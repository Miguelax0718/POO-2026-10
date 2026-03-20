/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

/**
 *
 * @author migue
 */
public class Combinatoric {
    private int n;
    private int k;

    public Combinatoric(int n, int k) {
        if (n >= k) {
            this.n = n;
            this.k = k;
        } else {
            this.n = k;
            this.k = n;
        }
    }

    public int getN() {
        return n;
    }

    public int getK() {
        return k;
    }
    
    public int compute() {
        int factN = 1, factK = 1, factNK = 1;
        for (int i = 2; i <= this.n; i++) {
            factN *= i;
        }
        for (int i = 2; i <= this.k; i++) {
            factK *= i;
        }
        for (int i = 2; i <= (this.n - this.k); i++) {
            factNK *= i;
        }
        return factN / (factK * factNK);
    }
}
