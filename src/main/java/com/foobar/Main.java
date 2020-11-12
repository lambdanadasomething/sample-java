package com.foobar;
import com.foobar.processor.Food;

public class Main {
  public static void main(String[] args) {
	  Food myfood = new Food();
	  myfood.name = "Curry";
	  myfood.amount = 3;
	  myfood.unit = "dishes";
    System.out.println("Oh no, not another Hello World example...");
    System.out.println(myfood.getString());
  }
}

