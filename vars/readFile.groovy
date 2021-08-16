def call(String str ) {
	
	def filePath = readFile "${str}"                   
	def lines = filePath.readLines()
      
	for (line in lines) {                                            
                      
                        println "$line"
                        }  
  
 
   
}
