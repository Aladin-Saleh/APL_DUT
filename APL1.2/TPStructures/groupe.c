#include <stdio.h>
#include <stdlib.h>
#include<grp.h>
#include<sys/types.h>

struct group *getgrnam(const char *name);



int main(int argc, char const *argv[])
{


struct group grp;



	grp = *getgrnam("students19");
	//char **eleves = grp.gr_mem;
	for (int i = 0; grp.gr_mem[i] != NULL; ++i)
	{
			printf("%s\n",grp.gr_mem[i] );
	}

	
	return 0;
}