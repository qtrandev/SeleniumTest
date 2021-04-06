package github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

	WebDriver driver = null;
	
	By overviewTab = By.cssSelector(".width-full .UnderlineNav-item:nth-child(1)");
	By repositoriesTab = By.cssSelector(".width-full .UnderlineNav-item:nth-child(2)");
	By projectsTab = By.cssSelector(".width-full .UnderlineNav-item:nth-child(3)");
	By packagesTab = By.cssSelector(".width-full .UnderlineNav-item:nth-child(4)");
	
	By lealetTransitLink = By.linkText("LeafletTransit");
	
	public ProfilePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOverviewTab() {
		
		driver.findElement(overviewTab).click();
	}
	
	public void clickRepositoriesTab() {
		
		driver.findElement(repositoriesTab).click();
	}
	
	public void clickProjectsTab() {
			
		driver.findElement(projectsTab).click();
	}

	public void clickPackagesTab() {
		
		driver.findElement(packagesTab).click();
	}
	
	public void clickLeafletTransitLink() {
		driver.findElement(lealetTransitLink).click();
	}
}












