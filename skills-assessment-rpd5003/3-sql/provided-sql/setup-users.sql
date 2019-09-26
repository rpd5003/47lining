create user candidate password 'REDACTED';
grant usage on schema public to candidate;
alter user candidate set search_path to public;
grant select on all tables in schema public to candidate;
