package br.com.neppo;

public class MathUtil {

    /**
     * Dado um conjunto de números inteiros "ints" e um número arbitrário "sum",
     * retorne true caso exista pelo menos um subconjunto de "ints" cuja soma soma dos seus elementos
     * seja igual a "sum"
     *
     * @param ints Conjunto de inteiros
     * @param sum Soma para o subconjunto
     * @return
     * @throws IllegalArgumentException caso o argumento "ints" seja null
     */
    public static boolean subsetSumChecker(int ints[], int sum) throws Exception {
-        throw new UnsupportedOperationException("Please implement me.");
-    }
+        if(ints == null){
+            throw new UnsupportedOperationException("OS VALORES SÃO NULOS");
+        }else{
+            if(ints==sum){
+                return true;;
+            }else{
+                total = 0;
+                for(int i : ints){
+                    total = total + i;
+                    if(total == sum){
+                        return true;
+                    }
 
-}
+                }
+                return false;
+            }
+        }
