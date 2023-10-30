package sqlGen;

public class Gerador {

	private String codigo;
	private String tipo;
	private boolean notNull;
	private boolean autoIncrement;
	
	public Gerador(String codigo, String tipo, boolean notNull, boolean autoIncrement) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.notNull = notNull;
		this.autoIncrement = autoIncrement;
	}
	
	public String gerar() {
		StringBuilder builder = new StringBuilder();
		builder.append(codigo);
		builder.append(" ");
		builder.append(tipo);
		if (notNull) {
			builder.append(" NOT NULL");
		}
		if (autoIncrement) {
			builder.append(" AUTO INCREMENT");
		}
		builder.append(",");
		
		return builder.toString();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isNotNull() {
		return notNull;
	}

	public void setNotNull(boolean notNull) {
		this.notNull = notNull;
	}

	public boolean isAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gerador [codigo=");
		builder.append(codigo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", notNull=");
		builder.append(notNull);
		builder.append(", autoIncrement=");
		builder.append(autoIncrement);
		builder.append("]");
		return builder.toString();
	}
}
