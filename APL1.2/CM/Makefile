CC = gcc
CFLAGS = -Wall \
		 -ansi

EXE = exec
OFILES = test_empan.o \
		 empan.o


but : ${EXE}





test_empan.o : empan.h

	

empan.o : empan.h 



${EXE} : ${OFILES}
		${CC} ${CFLAGS} -o ${EXE} ${OFILES}




clean :
	-rm -f ${OFILES}



mrproper : clean but
 


 
.PHONY : but clean mrproper