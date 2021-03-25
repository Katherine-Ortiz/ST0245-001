import java.util.*;
public class TecladoRoto {
        public static char teclado(String a){
            LinkedList<Character> texto = new LinkedList <>();
            int cont = 0;

            for(char l : a.toCharArray()){
                if(l == '['){
                    cont = 0;
                }else if(l == ']'){
                    cont = texto.size();
                }else
                    texto.add(cont++, l);
            }

            StringBuilder t = new StringBuilder();
            for(char l : texto)
                t.append(l);

            System.out.println(t.toString());
            return 0;
        }

    public static void main(String[] args) {
        String a = "This_is_a_[Beiju]_text [[]][][] "+ "Happy_Birthday_to_Tsinghua_University asd[fgh[jkl asd[fgh[jkl[ [[a[[d[f[[g[g[h[h[dgd[fgsfa[f";
        System.out.println(teclado(a));
    }
}