package StepDefinitions;

import Pages.ParaBank_Elements;
import Utulities.GWD;
import Utulities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ParaBank_Test_Steps {
    ParaBank_Elements pe = new ParaBank_Elements();
    String newloanAccountNumber;

    @Given("Navigate to website")
    public void NavigateTowebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Click on the element")
    public void clickOnTheElement(DataTable dt) {
        List<String> strClickItems = dt.asList(String.class);
        for (int i = 0; i < strClickItems.size(); i++) {
            WebElement e = pe.getWebElement(strClickItems.get(i));
            pe.myClick(e);
        }
    }

    @When("Click on the element with myJsClick")
    public void clickOnTheElementmyJsClick(DataTable dt) {
        List<String> strClickItems = dt.asList(String.class);
        for (int i = 0; i < strClickItems.size(); i++) {
            WebElement e = pe.getWebElement(strClickItems.get(i));
            pe.myJsClick(e);
        }
    }

    @And("User sending the keys")
    public void userSendingTheKeys(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = pe.getWebElement(items.get(i).get(0));
            pe.mySendKeys(e, items.get(i).get(1));
        }
    }

    @And("Hover to the element")
    public void hoverToTheElement(DataTable dt) {
        List<String> hoverList = dt.asList(String.class);
        for (int i = 0; i < hoverList.size(); i++) {
            WebElement e = pe.getWebElement(hoverList.get(i));
            pe.moveToElement(e);
        }
    }

    @And("User select on the element")
    public void userSelectOnTheElement(DataTable dt) {
        List<List<String>> selectList = dt.asLists(String.class);
        for (int i = 0; i < selectList.size(); i++) {
            WebElement e = pe.getWebElement(selectList.get(i).get(0));
            String optionText = selectList.get(i).get(1);
            pe.selectElementWithText(e, optionText);
        }
    }

    @Then("Text verification process")
    public void textMessageVerificationProcess(DataTable dt) {
        List<List<String>> text = dt.asLists(String.class);
        for (int i = 0; i < text.size(); i++) {
            WebElement e = pe.getWebElement(text.get(i).get(0));
            pe.verifyContainsText(e, text.get(i).get(1));
        }
    }

    @Then("Element display verification process")
    public void ElementDisplayVerificationProcess(DataTable dt) {
        List<List<String>> text = dt.asLists(String.class);
        for (int i = 0; i < text.size(); i++) {
            WebElement e = pe.getWebElement(text.get(i).get(0));
            pe.verifyDisplayElement(e, text.get(i).get(1));
        }
    }

    @Then("Account Overview verification process")
    public void accountOverviewVerificationProcess() {
        for (int i = 0; i < pe.aoList.size() - 3; i++) {
            WebElement e = pe.aoList.get(i);
            pe.verifyDisplayElement(e, pe.aoList.get(i).getText());
        }
    }

    @And("Account Details verification process")
    public void accountDetailsVerificationProcess() {
        for (int i = 0; i < pe.accActvList.size(); i++) {
            WebElement e = pe.accActvList.get(i);
            Assert.assertTrue(e.isDisplayed());
        }
    }

    @And("Transaction Details verification process")
    public void transactionDetailsVerificationProcess() {
        for (int i = 0; i < pe.tdList.size(); i++) {
            WebElement e = pe.tdList.get(i);
            Assert.assertTrue(e.isDisplayed());
        }
    }

    @And("Transfer Date, Credit Amount and Transaction Id Verification")
    public void transferDateAndCreditAmountVerification() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM-dd-YYYY");
        LocalDateTime dt = LocalDateTime.now();
        pe.verifyContainsText(pe.accActvList.get((pe.accActvList.size() - 4)), dt.format(f));
        pe.verifyContainsText(pe.accActvList.get((pe.accActvList.size() - 3)), "Funds Transfer Received");
        pe.verifyContainsText(pe.accActvList.get(pe.accActvList.size() - 1), "1");
        pe.myClick(pe.accActvList.get((pe.accActvList.size() - 3)));
        String StrTransactionID = pe.transactionID.getText();
        pe.myClick(pe.findTransactionButton);
        pe.selectElementWithText(pe.fromAccountTransferFuns, "13899");
        pe.mySendKeys(pe.findTransactionIdTextBox, StrTransactionID);
        pe.myClick(pe.findTransactionIDButton);
        pe.verifyContainsText(pe.accActvList.get(pe.accActvList.size() - 1), "1");
    }

    @And("Update Contact Info verification process")
    public void updateContactInfoAndNegativeUpdateContactInfoVerificationProcess(DataTable dt) {
        MyFunc.Wait(2);
        List<String> profileDetails = dt.asList(String.class);
        List<String> strAttribute = new ArrayList<>();

        strAttribute.add(pe.firstName.getAttribute("value"));
        strAttribute.add(pe.lastName.getAttribute("value"));
        strAttribute.add(pe.address.getAttribute("value"));
        strAttribute.add(pe.city.getAttribute("value"));
        strAttribute.add(pe.state.getAttribute("value"));
        strAttribute.add(pe.zip.getAttribute("value"));
        strAttribute.add(pe.phone.getAttribute("value"));

        for (int i = 0; i < profileDetails.size(); i++) {
            Assert.assertEquals(strAttribute.get(i), profileDetails.get(i), "PROFİL BİLGİLERİ GÜNCELLENMEMİŞ!");
        }
    }

    @And("Loan Request Processed verify")
    public void loanRequestProcessedVerify(DataTable dt) {
        List<String> loanDetailList = dt.asList(String.class);
        pe.myImplicitlyWait();
        pe.verifyContainsText(pe.adList.get(0), loanDetailList.get(0));
        pe.verifyContainsText(pe.adList.get(2), loanDetailList.get(1));
        pe.verifyContainsText(pe.getWebElement(loanDetailList.get(2)), "Congratulations");
        newloanAccountNumber = pe.newLoanAccount.getText();
    }

    @And("Loan Account verification process")
    public void loanAccountVerificationProcess() {
        pe.myImplicitlyWait();
        pe.verifyContainsText(pe.adList.get(0), newloanAccountNumber);
        pe.verifyContainsText(pe.adList.get(1), "LOAN");
        pe.verifyContainsText(pe.adList.get(2), "$2000.00");
        pe.verifyContainsText(pe.adList.get(3), "$2000.00");
        pe.verifyContainsText(pe.accountActivityCtrl, "No transactions found.");
    }

    @And("Loan Request Processed verify2")
    public void loanRequestProcessedVerify2(DataTable dt) {
        List<String> loanDetailList = dt.asList(String.class);
        pe.myImplicitlyWait();
        pe.verifyContainsText(pe.adList.get(0), loanDetailList.get(0));
        pe.verifyContainsText(pe.adList.get(2), loanDetailList.get(1));
        pe.verifyContainsText(pe.getWebElement(loanDetailList.get(2)), "You do not have sufficient funds for the given down payment.");
    }

    @Then("-negative- Update Contact Info verification process")
    public void negativeUpdateContactInfoVerificationProcess() {
        pe.myImplicitlyWait();
        pe.mySendKeys(pe.firstName," ");
        pe.mySendKeys(pe.lastName," ");
        pe.mySendKeys(pe.address," ");
        pe.myClick(pe.updateProfileButton);
        Assert.assertTrue(pe.firstNameError.isDisplayed(), "First Name Error görünmedi");
        Assert.assertTrue(pe.lastNameError.isDisplayed(), "Last Name Error görünmedi");
        Assert.assertTrue(pe.addressError.isDisplayed(), "Address Name Error görünmedi");
    }
}
