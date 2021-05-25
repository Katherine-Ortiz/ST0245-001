# -*- coding: utf-8 -*-
"""
Created on May 2021

@author: Dayana Arrieta, Valentina Ochoa, Katherine Benjumea & Juan Quintana

#This python algorithm is named RLE
#It's a lossless compression method

"""
import pandas as pd
import glob
import cv2
import time



# This allows to get the algorithm time
inicio = time.time()
time.sleep(1)
# -------------

# This variable groups all the csv files
files=glob.glob('*.csv')

# This loop allows to open each csv file
for file in files:
    csvfile = open(file, "r")

    # This variable is when the csv file is passed to text
    csvInText = ' '.join([i for i in csvfile])  

#Compression part of the algorithm
    def encode(user):
        result = ""
        preChar = ''
        count = 1
        for index, char in enumerate(user):
            if index == 0:
                preChar = char
                continue
    
            if preChar == char:
                count += 1
                if index == len(user)-1:
                    result += f"{count}{preChar}"
            else:
                if index != len(user)-1:
                    result += f"{count}{preChar}"
                    count = 1
                else:
                    result += f"{count}{preChar}1{char}"
    
            if count >= 10:
                result += f"9{preChar}"
                count -= 9
    
            preChar = char
        return result
    
#Decompression part of the algorithm    
    def decode(user):
        result = ""
        user = list(user)
        amounts = []
        chars = []
        for char in user[::2]:
            if char != None:
                amounts.append(char)
        for char in user[1::2]:
            if char != None:
                chars.append(char)
        for index, amount in enumerate(amounts):
            for i in range(int(amount)):
                result += chars[index]
    
        return result
    
    #if name  == "main":
    
    #In this part the compressed text is passed to the csv file
    #print(encode(csvInText))
    #co_text = (encode(csvInText))
    #file_name = "new_co-" + file
    #print(file_name)
    #This converts the decompressed message to csv file
    #f.write(co_text) #Give your csv text here.
    # Python will convert \n to os.linesep
    #f.close()
    
    de_text = (decode(encode(csvInText)))
    
    
    file_name = "new_dec-" + file
    #print(file_name)
    #This converts the decompressed message to csv file
    f = open(file_name, 'w')
    f.write(de_text) #Give your csv text here.
    # Python will convert \n to os.linesep
    f.close()

    #This converts the csv file to dataframe
    df = pd.read_csv(file_name)
    #print(df)

    #This converts the dataframe to numpyArray
    np_array = df.to_numpy()
    #print(np_array)

    #This use to numpy array to create a new image
    image_name = "newImage" + file.replace("csv", "png")
    cv2.imwrite(image_name, np_array)


fin = time.time()
print(fin-inicio)