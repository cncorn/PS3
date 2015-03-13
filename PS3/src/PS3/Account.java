package PS3;

import java.sql.Date;

public class Account {

private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;

public Account(){
	this.id=0;
	this.balance=0;
	this.annualInterestRate=0;
}
public Account(int id, double balance){
	this.id=id;
	this.balance=balance;
}
public int getId()
{
    return this.id;
}
public double getBalance(){
	return this.balance;
}
public double getAnnualInterestRate(){
	return this.annualInterestRate;
}
public Date dateCreated(){
	return this.dateCreated;
}
public void setId(int id){
	this.id=id;
}
public void setBalance(double balance){
	this.balance=balance;
}
public void setAnnualInterestRate(double annualInterestRate){
	this.annualInterestRate=annualInterestRate;
}
public double getMonthlyInterestRate(){
	return this.annualInterestRate/12;
}
public void withdrawal(double withdrawal){
	this.balance-=withdrawal;
}
public void deposit(double deposit){
	this.balance+=deposit;
}


}
