package week1.day2;

public class Browser {
	//global/class level variable
	
	float browserversion = 2;
	public void launchbrowser () {
		System.out.println("browserlaunched successfully");
	}
	public void loadurl () {
		System.out.println("Url loaded successfully");
	}
public static void main(String[] args) {
	Browser chrome = new Browser();
	Browser edge = new Browser();
	
	chrome.launchbrowser();
	edge.launchbrowser();
	chrome.browserversion = 2.1F;
	System.out.println(chrome);
	
	chrome.loadurl();
	edge.loadurl();
	edge.browserversion=2;
	System.out.println(edge);
	
	
	
	
}
}
