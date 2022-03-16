package com.e.pood.web.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderUpdateRequest {

	@JsonProperty("orderId")
	Integer orderId;

	@JsonProperty("orderStatus")
	String orderStatus;
}
