package tallercomposite;

import java.time.LocalDate;
import java.util.Date;

public class EPS implements Contrato {

    private long codigoContrato;
    private String nombreCotizante;
    private long documentoIdentidadCotizante;
    private String fechaNacimientoCotizante;
    private String direcciónCotizante;
    private long telefonoCotizante;
    private char generoCotizante;
    private String nombreBeneficiario;
    private long documentoIdentidadBeneficiario;
    private String fechaNacimientoBeneficiario;
    private char generoBeneficiario;

    public EPS() {
        this.codigoContrato = 0;
        this.nombreCotizante = "";
        this.documentoIdentidadCotizante = 0;
        this.fechaNacimientoCotizante = "";
        this.direcciónCotizante = "";
        this.telefonoCotizante = 0;
        this.generoCotizante = '\0';
    }

    public EPS(long codigoContrato, String nombreCotizante, long documentoIdentidadCotizante, String fechaNacimientoCotizante, String direcciónCotizante, long telefonoCotizante, char generoCotizante) {
        this.codigoContrato = codigoContrato;
        this.nombreCotizante = nombreCotizante;
        this.documentoIdentidadCotizante = documentoIdentidadCotizante;
        this.fechaNacimientoCotizante = fechaNacimientoCotizante;
        this.direcciónCotizante = direcciónCotizante;
        this.telefonoCotizante = telefonoCotizante;
        this.generoCotizante = generoCotizante;
    }

    public long getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(long codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getNombreCotizante() {
        return nombreCotizante;
    }

    public void setNombreCotizante(String nombreCotizante) {
        this.nombreCotizante = nombreCotizante;
    }

    public long getDocumentoIdentidadCotizante() {
        return documentoIdentidadCotizante;
    }

    public void setDocumentoIdentidadCotizante(long documentoIdentidadCotizante) {
        this.documentoIdentidadCotizante = documentoIdentidadCotizante;
    }

    public String getFechaNacimientoCotizante() {
        return fechaNacimientoCotizante;
    }

    public void setFechaNacimientoCotizante(String fechaNacimientoCotizante) {
        this.fechaNacimientoCotizante = fechaNacimientoCotizante;
    }

    public String getDirecciónCotizante() {
        return direcciónCotizante;
    }

    public void setDirecciónCotizante(String direcciónCotizante) {
        this.direcciónCotizante = direcciónCotizante;
    }

    public long getTelefonoCotizante() {
        return telefonoCotizante;
    }

    public void setTelefonoCotizante(long telefonoCotizante) {
        this.telefonoCotizante = telefonoCotizante;
    }

    public char getGeneroCotizante() {
        return generoCotizante;
    }

    public void setGeneroCotizante(char generoCotizante) {
        this.generoCotizante = generoCotizante;
    }

    @Override
    public void agregarContrato() {

    }

    @Override
    public void mostrarContratos() {

    }
}
