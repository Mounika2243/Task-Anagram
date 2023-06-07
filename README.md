# Task-Anagram
# Problem-Statement: Write a program that takes the list of words as input and returns a list of sets, where each set contains words that are anagrams of each other.
# Output:
# For example, given the following list of words: ["cat", "dog", "tac", "god", "act"], the function should return: [["cat", "tac", "act"], ["dog", "god"]]
Here in the code we have taken list of strings for input and using for loop every element is checked with the whole list elements to check whether they are anagrams or not.

every string is converted into charArray and both arrays are sorted and  checked if they are equal then both will be added to set and removed from the list respectively. This loop will be continued till the end of the list.
The resultant list will be returned.
