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


Mobile.startApplication('E:\\Projects\\MTAutomationKatalon\\apk\\MT 4.5.apk', false)
//Click on Skip Ad Manually
if (Mobile.verifyElementVisible(findTestObject('Object Repository/OnboardingElements/TestAdText'), 5, FailureHandling.OPTIONAL)) {
	Mobile.delay(5)
}
if (Mobile.verifyElementVisible(findTestObject('Object Repository/HomeElements/GotItOnSwipeButton'), 5, FailureHandling.OPTIONAL)) {
	if (Mobile.verifyElementVisible(findTestObject('Object Repository/HomeElements/DoNotShowThisDialogAgainCheckBox'), 3, FailureHandling.OPTIONAL)) {
		Mobile.tap(findTestObject('Object Repository/HomeElements/DoNotShowThisDialogAgainCheckBox'), 3)
	}
	Mobile.tap(findTestObject('Object Repository/HomeElements/GotItOnSwipeButton'), 5)
}
Mobile.tap(findTestObject('Object Repository/HomeElements/CategoryButton'), 5)



Mobile.tap(findTestObject('Object Repository/CategoriesElements/AddCategoryButton'), 5)


Mobile.verifyElementVisible(findTestObject('Object Repository/CategoriesElements/SubscribeButtonThatAppearAfterOneCategoryCreated'), 0)
