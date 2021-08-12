package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverBrainpop;

import java.util.List;

public class PlayerPage {
    public PlayerPage(){ PageFactory.initElements(DriverBrainpop.getDriver(), this);}

    @FindBy(xpath = "//div[contains(text(), 'DNA')]/parent::div")
    public WebElement DNAtopic;

    @FindBy(xpath = "//span[contains(text(), 'DNA')]/parent::li")
    public WebElement DNAhomepage;

    @FindBy(xpath = "//div[@class='controls vue-portal-target controls']")
    public WebElement videoplayerPanel;

    @FindBy(xpath = "//input[starts-with(@id,'video-slider')]")
    public WebElement videoSlider;

    @FindBy(xpath = "//progress[@class='playing']")
    public WebElement progressBar;

    @FindBy(xpath = "//button[starts-with(@aria-label,'Play')]")
    public WebElement playButton;

    @FindBy(xpath = "//button[starts-with(@aria-label,'Pause')]")
    public WebElement pauseButton;

//@FindBy(xpath = "//div[@class='video-progress blocked vue-portal-target']/following-sibling::*[1]")
//public WebElement pauseButton;
//
//    @FindBy(xpath = "//div[@class='video-progress blocked vue-portal-target']/following-sibling::*[1]")
//    public WebElement playButton;


//    @FindBy(xpath = "//button[@id='caption']")
//    public WebElement captionButton;
//
//    @FindBy(xpath = "//button[starts-with(@aria-label,'Pause')]")
//    public WebElement captions;


//    @FindBy(xpath = "//span[@name='icon-_wd9tfpab1']")
//    public WebElement captionButton;
    @FindBy(xpath = "//button[@id='caption']")
    public WebElement captionButton;

//    @FindBy(xpath = "//div[@data-kind='captions']/*[1]")
//    public WebElement captions;

    @FindBy(xpath = "//div[@data-kind='captions']/*[1]")
    public List<WebElement> captionsList;






}
