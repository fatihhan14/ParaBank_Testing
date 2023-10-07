package StepDefinitions;

import Utulities.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before() {

    }

    @After
    public void after(Scenario senaryo) {
        ExcelUtility.writeExcel("src/test/java/ExcelRepots/ParaBank_ExcelReport.xlsx",senaryo);

        if (senaryo.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        GWD.quitDriver();
    }
}
