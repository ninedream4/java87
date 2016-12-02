
/* �Խù��±� */
DROP TABLE BRD_TAG 
	CASCADE CONSTRAINTS;

/* ������±� */
DROP TABLE USER_TAG 
	CASCADE CONSTRAINTS;
	
/* ��� */
DROP TABLE CMTS 
	CASCADE CONSTRAINTS;
	
/* �Խù� */
DROP TABLE BRDS 
	CASCADE CONSTRAINTS;
	
/* ����� */
DROP TABLE USERS 
	CASCADE CONSTRAINTS;
	
/* ����� */
CREATE TABLE USERS (
	USER_ID INTEGER NOT NULL, /* ����� �Ϸù�ȣ */
	EMAIL VARCHAR2(40) NOT NULL, /* �̸��� */
	PWD VARCHAR(255) NOT NULL /* ��й�ȣ */
);

ALTER TABLE USERS
	ADD
		CONSTRAINT PK_USERS
		PRIMARY KEY (
			USER_ID
		);

ALTER TABLE USERS
	ADD
		CONSTRAINT UK_USERS
		UNIQUE (
			EMAIL
		);

/* �Խù� */
CREATE TABLE BRDS (
	BRD_ID INTEGER NOT NULL, /* �Խù� �Ϸù�ȣ */
	USER_ID INTEGER NULL, /* ����� �Ϸù�ȣ */
	TLE VARCHAR2(50) NOT NULL, /* ���� */
	DES       CLOB         NULL, /* ���� */
	FILE_PATH VARCHAR2(255) NOT NULL, /* ���ϰ�� */
	CATE VARCHAR2(50), /* ī�װ� */
	REG_DATE DATE NOT NULL /* ��Ͻð� */
);

ALTER TABLE BRDS
	ADD
		CONSTRAINT PK_BRDS
		PRIMARY KEY (
			BRD_ID
		);

ALTER TABLE BRDS
	ADD
		CONSTRAINT UK_BRDS
		UNIQUE (
			TLE
		);

/* ��� */
CREATE TABLE CMTS (
	CMT_ID INTEGER NOT NULL, /* ��� �Ϸù�ȣ */
	USER_ID INTEGER NOT NULL, /* ����� �Ϸù�ȣ */
	BRD_ID INTEGER NOT NULL, /* �Խù� �Ϸù�ȣ */
	DES      CLOB    NOT NULL, /* ���� */
	REG_DATE DATE NOT NULL /* ��Ͻð� */
);

ALTER TABLE CMTS
	ADD
		CONSTRAINT PK_CMTS
		PRIMARY KEY (
			CMT_ID
		);

/* �Խù��±� */
CREATE TABLE BRD_TAG (
	TAG_ID INTEGER NOT NULL, /* �±� �Ϸù�ȣ */
	BRD_ID INTEGER NOT NULL, /* �Խù� �Ϸù�ȣ */
	TAG_NAME VARCHAR2(50) /* �±׸� */
);

ALTER TABLE BRD_TAG
	ADD
		CONSTRAINT PK_BRD_TAG
		PRIMARY KEY (
			TAG_ID
		);

/* ������±� */
CREATE TABLE USER_TAG (
	TAG_ID INTEGER NOT NULL, /* �±��Ϸù�ȣ */
	USER_ID INTEGER NOT NULL, /* ����� �Ϸù�ȣ */
	TAG_NAME VARCHAR2(50) /* �±׸� */
);

ALTER TABLE USER_TAG
	ADD
		CONSTRAINT PK_USER_TAG
		PRIMARY KEY (
			TAG_ID
		);

ALTER TABLE BRDS
	ADD
		CONSTRAINT FK_USERS_TO_BRDS
		FOREIGN KEY (
			USER_ID
		)
		REFERENCES USERS (
			USER_ID
		);

ALTER TABLE CMTS
	ADD
		CONSTRAINT FK_USERS_TO_CMTS
		FOREIGN KEY (
			USER_ID
		)
		REFERENCES USERS (
			USER_ID
		);

ALTER TABLE CMTS
	ADD
		CONSTRAINT FK_BRDS_TO_CMTS
		FOREIGN KEY (
			BRD_ID
		)
		REFERENCES BRDS (
			BRD_ID
		);

ALTER TABLE BRD_TAG
	ADD
		CONSTRAINT FK_BRDS_TO_BRD_TAG
		FOREIGN KEY (
			BRD_ID
		)
		REFERENCES BRDS (
			BRD_ID
		);

ALTER TABLE USER_TAG
	ADD
		CONSTRAINT FK_USERS_TO_USER_TAG
		FOREIGN KEY (
			USER_ID
		)
		REFERENCES USERS (
			USER_ID
		);
		
DROP SEQUENCE SEQ_USER;
DROP SEQUENCE SEQ_BRD;

CREATE SEQUENCE SEQ_USER START WITH 10000 INCREMENT BY 1;
CREATE SEQUENCE SEQ_BRD START WITH 10000 INCREMENT BY 1;

DROP TRIGGER TRG_USER;
DROP TRIGGER TRG_BRD;

CREATE TRIGGER TRG_USER BEFORE INSERT ON USERS FOR EACH ROW
BEGIN
	SELECT SEQ_USER.NEXTVAL INTO:NEW.USER_ID FROM DUAL;
	END;
	/

CREATE TRIGGER TRG_BRD BEFORE INSERT ON BRDS FOR EACH ROW
BEGIN
	SELECT SEQ_BRD.NEXTVAL INTO:NEW.BRD_ID FROM DUAL;
	END;
	/

