'''
Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. 
The task is to cyclically rotate the array clockwise by K.
Note : Keep the first of the array unaltered. 
'''

def rotateArray(arr,k):
    
    newarr=[]
    for i in range(0,len(arr)):
        loc=(i+k+1)%len(arr)
        newarr.append(arr[loc])
    return newarr

arr=[10, 20, 30, 40, 50]
k=2
newarr=rotateArray(arr,k)
print(newarr)