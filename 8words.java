BufferedReader br = new BufferedReader(new FileReader("4words.txt"));
BufferedWriter writer = new BufferedWriter(new FileWriter("8words.txt"));
try {
    String firstLine = br.readLine();
	int x = length(firstline);
	String appendLine = firstline;
	
    for (i=0; firstline!= NULL; i++)
	{
	  for (j=0; appendLine!= NULL; j++)
		 x = length(firstLine);
		 if (x==4)
		 {
		    String y = appendLine;
			appendLine=appendLine+firstLine;
			writer.write(appendLine);
			appendLine=y;
			firstLine = br.readLine();
			j++;
		 }
	  firstLine = br.readLine();
	  appendLine = firstLine;
	  i++;
	  
	}

} finally {
    br.close();
	writer.close();
}
