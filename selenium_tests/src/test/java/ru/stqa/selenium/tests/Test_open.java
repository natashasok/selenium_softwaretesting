package ru.stqa.selenium.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_open extends TestBase {

    @Test
    public void testOpen() {
        app.wd.findElement(By.name("btnK"));
        System.out.println("Открыть браузер");
    }
}
