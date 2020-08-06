-- create table tipe (
--     id serial primary key,
--     name text
-- );
--
-- create table products (
--     id serial primary key,
--     name text,
--     tipe_id int references tipe(id),
--     expired_date date,
--     prise numeric,
--     in_stock numeric
--     );

-- insert into tipe
-- values
-- (1, 'Water'),
--        (2, 'Cheese'),
--        (3, 'Milk');

-- insert into products
-- values
-- (1, 'Parmezan', 2, '2020-09-20', 250.0, 250),
-- (2, 'Blue Cheeses', 2, '2020-10-20', 400.0, 80),
-- (3, 'Rokfor', 2, '2020-09-12', 600.0, 10),
-- (4, 'Dar Blue', 2, '2020-10-16', 80.0, 320),
-- (5, 'Bonakva', 1, '2020-12-16', 5.0, 1200),
-- (6, 'Tetra Pack', 3, '2020-09-09', 12.0, 100),
-- (7, 'Parmalat', 3, '2020-09-24', 28.0, 480),
-- (8, 'Nestle', 3, '2020-11-20', 40.0, 850);

-- select * from products
-- inner join tipe t on products.tipe_id = t.id
-- where t.name = 'Cheese'

-- select * from products
-- where name like '%ar%'

-- select * from products
-- where expired_date >='2020-09-01' and expired_date <='2020-09-30'

-- select *    from products
-- where prise = (select MAX(prise) from products)

-- select t.name, count(tipe_id) from products
-- inner join tipe t on products.tipe_id = t.id
-- group by t.name

-- select * from products
-- inner join tipe t on products.tipe_id = t.id
-- where t.name = 'Milk' or t.name = 'Cheese'

-- select * from products
-- inner join tipe t on products.tipe_id = t.id
-- where in_stock<50

-- select products.id, products.name, t.name from products
-- inner join tipe t on products.tipe_id = t.id



