-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

insert into Lista (id, nome, descricao, quantidade ) values(nextval('hibernate_sequence'), 'Cupuaçu', 'uma fruto do centro oeste do pais',20);
insert into Lista (id, nome, descricao, quantidade ) values(nextval('hibernate_sequence'), 'Laranja', 'uma laraja laranja oras kkkk',14);