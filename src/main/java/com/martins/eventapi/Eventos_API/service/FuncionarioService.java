package com.martins.eventapi.Eventos_API.service;

import com.martins.eventapi.Eventos_API.model.Funcionario;
import com.martins.eventapi.Eventos_API.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario addFunc(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> getAllFunc() {
        return funcionarioRepository.findAll();
    }

}
