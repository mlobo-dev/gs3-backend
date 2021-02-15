package com.gs3.evaluation.mapper;

import com.gs3.evaluation.domain.Endereco;
import com.gs3.evaluation.dto.EnderecoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnderecoMapper extends BaseMapper<Endereco, EnderecoDTO> {


}
