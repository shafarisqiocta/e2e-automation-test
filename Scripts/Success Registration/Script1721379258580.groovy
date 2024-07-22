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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.click(findTestObject('Object Repository/registrasi/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/registrasi/input_nama toko_name'), nama_toko)

WebUI.setText(findTestObject('Object Repository/registrasi/input_email_email'), 'risqishafa@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/registrasi/input_password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/registrasi/button_password_chakra-button css-1t6k0fn'))

WebUI.setText(findTestObject('Object Repository/registrasi/input_password_password_1'), 'test123')

WebUI.click(findTestObject('Object Repository/registrasi/button_daftar'))

WebUI.click(findTestObject('Object Repository/registrasi/div_Toko berhasil didaftarkananda dapat men_b3a8bd'))

