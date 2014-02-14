# phonegap-plugin-wizUniqueIdentifier 

phonegap version : 3.0  
last update : 13/02/2014  

# Description

PhoneGap plugin for generating a unique identifier and storing it in the device
keychain.  

For iOS - The unique identifier is stored in the device persistently and preserved
across device restarts and app re-installs.  Resetting the device content and settings
will reset the value, however restoring the device from a backup will restore any
previously stored value.

For Android - The unique identifier is stored in the device shared prefs and preserved
for the lifetime of the app on the device.

## Install (with Plugman - example iOS) 

	cordova plugin add https://github.com/Wizcorp/phonegap-plugin-wizUniqueIdentifier
	cordova build ios
	
	< or >
	
	phonegap local plugin add https://github.com/Wizcorp/phonegap-plugin-wizUniqueIdentifier
	phonegap build ios

# Example Code

Retrieving a unique identifier

		window.wizUniqueIdentifier.get(Function success));

* Returns a 128bit String unique identifier.

