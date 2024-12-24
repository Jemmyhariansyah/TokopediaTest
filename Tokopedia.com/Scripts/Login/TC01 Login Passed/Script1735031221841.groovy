import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import NewTestListener  // Mengimpor listener
import java.util.Random

// Fungsi untuk menambahkan delay acak
Random rand = new Random()

// Buka browser dan navigasi ke URL
WebUI.openBrowser('')
WebUI.delay(rand.nextInt(3) + 2)  // Delay acak 2-4 detik

// Menavigasi ke URL Tokopedia
WebUI.navigateToUrl('https://tokopedia.com')
WebUI.delay(rand.nextInt(3) + 2)  // Delay acak 2-4 detik

// Layar agar maximize
WebUI.maximizeWindow()
WebUI.delay(rand.nextInt(3) + 2)  // Delay acak 2-4 detik

// Klik tombol "Masuk"
WebUI.click(findTestObject('Object Repository/Login/Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/button_Masuk'))
WebUI.delay(rand.nextInt(2) + 2)  // Delay acak 2-3 detik

// Menginputkan email atau nomor handphone
WebUI.setText(findTestObject('Object Repository/Login/input_Nomor HP atau Email_email-phone'), 'omatbringer@gmail.com')
WebUI.delay(rand.nextInt(3) + 2)  // Delay acak 2-4 detik

// Klik tombol "Selanjutnya"
WebUI.click(findTestObject('Object Repository/Login/button_Selanjutnya'))
WebUI.delay(rand.nextInt(3) + 2)  // Delay acak 2-4 detik

// Menginputkan password dengan pengetikan normal
String password = '123qwe,./Kita'
for (int i = 0; i < password.length(); i++) {
    WebUI.sendKeys(findTestObject('Object Repository/Login/input_Kata Sandi_password-input'), password[i])
    WebUI.delay(0.1)  // Jeda 0.1 detik untuk meniru pengetikan alami
}

// Klik tombol "Masuk"
WebUI.click(findTestObject('Object Repository/Login/span_Masuk'))
WebUI.delay(rand.nextInt(3) + 2)  // Delay acak 2-4 detik

// Klik email
//WebUI.click(findTestObject('Object Repository/Login/div_E-mail ke og.com'))
