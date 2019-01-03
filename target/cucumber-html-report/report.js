$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("URLpage.feature");
formatter.feature({
  "line": 2,
  "name": "Un-publish HELOAN 192,204,216,228 month terms (UAT)",
  "description": "",
  "id": "un-publish-heloan-192,204,216,228-month-terms-(uat)",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@REQ_CD-1"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#As a client viewing the Loan Rates Marketing Page, I do not want to see the terms for 192 months, 204 months, 216 months and 228 months."
    },
    {
      "line": 5,
      "value": "#Tests As a client viewing the Loan Rates Marketing Page, I do not want to see the terms for 192 months, 204 months, 216 months and 228 months."
    }
  ],
  "line": 8,
  "name": "Cucumber: Test URL",
  "description": "",
  "id": "un-publish-heloan-192,204,216,228-month-terms-(uat);cucumber:-test-url",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@TEST_CD-4"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I open Homepage and I search for pillows",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the page title is as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_URLpage.i_launch_Chrome_browser()"
});
formatter.result({
  "duration": 1846353321,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_URLpage.i_open_URL()"
});
formatter.result({
  "duration": 9545731006,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_URLpage.the_page_title_is_as_expected()"
});
formatter.result({
  "duration": 100063029,
  "status": "passed"
});
formatter.after({
  "duration": 139339190,
  "status": "passed"
});
});