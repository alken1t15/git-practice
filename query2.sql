create table predmeti(
    id serial not null primary key ,
    name varchar(255)
);

create table month(
    id serial not null primary key,
    name varchar(255),
    day int
);

create table groupa(
    id serial not  null primary key,
    name varchar(255),
    count_people int
);
create table nedely(
  id serial not null primary key,
  name varchar(255)
);


create  table raspisanie(
    id serial not null primary key,
    id_pridmet int references predmeti(id),
    id_nedely int references nedely(id),
    pata int,
        id_groupa int references groupa(id)
);

insert into predmeti (name) values ('АИП') ,('ТРПО');

insert into nedely (name) values ('Понедельник') ,('Вторник');

insert into groupa (name, count_people) VALUES ('П-20-51б',25);

insert into raspisanie (id_pridmet, id_nedely, pata, id_groupa) VALUES (1,2,3,1);

insert into raspisanie (id_pridmet, id_nedely, pata, id_groupa) VALUES (1,2,4,1);