package Mapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Dto.FilmDto;

public class MapperObject {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
		FilmDto film1 = mapper.readValue(new File("C:\\Users\\films.json"), FilmDto.class);
		System.out.println(film1);
	
	}

}

