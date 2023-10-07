package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@....",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ParaBank_TestRunner_1 extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Burhan Şengül");
        ExtentService.getInstance().setSystemInfo("User Name", "D.Fatihhan Karahanlı");
        ExtentService.getInstance().setSystemInfo("User Name", "Şeyma Askerzade");
        ExtentService.getInstance().setSystemInfo("User Name", "Zafer Cansız");
        ExtentService.getInstance().setSystemInfo("User Name", "Ramazan İnce");
        ExtentService.getInstance().setSystemInfo("Application Name", "CleverPPC");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "Team-12");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
    }
}
