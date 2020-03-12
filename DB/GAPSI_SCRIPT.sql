CREATE SCHEMA `gapsi_test`;

CREATE USER 'GAPSI_API'@'%' IDENTIFIED BY 'pa55word';

create table `gapsi_test`.`ITEM_DATA`(
	ITEM_ID VARCHAR(10) PRIMARY KEY NOT NULL,
    ITEM_NAME VARCHAR(20) NOT NULL,
    ITEM_DESC VARCHAR(200) DEFAULT "",
    ITEM_PRICE FLOAT NOT NULL,
    ITEM_MODEL VARCHAR(10) DEFAULT "" 
);

insert into `gapsi_test`.`ITEM_DATA` values ('item001','Iphone 7','Celular marca Iphone 7',6433.00,'Serie 7');
insert into `gapsi_test`.`ITEM_DATA` values ('item002','Iphone XS','Celular marca Iphone XS',34303.00,'Serie XS');
insert into `gapsi_test`.`ITEM_DATA` values ('item003','Samsung S10','Celular marca Samsung S10',14303.00,'Galaxy S10');
commit;

GRANT ALL PRIVILEGES ON `gapsi_test`.`ITEM_DATA` TO 'GAPSI_API'@'%';
GRANT SELECT ON `gapsi_test`.`ITEM_DATA` TO 'GAPSI_API'@'%';
FLUSH PRIVILEGES;