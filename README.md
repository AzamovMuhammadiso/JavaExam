Savol: Javada necha xil standart functional interfaceni bilasiz?
Javob: Standart funktsional interfeyslar, Java standart kutubxonasi tomonidan taqdim etilgan o'zaro almashuvchi komponentlar hisoblanadi, ular funktsional dasturlashni oddiyroq qilish va kodni qisqa va qulayroq yozish imkonini beradi. 
Quyidagi standart funktsional interfeyslar odatda amalga oshirilad:
1. Supplier: Ushbu interfeys hech qanday kiritishsiz natijani ta'minlay oladigan narsani ifodalaydi. Uni do'konda yetkazib beruvchi sifatida tasavvur qilish mumkin. Bu bizdan hech narsaga muhtoj emas; bu bizga shunchaki nimadir beradi.
example code: Supplier<String> supplier = () -> "Hello";
2. Consumer: Bitta kiruvchi argumentni qabul qiluvchi va hech qanday natija qaytmaydigan operatsiyani ifodalaydi. Ma'lumotlarni qabul qilib olishimiz va hech narsani qaytarmasdan ishlashni talab qiladigan holatlar uchun foydalaniladi.
example code: Consumer<String> foodConsumer = food -> System.out.println("Eating: " + food);
3. Predicate: Bitta argumentning boolean qiymatli funksiyasini ifodalaydi. Shartlarni sinash yoki qandaydir kriteriyalar asosida elementlarni filtrlash uchun foydali.
example code: Predicate<Integer> isPositive = num -> num > 0;
4. Function:  Bitta argumentni qabul qiladigan va natija qaytadigan funksiya. Kiruvchi ma'lumotlarni chiquvchi ma'lumotlarga aylantirish uchun foydalaniladi.
example code: Function<String, String> addPrefix = str -> "Prefix: " + str;
5. BinaryOperator: Ikki turga ega argumentlarni qabul qilib, ularni biror turdagi natijaga aylantiruvchi funksiya.
