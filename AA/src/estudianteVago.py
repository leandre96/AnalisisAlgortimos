import numpy 
def estudianteVago(esf, punt, M):
    (n,m) = (M + 1, len(esf) + 1)
    matriz = numpy.zeros((m,n), float)

    #Inicializar la matriz
    for i in range (0, m):
        matriz[i][0] = float("inf")
    for j in range (0, n):
        matriz[0][j] = float("inf")

    #Llenar la matriz
    for f in range(1, m):
        for c in range(1, n):
            if sum(punt[:f]) < c:
                matriz[f][c] = float("inf")
            else:
                aux = 0
                if c - punt[f - 1] >= 0:
                    aux = matriz[f - 1, c - punt[f - 1]]
                if aux + esf[f - 1] < matriz[f - 1,c]:
                    matriz[f, c] = aux + esf[f - 1]
                else:
                    matriz[f, c] = matriz[f - 1, c]

    return obtenerDeberes(matriz,m-1,n-1,puntajes)

def obtenerDeberes(matriz, m, n, puntajes):
    deberes =[]
    while n>0 and m>0:
        if matriz[m,n] == matriz[m-1,n]:
            m -= 1
        else:
            deberes.append(m-1)
            n -= puntajes[m-1]
            m -= 1
    return deberes

minimaNota = 55
esfuerzos = [7, 3, 5, 2, 3, 12, 5, 2, 5, 4]
puntajes = [15, 6, 10, 4, 7, 25, 10, 4, 11, 8]
print("Valores de los puntajes; ",puntajes)
print("Valores de los esfuerzos: ",esfuerzos)
deberes = estudianteVago(esfuerzos, puntajes, minimaNota)
esfuerzoTotal = sum([esfuerzos[i] for i in deberes])
puntajeTotal = sum([puntajes[i] for i in deberes])
print("Nota Máxima: ", sum(puntajes))
print("Nota Mínima para aprobar: ", minimaNota)
print("Numero de Tareas que se tienen que realizar: ", len(puntajes))
print("Esfuerzo de todas las tareas: ", sum(esfuerzos))

print("\nNumero de Tareas para aprobar con el menor esfuerzo: ", len(deberes))
print("Esfuerzo realizado: ", esfuerzoTotal)
print("Puntaje obtenido: ", puntajeTotal)
print("\nLista de Tareas a Realizar:")
for i in deberes[::-1]:
    print("Tarea:", i + 1,"Puntaje:", puntajes[i],"Esfuerzo:", esfuerzos[i])
