1.Конзолен конвертор: USD към BGN
Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN). Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.

2.Конзолен конвертор: от радиани в градуси
Напишете програма, която чете ъгъл в радиани (rad) и го преобразува в градуси (deg). Използвайте формулата: градус = радиан * 180 / π.Числото π в Java програми е достъпно чрез Math.PI. Закръглете резултата до най-близкото цяло число използвайки "%.0f".

3.Калкулатор депозити
Напишете програма, която изчислява каква сума ще получите в края на депозитния период при определен лихвен процент. Използвайте следната формула: 
сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

4.Задължителна литература
За лятната ваканция в спикъка със задължителна литература на Жоро има определен брой книги, но Жоро предпочита да играе с приятели навън. Вашата задача е да помогнете на Жоро да изчисли колко часа на ден трябва да отделя, за да прочете необходимата литература, но и да прекарва максимално време навън.
Вход
От конзолата се четат 3 реда:
1.Брой страници в текущата книга – цяло число в интервала [1…1000];
2.Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
3.Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];
Изход
Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.

5.Рожден ден
За рожденият ден на дъщеря си, Людмила е решила да организира парти, на което да покани всичките ѝ съученици. За целта е решила да наеме развлекателна зала за деца, чийто наем ще получите като вход от конзолата. 
Напишете програма, с която да помогнете на Людмила да изчисли какъв бюджет ще ѝ бъде необходим, като имате следната информация за допълнителните неща, необходими за тържеството:
•Торта  – цената ѝ е 20% от наема на залата
•Напитки – цената им е 45% по-малко от тази на тортата
•Аниматор – цената му е 1/3 от цената за наема на залата
Вход
От конзолата се четe 1 ред:
•Наем за залата – цяло число в интервала [100..10000]
Изход
Да се отпечата на конзолата какъв бюджет ще бъде необходим за организиране на тържеството. 

6.Благотворителна кампания
В сладкарница се провежда благотворителна кампания за събиране на средства, в която могат да се включат сладкари от цялата страна. Първоначално прочитаме от конзолата броя на дните, в които тече кампанията и броя на сладкарите, които ще се включат. След това на отделни редове получаваме количеството на тортите, гофретите и палачинките, които ще бъдат приготвени от един сладкар за един ден. Трябва да се има предвид следния ценоразпис:
•Торта - 45 лв.
•Гофрета - 5.80 лв.
•Палачинка - 3.20 лв.
1/8 от крайната сума ще бъде използвана за покриване на разходите за продуктите по време на кампанията. Да се напише програма, която изчислява сумата, която е събрана в края на кампанията.
Вход
От конзолата се четат 5 реда:
1.Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
2.Броят на сладкарите – цяло число в интервала [0 … 1000]
3.Броят на тортите – цяло число в интервала [0… 2000]
4.Броят на гофретите – цяло число в интервала [0 … 2000]
5.Броят на палачинките – цяло число в интервала [0 … 2000]
Изход
Да се отпечата на конзолата едно число:
•парите, които са събрани.
Резултатът да се форматира до вторта цифра след десетичната запетая.

7.Пазар за плодове
Мария решава да мине на диета и отива до близкия пазар, за да купи ягоди, банани, портокали и малини. На конзолата се въвежда цената на ягодите в лв./кг. и количеството на бананите, портокалите, малините и ягодите, които трябва да закупи. Да се напише програма, която пресмята колко пари са ѝ необходими, за да плати сметката, като знаете, че:
•цената на малините е с 50% по-ниска от тази на ягодите;
•цената на портокалите е с 40% по-ниска от цената на малините;
•цената на бананите е с 80% по-ниска от цената на малините.
Вход
От конзолата се четат 5 реда:
1.Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
2.Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
3.Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
4.Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
5.Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]
Изход
Да се отпечата на конзолата едно число:
•парите, които са необходими на Мария.
Резултатът да се форматира до вторта цифра след десетичната запетая. 

8.Аквариум
За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от конзолата на отделни редове размерите му – дължина, широчина и височина в сантиметри. Трябва да се пресметне колко литра вода ще събира аквариума, ако се знае, че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа. 
Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/. 
Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.
Вход
От конзолата се четат 4 реда:
1.Дължина в см – цяло число в интервала [10 … 500]
2.Широчина в см – цяло число в интервала [10 … 300]
3.Височина в см – цяло число в интервала [10… 200]
4.Процент  – реално число в интервала [0.000 … 100.000]
Изход
Да се отпечата на конзолата едно число:
• литрите вода, които ще  събира аквариума.
Резултатът да се форматира до втората цифра след десетичната запетая. 
