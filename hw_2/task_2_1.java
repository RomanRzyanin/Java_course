/* Задание 1. Формирование URL с параметрами
Дана строка базового URL:
https://example.com/search?
Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
передаются в виде строки, где ключи и значения разделены =, а пары
ключ-значение разделены &. Если значение null, то параметр не должен
попадать в URL.
 */

public class task_2_1 {
    public static void main(String[] args) {


        String params = "query=java&sort=desc&filter=null";
        String URL = "https://example.com/search?";

        /* Тестовые строки кода не относящиеся к решению. 
        // String[] param = params.split("&");
        // for (int i = 0; i < param.length; i++) {

        //     String[] keyValue = param[i].split("=");
        //     if (!"null".equals(keyValue[1])) {
        //         System.out.println(keyValue[0] + " and " + keyValue[1]);

        //     }
        //     //for (int j = 0; j < keyValue.length; j++) {
        //         //System.out.println(keyValue[j]);
        //     }
        */

        

        
        System.out.println(buildURL(URL, params));
        }

        public static String buildURL(String baseURL, String params){

            StringBuilder url = new StringBuilder(baseURL);
            String[] param = params.split("&");

            for (int i = 0; i < param.length; i++) {

                String[] keyValue = param[i].split("=");

                if (!"null".equals(keyValue[1])) {

                    if (i > 0) {
                        url.append("&");
                    }
                    url.append(keyValue[0]).append("=").append(keyValue[1]);
                }
                }
                return url.toString();
        }

    }
