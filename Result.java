class Result {
 /*
 * Complete the 'anagram' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */
 public static int anagram(String s) {
 // Write your code here
 int count = 0;
 if(s.length()%2 !=0){
 return -1;
 }
 int mid = s.length()/2;
 List<Character> myList = new ArrayList<>();
 for(int i = mid;i<s.length();i++){
 myList.add(s.charAt(i));
 }

 for(int is = 0;is<mid;is++){
 char mychar = s.charAt(is);
 int index = myList.indexOf(mychar);
 if(myList.contains(mychar)){
 myList.remove(index);
 }else{
 count++;
 }
 }

 return count;
 }
}
