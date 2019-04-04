/*
 * package com.capgemini.files.client;
 * 
 * import java.io.FileInputStream; import java.io.FileOutputStream; import
 * java.io.ObjectInput; import java.io.ObjectInputStream; import
 * java.io.ObjectOutput; import java.io.ObjectOutputStream;
 * 
 * import com.capgemini.files.model.DebitCard;
 * 
 * public class SerializationDemo { public static void main(String args) {
 * 
 * DebitCard debitCard =new DebitCard(1234512345123451L,234,23,2345);
 * 
 * BankAccount account=new BankAccount(101,"madhu","SAVING",34000,debitCard);
 * 
 * FileOutputStream fileOutputStream=new FileOutputStream("account_ser");
 * ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
 * outputStream.writeObject(account); outputStream.close(); FileInputStream
 * fileinputStream=new FileInputStream("account_ser");
 * 
 * ObjectInputStream inputStream= new ObjectInputStream(fileinputStream);
 * 
 * BankAccount account2= (BankAccount) inputStream.readObject();
 * inputStream.close(); System.out.println(account2);
 * 
 * }
 * 
 * }
 */