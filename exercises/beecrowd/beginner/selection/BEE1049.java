package beginner.selection;

import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.next();
        String palavra2 = scanner.next();
        String palavra3 = scanner.next();
        String saida;

        if(palavra1.equals("vertebrado")){
            if (palavra2.equals("ave")){
                if (palavra3.equals("carnivoro")){
                    saida = "aguia";
                    System.out.println(saida);
                } else if (palavra3.equals("onivoro")){
                            saida = "pomba";
                            System.out.println(saida);
                }
            } else if (palavra2.equals("mamifero")){
                if (palavra3.equals("onivoro")){
                    saida = "homem";
                    System.out.println(saida);
                } else if (palavra3.equals("herbivoro")){
                    saida = "vaca";
                    System.out.println(saida);
                }
            }
        } else
            if (palavra1.equals("invertebrado")){
                if (palavra2.equals("inseto")){
                    if (palavra3.equals("hematofago")){
                        saida = "pulga";
                        System.out.println(saida);
                    } else if (palavra3.equals("herbivoro")){
                        saida = "lagarta";
                        System.out.println(saida);
                    }
                } else if (palavra2.equals("anelideo")){
                    if (palavra3.equals("hematofago")){
                        saida = "sanguessuga";
                        System.out.println(saida);
                    } else if (palavra3.equals("onivoro")){
                        saida = "minhoca";
                        System.out.println(saida);
                    }
                }

            }

        scanner.close();
    }
}
