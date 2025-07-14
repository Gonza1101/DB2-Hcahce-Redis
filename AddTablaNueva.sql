create table aeropuerto(
  id UUID not null primary key,
  nombreAeropuerto varchar (255),
  ciudad varchar (255),
  pais varchar (255),
  version int,
  constraint unique_aeropuerto unique (nombreAeropuerto, ciudad, pais)
);

create table avion(
	id UUID not null primary key,
	numeroSerieAvion varchar (255),
	nombreTipoAvion varchar (255),
	totalAsiento int,
	version int
);

select * from aeropuerto a;
select * from avion v;



{
  'Aeropuerto Internacional Ezeiza', 'Buenos Aires', 'Argentina'
},
('AeropuertoInternacional Jorege Newbery','CABA','Argentina'),
('Aeropuerto Internacional Rio de Janeiro Galeao', 'Rio de Janeiro', 'Brasil'),
('Aeropuerto Internacional Montevideo Carrasco', 'Montevideo', 'Uruguay'),
('Aeropuerto Internacional Asuncion Silvio Pettirossi', 'Asuncion', 'Paraguay');

