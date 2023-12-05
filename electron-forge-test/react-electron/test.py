# import sys
# import os

# f = open("test.txt", "r")
# line = f.readline()
# print(line) 
# print("1번 인자:", sys.argv[1], "/2번 인자:", sys.argv[2])
# f.close()

import os

path = os.getcwd()
filepath = os.path.join(path, "test.txt")
filepath2 = os.path.join(path, "test2.txt")

f = open(filepath, "r")
text = f.readline()
f.close()

f = open(filepath2, "w")
text2 = "I have read the content : "+ text + " successfully!"
f.write(text2)
f.close()
