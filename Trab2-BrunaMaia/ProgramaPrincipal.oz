declare [Circuitos] = {Module.link['C:\Users\brnam\OneDrive\Documentos\Oz\CircuitsFunctor.ozf']} 

% Programa principal

declare A B C S1 
A=1|1|0|_
B=0|1|0|_ 
C=0|0|0|_

{Circuitos.cir1 A B C S1} 
{Browse S1}

declare D E F S2
D=0|1|0|_
E=1|1|1|_
F=0|0|1|_ 

{Circuitos.cir2 D E F S2}
{Browse S2}

declare G H I S3
G=1|1|0|_
H=0|1|0|_
I=0|0|0|_

{Circuitos.cir3 G H I S3}
{Browse S3}