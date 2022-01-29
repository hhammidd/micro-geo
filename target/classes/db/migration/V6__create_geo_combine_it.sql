--CREATE TABLE IF NOT EXISTS geo_combine_it (
--  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--  region_id INT NOT NULL,
--  province_id INT NOT NULL,
--  comune_id INT NOT NULL
--) ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS geo_combine_it (
  id SERIAL PRIMARY KEY NOT NULL,
  region_id INT NOT NULL,
  province_id INT NOT NULL,
  comune_id INT NOT NULL
);