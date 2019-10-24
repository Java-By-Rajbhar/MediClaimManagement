package com.hcl.mediclaim.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 
 * @author Sushil
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApproveClaimRequestDto {
	
	private int userId;
	private String status;
	private String remarks;

}
