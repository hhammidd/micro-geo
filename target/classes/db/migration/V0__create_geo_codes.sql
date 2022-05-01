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
    code_geo INT NOT NULL,
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

INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2811, 'Abruzzo', 'IT/ABR', 1, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2812, 'Puglia', 'IT/PUG', 2, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2813, 'Basilicata', 'IT/BAS', 3, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2814, 'Calabria', 'IT/CAL', 4, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2815, 'Campania', 'IT/CAM', 5, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2816, 'Emilia-Romagna', 'IT/EMI', 6, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2817, 'Friuli-Venezia Giulia', 'IT/FRI', 7, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2818, 'Lazio', 'IT/LAZ', 8, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2819, 'Liguria', 'IT/LIG', 9, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2820, 'Lombardia', 'IT/LOM', 10, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2821, 'Marche', 'IT/MAR', 11, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2822, 'Molise', 'IT/MOL', 12, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2823, 'Piemonte', 'IT/PIE', 13, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2824, 'Sardegna', 'IT/SAR', 14, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2825, 'Sicilia', 'IT/SIC', 15, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2826, 'Toscana', 'IT/TOS', 16, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2827, 'Trentino-Alto Adige', 'IT/TRE', 17, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2828, 'Umbria', 'IT/UMB', 18, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2829, 'Valle d''Aosta', 'IT/VAL', 19, 1);
INSERT INTO region(id, region_name, region_code, code_geo, nation_id) VALUES (2830, 'Veneto', 'IT/VEN', 20, 1);
