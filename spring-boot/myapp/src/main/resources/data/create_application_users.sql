CREATE TABLE public.application_users
(
    id serial NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    user_name character varying(50) NOT NULL,
    email character varying(50) NOT NULL,
    password character varying(500) NOT NULL,
    verified boolean NOT NULL DEFAULT false,
    locked boolean NOT NULL DEFAULT false,
    acc_cred_expired boolean NOT NULL DEFAULT false,
    PRIMARY KEY (id),
    CONSTRAINT app_user_unique_cnstr UNIQUE (user_name, email)
);

ALTER TABLE IF EXISTS public.application_users
    OWNER to root;