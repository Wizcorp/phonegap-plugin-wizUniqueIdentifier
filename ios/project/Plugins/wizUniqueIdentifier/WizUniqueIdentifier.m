//
//  WizUniqueIdentifier.m
//  exampleWizUniqueIdentifier
//
//  Created by Chris Wynn on 3/21/13.
//  Copyright (c) 2013 Wizcorp. All rights reserved.
//

#import "WizUniqueIdentifier.h"
#import "KeychainItemWrapper.h"

@implementation WizUniqueIdentifier

-(void)get:(NSMutableArray *)arguments withDict:(NSMutableDictionary *)options
{
    NSString *callbackId = [arguments objectAtIndex:0];
    
    // Read the unique identifier from the keychain.
    KeychainItemWrapper *wrapper = [[KeychainItemWrapper alloc] initWithIdentifier:@"WizUniqueIdentifier" accessGroup:nil];
    NSString *uniqueId = [wrapper objectForKey:kSecAttrAccount];
    
    // If no identifier has ever been set, generate one and store it in the keychain.
    if ( [uniqueId isEqualToString:@""] ) {
        CFUUIDRef theUUID = CFUUIDCreate(NULL);
        CFStringRef string = CFUUIDCreateString(NULL, theUUID);
        [wrapper setObject:(NSString *)string forKey:kSecAttrAccount];
        CFRelease(string);
        CFRelease(theUUID);
        uniqueId = [wrapper objectForKey:kSecAttrAccount];
    }

    // Return the result
    CDVPluginResult *pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:uniqueId];
    [self writeJavascript: [pluginResult toSuccessCallbackString:callbackId]];
}

@end
