package br.com.bennytech.estudobackend.repository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.InputMismatchException;

import org.springframework.stereotype.Repository;

import br.com.bennytech.estudobackend.model.Product;
import br.com.bennytech.estudobackend.model.exception.ResourceNotFoundException;

@Repository
public class ProductRepository {
    
private List<Product> products = new ArrayList<>();
private Integer lastId  = 0;


/**
 * Metodods para retornar uma lista de produtos.
 * @apiNote Lista de produtos.
 */
public List<Product> obterTodos(){
    return products;
}

/**
 * Metodo que retorna o produto encontrado pelo seu id.
 * @param id do produto que será localizado.
 * @return Retorna um produto no caso de encontra-lo.
 */
public Optional <Product> obterPorId(Integer id){
    return products
                .stream()
                .filter(products -> products.getId() == id)
                .findFirst();
}


/**
 * Metodo para adinionar um produto a lista.
 * @param product que será adicionado.
 * @return Retorna o produto que foi adicionado
 */
public Product addProduct(Product product) {

    lastId++;
    product.setId(lastId); 
    products.add(product);

    return product;
}

/**
 * Método para deletar o produto por id.
 * @param id do produto que será deletado.
 */
public void delete(Integer id){
    products.removeIf(products -> products.getId() == id);

}

/**
 * Método para atualizar um produto na lista.
 * @param product que será atualizado.
 * @return Retorna o produto após atualizar a lista.
 */
public Product update(Product product){
    //encontrar o produto na lista:
    Optional<Product> productFound = obterPorId(product.getId());

    if(productFound.isEmpty()){
        throw new ResourceNotFoundException("Produto não encontrado.");
    }
    //remover o antigo produto da lista
    delete(product.getId());

    // Depois adicionar um novo produto.
    products.add(product);

    return product;
}
}

