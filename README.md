# DwelloChallenge


Question 1.

To solve this challenge, write an HTTP GET method to retrieve information from a movie database.
 
Complete the function getMovieTitles in the editor. 
 
Function Description
Given a string substr, getMovieTitles must perform the following tasks:
Query https://jsonmock.hackerrank.com/api/movies/search/?Title=substr(replace substr). 
Initialize the titles array to store total string elements. Store the Title of each movie meeting the search criterion in the titles array.
Sort titles in ascending order and return it as your answer.
 
The query response from the website is a JSON response with the following five fields:
page: The current page.
per_page: The maximum number of results per page.
total: The total number of movies in the search result.
total_pages: The total number of pages which must be queried to get all the results.
data: An array of JSON objects containing movie information where the Title field denotes the title of the movie.
 
In order to get all results, you may have to make multiple page requests. To request a page by number, your query should read https://jsonmock.hackerrank.com/api/movies/search/?Title=substr&page=pageNumber, replacing substr and pageNumber.
Input from stdin will be processed as follows and passed to the function.
 
A single string, substr, denoting the substring you must query for.











Question 2

A company stores the information of employees and departments in two data tables: Employee and Department. Write a query to print the respective department name and number of employees in each department for all departments in the Department table (even ones with no current employees). Sort the results by descending order of the number of employees; if two or more departments have the same number of employees, then sort those departments alphabetically by department name.
 
Input Format


 
Output Format
Each row must contain the following respective attributes for a department:
The name of the department.
The number of employees in the department.
DEPARTMENT.NAME COUNT_OF_EMPLOYEES_IN_THE_DEPARTMENT
Sort the results by descending order of the number of employees; if two or more departments contain the same number of employees, then sort those departments alphabetically by name.
 
Sample Input


 
Sample Output
Executive 2
Technical 2
Production 1
Management 0
Resources 0
 
Explanation
Candice with id 1, is in the department with dept_id 1, i.e., Executive.
Julia with id 2, is in the department with dept_id  2, i.e., Production.
Bob with id 3, is in the department with dept_id  4, i.e., Technical. 
Scarlet with id 4, is in the department with dept_id 1, i.e., Executive.
Ileana with id 5, is in the department with dept_id  4, i.e., Technical. 
So, we have two employees in Executive, two in Technical, one in Production, zero in Management, and zero in Resources department. Also, the result is sorted based on the criteria mentioned above: Executive, Technical, Production, Management and Resources.

























Question 3

We define the following:
 
There are friends_nodes friends numbered from 1 to friends_nodes.
There are friends_edges pairs of friends, where each (xi, yi) pair of friends is connected by a shared integer token described by friends_weighti.
Any two friends, xi and yi, can be connected by zero or more tokens because if friends xi and yi share token ti and friends yi and zi also share token ti, then xi and zi are also said to share token ti.
 
Find the maximal product of xi and yi for any directly or indirectly connected (xi, yi) pair of friends such that xi and yi share the maximal number of tokens with each other.
 
Complete the maxTokens function in the editor. It has four parameters:
 

 
The function must return an integer denoting the maximal product of xi and yi such that xi and yi are a pair of friends that share the maximal number of tokens with each other.
 
Input Format
The first line contains two space-separated integers describing the respective values of friends_nodes and friends_edges.
Each line i of the friends_edges subsequent lines (where 0 ≤ i < friends_edges) contains three space-separated integers describing the respective values of friends_fromi, friends_toi, and friends_weighti.
 
Constraints
 
2 ≤ friends_nodes ≤ 100
1 ≤ friends_edges ≤ min(200, (friends_nodes × (friends_nodes − 1)) / 2)
1 ≤ friends_weighti ≤ 100
1 ≤ friends_fromi, friends_toi ≤ friends_nodes
1≤ friends_weighti ≤ friends_edges
friends_fromi ≠ friends_toi
Each pair of friends can be connected by zero or more types of tokens.
 
Output Format
Return an integer denoting the maximal product of xi and yi such that xi and yi are a pair of friends that share the maximal number of tokens with each other.
 
Sample Input 0
4 5
1 2 1
1 2 2
2 3 1
2 3 3
2 4 3
 
Sample Output 0
6
 
Explanation 0


Question 4

We consider a string consisting of one or more lowercase English alphabetic letters ([a-z]), digits ([0-9]), colons (:), forward slashes (/), and backward slashes (\) to be adorable if the following conditions are satisfied:
The first letter of the string is a lowercase English letter.
Next, it contains a sequence of zero or more of the following characters: lowercase English letters, digits, and colons.
Next, it contains a forward slash.
Next, it contains a sequence of one or more of the following characters: lowercase English letters and digits.
Next, it contains a backward slash.
Next, it contains a sequence of one or more lowercase English letters.
 
Given some string, s, we define the following:
s[i..j] is a substring consisting of all the characters in the inclusive range between index i and index j (i.e., s[i], s[i + 1], s[i + 2], …, s[j]).
Two substrings, s[i1..j1] and s[i2..j2], are said to be distinct if either i1 ≠ i2 or j1 ≠ j2.
 
Complete the adorableCount function in the editor below. It has one parameter: an array of n strings, words. The function must return an array of n positive integers where the value at each index i denotes the total number of distinct, adorable substrings in wordsi.
 
Input Format
Locked stub code in the editor reads the following input from stdin and passes it to the function:
The first line contains an integer, n, denoting the number of elements in words.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains a string describing wordsi.
 
Constraints
1 ≤ n ≤ 50
Each wordsi consists of one or more of the following characters: lowercase English alphabetic letters ([a-z]), digits ([0-9]), colons (:), forward slashes (/), and backward slashes (\) only.
The length of each wordsi is no more than 5 × 105.
 
Output Format
The function must return an array of n positive integers where the integer at each index i denotes the total number of distinct, adorable substrings in wordsi. This is printed to stdout by locked stub code in the editor.
 
Sample Input 0
6
w\\//a/b
w\\//a\b
w\\/a\b
w:://a\b
w::/a\b
w:/a\bc::/12\xyz
 
Sample Output 0
0
0
0
0
1
8
 
Explanation 0
Let's call our return array ret. We fill ret as follows:
word = "w\\//a/b" has no adorable substring, so ret[0] = 0.
word = "w\\//a\b" has no adorable substring, so ret[1] = 0.
word = "w\\/a\b" has no adorable substring, so ret[2] = 0.
word = "w:://a\b" has no adorable substring, so ret[3] = 0.
word = "w::/a\b" has one adorable substring, word[0..6] = "w::/a\b", so ret[4] = 1.
word = "w:/a\bc::/12\xyz" has the following eight adorable substrings:
word[0..5] = w:/a\b
word[0..6] = w:/a\bc
word[5..13] = bc::/12\x
word[5..14] = bc::/12\xy
word[5..15] = bc::/12\xyz
word[6..13] = c::/12\x
word[6..14] = c::/12\xy
word[6..15] = c::/12\xyz
This means ret[5] = 8.
 
We then return ret = [0, 0, 0, 0, 1, 8].

Question 5

IPv4 was the first publicly used Internet Protocol. It used 4-byte addresses and permitted 232 distinct values. The typical format for an IPv4 address is A.B.C.D where A, B, C, and Dare integers in the inclusive range between 0 and 255.
 
IPv6, with 128 bits, was developed to permit the expansion of the address space. These addresses are represented by eight colon-separated sixteen-bit groups, where each sixteen-bit group is written using 1 to 4 hexadecimal digits. Leading zeroes in a section are often omitted from an address, meaning that the groups 0 is identical to 0000 and group 5 is identical to 0005. Some examples of valid IPv6 addresses are 2001:0db8:0000:0000:0000:ff00:0042:8329 and 3:0db8:0:01:F:ff0:0042:8329.
 
Given n strings of text that may or may not be valid Internet Protocol (IP) addresses, we want to determine whether each string of text is:
An IPv4 address.
An IPv6 address.
Neither an IPv6 address nor an IPv4 address.
 
Complete the checkIPs function in the editor below. It has one parameter: an array of strings, ip_array, where each element i denotes a string of text to be checked. It must return an array of strings where each element i contains the answer for ipi; each answer must be whichever of the following case-sensitive terms is appropriate:
IPv4 if the string is a valid IPv4 address.
IPv6 if the string is a valid IPv6 address.
Neither if the string is not a valid IPv4 or IPv6 address.
 
Input Format
Locked stub code in the editor reads the following input from stdin and passes it to the function:
The first line contains an integer, n, denoting the number of elements in ip_array.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains a string describing ipi.
 
Constraints
1 ≤ n ≤ 50
1 ≤ ipi ≤ 500
It is guaranteed that any string containing a valid IPv4 or IPv6 address has no leading or trailing whitespace.
 
Output Format
The function must return an array of strings where each element i contains the string IPv4, IPv6, or Neither, denoting that ipi was an IPv4 address, an IPv6 address, or Neither(i.e., not an address at all). This is printed to stdout by locked stub code in the editor.
 
Sample Input 0
2
This line has junk text.
121.18.19.20
 
Sample Output 0
Neither    
IPv4 
 
Explanation 0
We must check the following n = 2 strings:
ip0 = "This line has junk text." is not a valid IPv4 or IPv6 address, so we return Neither in index 0 of our return array.
ip1 = "121.18.19.20" is a valid IPv4 address, so we return IPv4 in index 1 of our return array.
 
Sample Input 1
1
2001:0db8:0000:0000:0000:ff00:0042:8329
 
Sample Output 1
IPv6
 
Explanation 1
We only have n = 1 value to check. Because ip0 = "2001:0db8:0000:0000:0000:ff00:0042:8329" is a valid IPv6 address, we return IPv6 in index 0 of our return array.
