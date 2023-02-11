# total = 10000000 
# rest36 = (total * 0.36)
# t1 = rest36 + total

v1 = 11700000
v2 = 21700000
v3 = 82236842.11
v4 = 92236842.11

# Valor = v4 - (v4 * 0.81 + t1 * 0.19)

t1 = v4 - (v4 * 0.81) 
Valor = t1 - (t1 * 0.36) 

print('36%: ', t1)
print('Total: ', Valor)