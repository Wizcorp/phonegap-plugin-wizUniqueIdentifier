//
//  WizUniqueIdentifier.h
//  exampleWizUniqueIdentifier
//
//  Created by Chris Wynn on 3/21/13.
//  Copyright (c) 2013 Wizcorp. All rights reserved.
//

#import <Foundation/Foundation.h>
#ifdef CORDOVA_FRAMEWORK
#import <Cordova/CDVPlugin.h>
#else
#import "CDVPlugin.h"
#endif

@interface WizUniqueIdentifier : CDVPlugin

- (void)get:(NSMutableArray *)arguments withDict:(NSMutableDictionary *)options;

@end
