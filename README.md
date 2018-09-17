# javaHW2
домашнее задание:
1. Создать класс Address с полями city, country, street, postalCode
2. Создать класс User c полями id, firstName, lastName, address, email, List<String>phoneNumbers, List<User> friends.
3. Создать класс UserService с методом который возвращает N юзеров, желательно рандомно заполненых данными.
4. написать тесты(методы), которые получают список юзеров из сервиса и выводят:
4.1: у скольки юзеров нет ни одного phoneNumber'a
4.1 все города юзеров в порядке популярности
4.3 телефоны юзеров у которых почта заканчивается на ".by"
4.4 вывести все firstName'ы без дубликатов
4.5 вывести id юзеров с ролью "administrator" отсортированных по аддресу
4.6 метод принимает на вход страну и список юзеров, возвращает true если есть юзеры с ролью "administrator" из этой страны