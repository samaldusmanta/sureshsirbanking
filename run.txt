set projectLocation=G:\MyWorkSpace\001_Bank_Fwk
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml