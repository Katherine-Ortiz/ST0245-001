import pandas as pd
import numpy as np
import glob
import csv
import cv2

files=glob.glob('cow*.csv')

def escalada():
    list = []
    for numero, elemento in enumerate(files, start=1):
        datos = pd.read_csv(elemento)
        arreglo = datos.to_numpy()
        imgNombre = ("nuevaimg" + str(numero) + ".jpg")
        cv2.imwrite(imgNombre, arreglo)
        imagen = cv2.imread(imgNombre, 1)
        escalamiento = cv2.resize(imagen, (0, 0), fx=0.4, fy=0.4, interpolation=cv2.INTER_NEAREST)
        imagen2 = ("nuevaImgp" + str(numero) + ".jpg")
        cv2.imwrite(imagen2, escalamiento)
        cv2.waitKey(0)
        cv2.destroyAllWindows()

escalada()