
# PLUGIN: 

phonegap-plugin-wizUniqueIdentifier<br />
version : 1.9<br />
last update : 21/03/2013<br />


# CHANGELOG: 
- Initial version.


# KNOWN ISSUES:
- None.


# DESCRIPTION :

PhoneGap plugin for generating a unique identifier and storing it in the device
keychain.  The unique identifier is stored in the device persistently and preserved
across device restarts and app re-installs.  Resetting the device content and settings
willl reset the value, however restoring the device from a backup will restore any
previously stored value.


# INSTALL (iOS): #

Project tree<br />

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

3 ) Add to Cordova.plist in the plugins array:<br />
- Key : wizUniqueIdentifier<br />
- Type : String<br />
- Value : wizUniqueIdentifier<br />

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

