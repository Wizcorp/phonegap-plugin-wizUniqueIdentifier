
#phonegap-plugin-wizUniqueIdentifier 

 
phonegap version : 2.7  
last update : 13/08/2013  

# Known Issues:
n/a


# Description

PhoneGap plugin for generating a unique identifier and storing it in the device
keychain.  

For iOS - The unique identifier is stored in the device persistently and preserved
across device restarts and app re-installs.  Resetting the device content and settings
will reset the value, however restoring the device from a backup will restore any
previously stored value.

For Android - The unique identifier is stored in the device shared prefs and preserved
for the lifetime of the app on the device.


# Install (iOS)

Project tree  

	www
    	/ phonegap
        	/ plugin
            	/ wizUniqueIdentifier
                	/ wizUniqueIdentifier.js
 	ios
    	/ project
        	/ Plugins
            	/ WizUniqueIdentifier
                	/ WizUniqueIdentifier.h
                	/ WizUniqueIdentifier.m
                	/ KeychainItemWrapper.h
                	/ KeychainItemWrapper.m



1 ) Arrange files to structure seen above.

2 ) Add the framework "Security.framework"

3 ) Add the following line to config.xml in the plugins section;<br />
<plugin name="WizUniqueIdentifier" value="WizUniqueIdentifier" />

4 ) Add ```<script>``` tag to your index.html

```<script type="text/javascript" charset="utf-8" src="phonegap/plugin/wizUniqueIdentifier/wizUniqueIdentifier.js"></script>```

5 ) Follow example code below.

# Install (Android)

Project tree  

	project
    	/ assets
        	/ www
            	/ phonegap
                	/ plugin
                   		/ wizUniqueIdentifier
                       		/ wizUniqueIdentifier.js 

    / src
        / jp 
            / wizcorp 
                / phonegap 
                    / plugins
                        / wizUniqueIdentifier
                            / WizUniqueIdentifier.java

1 ) Arrange files to structure seen above.


2 ) Add the following line to config.xml in the plugins section;

```<plugin name="WizUniqueIdentifier" value="jp.wizcorp.phonegap.plugin.wizUniqueIdentifier.WizUniqueIdentifier" />```

3 ) Add ```<script>``` tag to your index.html

```<script type="text/javascript" charset="utf-8" src="phonegap/plugin/wizUniqueIdentifier/wizUniqueIdentifier.js"></script>```

4 ) Follow example code below.


# Example Code

Retrieving a unique identifier

		window.wizUniqueIdentifier.get(Function success));

* Returns a String on a 128bit unique identifier.

