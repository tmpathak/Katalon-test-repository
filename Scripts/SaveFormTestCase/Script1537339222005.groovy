import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.selectOptionByValue(findTestObject('SaveForm_OR/Page_Execute Automation/select_SelectMr.Ms.'), '1', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SaveForm_OR/Page_Execute Automation/input_Initial_Initial'), 'Pathak')

WebUI.setText(findTestObject('SaveForm_OR/Page_Execute Automation/input__FirstName'), 'Trilok')

WebUI.setText(findTestObject('SaveForm_OR/Page_Execute Automation/input_Middle Name_MiddleName'), 'Manu Bhai.')

WebUI.check(findTestObject('SaveForm_OR/Page_Execute Automation/Page_Execute Automation/input_EnglishHindi_english'))

WebUI.check(findTestObject('SaveForm_OR/Page_Execute Automation/Page_Execute Automation/input_EnglishHindi_Hindi'))

WebUI.click(findTestObject('SaveForm_OR/Page_Execute Automation/input_EnglishHindi_Save'))

