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





Microsoft Blockchain - Virtual Workshop
from Monday, February 4, 2019, to Tuesday, February 5, 2019 | 7:30 pm India Time (GMT+05:30) | 2 hours  

Meeting number: 579 219 039

Meeting password: Tcs@123

To join meeting: Click Here

OR Copy and Paste below URL to your Web Browser:

https://tcs2.webex.com/tcs2/j.php?MTID=m94c60ecb48e08b3766df71086c9204c9

Bridge Details:-
Participant Pin 	 312 846 6372#
Moderator Pin 	 

Features for Moderator
  
•	*96 Mute participant line 
•	*97 to Un-Mute participant line 
•	 #0 Operator Assistance 
Features for Participants
  
•	#0 Operator Assistance  
•	*6 Mute/Un-Mute 
•	
Dial in Access Numbers- 
•	
INTERNATIONAL TOLL FREE AND LOCAL PHONE NUMBERS

   Canada, Toronto  :	+1 647 426 0816
   Argentina, Buenos Aires  :	+54 11 525 28751
   Argentina (toll free)  :	0800 444 7271
   Australia, Sydney  :	+61 (0)2 9037 1689
   Australia (toll free)  :	1800 986 271
   Austria (toll free)  :	0800 297 242
   Bahrain, Manama  :	+973 1619 8600
   Bahrain (toll free)  :	8000 4776
   Belgium, Brussels  :	+32 (0)2 894 8329
   Belgium (toll free)  :	0800 77524
   Bolivia (toll free)  :	800 100 946
   Brazil, Rio de Janeiro  :	+55 21 2730 6909
   Brazil (toll free)  :	0800 892 2388
   Brunei (toll free)  :	801 4053
   Bulgaria (toll free)  :	00800 117 1199
   Canada (toll free)  :	1855 655 7062
   Chile, Santiago  :	+56 (0)2 599 4584
   Chile (toll free)  :	123 0020 9249
   China (national)  :	+86 400 120 1131
   China (national)  :	10800 140 1711
   China (national)  :	10800 714 1677
   Colombia (toll free)  :	01800 518 1750
   Croatia (toll free)  :	0800 777 909
   Cyprus (toll free)  :	800 96479
   Czech Republic (toll free)  :	800 701 359
   Denmark (toll free)  :	80 88 68 59
   Dominican Republic (toll free)  :	1800 751 4901
   Egypt (toll free)  :	0800 000 0310
   Estonia (toll free)  :	8000 100 320
   Finland, Helsinki  :	+358 (0)9 3158 2478
   France, Paris  :	+33 (0)1 70 91 86 41
   France (toll free)  :	0800 919 261
   Germany, Frankfurt  :	+49 (0)69 25511 4419
   Germany (toll free)  :	0800 187 3551
   Greece (toll free)  :	00800 161 2203 7271
   Hong Kong  :	+852 5808 1811
   Hong Kong (toll free)  :	800 905 994
   Hungary (toll free)  :	068 001 9504
   Iceland (toll free)  :	800 9378
   India, Delhi  :	+91 (0)11 60003300
   India, Noida -UP  :	+91 (0)120 6000330
   India, Gurgaon  :	+91 (0)124 6000330
   India, Pune  :	+91 (0)20 60003300
   India, Mumbai  :	+91 (0)22 60003300
   India, Kolkata  :	+91 (0)33 60003300
   India, Hyderabad  :	+91 (0)40 60003300
   India, Chennai  :	+91 (0)44 6000 8444
   India, Cochin  :	+91 (0)484 6000330
   India, Jamshedpur  :	+91 (0)657 6000330
   India, Nagpur  :	+91 (0)712 6000330
   India, Ahmedabad  :	+91 (0)79 60003300
   India, Bangalore  :	+91 (0)80 60003300
   India, Goa  :	+91 (0)832 6000330
   India (toll free)  :	1800 266 3033
   India (national)  :	1860 266 3033
   Indonesia (toll free)  :	001 803 016 7271
   Ireland, Dublin  :	+353 (0)1 5269719
   Ireland (toll free)  :	1800 947 176
   Israel, Tel Aviv  :	+972 (0)3763 0331
   Israel (toll free)  :	1809 457 271
   Italy, Rome  :	+39 06 4523 0462
   Italy (toll free)  :	800 789 968
   Japan, Tokyo  :	+81 (0)3 4580 8151
   Japan (toll free)  :	0053 116 1200
   Kenya (toll free)  :	0800 723 082
   South Korea (toll free)  :	00798 14 207 9895
   Latvia (toll free)  :	8000 4284
   Lithuania (toll free)  :	8800 31669
   Luxembourg (toll free)  :	800 26609
   Malaysia (toll free)  :	1800 815 711
   Mexico, Guadalajara  :	+52 33 4777 2035
   Mexico, Mexico City  :	+52 554 777 2458
   Mexico (toll free)  :	001 800 514 7271
   Monaco (toll free)  :	800 93806
   Netherlands, Amsterdam  :	+31 (0)20 798 9583
   Netherlands (toll free)  :	0800 022 1398
   New Zealand, Auckland  :	+64 (0)9 929 1897
   New Zealand (toll free)  :	0800 452 563
   Norway (toll free)  :	800 10222
   Panama (toll free)  :	00800 226 7271
   Peru, Lima  :	+51 1 707 4301
   Peru (toll free)  :	0800 54824
   Philippines, Manila  :	+63 (0)2 626 3634
   Philippines (toll free)  :	1800 1110 1234
   Poland (toll free)  :	00 800 112 4310
   Portugal (toll free)  :	800 827 735
   Puerto Rico (toll free)  :	1 855 449 7271
   Romania, Bucharest  :	+40 (0)21 529 1352
   Romania (toll free)  :	0800 895 806
   Russia (toll free)  :	810 800 2104 2012
   Saudi Arabia (toll free)  :	800 814 1487
   Singapore  :	+65 3158 0801
   Singapore (toll free)  :	800 101 2586
   Slovakia (toll free)  :	0800 606 538
   Slovenia (toll free)  :	0800 80916
   South Africa, Johannesburg  :	+27 (0)11 019 7054
   South Africa (toll free)  :	0800 983 944
   Spain (toll free)  :	900 937 908
   Sri Lanka (toll free)  :	+94 788 155 806
   Sweden (toll free)  :	020 792 092
   Switzerland, Zurich  :	+41 (0)43 456 9557
   Switzerland (toll free)  :	0800 897 614
   Taiwan (toll free)  :	00 801 127 311
   Thailand (toll free)  :	001 800 156 203 7271
   Turkey (toll free)  :	00800 142 037 271
   UAE (toll free)  :	8000 3570 2302
   UK, Manchester  :	+44 (0)161 250 8129
   UK, London  :	+44 (0)20 3478 5112
   UK (toll free)  :	8000 163 006
   USA, Seattle  :	+1 206 826 7485
   USA, Detroit  :	+1 24 8856 1541
   USA, San Francisco  :	+1 415 358 0139
   USA, Los Angeles  :	+1 562 3756 542
   USA,Washington  :	+1 571 255 6133
   USA, Phoenix  :	+1 602 666 6001
   USA, New York  :	+1 631 267 4851
   USA, Buffalo  :	+1 716 242 1666
   USA, Denver  :	+1 720 386 9998
   USA, Miami  :	+1 786 219 3762
   USA, Texas, Houston  :	+1 832 240 2009
   USA, Boston  :	+1 857 207 3825
   USA /Canada (toll free)  :	1877 340 9263
   Uruguay (toll free)  :	000 4019 0514
   Venezuela (toll free)  :	0800 100 6018
   Vietnam (toll free)  :	1800 4826



