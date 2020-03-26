package com.sensetime.ehr.emp.common.web;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
public class PageInfo extends PageInfoCommon implements Serializable {

    private static final long serialVersionUID = -7566428799400202500L;
}
