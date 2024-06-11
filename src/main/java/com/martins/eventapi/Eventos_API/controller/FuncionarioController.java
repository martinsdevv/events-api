package com.martins.eventapi.Eventos_API.controller;

import com.martins.eventapi.Eventos_API.model.Funcionario;
import com.martins.eventapi.Eventos_API.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/func")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/addfunc")
    public ResponseEntity<Funcionario> addFuncionario(@RequestBody Funcionario funcionario){
        Funcionario newFunc = funcionarioService.addFunc(funcionario);
        return new ResponseEntity<>(newFunc, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Funcionario>> getAllFunc(){
        List<Funcionario> func = funcionarioService.getAllFunc();
        return new ResponseEntity<>(func, HttpStatus.OK);
    }

}
