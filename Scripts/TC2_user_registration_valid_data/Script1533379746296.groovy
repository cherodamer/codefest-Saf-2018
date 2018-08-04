import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.masoko.com/customer/account/create/')

WebUI.click(findTestObject('Page_Create New Customer Account/html_var require          base'))

WebUI.click(findTestObject('Page_Create New Customer Account/label_First Name'))

WebUI.setText(findTestObject('Page_Create New Customer Account/input_firstname (1)'), 'Damaris')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Last Name'))

WebUI.setText(findTestObject('Page_Create New Customer Account/input_lastname (1)'), 'Cherono')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_mobile (1)'), '+254727068737')

WebUI.click(findTestObject('Page_Create New Customer Account/label_Email (1)'))

WebUI.setText(findTestObject('Page_Create New Customer Account/input_email (1)'), 'cherodamer07@gmail.com')

WebUI.click(findTestObject('Page_Create New Customer Account/label_Password (1)'))

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_password (1)'), 'sVKe90LGPX+NNhEzez4NuQ==')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Confirm Password'))

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_password_confirmation (1)'), 'sVKe90LGPX+NNhEzez4NuQ==')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Create an Account (1)'))

WebUI.closeBrowser()

WebUI.closeBrowser()

