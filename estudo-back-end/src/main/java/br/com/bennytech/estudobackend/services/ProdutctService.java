package br.com.bennytech.estudobackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bennytech.estudobackend.model.Product;
import br.com.bennytech.estudobackend.repository.ProductRepository_old;

@Service
public class ProdutctService {

    @Autowired
    private ProductRepository_old productRepository;

    /**
     * Metodods para retornar uma lista de produtos.
     * 
     * @apiNote Lista de produtos.
     */
    public List<Product> obterTodos(){
        return productRepository.obterTodos();
        }

        /**
 * Metodo que retorna o produto encontrado pelo seu id.
 * @param id do produto que será localizado.
 * @return Retorna um produto no caso de encontra-lo.
 */
public Optional <Product> obterPorId(Integer id){
    return  productRepository.obterPorId(id);
}

/**
 * Metodo para adinionar um produto a lista.
 * @param product que será adicionado.
 * @return Retorna o produto que foi adicionado
 */
public Product addProduct(Product product) {
    return productRepository.addProduct(product);
      
}

/**
 * Método para deletar o produto por id.
 * @param id do produto que será deletado.
 */
public void delete(Integer id){
    productRepository.delete(id);
}

/**
 * Método para atualizar um produto na lista.
 * @param product que será atualizado.
 * @return Retorna o produto após atualizar a lista.
 */
public Product update(Integer id, Product product){
   product.setId(id);

   return productRepository.update(product);

}
    
}
