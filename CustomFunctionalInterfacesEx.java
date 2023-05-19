package com.hp.java8;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class CustomFunctionalInterfacesEx {

	public static void main(String[] args) {
		//Predicate,IntPredicate
		BiPredicate<Integer,Integer> predicate = (a,b) -> (a+b) % 2 == 0;

	
		System.out.println(predicate.test(10,20));

		Consumer<String> consumer = name -> System.out.println(name.toUpperCase());
		consumer.accept("india");

		Supplier<String> supplier = () -> "welcome to functional interfaces";

		System.out.println(supplier.get());

		Function<Integer, Integer> function = x -> x * x;
		System.out.println(function.apply(20));

	}

}
