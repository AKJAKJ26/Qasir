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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.qasir.id/sign-in')

WebUI.setText(findTestObject('Object Qasir Profile/Page_Masuk/Input Nomor Telepon'), '85697961517')

WebUI.setText(findTestObject('Object Qasir Profile/Page_Masuk/Input Pin'), '260192')

WebUI.click(findTestObject('Object Qasir Profile/Page_Masuk/Button Masuk'))

WebUI.click(findTestObject('Object Qasir Profile/Page_Masuk/Page_Masuk/Pilih Toko Adit Test'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Qasir Profile/Page_Outlet/Menu Outlet'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Qasir Profile/Page_Outlet/Button Tambah Outlet'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Input Nama'), 'Test Nama New')

WebUI.setText(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Input Nomor Telepon'), '087812341233')

WebUI.setText(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Input Alamat'), 'Binong Permai New')

WebUI.click(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Pilih Kelurahan'))

WebUI.setText(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Search Kelurahan'), 'Binong')

WebUI.click(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Pilih Binong'))

WebUI.uploadFile(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Pilih Gambar'), 'D:\\\\test-photo.jpg')

WebUI.click(findTestObject('Object Qasir Profile/Page_Tambah Outlet/Button Simpan'))

