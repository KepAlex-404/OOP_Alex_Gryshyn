package lab5;

public class Sentence {
    private static final String punctuationSymbols = ",.!?;";
    private SentenceElement[] sentenceElements;

    public Sentence(SentenceElement[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    public Sentence(String sentenceString) {
        String[] sentenceElementsStrings = sentenceString.split("(?=[" + punctuationSymbols + "])|\\s");
        sentenceElements = new SentenceElement[sentenceElementsStrings.length];
        String sentenceElementString;
        for (int i = 0; i < sentenceElementsStrings.length; i++) {
            sentenceElementString = sentenceElementsStrings[i];
            sentenceElements[i] = punctuationSymbols.contains(sentenceElementString)
                    ? new Punctuation(sentenceElementString)
                    : new Word(sentenceElementString);

        }
    }

    /*public Sentence(Word[] words, Punctuation[] punctuations) {
        this.sentenceElements = sentenceElements;
    }*/

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (int i = 0; i < sentenceElements.length; i++) {
            sentenceString.append(
                    (i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
                            sentenceElements[i].toString()
            );
        }
        return sentenceString.toString();
    }

    public String task(String sr, char a)
    {
        String t = "";
        StringBuilder sb = new StringBuilder (sr.trim());
        if (!(sb.substring(0).trim().equals(t))) {//перевірка на пусту строку
            String str = " ";
            String buf;
            String word1;
            String word2;
            sb.insert(sb.length(), " ");

            char tab = ' ';
            int n = 0;

            //пошук кількості слів у тексті
            for (int k1 = 0; k1 < sb.length(); k1++)
            {
                if (sb.charAt(k1) == tab)
                    n++;
            }
            int nlet1;
            int nlet2;
            int i = 0;

            //сортування бульбашкою
            for (int j2 = 0; j2 < n - 1; j2++)
            {
                i = 0;
                for (int i2 = 1; i2 < (n - j2); i2++)
                {
                    word1 = (sb.substring(i, sb.indexOf(str, i)))
                            .trim();//і-те слово
                    nlet1 = find(word1,a);
                    word2 =(sb.substring(word1.length() + i,
                            sb.indexOf(str, word1.length() + i + 1))).trim();
                    nlet2 = find(word2,a);//і+1 слово
                    if (nlet1 > nlet2)
                    {
                        buf = word1;
                        sb.replace(i, word1.length() + i, word2);
                        i += word2.length() + 1;
                        sb.replace(i, i + word2.length(), buf);
                    } else
                        i = sb.indexOf(str, i) + 1;
                }
            }
        } else
            System.out.println("строка пуста");
        return String.valueOf(sb);
    }


    public static int find(String s, char a)
    {
        int k = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++)
        {
            if ((s.charAt(i)==a))
                k++;
        }
        return k;
    }
}