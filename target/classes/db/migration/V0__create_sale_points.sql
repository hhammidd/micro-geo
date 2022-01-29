--MYSQL
--CREATE TABLE IF NOT EXISTS nation (
--id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--nation_name VARCHAR(50)NOT NULL,
--nation_code varchar(50),
--nation_father INT
--
--)ENGINE = INNODB;
--
--CREATE TABLE IF NOT EXISTS region (
--id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--region_name VARCHAR(50) NOT NULL,
--region_code varchar(50),
--nation_id INT(11) NOT NULL,
--INDEX fk_region_nation_idx (nation_id ASC),
--CONSTRAINT fk_region_nation
--FOREIGN KEY (nation_id)
--REFERENCES nation (id)
--)ENGINE = INNODB;
CREATE TABLE IF NOT EXISTS nation (
  id SERIAL PRIMARY KEY NOT NULL,
  nation_name VARCHAR(50) NOT NULL,
  nation_code varchar(50),
  nation_father varchar(50)
);


CREATE TABLE IF NOT EXISTS region (
  id SERIAL PRIMARY KEY NOT NULL,
  region_name VARCHAR(50) NOT NULL,
  region_code varchar(50),
  nation_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS province (
  id SERIAL PRIMARY KEY NOT NULL,
  province_name VARCHAR(50) NOT NULL,
  province_code varchar(50),
  region_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS comune (
  id SERIAL PRIMARY KEY NOT NULL,
  comune_name VARCHAR(50) NOT NULL,
  comune_code varchar(50),
  province_id INT
);

CREATE TABLE IF NOT EXISTS cap (
  id SERIAL PRIMARY KEY NOT NULL,
  code VARCHAR(50) NOT NULL,
  name VARCHAR(50),
  comune_id INT  NOT NULL
);


INSERT INTO nation(id, nation_name, nation_code, nation_father)
VALUES
(1, 'ITALY', 'ITA', 1);
INSERT INTO nation(id, nation_name, nation_code, nation_father)
VALUES
(2, 'NETHERLANDS', 'NED', 1);

INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2811, 'Abruzzo', 'IT/ABR', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2812, 'Puglia', 'IT/PUG', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2813, 'Basilicata', 'IT/BAS', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2814, 'Calabria', 'IT/CAL', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2815, 'Campania', 'IT/CAM', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2816, 'Emilia-Romagna', 'IT/EMI', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2817, 'Friuli-Venezia Giulia', 'IT/FRI', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2818, 'Lazio', 'IT/LAZ', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2819, 'Liguria', 'IT/LIG', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2820, 'Lombardia', 'IT/LOM', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2821, 'Marche', 'IT/MAR', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2822, 'Molise', 'IT/MOL', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2823, 'Piemonte', 'IT/PIE', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2824, 'Sardegna', 'IT/SAR', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2825, 'Sicilia', 'IT/SIC', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2826, 'Toscana', 'IT/TOS', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2827, 'Trentino-Alto Adige', 'IT/TRE', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2828, 'Umbria', 'IT/UMB', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2829, 'Valle d''Aosta', 'IT/VAL', 1);
INSERT INTO region(id, region_name, region_code, nation_id) VALUES (2830, 'Veneto', 'IT/VEN', 1);

--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1611, 'Abruzzo', 'ABR', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1612, 'Puglia', 'PUG', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1613, 'Basilicata', 'BAS', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1614, 'Calabria', 'CAL', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1615, 'Campania', 'CAM', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1616, 'Emilia-Romagna', 'EMI', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1617, 'Friuli-Venezia Giulia', 'FRI', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1618, 'Lazio', 'LAZ', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1619, 'Liguria', 'LIG', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1620, 'Lombardia', 'LOM', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1621, 'Marche', 'MAR', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1622, 'Molise', 'MOL', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1623, 'Piemonte', 'PIE', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1624, 'Sardegna', 'SAR', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1625, 'Sicilia', 'SIC', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1626, 'Toscana', 'TOS', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1627, 'Trentino-Alto Adige', 'TRE', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1628, 'Umbria', 'UMB', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1629, 'Valle d''Aosta', 'VAL', 1);
--INSERT INTO region (id, region_name, region_code, nation_id) VALUES (1630, 'Veneto', 'VEN', 1);