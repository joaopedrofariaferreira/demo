package joao.faria.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joao.faria.demo.model.Produto;



@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping
    public void salvarProduto( Produto produto){
        System.out.println("produto Recebido: " + produto);
    }
    
}
