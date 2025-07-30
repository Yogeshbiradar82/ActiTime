package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//div[text()='TASKS']")).click();
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
	driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Tata Consultancy Services");
	driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("TCS (Tata Consultancy Services) is a global IT services, consulting, and business solutions company headquartered in India.");
	driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
	driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Task Feature");
	driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Employee tasks");
	driver.findElement(By.id("createTasksHeaderBlock")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("add Task 1");
	driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[2]")).sendKeys("add Task 2");
	driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	driver.close();
	
	
}
}
