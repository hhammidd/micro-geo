
--CREATE TABLE IF NOT EXISTS region_nl (
--id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--region_name VARCHAR(50) NOT NULL,
--region_code int ,
--nation_id INT(11) NOT NULL,
--date_ins TIMESTAMP,
--INDEX fk_region_nl_nation_idx (nation_id ASC),
--CONSTRAINT fk_region_nl_nation
--FOREIGN KEY (nation_id)
--REFERENCES nation (id)
--)ENGINE = INNODB;
--
--
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (1 ,'Drenthe', 1, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (2 ,'Flevoland', 2, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (3 ,'Friesland', 3, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (4 ,'Gelderland', 4, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (5 ,'Groningen', 5, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (6 ,'Limburg', 6, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (7 ,'North Brabant', 7, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (8 ,'North Holland', 8, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (9 ,'Overijssel', 9, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (10 ,'South Holland', 10, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (11 ,'Utrecht', 11, 2, '2020-06-19 10:10:10');
--INSERT INTO region_nl(id, region_name, region_code, nation_id, date_ins) VALUES (12 ,'Zeeland', 12, 2, '2020-06-19 10:10:10');
--