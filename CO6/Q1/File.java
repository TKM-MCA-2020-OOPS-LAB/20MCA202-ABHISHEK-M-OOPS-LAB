package co5;
import java.io.File;
class File {
   public static void main(String[] args) {
File file = new File("C:\\Users\\User\\Desktop\\OOPS");
 String[] fileList = file.list();
  for(String str: fileList) {
  System.out.println(str);
}
}
}