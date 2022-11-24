package Mapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Dto.ActeurDto;
import Dto.FilmDto;
import Dto.GenreDto;
import Dto.LieuDto;
import Dto.RealisateurDto;
import Dto.RoleDto;

public class MapperObject {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
		ActeurDto [] acteur = mapper.readValue(new File("C:\\Users\\films.json"), ActeurDto [].class);
		System.out.println(acteur.toString());

		

	}

}
