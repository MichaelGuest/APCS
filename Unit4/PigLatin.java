public static void main(String[] args){
        ConsoleIO input = new ConsoleIO();
        String str, question;

        System.out.println("Pig Latin Translator");

        do{
            System.out.println("Please type a word: ");
            str = input.readToken();            

            System.out.println("In Pig Latin (using for): ");
            System.out.println(pigLatin(str, vowel(str)));
            System.out.println("In Pig Latin (using index): ");
            System.out.println(pigLatin(str, vowel2(str)));

            System.out.println("Translate another phrase?");
            question = input.readToken();
        }
        while (question.equals("yes") || question.equals("Yes"));
    }
    
    public static int vowel(String str){
        int num;
        int length = str.length();
        int length1 = (length - 1);
        for (num = 0;num <= length1; num++){
            char ch = str.charAt(num);
            if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                return num; 
            }
            else if (ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                return num;
            }
        }
        return -1;
    }

    public static String pigLatin(String str, int num)
    {
        String str1;
        String str2;
        if (num == -1){
            System.out.println(str + "ay");
        }
        else if (num == 0){
            System.out.println(str + "yay");
        }
        else{
            str1 = str.substring(num);
            str2 = str.substring(0,num);
            System.out.println(str1 + str2 + "ay");
        }
        return "";
    }

    public static int vowel2(String str){
        str = str.toLowerCase();
        int num = 0;
        int a = str.indexOf('a');
        int e = str.indexOf('e');
        int i = str.indexOf('i');
        int o = str.indexOf('o');
        int u = str.indexOf('u');
        if(a == -1 && e == -1 && i == -1 && o == -1 && u == -1){
            num = -1;
            return num;
        }
        if (a == -1){
            a = 100;
        }
        if (e == -1){
            e = 100;
        }
        if (i == -1){
            i = 100;
        }
        if (o == -1){
            o = 100;
        }
        if (u == -1){
            u = 100;
        }
        num = Math.min(Math.min(Math.min(Math.min(a,e),i),o),u);
        return num;
    }    
