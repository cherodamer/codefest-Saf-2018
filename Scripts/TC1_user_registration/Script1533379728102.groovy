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

WebUI.navigateToUrl('https://www.masoko.com/')

WebUI.click(findTestObject('Object Repository/Page_Shop Online in Kenya - Pay Con/span_Register'))

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_firstname'), 'Damaris')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_lastname'), 'Cherono')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_mobile'), '+254746155548')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/label_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_email'), 'cherodamer21@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/div_Password Strength'))

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/div_Password Strength'))

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_password'), 'sVKe90LGPX+NNhEzez4NuQ==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/label_Confirm Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_password_confirmation'), 
    'sVKe90LGPX+NNhEzez4NuQ==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/input_persistent_remember_me'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_email'), 'cherodamer21@gmail')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_email'), 'cherodamer21@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_mobile'), '+254717631972')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_password'), 'sVKe90LGPX+NNhEzez4NuQ==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/label_Confirm Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_password_confirmation'), 
    'sVKe90LGPX+NNhEzez4NuQ==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.closeBrowser()

WebUI.closeBrowser()

