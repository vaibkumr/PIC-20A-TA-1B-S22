#go to a directory <dir>
#cd <dir>
cd ~/

#make a new directory <dir>
#mkdir <dir>
mkdir PIC20A

#make a new empty file <file>
#touch <file>
touch hello.txt

#copy <source> to <destination>
#cp <source> <destination>
cp hello.txt hi.txt

#move <source> to <destination>
#mv <source> <destination>
mv hi.txt bye.txt

#remove a file <file>
#rm <file>
rm hi.txt

#remove a directory <dir>
#rmdir <dir> or rm -r <dir>
rmdir PIC20A

#list contents of a directory <dir>
#ls <dir>
ls .

#Special keywords:
# . : Current
# ../ : Parent
# / : root
# ~ : Home
# * : Everything

#View a file <file>
#less <file>
less bye.txt

#list first few lines of a file <file>
#head <file>
head bye.txt

#list first n lines of a file <file>
#head -n <file>
head -5 bye.txt

#list last few lines of a file <file>
#tail <file>
tail bye.txt

#list last n lines of a file <file>
#tail -n <file>
tail -5 bye.txt

#Cool trick: Press the tab key to autofill commands!