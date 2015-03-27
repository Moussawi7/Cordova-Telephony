# Telephony

> Telephony plugin for Android. This allows you to Obtain Network Operator,Phone Number,Sim Serial Number,Network Country if available otherwise an empty string.

## Installation:

    npm install -g cordova # if you don't have cordova
    cordova create MyProjectFolder com.my.project MyProject && cd MyProjectFolder # if you are just starting
    cordova plugin add https://github.com/Moussawi7/Cordova-Telephony

## Benefits:
This plugin return Network Operator,Phone Number,Sim Serial Number,Network Country if available otherwise an empty string.
	
## Usage
The plugin creates the object window.plugins.Telephony

After onDeviceReady, create a local var and startup the plugin like this;

	function onDeviceReady() {
   	    window.plugins.Telephony.getInfo(function(result){
		//result["NetworkOperator"]="40501";
		//result["PhoneNumber"]="+961000000";
		//result["SimSerialNumber"]="12344567998765";
		//result["NetworkCountry"]="lb";
		},function(e){
			alert(e);//Error Message
		});
	}

## License ##

The MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.