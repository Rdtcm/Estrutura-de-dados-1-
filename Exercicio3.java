
public class Exercicio3 {
    public static void main(String[] args) {
        Float media_salario_funcionarios = 0.0f;

        Float media_salario_homens_maior_30 = 0.0f;
        
        Trabalhador[] trabalhadores = new Trabalhador[50]; 
 
        // Criando manualmente os trabalhadores
        trabalhadores[0] = new Trabalhador("João Silva", 2500.50f, "123.456.789-00", 30, 'M', "Rua A, 123");
        trabalhadores[1] = new Trabalhador("Maria Oliveira", 3200.75f, "234.567.890-11", 28, 'F', "Rua B, 456");
        trabalhadores[2] = new Trabalhador("Carlos Souza", 2800.40f, "345.678.901-22", 35, 'M', "Rua C, 789");
        trabalhadores[3] = new Trabalhador("Ana Santos", 2200.60f, "456.789.012-33", 40, 'F', "Rua D, 101");
        trabalhadores[4] = new Trabalhador("Lucas Pereira", 3500.00f, "567.890.123-44", 26, 'M', "Rua E, 202");
        trabalhadores[5] = new Trabalhador("Fernanda Costa", 3000.30f, "678.901.234-55", 32, 'F', "Rua F, 303");
        trabalhadores[6] = new Trabalhador("Pedro Lima", 4500.00f, "789.012.345-66", 38, 'M', "Rua G, 404");
        trabalhadores[7] = new Trabalhador("Juliana Rocha", 4000.00f, "890.123.456-77", 30, 'F', "Rua H, 505");
        trabalhadores[8] = new Trabalhador("Rafael Martins", 3100.80f, "901.234.567-88", 27, 'M', "Rua I, 606");
        trabalhadores[9] = new Trabalhador("Carla Almeida", 2800.50f, "012.345.678-99", 25, 'F', "Rua J, 707");
        trabalhadores[10] = new Trabalhador("Fábio Souza", 3300.60f, "123.456.789-10", 33, 'M', "Rua K, 808");
        trabalhadores[11] = new Trabalhador("Patrícia Silva", 2700.90f, "234.567.890-21", 31, 'F', "Rua L, 909");
        trabalhadores[12] = new Trabalhador("Gustavo Pereira", 3800.70f, "345.678.901-32", 40, 'M', "Rua M, 1010");
        trabalhadores[13] = new Trabalhador("Paula Martins", 2300.50f, "456.789.012-43", 26, 'F', "Rua N, 1111");
        trabalhadores[14] = new Trabalhador("Ricardo Lima", 3700.80f, "567.890.123-54", 36, 'M', "Rua O, 1212");
        trabalhadores[15] = new Trabalhador("Juliano Costa", 2600.40f, "678.901.234-65", 29, 'M', "Rua P, 1313");
        trabalhadores[16] = new Trabalhador("Beatriz Rocha", 3500.20f, "789.012.345-76", 32, 'F', "Rua Q, 1414");
        trabalhadores[17] = new Trabalhador("Renato Souza", 2900.10f, "890.123.456-87", 34, 'M', "Rua R, 1515");
        trabalhadores[18] = new Trabalhador("Sofia Lima", 3600.90f, "901.234.567-98", 31, 'F', "Rua S, 1616");
        trabalhadores[19] = new Trabalhador("Tiago Oliveira", 3100.70f, "012.345.678-09", 33, 'M', "Rua T, 1717");
        
        int cont_homens_mais_30 = 0;
  
        for (int i = 0; i < 20; i++) {
                //calculando a media
                media_salario_funcionarios += trabalhadores[i].get_salario();

                if (trabalhadores[i].get_idade() > 30) {
                    media_salario_homens_maior_30 += trabalhadores[i].get_salario();
                    cont_homens_mais_30++;
                }
        }

        media_salario_funcionarios /= 20;
        media_salario_homens_maior_30 /= cont_homens_mais_30;

        System.out.println("Media do salario dos funcionarios: " + media_salario_funcionarios);
        System.out.println("Media dos homens acima de 30 anos: " + media_salario_homens_maior_30);

        System.out.printf("\n");
        

        // pegando os homens com salario acima da media
        System.out.printf("----- Dados dos homens com salario acima da media ----\n");
        for (int j = 0; j < 20; j++) {
            if (trabalhadores[j].get_sexo() == 'M' && trabalhadores[j].get_salario() > media_salario_funcionarios) {
                trabalhadores[j].mostrar();
            }
        }

    }
}