package com.rci.ptcp.springbatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TPTCP00")
//@Table(name = "TPTCP00_TEST")
public class CodigosPostales {

	/**
	 * Identificador de codigo postal
	 * 
	 * NOTA: increment Lanza una consulta SELECT MAX() contra la columna de la base de datos 
	 * y se obtiene el valor de la última clave primaria, incrementando el nº en 1.
	 * La columna de base de datos debe ser de tipo numérico
	 * 
	 * Field type in DB: NUMBER(26,0)
	 */
	@Id
	@Column(name = "ID")
	@GeneratedValue( generator = "generador_propietario_hibernate_increment" )
	@org.hibernate.annotations.GenericGenerator(
	     name = "generador_propietario_hibernate_increment",
	     strategy = "increment"
	)
	private long id;
	
	/**
	 * Código de Distrito
	 * 
	 * Field type in DB: NUMBER(2,0)
	 */
	@Column(name = "DD")
	private int dd;
	
	/**
	 * Código de Municipio
	 * 
	 * Field type in DB: NUMBER(2,0)
	 */
	@Column(name = "CC")
	private int cc;
	
	/**
	 * Código de la Localidad
	 * 
	 * Field type in DB: NUMBER(5,0)
	 */
	@Column(name = "LLLL")
	private long llll;
	
	/**
	 * Nombre de la Localidad
	 * 
	 * Field type in DB: VARCHAR2(70 BYTE)
	 */
	@Column(name = "LOCALIDADE")
	private String localidade;
	
	/**
	 * Código de la Arteria (Calle, Plaza, etc.)
	 * 
	 * Field type in DB: VARCHAR2(40 BYTE)
	 */
	@Column(name = "ART_COD")
	private String art_cod;
	
	/**
	 * Tipo de Arteria (Calle, Plaza, etc.)
	 * 
	 * Field type in DB: VARCHAR2(40 BYTE)
	 */
	@Column(name = "ART_TIPO")
	private String art_tipo;
	
	/**
	 * Primera Preposición
	 * 
	 * Field type in DB: VARCHAR2(10 BYTE)
	 */
	@Column(name = "PRI_PREP")
	private String pri_prep;
	
	/**
	 * Nombre de Calle
	 * 
	 * Field type in DB: VARCHAR2(70 BYTE)
	 */
	@Column(name = "ART_TITULO")
	private String art_titulo;
	
	/**
	 * Segunda Preposición
	 * 
	 * Field type in DB: VARCHAR2(10 BYTE)
	 */
	@Column(name = "SEG_PREP")
	private String seg_prep;
	
	/**
	 * Designación de Calle
	 * 
	 * Field type in DB: VARCHAR2(70 BYTE)
	 */
	@Column(name = "ART_DESIG")
	private String art_desig;
	
	/**
	 * Información Local
	 * 
	 * Field type in DB: VARCHAR2(70 BYTE)
	 */
	@Column(name = "ART_LOCAL")
	private String art_local;
	
	/**
	 * Tramo
	 * 
	 * Field type in DB: VARCHAR2(70 BYTE)
	 */
	@Column(name = "TRAMO")
	private String tramo;
	
	/**
	 * Puerta
	 * 
	 * Field type in DB: VARCHAR2(70 BYTE)
	 */
	@Column(name = "PUERTA")
	private String puerta;
	
	/**
	 * Cliente
	 * 
	 * Field type in DB: VARCHAR2(40 BYTE)
	 */
	@Column(name = "CLIENTE")
	private String cliente;
	
	/**
	 * Código Postal
	 * 
	 * Field type in DB: NUMBER(4,0)
	 */
	@Column(name = "CP4")
	private long cp4;
	
	/**
	 * Extensión de Código Postal
	 * 
	 * Field type in DB: NUMBER(3,0)
	 */
	@Column(name = "CP3")
	private long cp3;
	
	/**
	 *  Designación Postal
	 *  
	 *  Field type in DB: VARCHAR2(70 BYTE)
	 */
	@Column(name = "CPALF")
	private String cpalf;
	
	/**
	 * Identificación de Provincia Portugal Abaco
	 * 
	 * Field type in DB: NUMBER(2,0)
	 */
	@Column(name = "ID_PRO")
	private int id_pro;
	
	/**
	 * Nombre de la vía fusionada
	 * 
	 * Field type in DB: VARCHAR2(100 BYTE)
	 */
	@Column(name = "NOM_VIA")
	private String nom_via;
	
	/**
	 * Código de la vía
	 * 
	 * Field type in DB: VARCHAR2(8 BYTE)
	 */
	@Column(name = "COD_VIA")
	private String cod_via;
	
	/**
	 * Número de par mínimo
	 * 
	 * Field type in DB: VARCHAR2(4 BYTE)
	 */
	@Column(name = "NUMPARMIN")
	private String numparmin;
	
	/**
	 * Número de par máximo
	 * 
	 * Field type in DB: VARCHAR2(4 BYTE)
	 */
	@Column(name = "NUMPARMAX")
	private String numparmax;
	
	/**
	 * Número de impar mínimo
	 * 
	 * Field type in DB: VARCHAR2(4 BYTE)
	 */
	@Column(name = "NUMIMPARMIN")
	private String numimparmin;
	
	/**
	 * Número de impar máximo
	 * 
	 * Field type in DB: VARCHAR2(4 BYTE)
	 */
	@Column(name = "NUMIMPARMAX")
	private String numimparmax;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public long getLlll() {
		return llll;
	}

	public void setLlll(long llll) {
		this.llll = llll;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getArt_cod() {
		return art_cod;
	}

	public void setArt_cod(String art_cod) {
		this.art_cod = art_cod;
	}

	public String getArt_tipo() {
		return art_tipo;
	}

	public void setArt_tipo(String art_tipo) {
		this.art_tipo = art_tipo;
	}

	public String getPri_prep() {
		return pri_prep;
	}

	public void setPri_prep(String pri_prep) {
		this.pri_prep = pri_prep;
	}

	public String getArt_titulo() {
		return art_titulo;
	}

	public void setArt_titulo(String art_titulo) {
		this.art_titulo = art_titulo;
	}

	public String getSeg_prep() {
		return seg_prep;
	}

	public void setSeg_prep(String seg_prep) {
		this.seg_prep = seg_prep;
	}

	public String getArt_desig() {
		return art_desig;
	}

	public void setArt_desig(String art_desig) {
		this.art_desig = art_desig;
	}

	public String getArt_local() {
		return art_local;
	}

	public void setArt_local(String art_local) {
		this.art_local = art_local;
	}

	public String getTramo() {
		return tramo;
	}

	public void setTramo(String tramo) {
		this.tramo = tramo;
	}

	public String getPuerta() {
		return puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public long getCp4() {
		return cp4;
	}

	public void setCp4(long cp4) {
		this.cp4 = cp4;
	}

	public long getCp3() {
		return cp3;
	}

	public void setCp3(long cp3) {
		this.cp3 = cp3;
	}

	public String getCpalf() {
		return cpalf;
	}

	public void setCpalf(String cpalf) {
		this.cpalf = cpalf;
	}

	public int getId_pro() {
		return id_pro;
	}

	public void setId_pro(int id_pro) {
		this.id_pro = id_pro;
	}

	public String getNom_via() {
		return nom_via;
	}

	public void setNom_via(String nom_via) {
		this.nom_via = nom_via;
	}

	public String getCod_via() {
		return cod_via;
	}

	public void setCod_via(String cod_via) {
		this.cod_via = cod_via;
	}

	public String getNumparmin() {
		return numparmin;
	}

	public void setNumparmin(String numparmin) {
		this.numparmin = numparmin;
	}

	public String getNumparmax() {
		return numparmax;
	}

	public void setNumparmax(String numparmax) {
		this.numparmax = numparmax;
	}

	public String getNumimparmin() {
		return numimparmin;
	}

	public void setNumimparmin(String numimparmin) {
		this.numimparmin = numimparmin;
	}

	public String getNumimparmax() {
		return numimparmax;
	}

	public void setNumimparmax(String numimparmax) {
		this.numimparmax = numimparmax;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof CodigosPostales))
            return false;
        CodigosPostales other = (CodigosPostales) obj;
        if ((dd != other.dd) 
        		&& (cc != other.cc)
        		&& (llll != other.llll)
        		&& (!localidade.toLowerCase().trim().equals(other.localidade.toLowerCase().trim()))
        		&& (!art_cod.toLowerCase().trim().equals(other.art_cod.toLowerCase().trim()))
        		&& (!art_tipo.toLowerCase().trim().equals(other.art_tipo.toLowerCase().trim()))
        		&& (!pri_prep.toLowerCase().trim().equals(other.pri_prep.toLowerCase().trim()))
        		&& (!art_titulo.toLowerCase().trim().equals(other.art_titulo.toLowerCase().trim()))
        		&& (!seg_prep.toLowerCase().trim().equals(other.seg_prep.toLowerCase().trim()))
        		&& (!art_desig.toLowerCase().trim().equals(other.art_desig.toLowerCase().trim()))
        		&& (!art_local.toLowerCase().trim().equals(other.art_local.toLowerCase().trim()))
        		&& (!tramo.toLowerCase().trim().equals(other.tramo.toLowerCase().trim()))
        		&& (!puerta.toLowerCase().trim().equals(other.puerta.toLowerCase().trim()))
        		&& (!cliente.toLowerCase().trim().equals(other.cliente.toLowerCase().trim()))
        		&& (cp4 != other.cp4)
        		&& (cp3 != other.cp3)
        		&& (!cpalf.toLowerCase().trim().equals(other.cpalf.toLowerCase().trim()))
           )
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "CodigosPostales [id=" + id 
        		+ "\n\t, código de distrito=" + dd
                + "\n\t, código del municipio =" + cc 
                + "\n\t, código de la localidad=" + llll
                + "\n\t, nombre de la localidad=" + localidade
                + "\n\t, código de la arteria=" + art_cod
                + "\n\t, tipo de arteria=" + art_tipo
                + "\n\t, primera preposición=" + pri_prep
                + "\n\t, nombre de la calle=" + art_titulo
                + "\n\t, segunda preposición=" + seg_prep
                + "\n\t, designación de la calle=" + art_desig
                + "\n\t, información local=" + art_local
                + "\n\t, tramo=" + tramo
                + "\n\t, puerta=" + puerta
                + "\n\t, cliente=" + cliente
                + "\n\t, número de código postal=" + cp4
                + "\n\t, extensión del número de código postal=" + cp3
                + "\n\t, designación postal=" + cpalf
                + "\n\t, identificación de provincia=" + id_pro
                + "\n\t, nombre de la vía=" + nom_via
                + "\n\t, código de la vía=" + cod_via
                + "\n\t, número mínimo de par=" + numparmin
                + "\n\t, número máximo de par=" + numparmax
                + "\n\t, número mínimo de impar=" + numimparmin
                + "\n\t, número máximo de impar=" + numimparmax 
                + "\n]";
    }
	
}
