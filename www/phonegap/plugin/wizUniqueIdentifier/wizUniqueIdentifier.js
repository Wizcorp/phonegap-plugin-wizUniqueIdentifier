/* WizUniqueIdentifier for PhoneGap - 
 *
 * @author Chris Wynn
 * @copyright WizCorp Inc. [ Incorporated Wizards ] 2013
 * @file - wizUniqueIdentifier.js
 * @about - JavaScript PhoneGap bridge for unique identifer
 *
 *
*/

var wizUniqueIdentifier = {
    // get  -- retrieve a unique identifier for a given key (the same identifier
    // will always be returned until the device content and settings is reset)
    get: function(successCallback) {
        return cordova.exec(successCallback, null, "WizUniqueIdentifier", "get", []);
    }
};

