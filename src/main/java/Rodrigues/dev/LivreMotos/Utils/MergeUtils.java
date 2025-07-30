package Rodrigues.dev.LivreMotos.utils;

import java.lang.reflect.Field;

public class MergeUtils {


    public static void copiaCampos(Object source, Object target){

        Field[] fields = source.getClass().getDeclaredFields();

        for (Field field : fields){
            field.setAccessible(true);
            try {
                Object value = field.get(source);

                if (value !=null && !(value instanceof Integer && (int) value == 0)){
                    Field targetField  = target.getClass().getDeclaredField(field.getName());
                    targetField.setAccessible(true);
                    targetField.set(target, value);
                }


            }catch (Exception e){
                System.out.println("Erro ao copiar campo: " + field.getName());
            }
        }


    }

}
