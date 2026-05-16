package br.com.faculdadedonaduzzi.lab.entity;

import jakarta.persistence.*;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private String prazo;


    private Date dataPrevisao;

    public Task(String titulo, String descricao, TaskStatus status, String prazo, Date dataPrevisao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prazo = prazo;
        this.dataPrevisao = dataPrevisao;
    }

    public Task(){}

    public @NotBlank String getTitulo() {
        return null;
    }

    public @NotBlank String getDescricao() {
        return descricao;
    }

    public void setDescricao(Object descricao) {
        this.descricao = (String) descricao;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = (TaskStatus) status;
    }

    public void setTitulo(@NotBlank String titulo) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}