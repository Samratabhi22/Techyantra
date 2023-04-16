package com.java.practice;

public interface AB {
default void show() {
	System.out.println(" i am using default show method");
}
//private void abc() {
//	System.out.println(" i am using default show method");
//}
public abstract void xyz() ;
// void qwe() {
//	 
// }
// public void asd() {
//	 
// }

// void sed() {
//	 
// }
// protected void qhy() {
//	 
// }
static void qsc() {
	System.out.println(" i am using sttaic method");
}
}
