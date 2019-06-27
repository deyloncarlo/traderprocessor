package com.trader.traderprocessor.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageResource
{

	@GetMapping("/message/{id}")
	public ResponseEntity<?> createPedido(@PathVariable Long id) throws Exception
	{
		System.out.println(id);
		if (id != null)
		{

		}
		return new ResponseEntity<>("{id:" + id + "}", HttpStatus.OK);
	}

}
