CREATE TABLE SBI_CACHE_ITEM (
	   SIGNATURE			VARCHAR2(100) NOT NULL,
	   NAME					VARCHAR2(100) NULL,
	   TABLE_NAME 			VARCHAR2(100) NOT NULL,
	   DIMENSION 			NUMERIC NULL,
	   CREATION_DATE 		DATE NULL,
	   LAST_USED_DATE 		DATE NULL,
       PROPERTIES			CLOB NULL,
	   USER_IN              VARCHAR2(100) NOT NULL,
       USER_UP              VARCHAR2(100),
       USER_DE              VARCHAR2(100),
       TIME_IN              TIMESTAMP NOT NULL,
       TIME_UP              TIMESTAMP DEFAULT NULL,
       TIME_DE              TIMESTAMP DEFAULT NULL,
       SBI_VERSION_IN       VARCHAR2(10),
       SBI_VERSION_UP       VARCHAR2(10),
       SBI_VERSION_DE       VARCHAR2(10),
       META_VERSION         VARCHAR2(100),
       ORGANIZATION         VARCHAR2(20),
       CONSTRAINT XAK1SBI_CACHE_ITEM UNIQUE(TABLE_NAME),
	   PRIMARY KEY (SIGNATURE)
) ;
commit;

CREATE TABLE SBI_CACHE_JOINED_ITEM (
	   ID 					INTEGER  NOT NULL,
	   SIGNATURE			VARCHAR2(100) NOT NULL,
	   JOINED_SIGNATURE		VARCHAR2(100) NOT NULL,
       USER_IN              VARCHAR2(100) NOT NULL,
       USER_UP              VARCHAR2(100),
       USER_DE              VARCHAR2(100),
       TIME_IN              TIMESTAMP NOT NULL,
       TIME_UP              TIMESTAMP DEFAULT NULL,
       TIME_DE              TIMESTAMP DEFAULT NULL,
       SBI_VERSION_IN       VARCHAR2(10),
       SBI_VERSION_UP       VARCHAR2(10),
       SBI_VERSION_DE       VARCHAR2(10),
       META_VERSION         VARCHAR2(100),
       ORGANIZATION         VARCHAR2(20),
       CONSTRAINT XAK1SBI_CACHE_JOINED_ITEM UNIQUE(SIGNATURE, JOINED_SIGNATURE),
	   PRIMARY KEY (ID)
) ;
commit;

ALTER TABLE SBI_CACHE_JOINED_ITEM  ADD CONSTRAINT FK_SBI_CACHE_JOINED_ITEM_1 FOREIGN KEY ( SIGNATURE ) REFERENCES  SBI_CACHE_ITEM  ( SIGNATURE ) ON DELETE NO ACTION ON UPDATE CASCADE;
commit;
ALTER TABLE SBI_CACHE_JOINED_ITEM  ADD CONSTRAINT FK_SBI_CACHE_JOINED_ITEM_2 FOREIGN KEY ( JOINED_SIGNATURE ) REFERENCES  SBI_CACHE_ITEM  ( SIGNATURE ) ON DELETE CASCADE ON UPDATE CASCADE;
commit;

ALTER TABLE SBI_META_MODELS
	ADD COLUMN MODEL_LOCKED SMALLINT NULL DEFAULT NULL AFTER DESCR,
	ADD COLUMN MODEL_LOCKER VARCHAR2(100) NULL DEFAULT NULL AFTER MODEL_LOCKED;
	
-- Date Range
ALTER TABLE SBI_PARUSE 
	ADD COLUMN OPTIONS VARCHAR2(4000) NULL DEFAULT NULL AFTER ORGANIZATION;
	
ALTER TABLE SBI_THRESHOLD_VALUE RENAME COLUMN POSITION TO KPI_POSITION;

-- Sbi Version
INSERT INTO SBI_CONFIG ( ID, LABEL, NAME, DESCRIPTION, IS_ACTIVE, VALUE_CHECK, VALUE_TYPE_ID, CATEGORY, USER_IN, TIME_IN) VALUES 
((SELECT next_val FROM hibernate_sequences WHERE sequence_name = 'SBI_CONFIG'), 
'SPAGOBI.SPAGOBI_VERSION_NUMBER', 'SPAGOBI.SPAGOBI_VERSION_NUMBER', 
'SpagoBI version number', true, '5.2.0',
(select VALUE_ID from SBI_DOMAINS where VALUE_CD = 'STRING' AND DOMAIN_CD = 'PAR_TYPE'), 
'GENERIC_CONFIGURATION', 'biadmin', current_timestamp);
update hibernate_sequences set next_val = next_val+1 where sequence_name = 'SBI_CONFIG';
commit;


--  add mail subject to alarms
 ALTER TABLE SBI_ALARM ADD COLUMN MAIL_SUBJ VARCHAR2(256);
  ALTER TABLE SBI_ALARM MODIFY COLUMN URL VARCHAR2(256);