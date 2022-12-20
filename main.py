#input : racecar
#output : racecar
#don't use reverse or slicing
'''
Algorithm
Two Pointer Approach
1>left = 0;
2>right = len(nums)
while(left < right)
if(nums[left] != nums[right])
  return false
return true;
'''

# #Input 
# input = "braveman"
# detectPalindrome = True

# left = 0
# right = len(input) - 1

# while left < right:
#   if(input[left] != input[right]):
#     detectPalindrome = False
#     break
#   right -= 1;
#   left += 1;
  
# if(detectPalindrome == True):
#   print("It is a Palindrome")
# else:
#   print("Not a Palindrome")

def detect_palindrom(input):
  left = 0
  right = len(input) - 1
  
  #Make input clean
  input = input.lower()
  input = input.replace(" ", "")

  if(len(input) <= 1):
    return False
  
  while left < right:
    if(input[left] != input[right]):
      return False
    right -= 1
    left += 1
    return True

print("TestCases")
print("Is it a Palindrome:" + str (detect_palindrom("racecar")) )
print("Is it a Palindrome:" + str (detect_palindrom("racecab")) )
print("Is it a Palindrome:" + str (detect_palindrom("r")) )
print("Is it a Palindrome:" + str (detect_palindrom("rr")) )

  

  
  





  







