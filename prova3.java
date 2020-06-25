import java.io.serializable;
public class numero implements serializable {

  private float a;
  private float b;
  private float c;
  
  public numero () {
    this.a = 0;
    this.b = 0;
    this.c = 0;
  }
  
  public float getA() {
    return a;
  }
  
  public float getB() {
    return b;
  }
  
  public float getC() {
    return c;
  }
  
  public void setA(float A){
    this.a = A;
  }
  
  public void setB(float B){
    this.b = B;
  }
  
  public void setC(float C){
    this.c = C;
  }
  
  public float Soma(){
    return (a+b+c);
  }
  
  public float Subtrai(){
    return (a-b-c);
  }
  
}