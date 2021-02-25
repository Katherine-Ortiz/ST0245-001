import os, sys
import pandas as pd
ruta = './Ganado.CSV'
arreglo= os.listdir(ruta)
archivos=[[]]*len(arreglo)
for i in range(len(arreglo)):
   archivos[i]=pd.read_csv(ruta +'/'+ arreglo[i])
print(archivos)

