
public class Diretor{
  private String nome;
  private float exp;
  private String local;
  
  public Diretor(){
  }
  public Diretor(String nome, float exp, String local){
    this.nome=nome;
    this.exp=exp;
    this.local=local;
  }
  
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public float getExp(){
    return exp;
  }
  public void setExp(float exp){
    this.exp=exp;
  }
  public String getLocal(){
    return local;
  }
  public void setLocal(String local){
   this.local=local; 
  }
  
  public String toString(){
   return("Nome:"+nome+"\n Experiencia:"+exp+"\nLocal de nascimento:"+local); 
  }
}
