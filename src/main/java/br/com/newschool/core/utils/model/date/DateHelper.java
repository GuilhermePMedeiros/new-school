package br.com.newschool.core.utils.model.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 21/12/2021
 * */

public class DateHelper {
	
	public static String getFormatedData(Date date) {
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}
	
}
