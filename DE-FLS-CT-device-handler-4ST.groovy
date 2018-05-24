/*
* 
*  Dresden adjustable color temperature (CW/WW) LED ballast 
* 

* 
*/
metadata { // Automatically generated. Make future change here. 
definition (name: "DE FLS-CT", namespace: "dresden-electronic-FLS-CT", author: "") {  
capability "Switch Level"  
capability "Actuator"  
capability "Color Control"  
capability "Switch"  
capability "Configuration"  
capability "Polling"  
capability "Refresh"  
capability "Sensor" 

command "setWhiteLevel"        
command "whiteOn"        
command "whiteOff"               
command "setAdjustedColor"        
command "startLoop"        
command "stopLoop"        
command "setLoopTime"        
command "setDirection"               
command "alert"        
command "toggle"                

