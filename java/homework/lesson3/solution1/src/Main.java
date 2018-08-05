public class Main {
    public static void main (String[] args)
    {
        //сделать наследование, ссылку на объекты других классов, обновить вывод
        //разобраться с конструктором в наследующем классе
        Pet koshka = new Pet('C', 'F', "Глаша", "Василиса Петровна", "дворец Молодежи");
        Pet kot = new Pet('C', 'M', "Мурзик", "Орк", "уютный домик");
        Pet sobakaS = new Pet('D', 'F', "Алебардия", "", "");
        Pet sobakaH = new Pet('D', 'F', "", "Петрович", "маленькая квартирка");

        koshka.introduce(koshka.getAClass(), koshka.getGender(), koshka.getName(), koshka.getOwner(), koshka.getLivAddress());
        kot.introduce(kot.getAClass(), kot.getGender(), kot.getName(), kot.getOwner(), kot.getLivAddress());
        sobakaS.introduce(sobakaS.getAClass(), sobakaS.getGender(), sobakaS.getName(), sobakaS.getOwner(), sobakaS.getLivAddress());
        sobakaH.introduce(sobakaH.getAClass(), sobakaH.getGender(), sobakaH.getName(), sobakaH.getOwner(), sobakaH.getLivAddress());

        koshka.eat();
        kot.sleep();
        sobakaS.voice();
        sobakaH.run();


        Human person = new Human('H', 'F', "Землянин", "планета Земля");
        person.introduce(person.getAClass(), person.getGender(), person.getName(), "", person.getLivAddress());

        //Борьба
        int i = 1; // 1 - борьба человека с котом; 2 - человека с собакой; 3 - кота с котом
        switch (i){
            case 1:
                Human fighter11 = new Human('H', 'M', "fighter11", "планета Земля");
                Pet fighter12 = new Pet('C', 'M', "fighter12", "Землянин", "планета Марс");
                for (int j = 10; j >= 0; j--)
                {
                    int a, b, v1, v2;
                    //присваиваем значения
                    a = 1; // левая граница диапазона случайных целочисленных
                    b = 4; // правая граница
                    v1 = a + (int) (Math.random() * b); //генерим случайное целое
                    v2 = a + (int) (Math.random() * b); //генерим случайное целое
                    switch (v1) {
                        case 1: {
                            fighter11.eat();
                            break;
                        }
                        case 2: {
                            fighter11.sleep();
                            break;
                        }
                        case 3: {
                            fighter11.run();
                            break;
                        }
                        case 4: {
                            fighter12.setHealth(fighter11.fight());
                            break;
                        }
                    }
                        switch (v2) {
                            case 1: {
                                fighter12.eat();
                                break;}
                            case 2: {
                                fighter12.sleep();
                                break;}
                            case 3: {
                                fighter12.run();
                                break;}
                            case 4: {
                                fighter11.setHealth(fighter12.fight());
                                break;}
                    }
                    //Результат игры
                    if (j==0 && fighter11.getHealth() > fighter12.getHealth()) {
                        System.out.println("Победил " + fighter11.getName());
                    }
                    else if (j==0 && fighter11.getHealth() < fighter12.getHealth()) {
                        System.out.println("Победил " + fighter12.getName());
                    }
                    else if (j==0 && fighter11.getHealth() == fighter12.getHealth())
                    {
                        System.out.println("Ничья!");
                    }
                }
                break;
            case 2:
                Human fighter21 = new Human('H', 'M', "fighter21", "планета Земля");
                Pet fighter22 = new Pet('D', 'M', "fighter22", "Землянин", "планета Марс");
                for (int j = 10; j >= 0; j--)
                {
                    int a, b, v1, v2;
                    //присваиваем значения
                    a = 1; // левая граница диапазона случайных целочисленных
                    b = 4; // правая граница
                    v1 = a + (int) (Math.random() * b); //генерим случайное целое
                    v2 = a + (int) (Math.random() * b); //генерим случайное целое
                    switch (v1) {
                        case 1: {
                            fighter21.eat();
                            break;
                        }
                        case 2: {
                            fighter21.sleep();
                            break;
                        }
                        case 3: {
                            fighter21.run();
                            break;
                        }
                        case 4: {
                            fighter22.setHealth(fighter21.fight());
                            break;
                        }
                    }
                    switch (v2) {
                        case 1: {
                            fighter22.eat();
                            break;}
                        case 2: {
                            fighter22.sleep();
                            break;}
                        case 3: {
                            fighter22.run();
                            break;}
                        case 4: {
                            fighter21.setHealth(fighter22.fight());
                            break;}
                    }
                    //Результат игры
                    if (j==0 && fighter21.getHealth() > fighter22.getHealth()) {
                        System.out.println("Победил " + fighter21.getName());
                    }
                    else if (j==0 && fighter21.getHealth() < fighter22.getHealth()) {
                        System.out.println("Победил " + fighter22.getName());
                    }
                    else if (j==0 && fighter21.getHealth() == fighter22.getHealth())
                    {
                        System.out.println("Ничья!");
                    }
                }
                break;
            case 3:
                Pet fighter31 = new Pet('C', 'M', "fighter31", "Землянин", "планета Марс");
                Pet fighter32 = new Pet('C', 'M', "fighter32", "Землянин", "планета Марс");
                for (int j = 10; j >= 0; j--)
                {
                    int a, b, v1, v2;
                    //присваиваем значения
                    a = 1; // левая граница диапазона случайных целочисленных
                    b = 4; // правая граница
                    v1 = a + (int) (Math.random() * b); //генерим случайное целое
                    v2 = a + (int) (Math.random() * b); //генерим случайное целое
                    switch (v1) {
                        case 1: {
                            fighter31.eat();
                            break;
                        }
                        case 2: {
                            fighter31.sleep();
                            break;
                        }
                        case 3: {
                            fighter31.run();
                            break;
                        }
                        case 4: {
                            fighter32.setHealth(fighter31.fight());
                            break;
                        }
                    }
                    switch (v2) {
                        case 1: {
                            fighter32.eat();
                            break;}
                        case 2: {
                            fighter32.sleep();
                            break;}
                        case 3: {
                            fighter32.run();
                            break;}
                        case 4: {
                            fighter31.setHealth(fighter32.fight());
                            break;}
                    }
                    //Результат игры
                    if (j==0 && fighter31.getHealth() > fighter32.getHealth()) {
                        System.out.println("Победил " + fighter31.getName());
                    }
                    else if (j==0 && fighter31.getHealth() < fighter32.getHealth()) {
                        System.out.println("Победил " + fighter32.getName());
                    }
                    else if (j==0 && fighter31.getHealth() == fighter32.getHealth())
                    {
                        System.out.println("Ничья!");
                    }
                }
                break;
        }


    }
}