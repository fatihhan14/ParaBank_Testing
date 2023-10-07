package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@Smoke",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ParaBank_TestRunner_1 extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("QA Lead", "Burhan Şengül");
        ExtentService.getInstance().setSystemInfo("QA Tester1", "D.Fatihhan Karahanlı");
        ExtentService.getInstance().setSystemInfo("QA Tester2", "Şeyma Askerzade");
        ExtentService.getInstance().setSystemInfo("QA Tester3", "Zafer Cansız");
        ExtentService.getInstance().setSystemInfo("QA Tester4", "Ramazan İnce");
        ExtentService.getInstance().setSystemInfo("Application Name", "ParaBank");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "Team-12");
        ExtentService.getInstance().setSystemInfo("Ek Satır1", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır2", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır3", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır4", "Açıklama");
    }
}
