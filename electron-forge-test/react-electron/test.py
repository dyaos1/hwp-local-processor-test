import sys
import os

f = open("test.txt", "r")
line = f.readline()
print(line) 
print("1번 인자:", sys.argv[1], "/2번 인자:", sys.argv[2])
f.close()