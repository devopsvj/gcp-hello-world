package com.sabre.labs.gcpdemo.feign.dtos;

import com.sabre.labs.gcpdemo.jpa.entity.CasesInAllUSStates;
import lombok.Data;

import java.util.List;

@Data
public class CasesInAllUSStateTable {
    private List<CasesInAllUSStates> table;
}
