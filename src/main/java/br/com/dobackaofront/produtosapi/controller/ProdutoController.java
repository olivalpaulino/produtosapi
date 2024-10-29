package br.com.dobackaofront.produtosapi.controller;

import br.com.dobackaofront.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto Recebido!" + produto);
        return produto;
    }
}