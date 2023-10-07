package Utulities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MyFunc {

    public static void Wait(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static int randomGenerator(int sinir) {
        return (int) Math.random() * sinir;
    }

    public static boolean listContainsString(List<WebElement> list, String aranacakKelime) {
        boolean bulundu = false;
        for (WebElement e : list) {
            if (e.getText().toLowerCase().equals(aranacakKelime.toLowerCase())) {
                bulundu = true;
                break;
            }
        }
        return bulundu;
    }
}
