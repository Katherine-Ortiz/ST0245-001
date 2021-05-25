# -*- coding: utf-8 -*-
"""
Created on May 2021

@author: Dayana Arrieta, Valentina Ochoa, Katherine Benjumea & Juan Quintana

#This python algorithm is named LZ77
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

    #displaying result
    #print(csvInText)


    #Compression part of the algorithm
    length = 0 #matched length
    win = 10 #window length
    pointer = 0 #Pointer, initially pointing to the first position
    text = csvInText   #coding information
    compressed_text = list() #Use tuple storage
    while True:
        if pointer - win < 0:
            match = text[0:pointer]
        else:
            match = text[pointer - win:pointer]
        while match.find(text[pointer:pointer + length + 1]) != -1:
            length += 1
        first = match.find(text[pointer:pointer + length])
        if pointer - win > 0:
            first += pointer - win
        if length != 0:
            a = (pointer - first, length, text[pointer + length])
            compressed_text.append(a)
            pointer += length + 1
        else:
            b = (0,0,text[pointer])
            compressed_text.append(b)
            pointer +=1
        length = 0
        if pointer == len(text):
            break
    #print(compressed_text)
    
    # This part pass the compressed lis to a text
    #listToStr = ' '.join([str(elem) for elem in compressed_text])
            
    #com_text = (listToStr)
    
    #file_name1 = "new_co-" + file
    #print(file_name1)
    #This converts the decompressed message to csv file
    #f = open(file_name1, 'w')
    #f.write(com_text) #Give your csv text here.
    #f.close()
    
    #Decoding part 
    de_text = ""
    for s in compressed_text:
        if s[0] != 0:
            de_text += de_text[(len(de_text) - s[0]): (len(de_text) - s[0] + s[1])]
        de_text += s[2]
    #print(de_text)
     
    #In this part the decompressed text is passed to the csv file
    file_name = "new_decc-" + file
    print(file_name)
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