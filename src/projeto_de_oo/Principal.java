package projeto_de_oo;

import java.io.*;
import java.util.*;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criando pasta para dados de venda
        File diretorioPrincipal = new File("c://TEC");
        diretorioPrincipal.mkdir();
        
        // coleções
        //-------------------------------------------------
        Collection<Cliente> cli = new TreeSet<Cliente>();
        Collection<Vendedor> vend = new TreeSet<Vendedor>();
        Collection<Produto_Informatica> prod = new TreeSet<Produto_Informatica>();
        List<Venda> venda1 = new ArrayList<Venda>();
        //-------------------------------------------------
        
        // objetos
        //-------------------------------------------------
        Cliente[] novoCliente = new Cliente[100];
        Vendedor[] novoVendedor = new Vendedor[100];
        Endereco novoEnd = new Endereco();
        Produto_Informatica[] novoProduto = new Produto_Informatica[100];
        Venda[] novaVenda = new Venda[100];
        for(int i = 0;i < 100;i++){
            novoCliente[i] = new Cliente();
            novoVendedor[i] = new Vendedor();
            novoProduto[i] = new Produto_Informatica();
            novaVenda[i] = new Venda();
        }
        
        
        
        
        // scanners
        //-------------------------------------------------
        Scanner imput = new Scanner(System.in); // para inteiros
        Scanner input2 = new Scanner(System.in); // para caracteres
        Scanner input3 = new Scanner(System.in); // para float
        
        // indexes
        int idxCli = 0;
        int idxVend = 0;
        int idxProd = 0;
        int idxVen = 0;
        
        int controlador = 0;
        
        // carregando arquivos da memoria
        
        // dados do cliente
        System.out.println("Carregando arquivos na memória...");
        try{
                Reader fileR = new FileReader("c://TEC/cliente/dadosCliente.txt");
                BufferedReader in = new BufferedReader(fileR);
                String linha = in.readLine();
                
                while (linha !=null){
                    int cont = 0;
                     //System.out.println(String.format("%s", linha));
                     String[] splitS = linha.split(",");
                     for(String s : splitS){
                         if(cont == 0){
                            novoCliente[idxCli].setNome(s);
                            
                         }
                         if(cont == 1){
                            novoCliente[idxCli].setCpf(s);
                            
                         }
                         if(cont == 2){
                            novoEnd.setEstado(s);
                            
                         }
                         if(cont == 3){
                            novoEnd.setCidade(s);
                            
                         }
                         if(cont == 4){
                            novoEnd.setCep(s);
                            
                         }
                         if(cont == 5){
                            novoEnd.setBairro(s);
                            
                         }
                         if(cont == 6){
                            novoEnd.setRua(s);
                            
                         }
                         if(cont == 7){
                            novoEnd.setNumero(s);
                            
                         }
                         if(cont == 8){
                            novoCliente[idxCli].setDados_adicionais(s);
                            
                            
                         }                    
                                                                        
                         
                         cont++;
                         
                         
                     }
                     novoCliente[idxCli].setEnd(novoEnd); // setando endereço
                    
                     cli.add(novoCliente[idxCli]);
                     idxCli++;
                     linha = in.readLine();
                }
                fileR.close();
                in.close();
        } catch(FileNotFoundException e) {
                System.err.println("Arquivo não existe!");
        }catch (IOException ex){
                System.err.println("Erro de leitura!");
        } 
        //============================================================================================
        // dados do vendedor
       
        try{
                Reader fileR = new FileReader("c://TEC/vendedor/dadosVendedor.txt");
                BufferedReader in = new BufferedReader(fileR);
                String linha = in.readLine();
                
                while (linha !=null){
                    int cont = 0;
                     //System.out.println(String.format("%s", linha));
                     String[] splitS = linha.split(",");
                     for(String s : splitS){
                         if(cont == 0){
                            novoVendedor[idxVend].setNome(s);
                            
                         }
                         if(cont == 1){
                            novoVendedor[idxVend].setCpf(s);
                            
                         }
                         if(cont == 2){
                            novoEnd.setEstado(s);
                            
                         }
                         if(cont == 3){
                            novoEnd.setCidade(s);
                            
                         }
                         if(cont == 4){
                            novoEnd.setCep(s);
                            
                         }
                         if(cont == 5){
                            novoEnd.setBairro(s);
                            
                         }
                         if(cont == 6){
                            novoEnd.setRua(s);
                            
                         }
                         if(cont == 7){
                            novoEnd.setNumero(s);
                            
                         }
                         if(cont == 8){
                            novoVendedor[idxVend].setComisao(Float.valueOf(s));
                            
                            
                         }                    
                                                                        
                         
                         cont++;
                         
                         
                     }
                     novoVendedor[idxVend].setEnd(novoEnd); // setando endereço
                    
                     vend.add(novoVendedor[idxVend]);
                     idxVend++;
                     linha = in.readLine();
                }
                fileR.close();
                in.close();
        } catch(FileNotFoundException e) {
                System.err.println("Arquivo não existe!");
        }catch (IOException ex){
                System.err.println("Erro de leitura!");
        } 
        // =============================================================================================================
        // dados do Produto
       
        try{
                Reader fileR = new FileReader("c://TEC/produto/dadosProduto.txt");
                BufferedReader in = new BufferedReader(fileR);
                String linha = in.readLine();
                
                while (linha !=null){
                    int cont = 0;
                     //System.out.println(String.format("%s", linha));
                     String[] splitS = linha.split(",");
                     for(String s : splitS){
                         if(cont == 0){
                            novoProduto[idxProd].setCodigo(s);
                            
                         }
                         if(cont == 1){
                            novoProduto[idxProd].setDescricaoproduto(s);
                            
                         }
                         if(cont == 2){
                            novoProduto[idxProd].setUnidade(s);
                            
                         }
                         if(cont == 3){
                            novoProduto[idxProd].setPrecounitario(Float.valueOf(s));
                            
                         }
                                    
                                                                        
                         
                         cont++;
                         
                         
                     }
                     
                    
                     prod.add(novoProduto[idxProd]);
                     idxProd++;
                     linha = in.readLine();
                }
                fileR.close();
                in.close();
        } catch(FileNotFoundException e) {
                System.err.println("Arquivo não existe!");
        }catch (IOException ex){
                System.err.println("Erro de leitura!");
        } 
        //===================================================================================================================
        // dados do vendas
       
        try{
                Reader fileR = new FileReader("c://TEC/vendas/dadosVendas.txt");
                BufferedReader in = new BufferedReader(fileR);
                String linha = in.readLine();
                
                while (linha !=null){
                    int cont = 0;
                    Cliente novoC = new Cliente();
                    Vendedor novoV = new Vendedor();
                    Produto_Informatica novoP = new Produto_Informatica();
                    
                     //System.out.println(String.format("%s", linha));
                     String[] splitS = linha.split(",");
                     for(String s : splitS){
                         if(cont == 0){
                            novoC.setNome(s);
                            
                            
                         }
                         if(cont == 1){
                            novoV.setNome(s);
                            
                         }
                         if(cont == 2){
                           novaVenda[idxVen].setValor_Total(Float.valueOf(s));
                            
                         } 
                         //+","+c.getQuantidade()+c.getProduto().getCodigo()+","+c.getProduto().getPrecounitario());
                         if(cont == 3){
                             novaVenda[idxVen].setQuantidade(Integer.parseInt(s));
                         }
                         if(cont == 4){
                             novoP.setCodigo(s);
                         }
                         if(cont == 5){
                             novoP.setPrecounitario(Float.valueOf(s));
                         }
                                                                        
                         cont++;
                         
                         
                     }
                     
                     novaVenda[idxVen].setCliente(novoC);
                     novaVenda[idxVen].setVendedor(novoV);
                     novaVenda[idxVen].setProduto(novoP);
                     venda1.add(novaVenda[idxVend]);
                     idxVen++;
                     linha = in.readLine();
                }
                fileR.close();
                in.close();
        } catch(FileNotFoundException e) {
                System.err.println("Arquivo não existe!");
        }catch (IOException ex){
                System.err.println("Erro de leitura!");
        } 
        //=========================================================================================================================
        
        System.out.println("Arquivo carregado com sucesso!");
        
        
        do{
            System.out.println(""
                    + "+++++++++++++++++++++++++\n"
                    + "+ Digite opcao de Menu: +\n"
                    + "+-----------------------+\n"
                    + "+0 - Sair e Salvar      +\n"
                    + "+1 - Cliente            +\n"
                    + "+2 - Vendedor           +\n"
                    + "+3 - Produto            +\n"
                    + "+4 - PDV                +\n"
                    + "+++++++++++++++++++++++++\n");
            // tratamento de exceções
            boolean continuar = true;
            do{
                try{


                    controlador = imput.nextInt();                    
                    continuar = false;
                }catch(InputMismatchException e){
                    imput.next();
                    System.err.println(e);
                    System.out.println("ERRO!!! Entre com um valor inteiro.");
                }

            }while(continuar);
            switch(controlador) {
                case 0:
                    System.out.println("Sair e Salvar"); // encerra o programa
                    //===================================================================================================
                    File diretorio = new File("c://TEC/cliente");
                    diretorio.mkdir();
                    File arquivo = new File(diretorio, "dadosCliente.txt");
                    FileWriter file;
                    BufferedWriter buf;
           
          
                    try {
                        file = new FileWriter(arquivo);
                        buf = new BufferedWriter(file);
                        
                               if(cli.isEmpty()){
                                    System.out.println("Não há Clientes, nada para salvar!");
                                }
                                Iterator i = cli.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Cliente c = (Cliente) i.next();
                                    
                                        buf.write(c.getNome()+","+c.getCpf()+","+c.getEnd().getEstado()+","+c.getEnd().getCidade()+","+c.getEnd().getCep()+
                                                ","+c.getEnd().getBairro()+","+c.getEnd().getRua()+","+c.getEnd().getNumero()+","+c.getDados_adicionais()+"\n");
                                    
                                    cont++;
                                            
                                }
                       
                        
                        
                        
                        
                        
                        buf.close();
                        file.close();
                    } catch (IOException ex) {
                        System.out.println("Erro ao gravar arquivo!");
                    }
                    // ====================================================================================================
                    
                    File diretorio2 = new File("c://TEC/vendedor");
                    diretorio2.mkdir();
                    File arquivo2 = new File(diretorio2, "dadosVendedor.txt");
                    FileWriter file2;
                    BufferedWriter buf2;
           
          
                    try {
                        file2 = new FileWriter(arquivo2);
                        buf2 = new BufferedWriter(file2);
                        
                               if(vend.isEmpty()){
                                    System.out.println("Não há Vendedores, nada para salvar!");
                                }
                                Iterator i = vend.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Vendedor c = (Vendedor) i.next();
                                    
                                        buf2.write(c.getNome()+","+c.getCpf()+","+c.getEnd().getEstado()+","+c.getEnd().getCidade()+","+c.getEnd().getCep()+
                                                ","+c.getEnd().getBairro()+","+c.getEnd().getRua()+","+c.getEnd().getNumero()+","+c.getComisao()+"\n");
                                    
                                    cont++;
                                            
                                }
                       
                        
                        
                        
                        
                        
                        buf2.close();
                        file2.close();
                    } catch (IOException ex) {
                        System.out.println("Erro ao gravar arquivo!");
                    }
                    //=========================================================================================================
                    File diretorio3 = new File("c://TEC/produto");
                    diretorio3.mkdir();
                    File arquivo3 = new File(diretorio3, "dadosProduto.txt");
                    FileWriter file3;
                    BufferedWriter buf3;
           
          
                    try {
                        file3 = new FileWriter(arquivo3);
                        buf3 = new BufferedWriter(file3);
                        
                               if(prod.isEmpty()){
                                    System.out.println("Não há Produtos, nada para salvar!");
                                }
                                Iterator i = prod.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Produto_Informatica c = (Produto_Informatica) i.next();
                                    
                                        buf3.write(c.getCodigo()+","+c.getDescricaoproduto()+","+c.getUnidade()+","+c.getPrecounitario()+"\n");
                                    
                                    cont++;
                                            
                                }                     
                                               
                                                
                        buf3.close();
                        file3.close();
                    } catch (IOException ex) {
                        System.out.println("Erro ao gravar arquivo!");
                    }
                    //==================================================================================================================
                    File diretorio4 = new File("c://TEC/vendas");
                    diretorio4.mkdir();
                    File arquivo4 = new File(diretorio4, "dadosVendas.txt");
                    FileWriter file4;
                    BufferedWriter buf4;
           
          
                    try {
                        file4 = new FileWriter(arquivo4);
                        buf4 = new BufferedWriter(file4);
                        
                               if(venda1.isEmpty()){
                                    System.out.println("Não há Vendas, nada para salvar!");
                                }
                                Iterator i = venda1.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Venda c = (Venda) i.next();
                                    
                                        buf4.write(c.getCliente().getNome()+","+c.getVendedor().getNome()+","+c.getValor_Total()
                                        +","+c.getQuantidade()+","+c.getProduto().getCodigo()+","+c.getProduto().getPrecounitario()+"\n");
                                            
                                    
                                    cont++;
                                            
                                }
                       
                        
                        
                        
                        
                        
                        buf4.close();
                        file4.close();
                    } catch (IOException ex) {
                        System.out.println("Erro ao gravar arquivo!");
                    }
                    
                    
                    break;
                case 1:
               
                // definindo opções para cliente
                
                    int controladorcli = 0;  
                    
                  
                    
                    do{
                        System.out.println(""
                        + "+++++++++++++++++++++++++\n"
                        + "+         Cliente       +\n"
                        + "+-----------------------+\n"
                        + "+0 - Sair               +\n"
                        + "+1 - Inclusao           +\n"
                        + "+2 - Alteracao          +\n"
                        + "+3 - Exclusao           +\n"
                        + "+4 - Listar             +\n"
                        + "+++++++++++++++++++++++++\n");
                        
                        boolean continuar1 = true;
                        do{
                            try{


                                controladorcli = imput.nextInt();                    
                                continuar1 = false;
                            }catch(InputMismatchException e){
                                imput.next();
                                System.err.println(e);
                                System.out.println("ERRO!!! Entre com um valor inteiro.");
                            }

                        }while(continuar1);

                        String buscaNome;
                        int numero;
                        
                    
                        switch(controladorcli) {
                            case 0:
                                System.out.println("Sair"); // sai do programa
                                break;
                            case 1:
                                // incluindo novos clientes
                                System.out.println("incluir");
                                
                                // adicionando novos clientes
                                System.out.println("---------------------------");
                                System.out.println("Insira os dados do cliente");
                                System.out.println("---------------------------");
                                
                                System.out.print("nome:");
                                novoCliente[idxCli].setNome(input2.nextLine());
                                
                                System.out.print("CPF:");
                                novoCliente[idxCli].setCpf(input2.nextLine());
                                
                                System.out.println("Enderço");                            
                                
                                System.out.print("Estado:");
                                novoEnd.setEstado(input2.nextLine());                               
                                
                                System.out.print("Cidade:");
                                novoEnd.setCidade(input2.nextLine());                                                               
                                
                                System.out.print("Cep:");
                                novoEnd.setCep(input2.nextLine());
                               
                                System.out.print("Bairro:");
                                novoEnd.setBairro(input2.nextLine());                                
                                
                                System.out.print("Rua:");
                                novoEnd.setRua(input2.nextLine());
                                
                                System.out.print("Número:");
                               
                                // tratando quando o usuario insere um numero que não pode ser convertido
                                try {
                                    buscaNome = input2.nextLine();
                                    numero = Integer.parseInt(buscaNome);
                                } catch (NumberFormatException e) {
                                    System.out.println("Por favor, digite apenas números!");
                                    novoEnd.setNumero(input2.nextLine());
                                }

                                
                                System.out.print("observações:");                            
                                novoCliente[idxCli].setDados_adicionais(input2.nextLine());
                                
                                
                                novoCliente[idxCli].setEnd(novoEnd);

                          
                                
                                cli.add(novoCliente[idxCli]);
                                System.out.println("Operação realizada com sucesso!");
                                idxCli++;
                                break;
                            case 2:
                                // alterando informações
                                System.out.println("alterar");
                                if(cli.isEmpty()){
                                    System.out.println("Não há clientes");
                                }else{
                                    // percorrendo o treeSet
                                    // e procurando o nome especificado
                                    System.out.println("Insira o nome do cliente:");
                                    buscaNome = input2.nextLine();
                                    
                                    Iterator i = cli.iterator();
                                    Cliente c;
                                    while(i.hasNext()){
                                        c = (Cliente) i.next(); 
                                        
                                        // comparando os nomes
                                        if((buscaNome.contains(c.getNome())) == true){
                                            System.out.println("Cliente econtrado!\nexibindo informações atuais...");
                                            System.out.println("-------------------------------------------");
                                            System.out.println("Cliente: " + c.getNome());
                                            System.out.println("CPF: " + c.getCpf());
                                            System.out.println("Estado: " + c.getEnd().getEstado());
                                            System.out.println("Cidade: " + c.getEnd().getCidade());
                                            System.out.println("Cep: " + c.getEnd().getCep());
                                            System.out.println("Bairro: " + c.getEnd().getBairro());
                                            System.out.println("Rua: " + c.getEnd().getRua());
                                            System.out.println("Numero: " + c.getEnd().getNumero());
                                            System.out.println("Observaçoes: " + c.getDados_adicionais());
                                            System.out.println("-------------------------------------------");
                                            
                                            // alterando informações desejadas
                                            System.out.println("===============================================");
                                            System.out.println("Insira as alterações ou aperte N para manter");
                                            
                                            System.out.println("Estado: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setEstado(buscaNome);
                                            }
                                            
                                            System.out.println("Cidade: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setCidade(buscaNome);
                                            }
                                            
                                            System.out.println("Cep: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setCep(buscaNome);
                                            }
                                            
                                            System.out.println("Bairro: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setBairro(buscaNome);
                                            }
                                            
                                            System.out.println("Rua: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setRua(buscaNome);
                                            }
                                            
                                            System.out.println("Número: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setNumero(buscaNome);
                                            }
                                            
                                            System.out.println("Observações: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.setDados_adicionais(buscaNome);
                                            }
                                            
                                            System.out.println("===============================================");
                                            
                                            
                                            System.out.println("Novas informações...");
                                            System.out.println("-------------------------------------------");
                                            System.out.println("Cliente: " + c.getNome());
                                            System.out.println("CPF: " + c.getCpf());
                                            System.out.println("Estado: " + c.getEnd().getEstado());
                                            System.out.println("Cidade: " + c.getEnd().getCidade());
                                            System.out.println("Cep: " + c.getEnd().getCep());
                                            System.out.println("Bairro: " + c.getEnd().getBairro());
                                            System.out.println("Rua: " + c.getEnd().getRua());
                                            System.out.println("Numero: " + c.getEnd().getNumero());
                                            System.out.println("Observaçoes: " + c.getDados_adicionais());
                                            System.out.println("-------------------------------------------");
                                            
                                            break;
                                         }else{
                                            System.out.println("Sem resultados!");
                                            //System.out.print((buscaNome == c.getNome()));
                                            
                                         }
                                        
                                 
                                            
                                    }
                                }
                                break;   
                            case 3:
                                
                                System.out.println("excluir");
                                System.out.println("Insira o nome do cliente:");
                                buscaNome = input2.nextLine();
                                if(cli.isEmpty()){
                                    System.out.println("Não há itens");
                                }else{
                                    Iterator i = cli.iterator();
                                    Cliente c;
                                    while(i.hasNext()){
                                        c = (Cliente) i.next();
                                        if(buscaNome.contains(c.getNome())){
                                            cli.remove(c);
                                            idxCli--;
                                            break;
                                        }
                                    }
                                }
                                System.out.println("cliente removido!");
                                
                                break;
                            case 4:
                                // listando os clientes cadastrados
                                System.out.println("Listar");
                                if(cli.isEmpty()){
                                    System.out.println("Não há clientes ):");
                                }
                                Iterator i = cli.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Cliente c = (Cliente) i.next();
                                    
                                        
                                        c.imprimicadastro();
                                    
                                    cont++;
                                            
                                }
                                
                            break;
                        default:
                            System.out.println("entrada invalida");
                    }
                    
                }while(controladorcli != 0);
        
               break;
            case 2:        
                int controladorVendedor = 0;
                String buscaNome;
               do{       
                    System.out.println(""
                    + "+++++++++++++++++++++++++\n"
                    + "+        Vendedor       +\n"
                    + "+-----------------------+\n"
                    + "+0 - Sair               +\n"
                    + "+1 - Inclusao           +\n"
                    + "+2 - Alteracao          +\n"
                    + "+3 - Exclusao           +\n"
                    + "+4 - Listar             +\n"
                    + "+++++++++++++++++++++++++\n");
                    
                    boolean continuar1 = true;
                        do{
                            try{


                                controladorVendedor = imput.nextInt();                    
                                continuar1 = false;
                            }catch(InputMismatchException e){
                                imput.next();
                                System.err.println(e);
                                System.out.println("ERRO!!! Entre com um valor inteiro.");
                            }

                        }while(continuar1);

                    
                    switch(controladorVendedor) {
                    case 0:
                        System.out.println("Sair");
                    break;
                    case 1:
                        System.out.println("incluir");
                                
                                // adicionando novos clientes
                                System.out.println("---------------------------");
                                System.out.println("Insira os dados do Vendedor");
                                System.out.println("---------------------------");
                                
                                System.out.println("nome:");
                                novoVendedor[idxVend].setNome(input2.nextLine());
                                
                                System.out.println("CPF:");
                                novoVendedor[idxVend].setCpf(input2.nextLine());
                                
                                System.out.println("Enderço");                            
                                
                                System.out.print("Estado:");
                                novoEnd.setEstado(input2.nextLine());                               
                                
                                System.out.print("Cidade:");
                                novoEnd.setCidade(input2.nextLine());                                                               
                                
                                System.out.print("Cep:");
                                novoEnd.setCep(input2.nextLine());
                               
                                System.out.print("Bairro:");
                                novoEnd.setBairro(input2.nextLine());                                
                                
                                System.out.print("Rua:");
                                novoEnd.setRua(input2.nextLine());
                                
                                System.out.print("Número:");
                                novoEnd.setNumero(input2.nextLine());
                                
                                //System.out.print("Comissão:");                            
                                //novoVendedor.setComisao(input3.nextFloat());
                                
                                novoVendedor[idxVend].setEnd(novoEnd);
                   

                          
                                
                                vend.add(novoVendedor[idxVend]);
                                System.out.println("Operação realizada com sucesso!");
                                break;
                    
                    case 2:
                        // alterando informações
                        
                                System.out.println("alterar");
                                if(vend.isEmpty()){
                                    System.out.println("Não há vendedores");
                                }else{
                                    // percorrendo o treeSet
                                    // e procurando o nome especificado
                                    System.out.println("Insira o nome do cliente:");
                                    buscaNome = input2.nextLine();
                                    
                                    Iterator i = vend.iterator();
                                    Vendedor c;
                                    while(i.hasNext()){
                                        c = (Vendedor) i.next(); 
                                        
                                        // comparando os nomes
                                        if((buscaNome.contains(c.getNome())) == true){
                                            System.out.println("vendedor econtrado!\nexibindo informações atuais...");
                                            System.out.println("-------------------------------------------");
                                            System.out.println("Vendedor: " + c.getNome());
                                            System.out.println("Estado: " + c.getEnd().getEstado());
                                            System.out.println("Cidade: " + c.getEnd().getCidade());
                                            System.out.println("Cep: " + c.getEnd().getCep());
                                            System.out.println("Bairro: " + c.getEnd().getBairro());
                                            System.out.println("Rua: " + c.getEnd().getRua());
                                            System.out.println("Numero: " + c.getEnd().getNumero());
                                            System.out.println("comissão: " + c.getComisao());
                                            System.out.println("-------------------------------------------");
                                            
                                            // alterando informações desejadas
                                            System.out.println("===============================================");
                                            System.out.println("Insira as alterações ou aperte N para manter");
                                            
                                            System.out.println("Estado: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setEstado(buscaNome);
                                            }
                                            
                                            System.out.println("Cidade: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setCidade(buscaNome);
                                            }
                                            
                                            System.out.println("Cep: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setCep(buscaNome);
                                            }
                                            
                                            System.out.println("Bairro: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setBairro(buscaNome);
                                            }
                                            
                                            System.out.println("Rua: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setRua(buscaNome);
                                            }
                                            
                                            System.out.println("Número: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.getEnd().setNumero(buscaNome);
                                            }
                                            
                                            System.out.println("comissão: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.setComisao(input3.nextFloat());
                                            }
                                            
                                            System.out.println("===============================================");
                                            
                                            
                                            System.out.println("Novas informações...");
                                            System.out.println("-------------------------------------------");
                                            System.out.println("Cliente: " + c.getNome());
                                            System.out.println("Estado: " + c.getEnd().getEstado());
                                            System.out.println("Cidade: " + c.getEnd().getCidade());
                                            System.out.println("Cep: " + c.getEnd().getCep());
                                            System.out.println("Bairro: " + c.getEnd().getBairro());
                                            System.out.println("Rua: " + c.getEnd().getRua());
                                            System.out.println("Numero: " + c.getEnd().getNumero());
                                            System.out.println("comissão: " + c.getComisao());
                                            System.out.println("-------------------------------------------");
                                            
                                            break;
                                         }else{
                                            System.out.println("Sem resultados!");
                                            
                                            
                                         }
                                        
                                 
                                            
                                    }
                                }
                                break;   
                    case 3:
                        System.out.println("excluir");
                                System.out.println("Insira o nome do vendedor:");
                                buscaNome = input2.nextLine();
                                if(vend.isEmpty()){
                                    System.out.println("Não há itens");
                                }else{
                                    Iterator i = vend.iterator();
                                    Vendedor c;
                                    while(i.hasNext()){
                                        c = (Vendedor) i.next();
                                        if(buscaNome.contains(c.getNome())){
                                            vend.remove(c);
                                            idxVend--;
                                            break;
                                        }
                                    }
                                }
                                System.out.println("Vendedor removido!");
                                
                                break;
                    
                    case 4:
                        // listando os clientes cadastrados
                                System.out.println("Listar");
                                if(vend.isEmpty()){
                                    System.out.println("Não há Vendedores!):");
                                }
                                Iterator i = vend.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Vendedor c = (Vendedor) i.next();
                                    
                                        System.out.println("Vendedor: " + c.getNome());
                                    
                                    cont++;
                                            
                                }
                                break;
                    default:
                        System.out.println("entrada invalida");
                    }
               }while(controladorVendedor != 0);

            break;   
            case 3:
                int controladorProduto = 0;
               do{
                    System.out.println(""
                    + "+++++++++++++++++++++++++\n"
                    + "+        Produto        +\n"
                    + "+-----------------------+\n"
                    + "+0 - Sair               +\n"
                    + "+1 - Inclusao           +\n"
                    + "+2 - Alteracao          +\n"
                    + "+3 - Exclusao           +\n"
                    + "+4 - Listar             +\n"
                    + "+++++++++++++++++++++++++\n");
                    
                    boolean continuar1 = true;
                        do{
                            try{


                                controladorProduto = imput.nextInt();                    
                                continuar1 = false;
                            }catch(InputMismatchException e){
                                imput.next();
                                System.err.println(e);
                                System.out.println("ERRO!!! Entre com um valor inteiro.");
                            }

                        }while(continuar1);
                    
                    switch(controladorProduto) {
                    case 0:
                        System.out.println("Sair");
                    break;
                    case 1:
                        System.out.println("incluir");
                                
                                // adicionando novos clientes
                                System.out.println("---------------------------");
                                System.out.println("Insira os dados do Produto");
                                System.out.println("---------------------------");
                                
                                
                                System.out.print("Codigo:");
                                novoProduto[idxProd].setCodigo(input2.nextLine());
                                
                                System.out.print("Unidade:");
                                novoProduto[idxProd].setUnidade(input2.nextLine());
                                
                                
                                
                                                       
                                
                                System.out.print("Descrição:");
                                novoProduto[idxProd].setDescricaoproduto(input2.nextLine());                               
                                
                                System.out.print("Preço unitário:");
                                novoProduto[idxProd].setPrecounitario(input2.nextFloat());                                                               
                                
                                
                                

                          
                                
                                prod.add(novoProduto[idxProd]);
                                System.out.println("Operação realizada com sucesso!");
                                break;
                        
                    
                    case 2:
                        // alterando informações
                        
                                System.out.println("alterar");
                                if(prod.isEmpty()){
                                    System.out.println("Não há produtos");
                                }else{
                                    // percorrendo o treeSet
                                    // e procurando o nome especificado
                                    System.out.println("Insira o código do produto:");
                                    buscaNome = input2.nextLine();
                                    
                                    Iterator i = prod.iterator();
                                    Produto_Informatica c;
                                    while(i.hasNext()){
                                        c = (Produto_Informatica) i.next(); 
                                        
                                        // comparando os nomes
                                        if((buscaNome.contains(c.getCodigo())) == true){
                                            System.out.println("vendedor econtrado!\nexibindo informações atuais...");
                                            System.out.println("-------------------------------------------");
                                            System.out.println("Código: " + c.getCodigo());
                                            System.out.println("Descrição: " + c.getDescricaoproduto());
                                            System.out.println("Unidade: " + c.getUnidade());
                                            System.out.println("Preço unitário: " + c.getPrecounitario());
                                           
                                            
                                            // alterando informações desejadas
                                            System.out.println("===============================================");
                                            System.out.println("Insira as alterações ou aperte N para manter");
                                            
                                            System.out.println("Código: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.setCodigo(buscaNome);
                                            }
                                            
                                            System.out.println("Descrição: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.setDescricaoproduto(buscaNome);
                                            }
                                            
                                            System.out.println("Unidade: " );
                                            buscaNome  =   input2.nextLine();
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.setUnidade(buscaNome);
                                            }
                                            
                                            System.out.println("Preco unitario: " );
                                            buscaNome  =   input2.nextLine();
                                            
                                            
                                            // forçando o valor ser tipo flutuante
                                            Float f = Float.valueOf(0);
                                            try {
                                                f = Float.valueOf(buscaNome.trim()).floatValue();
                                    
                                            }
                                            catch (NumberFormatException nfe){
                                                System.err.println("NumberFormatException: " + nfe.getMessage());
                                            }
                                            
                                            // se for diferente de n deve ser alterado
                                            if(buscaNome.contains("n") == false){
                                                c.setPrecounitario(f);
                                            }
                                            
                                            
                                            
                                            System.out.println("===============================================");
                                            
                                            
                                            System.out.println("Novas informações...");
                                            System.out.println("-------------------------------------------");
                                            System.out.println("Código: " + c.getCodigo());
                                            System.out.println("Descrição: " + c.getDescricaoproduto());
                                            System.out.println("Unidade: " + c.getUnidade());
                                            System.out.println("Preço Unitário: " + c.getPrecounitario());
                                            System.out.println("-------------------------------------------");
                                            
                                            break;
                                         }else{
                                            System.out.println("Sem resultados!");
                                            
                                            
                                         }
                                        
                                 
                                            
                                    }
                                }
                                break;   
                   
                    case 3:
                        System.out.println("excluir");
                                System.out.println("Insira o codigo do produto:");
                                buscaNome = input2.nextLine();
                                if(prod.isEmpty()){
                                    System.out.println("Não há itens");
                                }else{
                                    Iterator i = prod.iterator();
                                    Produto_Informatica c;
                                    while(i.hasNext()){
                                        c = (Produto_Informatica) i.next();
                                        if(buscaNome.contains(c.getCodigo())){
                                            vend.remove(c);
                                            idxProd--;
                                            break;
                                        }
                                    }
                                }
                                System.out.println("produto removido!");
                                
                                break;
                 
                    case 4:
                        // listando os clientes cadastrados
                                System.out.println("Listar");
                                if(cli.isEmpty()){
                                    System.out.println("Não há Produtos! ):");
                                }
                                Iterator i = prod.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Produto_Informatica c = (Produto_Informatica) i.next();
                                    
                                        System.out.println("Produto: " + c.getCodigo());
                                    
                                    cont++;
                                            
                                }
                                break;
                    default:
                        System.out.println("entrada invalida");
                    }
               }while(controladorProduto != 0);
                
            break;
            case 4:
              
                System.out.println("PDV");               
                int controladorPdv= 0;
                String buscaN;
                
                int aux = 0;
                int aux2 = 0;
                int aux3 = 0;
                
               do{
                                       System.out.println(""
                    + "+++++++++++++++++++++++++\n"
                    + "+          PDV          +\n"
                    + "+-----------------------+\n"
                    + "+0 - Sair               +\n"
                    + "+1 - Efetuar Venda      +\n"
                    + "+2 - Listar             +\n"
                    + "+++++++++++++++++++++++++\n");
                    
                    boolean continuar1 = true;
                        do{
                            try{


                                controladorPdv = imput.nextInt();                   
                                continuar1 = false;
                            }catch(InputMismatchException e){
                                imput.next();
                                System.err.println(e);
                                System.out.println("ERRO!!! Entre com um valor inteiro.");
                            }

                        }while(continuar1);
                    
                    
                    
                    switch(controladorPdv) {
                    case 0:
                        System.out.println("Sair");
                        break;
                    case 1:
                        System.out.println("Efetuar venda");
                        // inserindo cliente se não estiver no banco de dados
                        System.out.println("Insira o nome do cliente");
                        buscaN = input2.nextLine();
                        // buscando no na coleção o cliente cadastrado
                        if(cli.isEmpty()){
                            System.out.println("Nenhum cliente cadastrado!");
                            break;
                            
                        }else{
                            
                            Iterator i = cli.iterator();
                            Cliente obj;
                            
                            
                            while(i.hasNext()){
                                obj = (Cliente)i.next();
                                if(buscaN.contains(obj.getNome())){
                                    //novoCliente = obj;
                                    // validando nova venda                        
                                     novaVenda[idxVen].setCliente(obj);
                                    aux = 1;
                                    break;
                                }else{
                                    System.out.println("Nenhum Cliente cadastrado!");
                                    break;
                                }
                                
                            }
                        }
                        // saindo se aux = 0
                        if(aux == 0){
                            break;
                        }
                        
                        System.out.println("Insira o nome do Vendedor");
                        buscaN = input2.nextLine(); 
                        
                        
                        // buscando no na coleção o cliente cadastrado
                        if(vend.isEmpty()){
                            System.out.println("Nenhum Vendedor cadastrado!");
                            break;
                            
                        }else{
                            
                            Iterator i = vend.iterator();
                            Vendedor obj;
                            
                            
                            while(i.hasNext()){
                                obj = (Vendedor)i.next();
                                if(buscaN.contains(obj.getNome())){
                                    //novoVendedor = obj;
                                    // validando nova venda                        
                                     novaVenda[idxVen].setVendedor(obj);
                                    aux2 = 1;
                                    break;
                                }else{
                                    System.out.println("Nenhum Vendedor cadastrado!");
                                    
                                    break;
                                }
                                
                            }
                        }
                        
                        // lendo varios produtos 
                        if(aux2 == 0){
                            break;
                        }
                        
                        // somar produtos comprados
                        int somadorProdutos = 0;
                        int quantProdutos; // leitura de quantidade de produtos
                        
                    
                        System.out.println("Insira o codigo e a quantidade de produtos");
                        buscaN = input2.nextLine();
                        quantProdutos = imput.nextInt();
                        
                        // buscando no na coleção o cliente cadastrado
                        if(prod.isEmpty()){
                            System.out.println("Nenhum produto cadastrado!");
                            break;
                            
                        }else{
                            
                            Iterator i = prod.iterator();
                            Produto_Informatica obj;
                            
                            
                            
                            while(i.hasNext()){
                                obj = (Produto_Informatica)i.next();
                                if(buscaN.contains(obj.getCodigo())){
                                   // novoProduto = obj;
                                    // validando nova venda 
                                     novaVenda[idxVen].setValor_Total(quantProdutos * obj.getPrecounitario());
                                     novaVenda[idxVen].setProduto(obj);
                                     
                                     
                                     
                                     
                                    aux3 = 1;
                                    break;
                                }else{
                                    System.out.println("Nenhum Produto cadastrado!");
                                    break;
                                }
                                
                            }
                        }
                   
                        
               
                        
                         
                        
                        // auxiliar para produto
                        if(aux3 == 0){
                            break;
                        }    
                       novaVenda[idxVen].setQuantidade(quantProdutos);
                       venda1.add(novaVenda[idxVen]);
                       idxVen++;
                       System.out.println("Venda feita com sucesso!");
                       break;
                        
                    
                    
                    case 2:
                        // listando os clientes cadastrados
                                System.out.println("Listar");
                                if(venda1.isEmpty()){
                                    System.out.println("Nenhuma venda!");
                                }
                                Iterator i = venda1.iterator();
                                
                               int cont = 0;
                                while(i.hasNext()){
                                    Venda c = (Venda) i.next();
                                        System.out.println("Venda " + (cont+1));
                                        System.out.println("Cliente: " + c.getCliente().getNome());
                                        System.out.println("Vendedor: " + c.getVendedor().getNome());
                                        System.out.println("Valor total " + c.getValor_Total());
                                    
                                    cont++;
                                            
                                }
                                break;
                    
                    default:
                        System.out.println("entrada inválida");
                    }
                    // o usuario vai ser redirecionado para a tela de cadastrar 
                    if(aux == 0){
                        System.out.println("Por favor, cadastre o cliente primeiro!");
                        break;
                    }
                    if(aux2 == 0){
                        System.out.println("Por favor, cadastre o vendedor primeiro!");
                        break;
                    }
                    if(aux3 == 0){
                        System.out.println("Por favor, cadastre o Produto primeiro!");
                        break;
                    }
                    
                
                    
                    
               }while(controladorPdv != 0);
               break;
            default:
                System.out.println("entrada inválida");
            }
             
             
        }while(controlador != 0);
 
        
        
        
    }
    
}
