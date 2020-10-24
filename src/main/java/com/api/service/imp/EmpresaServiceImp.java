package com.api.service.imp;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Empresa;
import com.api.repository.EmpresaRepository;
import com.api.service.EmpresaService;

@Service
public class EmpresaServiceImp implements EmpresaService {

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImp.class);

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresa para o CNPJ {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa {}", empresa);
		return this.empresaRepository.save(empresa);
	}
}
