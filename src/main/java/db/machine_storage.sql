-- create table body (
--                       id serial primary key,
--                       name text
-- );

-- insert into body
-- values
-- (1, 'Sedan'),
-- (2, 'Universal'),
-- (3, 'Cabriolet'),
-- (4, 'Cupe'),
-- (5, 'Pickup');

-- create table engine (
--                         id serial primary key,
--                         name text
-- );

-- insert into engine
-- values
-- (1, 'Petrol'),
-- (2, 'Disel'),
-- (3, 'Gas'),
-- (4, 'Electro');

-- create table transmission (
--                               id serial primary key,
--                               name text
--
-- );

-- insert into transmission
-- values
-- (1, 'Mechanical'),
-- (2, 'Avtomat'),
-- (3, 'Electro');

-- create table car (
--                      id serial primary key,
--                      name text,
--                      body_id int references body(id),
--                      engine_id int references engine(id),
--                      transmission_id int references transmission(id)
-- );

-- insert into car
-- values
-- (1, 'Lexus', 1, 1, 1),
-- (2, 'Audi', 1, 1, 1),
-- (3, 'Ford', 1, 1, 1),
-- (4, 'Reno', 1, 1, 1),
-- (5, 'Fiat', 1, 1, 1);

-- select car.id, car.name, body.name as body, engine.name as engine, transmission.name as transmission  from car
-- left join body on car.body_id = body.id
-- left join engine on car.engine_id = engine.id
-- left join transmission on car.transmission_id = transmission.id

-- select body.id, body.name as body from body
-- left join car on car.body_id = body.id
-- where car.id is null

-- select engine.id, engine.name as engine from engine
-- left join car on car.engine_id = engine.id
-- where car.id is null

-- select transmission.id, transmission.name as transmission from transmission
-- left join car on car.transmission_id = transmission.id
-- where car.id is null
