package br.com.savioea;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        ClasseComTabelas classeComTabelas = new ClasseComTabelas();
        Class<?> tabela1 = classeComTabelas.getClass();
        System.out.println(tabela1);

        System.out.println("");

        Field[] fields = tabela1.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] fieldAnnotations = field.getAnnotations();
            for (Annotation annotation : fieldAnnotations) {
                if (annotation instanceof Tabela) {
                    Tabela tabela = (Tabela) annotation;
                    System.out.println("Complete Information: " + tabela);
                    System.out.println("Nome da tabela: " + tabela.nomeTabela());
                    for (String sala : tabela.colunas()) {
                        System.out.println("Colunas: " + sala);
                    }
                    System.out.println("Número de colunas: " + tabela.numColunas());
                    System.out.println("");
                }
            }
        }
    }
}
