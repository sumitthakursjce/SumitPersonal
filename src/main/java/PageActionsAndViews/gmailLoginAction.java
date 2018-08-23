package PageActionsAndViews;

public class gmailLoginAction extends gmailLoginView{

    public void enterEmailORPhone() throws InterruptedException {
        emailInput.sendKeys("sumitthakur1994@gmail.com");
    }

    public void clickNext()
    {
        nextButton.click();
    }

    public void enterPassword()
    {
        passwordTextBox.sendKeys("Thakursumit@9294");
    }

}
