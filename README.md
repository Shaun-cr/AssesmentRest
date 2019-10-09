# Setup
1. Install javav jdk (12.0.1) and set Java path under Environment Variables (Windows)
2. Download Maven(3.6.1) and Set MAVEN_HOME and M2_HOME path under Environment Variables (Windows)
3. In Terminal(CMD) run "mvn clean install" for Maven to download all the plugins and related dependencies if this is your first install. Also "mvn test" to get surefire-reports dependencies.
4. I used Eclipse for this project on Windows 10
5. I have installed TestNG Plugin and GIT Plugin for eclipse (Help - Install New Software)
(TestNG P2 - http://dl.bintray.com/testng-team/testng-p2-release)
(egit - http://download.eclipse.org/egit/updates)
6. On this project I did a Maven Project Update for to fecth all dependancies for the pom.xml file

#Run Test Via Command Line
1. Open CMD in Windows
2. Navigate to you project folder  (Use cd command)
3. Run all the unit test classes: 
"$ mvn test"
4. Run a single test class: 
"$ mvn -Dtest=Test_GetAlbums test"
5. Run a single test method from a test class: 
"$ mvn -Dtest=Test_GetAlbums#testIsReturningARequest test"

#View Test Results
1. To view test results run through cmd(terminal). Under your project folder, go to "target/surefire/reports", view emailable-report . I liked the "Surefire test.html" report more under "target/surefire/reports/surefire suite"

#Assumptions
1. Only automate three routes /posts,/albums, /users. I also assumed that this for 2 GETS and 1 POST

#Approach 
1. I used Rest-Assured plugin to apply a BDD (Behaviour Driven Development) approach , with TestNG framework

#Other
1. I did include a Test_BasicLoadTest and an alternative way to add a record namely TestAddRecordAlternative. This alternative way will be able to do a bit more reporting as you can expand on it

#Maven Trouble Shooting
If Maven is giving problems try the following
1. "mvn clean install" and then "mvn test"
2. On your ide try Maven Update and then Run Maven Test