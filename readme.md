Exercise: Create a Java project in your IDE Exercise 1:
Bubble sort Create a “BubbleSort” class with one public method called “sort” (You can create other private methods) which has to sort numbers in accordance with the “Bubble sort” algorithm.
method should receive List of Comparable (parameter name = “input”) method should return List of Comparable, but the numbers should be sorted ascending if the input is null then method should throw an exception if the input contains null value in list then method should omit this element
Create a “BubbleSortTest” class and create test methods for below cases:
input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8]
input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9]
input = [] result = [] 
input = [null,5.0001] result = [5.0001]
input = null result = RuntimeException 

Exercise 2: Balanced words counter Balanced words definition:
The word is balanced if every letter that occurs in it occurs in the same number of time. E.g. the words: “mama”, “ear”, “aabbcbcccbaa” are balanced but the words “dad”, “elephant”, “abcba” are not.
Additionally, the balanced word is not empty. Create a “BalancedWordsCounter” class with one public method called “count” (you can create other private methods) which has to count how many balanced subwords exist in the input word.
method should receive String (parameter name = “input”) method should return Integer the input should contain the letters only, throw an exception if the text contains other characters.
if the input is null then method should throw an exception
Create a “BalancedWordsCounterTest” and create a test methods for below cases:
input = “aabbabcccba” result = 28
input = “” result = 0
input = “abababa1” result = RuntimeException
input = null result = RuntimeException *