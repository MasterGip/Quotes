package ru.kpfu.itis.daointerfaces;


public interface AbstractDAO<T, PK> {
    public void create(T obj);
    public T get(PK id);
    public void update(T obj);
    public void delete(T obj);

}
