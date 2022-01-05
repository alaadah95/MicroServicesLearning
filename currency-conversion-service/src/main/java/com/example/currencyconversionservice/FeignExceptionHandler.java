package com.example.currencyconversionservice;

import org.springframework.stereotype.Component;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class FeignExceptionHandler implements ErrorDecoder{

	@Override
	public Exception decode(String methodKey, Response response) {
	 
		switch (response.status()) {
		case 500:
			System.out.println("HHHHHHHHHHHHHHHHHHsssssssssssssssssssssssss");
			break;
		default:
			break;
		}
		return new Exception("s->"+response.reason());
	}

}
