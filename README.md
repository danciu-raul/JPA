# Practical Example for JPA

The latest Docker Wildfly composed application has been updated to use MariaDB instead of MySQL.Therefore, it is recommended that the MariaDB CLI program is used instead of the MySQL CLI (but this should also work, since both DBMS should be compatible).

If no data are yet present in the DB available in Docker, then the dump given in the file `DB.dump` must be loaded into the DB instance before the examples will work correctly. Assume that a `mariadb` CLI program is available on the host, then just run:

```
mariadb -h 127.0.0.1 -u javaee -p javaee < DB.dump
```

with password "eeavaj". You can detect this problem if a search with id 1 outputs "No data found", and there is a corresponding error message in the logs.

Note also that the entity class was also defined as a named bean, which does not take part in automatic transactions (ideally, it should be an EJB). Therefore, the insert/update operation had to be extended with a manual transaction using an injected userTransaction object.
