/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  andre
 * Created: 7 de mai. de 2024
 */
create table pessoa(
	id serial primary key,
	nome varchar(150)
);

create table contato(
id serial primary key,
informacao varchar(100),
pessoa_id integer,
foreign key (pessoa_id) references pessoa(id)
);