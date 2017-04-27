package com.example.project.dto;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class NeoDto {
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		try {

			Field[] allFields = this.getClass().getDeclaredFields();

			for (Field field : allFields) {

				if (Modifier.isPrivate(field.getModifiers())) {

					field.setAccessible(true);

					String fieldName = field.getName();
					Object fieldValue = field.get(this);

					if (fieldValue != null) {

						sb.append(fieldName.toUpperCase()).append("=").append("[").append(fieldValue).append("] ");

					}
				}
			}

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return sb.toString().trim();

	}
}
