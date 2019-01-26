Package turtolials.java.oca;
// a package uniquely qualifies the class name
// Default / Convention for naming packages: own domain - precede the package name
// for example: com.cocacola.accounting
// 
// import
// 
// import java.lang.arrays;
public class FirstClass {
		
		public static void main (String [] args){
		
		System.out.println("First turtolial ");
		
		}
		
		    // identifiers
        // give 'things' in programs a name
        // 
        
        // Syntax-rules
        //  character classes (Unicode, utf-8)
        //      1. letters   cola
        //      2. Ziffern
        //      3. connection '_'
        //      4. currency sign
        //  limitations
        //      NO digit as the first character 1cola   2user
        //      KEINE reservierten Schlüsselwörter   go else for 
        //      Identifiers are case-sensitive    int a; int A;
        
        
// int € uro;
// int 3d; // no number at the beginning
// int diesel, normal, great; // no reserved words
// int number, Number, NUMBER; // these are three different identifiers
        
        // who uses national special characters outet as a beginner !!!
  //       int Österreich;          // ==> ASCII-7 (a-z, A-Z, 0-9, _, $)
        
//        int #hashtag;                         // other special characters are invalid

 // Identifiers Conventions  
        //      ClassName             UpperCamelCase      FirstClass 
        //      variableName           lowerCamelCase	  firstClass 
        //      methodeName()          lowerCamelCase()   convertTo
        //      KONSTANT_NAME         UPPER_CASE             TAX
        //      packagename             lowercase     turtolias.java.oca
        //      T                       Typ-Variable generic   
		
		   // JavaBeans-Standard
        //    Getter/Setter
        //      Getter:     PropertyType getProperty()
        //                  boolean isProperty()
        //      Setter:     void setProperty(Propertype property)
        //
        //    Listener
        //                  addXxxListener(XxxListener)
        //                  removeXxxListener(XxxListener)
        //    z.B. ActionListener
        //                  addActionListener(ActionListener)
        //                  removeActionListener(ActionListener)
        
        
        // 
        // Identifier standards: z.B. JavaBeans-Standard
        // 
		
		 // Variable / Methode haben a Datatype
        
        // 
        // Datantype
        // 
        
        // primitive / elementary Datatype
        //  byte        1 Byte          -128    to     127  each byte is 8 bit and each be could be 1 or 0 be 
        //  short       2 Byte          -32T    to     32T
        //  int           4 Byte          -2Mrd   to     2Mrd
        //  long        8 Byte          -9Trl   to     9Trl
        //  float        4 Byte          ca. 40 set
        //  double    8 Byte          ca. 300 set
        //  char        2 Byte          \u0000    bis     \uffff
        //  boolean                            true,                false
        
        // Reference types / all classes (interfaces, enums) are reference types
        //  String
        //  Date
        //  Icon
        //  ...
        //  FirstClass
        
        final String str;
        str = "initialization - OK";
//        str = "reassignment - NO"; 
//  In this particular case no why because it s final 
        
        FirstClass fc;
        
        // Declarations / assignments
        
// int i; 			// declaration of ONE variable
// int k, l, m; 		// Declaration of MULTIPLE variables of the same types
// int x = 42; 		// declaration and assignment in ONE statement
// int y = 11, z = 12;
        
// x = 99;                     // What is an expression / expression?
// x = 5 + 4;  // An expression returns a value and has a defined type!
        
//        x = "Text"; // type-mismatch
        
//        byte i; int i;
// Each variable identifier can only be used once in the current context

}