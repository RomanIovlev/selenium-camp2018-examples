package io.github.epam.entities;


public class Users {
    public static User DEFAULT_USER = new User();
    public static User USER_WITH_CONTACTS = new User().set(u-> {
        u.gender = "Male";
        u.passport = "true";
        u.acceptConditions = "true";
        u.lastName = "Iovlev";
        u.position = "ChiefQA";
        u.number = "4321";
        u.seria = "123456";
        u.email = "roman.iovlev.jdi@gmail.com";
        u.phone = "+7(987)123-45-67";
        u.description = "JDI - awesome UI autoamtion tool";});
}
