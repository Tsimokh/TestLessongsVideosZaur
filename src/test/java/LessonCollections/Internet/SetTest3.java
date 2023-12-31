package LessonCollections.Internet;

import java.util.HashSet;

class SetTest3 {
    String name;
    SetTest3(String name) { this.name = name; }
    public String toString() { return name; }

    static class TestHashSet {
        public static void main(String args[]) {
            HashSet<SetTest3> set = new HashSet<>();
            SetTest3 p1 = new SetTest3("Иван");
            SetTest3 p2 = new SetTest3("Мария");
            SetTest3 p3 = new SetTest3("Пётр");
            SetTest3 p4 = new SetTest3("Мария");
            set.add(p1);
            set.add(p2);
            set.add(p3);
            set.add(p4);
            System.out.print(set.size());
        }
    }
}

//Объяснение
//
//Как же так, ведь во множество должны попадать уникальные элементы?
//
//Прежде чем добавить новый элемент в множество, вычисляется его hashCode() — чтобы определить бакет, куда он может быть помещён.
//
//Если бакет пуст, элемент будет добавлен. Иначе уже добавленные элементы с таким же значением хеша сравниваются с кандидатом при помощи метода equals(). Если дубликат не найден, новый элемент становится частью множества. Он попадёт в тот же бакет.
//
//Мы добавляем в Set объекты типа Person — созданного нами класса. Этот класс, как и все ссылочные типы, наследуется от класса Object.
//
//Так как мы не переопределили метод hashCode(), будет использована родительская реализация. В ней хеш вычисляется на основе данных адреса (реализация зависит от JVM).
//
//Метод equals() тоже не переопределён. В классе-родителе этот метод просто сравнивает ссылки на объекты. Это значит, что даже если хеш случайно совпадёт для каких-то из четырёх элементов, equals() в любом случае вернёт false.
//
//Таким образом, каждый из четырёх кандидатов попадёт в множество.