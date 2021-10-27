package co.edu.unab_g47_2.webapp.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")

@Access(value = AccessType.FIELD)

public class PacienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String fecha_consulta;
    private String tipoDocumento;
    private Integer prioridad;
    private String genero;
    private String nombre;
    private String fecha_nacimiento;
    private String tipo_paciente;
    private String Aseguradora;
    private String estado_civil;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String celular;
    private String email;
    private String nombre_acompanante;
    private String telefonoacomp;
    private String parentesco;
    private String observacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFecha_consulta() {
        return fecha_consulta;
    }

    public void setFecha_consulta(String fecha_consulta) {
        this.fecha_consulta = fecha_consulta;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTipo_paciente() {
        return tipo_paciente;
    }

    public void setTipo_paciente(String tipo_paciente) {
        this.tipo_paciente = tipo_paciente;
    }

    public String getAseguradora() {
        return Aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        Aseguradora = aseguradora;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre_acompanante() {
        return nombre_acompanante;
    }

    public void setNombre_acompanante(String nombre_acompañante) {
        this.nombre_acompanante = nombre_acompañante;
    }

    public String getTelefonoacomp() {
        return telefonoacomp;
    }

    public void setTelefonoacomp(String telefonoacomp) {
        this.telefonoacomp = telefonoacomp;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
