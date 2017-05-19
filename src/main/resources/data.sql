-- especie
insert into especie (id, nombre) values (-1, 'Ovino');
insert into especie (id, nombre) values (-2, 'Bovino');
insert into especie (id, nombre) values (-3, 'Caprino');

-- explotacion
insert into explotacion (id, cea, direccion, propietario) values (-1, 'ES47001986245954', 'Acceso Entregara, 96A 6ºC', 'Itzel Davila Azurmendi');
insert into explotacion (id, cea, direccion, propietario) values (-2, 'ES47001986245954', 'Carrera Faixàs, 172 13ºB', 'Esteban Jibaja Murias');

-- animal
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-1, 'ES78438760003421', '2010-01-30', -1, -1);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-2, 'ES78438760003422', '2009-07-15', -1, -1);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-3, 'ES78438760003423', '2009-04-22', -1, -1);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-4, 'ES78438760003424', '2011-05-01', -1, -1);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-5, 'ES78438760003425', '2011-11-03', -3, -2);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-6, 'ES78438760003426', '2015-04-29', -2, -2);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-7, 'ES78438760003427', '2008-07-11', -2, -2);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-8, 'ES78438760003428', '2008-03-07', -1, -1);
insert into animal (id, crotal, fecha_nacimiento, especie_id, explotacion_id) values (-9, 'ES78438760003429', '2001-03-24', -3, -2);
