total=0
monto=float(input("Monto de una Venta $:"))
while monto!=0:
    if monto<0:
        print("Monto no valido")
    else:
        total +=monto
    monto=float(input("Monto de una Venta $:"))
if total>1000:
    total-=total*0.1
print("Monto Total a pagar $",total)