CREATE TABLE public.users
(
    username character varying(50) NOT NULL,
    password character varying(500) NOT NULL,
    enabled boolean NOT NULL,
    PRIMARY KEY (username),
    CONSTRAINT unique_cnst_username_password UNIQUE (username, password)
);

ALTER TABLE IF EXISTS public.users
    OWNER to root;

CREATE TABLE public.authorities
(
    username character varying(50) NOT NULL,
    authority character varying(50) NOT NULL,
    CONSTRAINT unique_cnstr_username UNIQUE (username),
    CONSTRAINT fk_user_username FOREIGN KEY (username)
        REFERENCES public.users (username) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
        NOT VALID
);

ALTER TABLE IF EXISTS public.authorities
    OWNER to root;