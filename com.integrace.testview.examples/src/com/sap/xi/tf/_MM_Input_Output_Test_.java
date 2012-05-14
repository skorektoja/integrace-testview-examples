/*
* File created from Enterprise Services Repository
 * Mon, 14 May 2012 14:39:44 BST
 * User: pidev
 */
package com.sap.xi.tf;

// beginning of import 93473a7344419b15c4219cc2b6c64c6f
import com.sap.aii.mapping.api.*;
import com.sap.aii.mapping.lookup.*;
import com.sap.aii.mappingtool.tf7.rt.*;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
// end of import 93473a7344419b15c4219cc2b6c64c6f

/**
 * Class encapsulates the user-defined functions of the message mapping MM_Input_Output_Test 
 * from namespace http://www.integrace.co.uk/testview/ in software component version 
 * TESTVIEW
 * <p>
 * Enter the source text between '// beginning of [function or section name] [GUID]' 
 * and '// end of [function or section name] [GUID]' (example: '// beginning of cleanUp 
 * 7e26d344ee3a9ad7648ebff5b3eb58' and '// end of cleanUp 7e26d344ee3a9ad7648ebff5b3eb58'); 
 * only this section will be included in the import
 * </p>
 * <p>
 * The Java documentation for the classes GlobalContainer, Container, ResultList 
 * are located in SAP NetWeaver Developer Studio under menu option Help > Help Contents 
 * > SAP NetWeaver CE Developer Studio Documentation >API Reference > SAP NetWeaver 
 * 7.10 for Process Integration > com.sap.aii.mappingtool.tf7.rt
 * </p>
 * <p>
 * If you use other Java archives in addition to the exported Java archives, you 
 * must import them to the Enterprise Services Repository as imported archives and 
 * enter them in the function library editor as used archives. Create the imported 
 * archives in the software component version of the function library or in an underlying 
 * software component version. The JARs of the logging API, the JCo JAR, and the 
 * SAP XML toolkit JAR are exceptions: they do not need to be imported to the Enterprise 
 * Services Repository.
 * </p>
 * <p>
 * Java mapping programs (user-defined functions and imported archives) must not 
 * be stateful. For example, during a Java mapping, they cannot write data to a database 
 * table. The Integration Server cannot follow such side effects, and if an attempt 
 * is made to resend a message not yet accepted by the receiver, it is possible that 
 * write-to database accesses during a Java mapping may be executed more than once.
 * </p>
 * <p>
 * The Java mapping programs must be J2EE-compatible; in particular, the same restrictions 
 * apply as for Enterprise Java Beans (see paragraph 25.1.2 of the EJB 2.1 specification). 
 * For example, you cannot do the following: load a JDBC driver and use it directly 
 * (instead use the lookup API), use a classloader, create or use threads, use network 
 * sockets, or read or write files to or from the file system.
 * </p>
 * <p>
 * Source Text Must Be Compatible with Java Version 1.5
 * </p>
 * <p>
 * File is coded in UTF-8. File can only be correctly imported by using UTF-8 coding
 */
public class _MM_Input_Output_Test_{
// beginning of attributes and methods 72418d956989a1e71aecbea9d5a90ecf

// end of attributes and methods 72418d956989a1e71aecbea9d5a90ecf



  public void init(GlobalContainer container) throws StreamTransformationException{
  // beginning of init f2bfdf97b7d432d057584464aabdb643

  // end of init f2bfdf97b7d432d057584464aabdb643
  }


  public void SafeConcat(String[] a, String[] b, ResultList result, Container container) throws StreamTransformationException{
  // beginning of SafeConcat de8742f31957a013012b6fbbf1358f65

	  int maxLength = a.length>b.length?a.length:b.length;
	  for (int i=0; i<maxLength;i++){
		  String vA = a.length>i?a[i]:"";
		  String vB = b.length>i?b[i]:"";
		  result.addValue(vA+vB);
	  }
	  
  // end of SafeConcat de8742f31957a013012b6fbbf1358f65
  }


  public void cleanUp(GlobalContainer container) throws StreamTransformationException{
  // beginning of cleanUp 7e26d344ee3a9ad7648ebff5b3eb584b
  
  // end of cleanUp 7e26d344ee3a9ad7648ebff5b3eb584b
  }
}