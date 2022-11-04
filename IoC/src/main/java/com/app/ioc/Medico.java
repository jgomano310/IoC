package com.app.ioc;

public class Medico {
 Util utensilio;
 
 public void setUtensilio(Util utensilio) {
	 this.utensilio=utensilio;
 }
 
 public void operar() {
	 System.out.println("operando");
	 utensilio.Usar();
 }
}
