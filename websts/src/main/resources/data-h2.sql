--create table produkt(
--id INT(10) NOT NULL AUTO_INCREMENT PRIMARY_KEY,
--name VARCHAR(255) NOT NULL,
--beschreibung VARCHAR(1024),
--kurzbeschr VARCHAR(512),
--stueck int,
--preis double not NULL,
--link VARCHAR(256));

insert into user (username, firstname, lastname, password, admin, email) values ('max123', 'Max1', 'Mustermann1', 'password1', false, 'max@max.at');
insert into produkt (id, name, beschreibung, kurzbeschr, stueck, preis, link) values (1, 'P1', 'P1 blablalblblalbalblalblalbla', 'P1 blablablabla', 30, 12.56, 'wwww.w.w.w.w.www');