CREATE TABLE public.email_verifications
(
    verification_id text NOT NULL,
    user_name character varying(50) NOT NULL,
    PRIMARY KEY (verification_id)
);

ALTER TABLE IF EXISTS public.email_verifications
    OWNER to root;