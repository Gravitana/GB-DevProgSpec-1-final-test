# Грахов Виталий Анатольевич, группа 4720, дата: 01.02.2024

## Операционные системы и виртуализация (Linux)

### История команд в терминале Ubuntu

```
gravitana@gb:~$ cat > Pets.txt
собака Жужа
кошка Маха
хомяк Хома
gravitana@gb:~$ cat > PackAnimals.txt
лошадь Маруся
верблюд Афанасий
осёл Иа
gravitana@gb:~$ cat Pets.txt PackAnimals.txt > HumanFrends.txt
gravitana@gb:~$ cat HumanFrends.txt
собака Жужа
кошка Маха
хомяк Хома
лошадь Маруся
верблюд Афанасий
осёл Иа
gravitana@gb:~$ ls
HumanFrends.txt   snap        Загрузки      Общедоступные
PackAnimals.txt   Видео       Изображения  'Рабочий стол'
Pets.txt          Документы   Музыка        Шаблоны
gravitana@gb:~$ mkdir gb-final-test
gravitana@gb:~$ mv HumanFrends.txt gb-final-test/
gravitana@gb:~$ ls
gb-final-test     snap        Загрузки      Общедоступные
PackAnimals.txt   Видео       Изображения  'Рабочий стол'
Pets.txt          Документы   Музыка        Шаблоны
gravitana@gb:~$ cd gb-final-test/
gravitana@gb:~/gb-final-test$ ls
HumanFrends.txt
gravitana@gb:~/gb-final-test$


gravitana@gb:~$ sudo apt update

gravitana@gb:~$ sudo apt install mysql-server

gravitana@gb:~$ sudo dpkg -i /home/gravitana/Загрузки/google-chrome-stable_current_amd64.deb

gravitana@gb:~$ dpkg -l | grep chrome

gravitana@gb:~$ sudo dpkg -r google-chrome-stable

gravitana@gb:~$ dpkg -l | grep chrome

```
