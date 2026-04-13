package comparable_ejemplo;

import java.util.Comparator;

public class AlumnoPorNiaComparator implements Comparator<Alumno>{

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getNia().compareTo(a2.getNia());
	}

}
