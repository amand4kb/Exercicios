public class Main {
    public static void main(String[] args)

    ArrayList<Integer> lista = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);

                int soma = 0;
                for (int num : lista) {
                    soma += num;
                }

                System.out.println("Soma dos elementos:" + soma);
            }
        }
    }