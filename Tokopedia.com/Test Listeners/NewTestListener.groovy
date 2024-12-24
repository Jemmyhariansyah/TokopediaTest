import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class NewTestListener {
	// Menyeting preferensi WebDriver sebelum menjalankan test case
	@BeforeTestCase
	def setup(TestCaseContext testCaseContext) {
		// Menambahkan user-agent ke WebDriver
		RunConfiguration.setWebDriverPreferencesProperty("args", [
			"--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
		])
		
		// Menjalankan browser dengan window size tertentu
		RunConfiguration.setWebDriverPreferencesProperty("args", ["--window-size=1920,1080"])

		// Optional: Menambahkan pengaturan headless mode jika diperlukan
		// RunConfiguration.setWebDriverPreferencesProperty("args", ["--headless"])
	}

	// Anda bisa menambahkan kode untuk cleanup setelah test selesai (opsional)
	@AfterTestCase
	def tearDown(TestCaseContext testCaseContext) {
		// Cleanup after the test if necessary
	}
}