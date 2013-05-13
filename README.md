
# PLUGIN: 

phonegap-plugin-wizUniqueIdentifier  
version : 2.6
last update : 13/05/2013  


# CHANGELOG: 
- Updated to Cordova 2.6
- Updated to Cordova 2.5
- Updated to Cordova 2.4
- Updated to Cordova 2.3
- Initial version.


# KNOWN ISSUES:


# DESCRIPTION :

PhoneGap plugin for generating a unique identifier and storing it in the device
keychain.  The unique identifier is stored in the device persistently and preserved
across device restarts and app re-installs.  Resetting the device content and settings
willl reset the value, however restoring the device from a backup will restore any
previously stored value.


# INSTALL (iOS): #

Project tree  

<pre><code>
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

</code></pre>

1 ) Arrange files to structure seen above.

2 ) Add the framework "Security.framework"

3 ) Add the following line to config.xml in the plugins section;<br />
<plugin name="WizUniqueIdentifier" value="WizUniqueIdentifier" />

4 ) Add \<script\> tag to your index.html<br />
- \<script type="text/javascript" charset="utf-8"
  src="phonegap/plugin/wizUniqueIdentifier/wizUniqueIdentifier.js"\>\</script\><br />

5 ) Follow example code below.

# EXAMPLE CODE : #

Retrieving a unique identifier<br />
<pre><code>
window.wizUniqueIdentifier.get(Function success));

* Retrieves a unique identifier.  The unique identifier is generated the first
* time this method is called.  The unique identifier is stored in the device
* persistently and preserved across device restarts and app re-installs.
* Resetting the device content and settings willl reset the value, however
* restoring the device from a backup will restore any previously stored values.

</code></pre>

