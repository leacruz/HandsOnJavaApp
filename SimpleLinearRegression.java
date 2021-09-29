/**
 * SimpleLinearRegression(SLR)
 */
public class SimpleLinearRegression {

  punto a;
  
  public SimpleLinearRegression(){
    a.A = 1f;
    a.B = 3f;
  } 

  public SimpleLinearRegression(float B1, float B2){
    a.A = B1;
    a.B = B2;
  }

  public void PrintPoint(){
    System.out.println(a.A + "  " + a.B);
  } 
  
}