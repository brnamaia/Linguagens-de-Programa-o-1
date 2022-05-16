functor
import
    DoorFunctor at 'DoorFunctor.ozf'
export
    cir1: Circuito1
    cir2: Circuito2
    cir3: Circuito3
define 
    
    proc {Circuito1 A B C ?S}
        K L M N O P
    in
        K= {DoorFunctor.notg A}
        L= {DoorFunctor.notg B}
        M= {DoorFunctor.notg C}
        N= {DoorFunctor.andg M L}
        O= {DoorFunctor.andg C B}
        P= {DoorFunctor.org K N}
        S= {DoorFunctor.org P O}
    end

    proc {Circuito2 A B C ?S}
        K L M 
    in
        K= {DoorFunctor.notg A}
        L= {DoorFunctor.andg K B}
        M= {DoorFunctor.andg B C}
        S= {DoorFunctor.org L M}

    end

    proc {Circuito3 A B C ?S}
        K L M N 
    in
        K= {DoorFunctor.xorg C A}
        L= {DoorFunctor.norg A B}
        M= {DoorFunctor.andg L C}
        N= {DoorFunctor.andg K B}
        S= {DoorFunctor.org M N}

    end   
end
