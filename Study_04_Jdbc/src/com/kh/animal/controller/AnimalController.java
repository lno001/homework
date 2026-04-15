package com.kh.animal.controller;

import java.util.List;

import com.kh.animal.model.dto.AnimalDto;
import com.kh.animal.model.service.AnimalService;

public class AnimalController {

	public List<AnimalDto> animalFindAll() {
		return new AnimalService().animalFindAll();
	}

}
