#!/usr/bin/env groovy

def call(String str ) {
	
	def filePath = readFile "${str}"                   
	def lines = filePath.readLines()
      
	for (line in linesbyline) {                                            
                      
                        println "$line"
                        }  
  
 
   
}
