package com.devsuperior.hrpayroll.feignclients;


import com.devsuperior.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
* @Component = Componente gerenciado pelo spring para poder injeta-lo em outro lugar
* @FeignClient(name = "nome do serviço a ser chamado", url = "url do serviço", path = "/workers")
* */

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {

    //Tipo de chamada que vai ser feita ao webservice
    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}