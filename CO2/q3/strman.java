package opsproj;

public class strmanipulation {
		public static void main(String[] args) {			
			  //String Manipulations
			    String s1="java";
			    String s2="programming";
			    System.out.println("First string:"+s1+"\nSecond string:"+s2);
			  //Length of a String
			    int length1=s1.length();
				System.out.println("Length of First string: "+length1);
				int length2=s2.length();
				System.out.println("Length of Second string: "+length2);
				String s3=s1.concat(s2);
				System.out.println(s3);
				System.out.println(s1.isEmpty());
				System.out.println(s1.toLowerCase());
				System.out.println(s2.toUpperCase());
				System.out.println(s2.endsWith("ing"));
				System.out.println(s2.indexOf('n'));
				System.out.println(s1.charAt(2));
				System.out.println(s3.replace("java","object oriented"));

				
				}

			}
			