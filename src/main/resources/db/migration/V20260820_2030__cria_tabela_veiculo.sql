CREATE TABLE veiculo (
    id bigint not null auto_increment,
    marca varchar(20) not null,
    modelo varchar(20) not null,
    placa varchar(7) not null,
    status varchar(20) not null,
    data_cadastro datetime not null,
    data_apreensao datetime,
    proprietario_id bigint not null,
    primary key (id)
);

ALTER TABLE veiculo ADD CONSTRAINT fk_veiculo_proprietario
FOREIGN KEY (proprietario_id) references proprietario (id);

ALTER TABLE veiculo ADD CONSTRAINT uk_veiculo UNIQUE (placa);

