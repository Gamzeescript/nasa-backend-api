-- Database: apinasa

-- DROP DATABASE IF EXISTS apinasa;

CREATE DATABASE apinasa
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Mexico.1252'
    LC_CTYPE = 'Spanish_Mexico.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	-- Table: public.registro_nasa

-- DROP TABLE IF EXISTS public.registro_nasa;

CREATE TABLE IF NOT EXISTS public.registro_nasa
(
    id_nasa integer NOT NULL DEFAULT nextval('registro_nasa_id_nasa_seq'::regclass),
    href text COLLATE pg_catalog."default" NOT NULL,
    center "char" NOT NULL,
    title text COLLATE pg_catalog."default" NOT NULL,
    historial timestamp with time zone NOT NULL,
    CONSTRAINT registro_nasa_pkey PRIMARY KEY (id_nasa)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.registro_nasa
    OWNER to postgres;
	
	