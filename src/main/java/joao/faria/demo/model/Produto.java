package joao.faria.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private String preco;

}
