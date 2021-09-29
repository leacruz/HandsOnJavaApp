/**
 * SimpleLinearRegression(SLR)
 */
public class SLR {

    punto[] P = new punto[4];
    float[] XC = new float[4]; // X^2
    float[] XY = new float[4]; // Xy
  
    public SLR(){
        P[0] = new punto(42.9f, 28.9f);
        P[1] = new punto(44.4f, 31.3f);
        P[2] = new punto(81.4f, 34.3f);
        P[3] = new punto(81.5f, 33.2f);
    } 

    public SLR(punto TheP1, punto TheP2, punto TheP3, punto TheP4){
        P[0] = TheP1;
        P[1] = TheP2;
        P[2] = TheP3;
        P[3] = TheP4;
    }

    public void PrintPoint(){
        //System.out.println(p1.A + "  " + p2.B);
    }

    public float SumXCuadrada() {     //ΣX^2
        float SumTotal = 0f;
        for (int i = 0; i < P.length; i++) {
            Double x = Math.pow(P[i].X, 2);
            XC[i] = x.floatValue();
        }

        for (int i = 0; i < XC.length; i++) {
            SumTotal += XC[i];
        }
        return SumTotal;
    }

    public Float SumXY() {    //ΣXY
        float SumTotal = 0f;
        for (int i = 0; i < P.length; i++) {        
            XY[1] = P[1].X * P[1].Y;
        }

        for (int i = 0; i < XY.length; i++) {
            SumTotal += XY[i];
        }
        return SumTotal;
    }

    public punto Promedio(punto[] a) {
        punto PromXY = new punto();
        for (int i = 0; i < a.length; i++) {
            PromXY.X += a[i].X;
            PromXY.Y += a[i].Y;
        }
        PromXY.X = PromXY.X/a.length;
        PromXY.Y = PromXY.Y/a.length;
        return PromXY;
    }

    public void Recta(){  // Y = a + bx

    }

    public void Ordenada() {  // a = Σy
      
    }

    public void Pendiente() {
      
    }
  
}