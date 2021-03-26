import java.util.*;
public class TecladoRoto {
        public static char teclado(String b){
            LinkedList<Character> palabra = new LinkedList <>();
            int cont = 0;

            for(char l : b.toCharArray()){
                if(l == '['){
                    cont = 0;
                }else if(l == ']'){
                    cont = palabra.size();
                }else
                    palabra.add(cont++, l);
            }

            StringBuilder texto = new StringBuilder();
            for(char l : palabra)
                texto.append(l);

            System.out.println(texto.toString());
            return 0;
        }

    public static void main(String[] args) {
        String b = "This_is_a_[Beiju]_text [[]][][] "+ "Happy_Birthday_to_Tsinghua_University asd[fgh[jkl asd[fgh[jkl[ [[a[[d[f[[g[g[h[h[dgd[fgsfa[f";
        System.out.println(teclado(b));
    }
}