public class palindromeCheck {
    public static void main(String[] args) {

        //Variáveis
        int number;
        int resto;

        //Verificar as datas a partir do dia 12/02/2021
        for (number = 12022021; number < 99999999; number++ ) {

            int reverse = 0;
            int temp = number;

            //Calcular o reverso do número
            while (temp != 0){
                resto = temp%10;
                reverse = reverse*10+resto;
                temp = temp/10;
            }

            //Transformar o int em String
            String num = String.valueOf(number);
            String day = num.substring(0,2);
            String month = num.substring(2,4);
            String year = num.substring(4,8);

            //Verificar o número nos campos de dias e meses para que não ultrapassem o limite
            if (Integer.parseInt(day) <= 31 && Integer.parseInt(day) > 0 && Integer.parseInt(month) <= 12 && Integer.parseInt(month) > 0) {

                //Imprimir caso o número seja palíndromo ou não
                if (reverse == number) {

                    //Separar a String em um formato de data
                    String dataResult = num.substring(0, 2) + "/" + num.substring(2,4) + "/" + num.substring(4,8);
                    System.out.println(dataResult + " é Palíndromo");
                }
            }
        }
    }
}
