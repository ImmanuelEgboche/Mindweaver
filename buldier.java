//getChars()=This method copies a substring of a StringBuffer object into a character array specified by char
		  StringBuffer sb = new StringBuffer("Java Programming");
		  System.out.println("Original StringBuffer: " + sb);
		  char c[] = new char[9];
		  sb.getChars(0, 8, c, 0);
		  System.out.println("Contents of charcter array ....");
		  for(int i=0 ; i<c.length;i++) {
			  System.out.print(c[i]+"");
		  }
		  //insert =Java StringBuffer class provides insert() method that inserts a string representation of all simple data types plus String, Object,
		  //and CharSequence into invoking StringBuffer object.
		  StringBuffer sbb = new StringBuffer("I Java Programming");
		  System.out.println(" Original String before inserting = "+sbb);
		  sbb.insert(2, "Like");
		  System.out.println(" After inserting => "+sbb);
		  
		  //indexOf() 
		  StringBuffer s5 = new StringBuffer("I am a Java Programmer and have fifteen year of exp ");
		 
		  
  System.out.println("Original string = "+s5);
		  int i ;
		  i=s5.indexOf("fifteen", 77);
		  System.out.println(" Index of fifteen = "+i);
		  
		  //reverse()
		  StringBuffer s1 = new StringBuffer("Welcome to simplilearn ");
		  System.out.println(" reverse string = "+sb2.reverse());
		  System.out.println(" Replace hello to Hi : "+s1.replace(8, 10, "in"));
	

 System.out.println("I print number between 1 and 10");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println(" Enter " + n + " different numbers");
        int total =0;
        for(int i=0 ;i<n ;i++) {
            nums[i]=sc.nextInt();
            total+=nums[i];
        }
        float average = total/n;
        System.out.println(" Total: "+total);
        System.out.println(" Average: " + average);

