/**
 * SimpleLinearRegression(SLR)
 */
public class SLR {

  punto a;
  
  public SLR(){
    a.A = 1f;
    a.B = 3f;
  } 

  public SLR(float B1, float B2){
    a.A = B1;
    a.B = B2;
  }

  public void PrintPoint(){
    System.out.println(a.A + "  " + a.B);
  } 
  
}