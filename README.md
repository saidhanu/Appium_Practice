# Steps to set up Appium on windows machine
1. Download Java
2. Download Android studio and copy Android SDK path
3. Download Node js --- Appium server built on node js
4. Set (Java,Android SDK & Node) Home paths in windows system variables.
      - JAVA_HOME ----C:\Program Files\Java\jre-1.8
      - ANDROID_HOME----C:\Users\HP\AppData\Local\Android\Sdk
      - NODE_HOME-------C:\Program Files\nodejs
5. Edit path variable and add 
      - C:\Users\HP\AppData\Local\Android\Sdk\tools
      - C:\Users\HP\AppData\Local\Android\Sdk\tools\bin
      - C:\Users\HP\AppData\Local\Android\Sdk\platform-tools
      - C:\Program Files\nodejs\node_modules\npm\bin
      - C:\Program Files\nodejs\
6. Open Android Studio and configure Emulator(If you face any probelm check HYPER -V is enabled or not in your machine--reference YOU TUBE)
7. Download APPIUM SERVER, UIAUTOMATOR2 globally from CMD(HOW to do it --Get commands from Google) and start appium server
8. Install IDE example Ecllipse and create Maven project -- maven-quickstart ---1.4 version
9. Add Java-client and TestNg jars(for test Ng framework)
10. Add TestNg plugin from Ecllipse market place.
11. Clone the repo,start the emulator and run the test
12. If Appium server not starts programmetically comment the code and start it manually to verify.
