package banksystem;

public class Account {
	
	float Balance;
    //constructors
    public Account(float Balance) {
        this.Balance=Balance;
    }
     //Methods
public Account(){
    Balance=0.0f;
}
//Getter
public float getbalance(){
    return Balance;
}
//Setter
public void setbalance(float Balance){
    this.Balance=Balance;
    
}

}
