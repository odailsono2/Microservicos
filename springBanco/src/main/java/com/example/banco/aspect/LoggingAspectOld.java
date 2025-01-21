// package com.example.banco.aspect;

// import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;
// import org.springframework.web.context.request.RequestContextHolder;
// import org.springframework.web.context.request.ServletRequestAttributes;

// import com.example.banco.service.RestTemplateService.ExternalService;
// import com.example.banco.service.banco.DiscoverService.ServiceDiscoveryController;

// import jakarta.servlet.http.HttpServletRequest;

// @Aspect
// @Component
// public class LoggingAspectOld {

//     private ServiceDiscoveryController discoverService;

//     @Autowired
//     private ExternalService externalService;

//     @Value("${bancoLog.nome:bancoLog-service}")
//     private String servico;// = "bancoLog-service";

//     @Value("${bancoLog.metodo:/bancoLog/criarLog/}")
//     private String metodo;// = "/criarLog/";

//     @Autowired
//     LoggingAspectOld(ServiceDiscoveryController discoverService){
//         this.discoverService = discoverService;
//     }

//     // Executa antes de qualquer método dentro de classes no pacote controller ser chamado
//     @Before("execution(* com.example.banco.controller.ControllerBanco.*(..))")
//     public void logMethodAccessBefore() {

//         Integer M1service_port = discoverService.getInstances(servico).get(0).getPort();

//         String M1service_url = discoverService.getInstances(servico).get(0).getHost()+":"+M1service_port;

//         HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
//         String op = request.getRequestURI().replace("/", "-");
        
//         // String instancesURL = "http://localhost:8081/bancoLog"+metodo+op;
//         String instancesURL = "http://"+M1service_url+metodo+op;
    
//         System.out.println("*****HTTP op: " + op);     
//         System.out.println("*****HTTP instancia: " + instancesURL); 
//         System.out.println("*****HTTP M1: " + M1service_url);     


//         externalService.retrieveDataFromExternalService(instancesURL);
//     }

// }

