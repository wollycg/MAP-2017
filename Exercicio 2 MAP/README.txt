No primeiro cenario (AluguelChale) o que ocorre é que no programa de gerenciamento de uma pousada o objeto pode ser instanciado 
varias vezes causado o problema de alugar o mesmo chale para varias pessoas. Para que isso não ocorra devemos limitar o numero
de instacias a uma unica instacia usando o padrao Singleton(AluguelChaleSingleton), onde o metodo estatico verifica se ja existe uma instancia criada se nao houver ele cria(usando o construtor da classe) e retorna true se houver ele nao cria e retorna(getInstace) false
 pq a instacia ja foi criada(chale alugado). 