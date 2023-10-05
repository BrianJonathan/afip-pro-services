package proservices.main;


import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import proservices.servicios.Servicio;

import javax.persistence.EntityTransaction;

public class MainExample implements WithSimplePersistenceUnit {

    public static void main(String[] args) {
        new MainExample().start();
    }

    private void start() {
        Servicio jardineria = new Servicio();
        jardineria.setNombre("Jardinería");

        EntityTransaction tx = entityManager().getTransaction();

        tx.begin();
        entityManager().package proservices.main;


import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import proservices.servicios.Servicio;

import javax.persistence.EntityTransaction;

public class MainExample implements WithSimplePersistenceUnit {

    public static void main(String[] args) {
        new MainExample().start();
    }

    private void start() {
        Servicio jardineria = new Servicio();
        jardineria.setNombre("Jardinería");

        EntityTransaction tx = entityManager().getTransaction();

        tx.begin();
        entityManager().persist(jardineria);//INSERT TO...
        tx.commit();
    }
}
