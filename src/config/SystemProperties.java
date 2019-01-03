package config;


public class SystemProperties {
    public static String CHROMEDRIVER_BINARY_PATH = System.getProperty("chromedriverBinaryPath", "src/test/resources/chromedriver.exe").toLowerCase();

    public static String JIRA_ROOT_URL = System.getProperty("jiraRootURL", "https://centricstlbu.atlassian.net").toLowerCase();
    public static String JIRA_USERNAME = System.getProperty("jiraUsername", "kathi.paquet@centricconsulting.com").toLowerCase();
    public static String JIRA_PASSWORD = System.getProperty("jiraPassword", "T@rn0w$k!");
    public static String JIRA_ISSUE_KEYS = System.getProperty("jiraIssueKeys", "CD-10");

    public static String IMPORTED_SCENARIO_DIRECTORY = System.getProperty("importedScenarioDirectory", "target/TestsImportedFromJira");
    public static String CUCUMBER_JSON_REPORT_FILEPATH = System.getProperty("cucumberJsonReportFilepath", "target/cucumber.json");
}