package Pages;

import Utulities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ParaBank_Elements extends Parent {

    public ParaBank_Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement register;
    @FindBy(css = "input[id='customer.firstName']")
    public WebElement firstName;
    @FindBy(css = "input[id='customer.lastName']")
    public WebElement lastName;
    @FindBy(css = "input[id='customer.address.street']")
    public WebElement address;
    @FindBy(css = "input[id='customer.address.city']")
    public WebElement city;
    @FindBy(css = "input[id='customer.address.state']")
    public WebElement state;
    @FindBy(css = "input[id='customer.address.zipCode']")
    public WebElement zip;
    @FindBy(css = "input[id='customer.phoneNumber']")
    public WebElement phone;
    @FindBy(css = "input[id='customer.ssn']")
    public WebElement ssn;
    @FindBy(css = "input[id='customer.username']")
    public WebElement username;
    @FindBy(css = "input[id='customer.password']")
    public WebElement password;
    @FindBy(css = "input[id='repeatedPassword']")
    public WebElement confirmPassword;
    @FindBy(css = "input[value='Register']")
    public WebElement registerBtn;
    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement successMsg;
    @FindBy(css = "input[name='username']")
    public WebElement usernameBox;
    @FindBy(css = "input[name='password']")
    public WebElement passwordBox;
    @FindBy(css = "input[class='button']")
    public WebElement loginBtn;
    @FindBy(xpath = "//*[@id='leftPanel']/p/b")
    public WebElement welcomeMsg;
    @FindBy(xpath = "//p[text()='The username and password could not be verified.']")
    public WebElement failedMsg;
    @FindBy(linkText = "Bill Pay")
    public WebElement billPay;
    @FindBy(css = "input[name='payee.name']")
    public WebElement payeeName;
    @FindBy(css = "input[name='payee.address.street']")
    public WebElement owingAddress;
    @FindBy(css = "input[name='payee.address.city']")
    public WebElement owingCity;
    @FindBy(css = "input[name='payee.address.state']")
    public WebElement owingState;
    @FindBy(css = "input[name='payee.address.zipCode']")
    public WebElement owingZip;
    @FindBy(css = "input[name='payee.phoneNumber']")
    public WebElement owingPhone;
    @FindBy(css = "input[name='payee.accountNumber']")
    public WebElement payeeAccount;
    @FindBy(css = "input[name='verifyAccount']")
    public WebElement payeeAccountVerify;
    @FindBy(css = "input[name='amount']")
    public WebElement amount;
    @FindBy(css = "select[name='fromAccountId']")
    public WebElement fromAccount;
    @FindBy(css = "input[value='Send Payment']")
    public WebElement sendPayment;
    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement paymentMsg;
    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverview;
    @FindBy(xpath = "//*[@id='accountTable']/tbody/tr[1]/td[1]/a")
    public WebElement accountNumber;
    @FindBy(linkText = "Bill Payment to Electricity")
    public WebElement electricity;
    @FindBy(linkText = "Bill Payment to Water")
    public WebElement water;
    @FindBy(linkText = "Bill Payment to Natural Gas")
    public WebElement naturalGas;
    @FindBy(xpath = "//h1[text()='Transaction Details']")
    public WebElement transactionDetails;
    @FindBy(linkText = "Open New Account")
    public WebElement openNewAccount;
    @FindBy(css = "select[ng-model='types.selectedOption']")
    public WebElement accountType;
    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement accountNum;
    @FindBy(xpath = "//*[@id='rightPanel']/div/div/form/p[2]/b") //verify--containsText
    public WebElement accountMsg;
    @FindBy(xpath = "//*[@id='rightPanel']/div/div/form/div/input")
    public WebElement newAccountBtn;
    @FindBy(xpath = "//h1[text()='Account Opened!']") //verify--containsText
    public WebElement accountOpenMsg;
    @FindBy(xpath = "//b[text()='Your new account number:']") //Verify--visibility
    public WebElement newAccountNum;
    @FindBy(xpath = "//*[@id='accountTable']/tbody/tr/td") //list.size-3
    public List<WebElement> aoList;
    @FindBy(xpath = "//*[@id='rightPanel']/div/div[1]/table/tbody/tr/td[2]")
    public List<WebElement> adList;
    @FindBy(xpath = "//*[@id='rightPanel']/table/tbody/tr/td[2]")
    public List<WebElement> tdList;
    @FindBy(css = "[id='transactionTable']>tbody>tr>td")
    public List<WebElement> accActvList;
    @FindBy(xpath = "(//table[@id='transactionTable']//tbody//tr//td)[14]")
    public WebElement transaction1;
    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds;
    @FindBy(xpath = "(//div//select)[1]")
    public WebElement fromAccountTransferFuns;
    @FindBy(xpath = "(//div//select)[2]")
    public WebElement fromAccountTransferFuns2;
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountTextBox;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement transferButton;
    @FindBy(xpath = "(//span[contains(text(),'')])[2]")
    public WebElement transferCompleteText;
    @FindBy(xpath = "(//span[contains(text(),'')])[3]")
    public WebElement transferCompleteText2;
    @FindBy(xpath = "//td//a[contains(text(),'16341')]")
    public WebElement recipientAccount;
    @FindBy(xpath = "(//*[@id='rightPanel']/table/tbody/tr/td[2])[1]")
    public WebElement transactionID;
    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionButton;
    @FindBy(xpath = "//input[@id='criteria.transactionId']")
    public WebElement findTransactionIdTextBox;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement findTransactionIDButton;
    @FindBy(css = "input[type='submit']")
    public WebElement updateProfileButton;
    @FindBy(css = "div[ng-if='showResult']>p")
    public WebElement profileUpdatedVerifyText;
    @FindBy(linkText = "Log Out")
    public WebElement logOutButton;
    @FindBy(linkText = "Update Contact Info")
    public WebElement updateContactInfo;
    @FindBy(css = "span[ng-if='customer && !customer.firstName']")
    public WebElement firstNameError;
    @FindBy(css = "span[ng-if='customer && !customer.lastName']")
    public WebElement lastNameError;
    @FindBy(css = "span[ng-if='customer && !customer.address.street']")
    public WebElement addressError;
    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanButton;
    @FindBy(css = "input[id='amount']")
    public WebElement loanAmountTextBox;
    @FindBy(css = "input[id='downPayment']")
    public WebElement downPaymentTextBox;
    @FindBy(css = "input[type='submit']")
    public WebElement applyNowButton;
    @FindBy(css = "div[ng-if='loanResponse.approved']>p")
    public WebElement congratulationsText;
    @FindBy(css = "div[ng-if='loanResponse.approved']>p>a")
    public WebElement newLoanAccount;
    @FindBy(css = "p[ng-if='transactions.length <= 0']>b")
    public WebElement accountActivityCtrl;
    @FindBy(css = "p[class='error ng-scope']")
    public WebElement loanDeniedMessage;



    public WebElement getWebElement(String strElement) {
        switch (strElement) {

            case "register": return this.register;
            case "loanDeniedMessage": return this.loanDeniedMessage;
            case "accountActivityCtrl": return this.accountActivityCtrl;
            case "newLoanAccount": return this.newLoanAccount;
            case "congratulationsText": return this.congratulationsText;
            case "applyNowButton": return this.applyNowButton;
            case "downPaymentTextBox": return this.downPaymentTextBox;
            case "loanAmountTextBox": return this.loanAmountTextBox;
            case "requestLoanButton": return this.requestLoanButton;
            case "addressError": return this.addressError;
            case "lastNameError": return this.lastNameError;
            case "firstNameError": return this.firstNameError;
            case "updateContactInfo": return this.updateContactInfo;
            case "logOutButton": return this.logOutButton;
            case "profileUpdatedVerifyText": return this.profileUpdatedVerifyText;
            case "updateProfileButton": return this.updateProfileButton;
            case "findTransactionIDButton": return this.findTransactionIDButton;
            case "findTransactionIdTextBox": return this.findTransactionIdTextBox;
            case "findTransactionButton": return this.findTransactionButton;
            case "transactionID": return this.transactionID;
            case "recipientAccount": return this.recipientAccount;
            case "transferCompleteText": return this.transferCompleteText;
            case "transferCompleteText2": return this.transferCompleteText2;
            case "transferButton": return this.transferButton;
            case "amountTextBox": return this.amountTextBox;
            case "fromAccountTransferFuns": return this.fromAccountTransferFuns;
            case "fromAccountTransferFuns2": return this.fromAccountTransferFuns2;
            case "transferFunds": return this.transferFunds;
            case "transaction1": return this.transaction1;
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zip": return this.zip;
            case "phone": return this.phone;
            case "ssn": return this.ssn;
            case "username": return this.username;
            case "password": return this.password;
            case "confirmPassword": return this.confirmPassword;
            case "registerBtn": return this.registerBtn;
            case "successMsg": return this.successMsg;
            case "usernameBox": return this.usernameBox;
            case "passwordBox": return this.passwordBox;
            case "loginBtn": return this.loginBtn;
            case "failedMsg": return this.failedMsg;
            case "billPay": return this.billPay;
            case "payeeName": return this.payeeName;
            case "owingAddress": return this.owingAddress;
            case "owingCity": return this.owingCity;
            case "owingState": return this.owingState;
            case "owingZip": return this.owingZip;
            case "owingPhone": return this.owingPhone;
            case "payeeAccount": return this.payeeAccount;
            case "payeeAccountVerify": return this.payeeAccountVerify;
            case "amount": return this.amount;
            case "fromAccount": return this.fromAccount;
            case "sendPayment": return this.sendPayment;
            case "paymentMsg": return this.paymentMsg;
            case "accountsOverview": return this.accountsOverview;
            case "accountNumber": return this.accountNumber;
            case "electricity": return this.electricity;
            case "water": return this.water;
            case "naturalGas": return this.naturalGas;
            case "transactionDetails": return this.transactionDetails;
            case "openNewAccount": return this.openNewAccount;
            case "accountType": return this.accountType;
            case "accountNum": return this.accountNum;
            case "accountMsg": return this.accountMsg;
            case "newAccountBtn": return this.newAccountBtn;
            case "accountOpenMsg": return this.accountOpenMsg;
            case "newAccountNum": return this.newAccountNum;
            case "welcomeMsg": return this.welcomeMsg;

        }
        return null;
    }
}
