package com.ansteel.common.documentnumber.repository;

import com.ansteel.common.documentnumber.domain.DocumentNumber;
import com.ansteel.core.repository.ProjectRepository;

import java.util.List;

/**
 * Created by Administrator on 2016/2/1.
 */
public interface DocumentNumberRepository extends ProjectRepository<DocumentNumber,String> {
    DocumentNumber findOneByName(String name);
}
