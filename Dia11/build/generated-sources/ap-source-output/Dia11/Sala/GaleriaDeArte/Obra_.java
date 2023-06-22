package Dia11.Sala.GaleriaDeArte;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Obra.class)
public abstract class Obra_ {

	public static volatile SingularAttribute<Obra, String> dimensoes;
	public static volatile SingularAttribute<Obra, String> tipo;
	public static volatile SingularAttribute<Obra, String> procedencia;
	public static volatile SingularAttribute<Obra, String> titulo;
	public static volatile SingularAttribute<Obra, String> tecnica;
	public static volatile SingularAttribute<Obra, Integer> id;
	public static volatile SingularAttribute<Obra, Calendar> dataObra;
	public static volatile SingularAttribute<Obra, String> autor;

	public static final String DIMENSOES = "dimensoes";
	public static final String TIPO = "tipo";
	public static final String PROCEDENCIA = "procedencia";
	public static final String TITULO = "titulo";
	public static final String TECNICA = "tecnica";
	public static final String ID = "id";
	public static final String DATA_OBRA = "dataObra";
	public static final String AUTOR = "autor";

}

