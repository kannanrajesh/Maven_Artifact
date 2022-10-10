package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {
@Test
private void facebook() {
System.out.println("facebook");
}
@Test
private void google() {
System.out.println("google");
}
@Test
private void youtube() {
System.out.println("youtube");
}
@Test
private void gmail() {
System.out.println("gamil");
}
@Test
private void twitter() {
	System.out.println("twitter");
	}
@Test(alwaysRun = true, enabled = false)
private void books() {
System.out.println("books");
}
@Test
private void amazonprime() {
	System.out.println("amazonprime");
}
@Ignore

@Test
private void hotstar() {
System.out.println("hotstar");
}
@Test
private void whatsapp() {
System.out.println("whatsapp");
}
}
