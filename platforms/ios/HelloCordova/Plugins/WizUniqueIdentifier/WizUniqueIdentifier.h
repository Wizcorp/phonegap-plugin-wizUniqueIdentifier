//
//  WizUniqueIdentifier.h
//
//  Created by Chris Wynn on 3/21/13.
//  Copyright (c) 2013 Wizcorp. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>

@interface WizUniqueIdentifier : CDVPlugin

- (void)get:(CDVInvokedUrlCommand*)command;

@end
