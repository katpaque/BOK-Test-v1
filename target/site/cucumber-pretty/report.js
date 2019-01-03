$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/features/Searchpage.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Search",
  "description": "",
  "id": "validate-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@REQ_CD-3"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Cucumber: Test Search",
  "description": "",
  "id": "validate-search;cucumber:-test-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TEST_CD-40"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch Chrome browser for bank",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I open Homepage and I search for bank",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the page Search title is as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_Searchpage.i_launch_Chrome_browser_for_bank()"
});
formatter.result({
  "duration": 1814929438,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_Searchpage.i_open_Homepage_and_I_search_for_bank()"
});
formatter.result({
  "duration": 36081995579,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Search\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.43.600229 (3fae4d0cda5334b4f533bede5a4787f7b832d052),platform\u003dMac OS X 10.14.1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:13:22.693Z\u0027\nSystem info: host: \u0027KATHIs-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:43a:ca44:9600:908f%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.1\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600229 (3fae4d0cda5334..., userDataDir: /var/folders/gr/th04b2k93zj...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:57256}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 7afae47c0be8ff43762aeed5dc13147e\n*** Element info: {Using\u003dlink text, value\u003dSearch}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:376)\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat seleniumPages.Search_URL_Page.openURL(Search_URL_Page.java:47)\n\tat stepDefinitions.StepDefs_Searchpage.i_open_Homepage_and_I_search_for_bank(StepDefs_Searchpage.java:21)\n\tat ✽.When I open Homepage and I search for bank(resources/features/Searchpage.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefs_Searchpage.the_page_Search_title_is_as_expected()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 120923884,
  "status": "passed"
});
formatter.after({
  "duration": 31645,
  "status": "passed"
});
});