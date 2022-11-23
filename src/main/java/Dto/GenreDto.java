package Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author odrey
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreDto {

		private List <String> type;

		/**
		 * @param type
		 */
		public GenreDto(List<String> type) {
			super();
			this.type = type;
		}

		public List<String> getType() {
			return type;
		}

		public void setType(List<String> type) {
			this.type = type;
		}

		
}
