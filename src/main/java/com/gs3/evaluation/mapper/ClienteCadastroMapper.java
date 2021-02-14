package com.gs3.evaluation.mapper;

import com.gs3.evaluation.domain.Cliente;
import com.gs3.evaluation.dto.ClienteCadastroDTO;
import com.gs3.evaluation.dto.ClienteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClienteCadastroMapper extends BaseMapper<Cliente, ClienteCadastroDTO> {


}
