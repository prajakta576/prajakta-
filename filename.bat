set javaTestProjectPath=C:\Users\Prajakta\workspace\SageSurferDataDrivenFramework
C:
cd %javaTestProjectPath%
set path=C:\Program Files\Java\jdk1.8.0_112\bin
set classpath=%javaTestProjectPath%\bin;%javaTestProjectPath%\Lib\*;

java org.testng.TestNG %javaTestProjectPath%\testng.xml
pause