1.Пирамида от числа
Напишете програма, която чете цяло число n, въведено от потребителя, и отпечатва пирамида от числа като в примерите:
1
2 3
4 5 6
7

2.Еднакви суми на четни и нечетни позиции
Напишете програма, която чете от конзолата две шестцифрени цели числа в диапазона от 100000 до 300000. Винаги първото въведено число ще бъде по малко от второто. На конзолата да се отпечатат на 1 ред разделени с интервал всички числа, които се намират между двете, прочетени от конзолата числа и отговарят на следното условие:
•сумата от цифрите на четни и нечетни позиции да са равни. Ако няма числа, отговарящи на условието на конзолата не се извежда резултат.

3.Суми прости и непрости числа
Напишете програма, която чете от конзолата цели числа в диапазона от -2,147,483,648 до 2,147,483,647, докато не се получи команда "stop". Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа. Тъй като по дефиниция от математиката отрицателните числа не могат да бъдат прости, ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.". В този случай въведено число се игнорира и не се прибавя към нито една от двете суми, а програмата продължава своето изпълнение, очаквайки въвеждане на следващо число. 
На изхода да се отпечатат на два реда двете намерени суми в следния формат:
"Sum of all prime numbers is: {prime numbers sum}"
"Sum of all non prime numbers is: {nonprime numbers sum}"

4.Train the Trainers
Курсът "Train the trainers" е към края си и финалното оценяване наближава. Вашата задача е да помогнете на журито което ще оценява презентациите, като напишете програма в която да изчислява средната оценка от представянето на всяка една презентация от даден студент, а накрая средният успех от всички тях.
От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
След това на отделен ред се прочита името на презентацията - текст
За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
 "{името на презентацията} - {средна оценка}."
След получаване на команда "Finish" на конзолата се печата "Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.

5.Генератор за пароли
Да се напише програма, която чете две цели числа n и l, въведени от потребителя, и генерира по азбучен ред всички възможни  пароли, които се състоят от следните 5 символа:
•Символ 1: цифра от 1 до n.
•Символ 2: цифра от 1 до n.
•Символ 3: малка буква измежду първите l букви на латинската азбука.
•Символ 4: малка буква измежду първите l букви на латинската азбука.
•Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.
Вход
Входът се чете от конзолата и се състои от две цели числа n и l в интервала [1…9], по едно на ред.
Изход
На конзолата трябва да се отпечатат всички пароли по азбучен ред, разделени с интервал.

6.	Специални числа
Да се напише програма, която чете едно цяло число N, въведено от потребителя, и генерира всички възможни "специални" числа от 1111 до 9999. За да бъде "специално" едно число, то трябва да отговаря на следното условие: 
•N да се дели на всяка една от неговите цифри без остатък.
Пример: при N = 16, 2418 е специално число:
•16 / 2 = 8 без остатък
•16 / 4 = 4 без остатък
•16 / 1 = 16 без остатък
•16 / 8 = 2 без остатък
Вход
Входът се чете от конзолата и се състои от едно цяло число в интервала [1…600000]
Изход
На конзолата трябва да се отпечатат всички "специални" числа, разделени с интервал
