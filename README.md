Desafio 2 Tecnico de Informatica
Exercicio 1- Comisão de vendedores - Técnico em Informática - Ulbra São Lucas - Sapucaia do Sul

Proposta a ser elaborada:

Observe o diagrama de classe abaixo e a tabela para calcular a comissão de um vendedor.
Vendedor
- nome: String
- meta: double
- totalVendido:double

+getNome():String
+getMeta():double
+getTotalVendido():double
+setNome(nome:String):void
+setMeta(meta:double):void
+setTotalVendido(totalVendido:double):void
+calcularComissao(valorVendido:float): double
+toString():String

Obs.: Usar esta tabela no método calcularComissao();

Valor vendido em relação a meta- Comissão sobre o valor total vendido
Menos de 50%-1%
De 50% a 75%-2,5%
De 75,1% a 100%- 3,5%
Acima de 100%-5%

Crie um projeto onde o usuário informe o nome do vendedor, a sua meta e o total vendido. Após isso, o programa deve calcular a comissão do vendedor, 
e em seguida exibir os dados do vendedor (seu nome e sua meta) e apresentar o valor que receberá de comissão.
