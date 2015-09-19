/*
 *    Copyright 2015 Codessus. All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License
 *
 */

package creational.abstractFactory;

/**
 *
 * Project Learning_Design_Patterns_Java
 * @author alejandro
 * Date 19/09/15
 *
 * Patrones de CREACIÓN
 * --------------------
 * Corrresponden a patrones de diseño que solucionan problemas de creación de instancias.
 *
 * Pattern [ABSTRACT FACTORY] (fábrica abstracta)
 *
 * Permite crear diferentes tipos o familias de instancias, aislando al cliente sobre cómo se debe crear cada una de ellas.
 *
 * Por ejemplo, las bibliotecas para crear interfaces gráficas suelen utilizar este patrón y cada familia sería un
 * SO distinto. Así pues, el usuario declara un elemento como podría ser un Button pero de forma más interna lo que está
 * creando es un WindowsButton o un LinuxButton según el SO, siendo transparente para el cliente o usuario.
 *
 * En definitiva, el patroón <i>Abstract Factory</i> recomienda crear las siguientes entidades:
 *  - Factoría abstracta que defina una interfaz para que los clientes puedan crear los distintos tipos de objetos.
 *  - Factorías concretas que realmente crean las instancias finales y que son hijas de la factoría abstracta.
 *
 * see Example.md
 *
 * Links:
 * https://es.wikipedia.org/wiki/Abstract_Factory
 *
 */
public class AbstractFactory {

    public static void main (String[] args){

        // Factory
        SoldierFactory factory;

        // Men
        factory = new ManFactory();

        Soldier mArcher = factory.makeArcher();
        Soldier mRider = factory.makeRider();


        // Orcs
        factory = new OrcFactory();
        Soldier oArcher = factory.makeArcher();
        Soldier oRider = factory.makeRider();

    }
}
