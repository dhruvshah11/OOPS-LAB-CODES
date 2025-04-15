package p;

/**
 * Question: Access Modifiers and Package Interaction
 *
 * Create a Java program that demonstrates the behavior of different access modifiers
 * when accessing class members across packages. Implement two classes in separate
 * packages to show access restrictions.
 *
 * Requirements:
 * 1. Create two packages 'p' and 'Q'
 * 2. Implement class A in package 'p' with:
 *    - Methods using all access modifiers (public, protected, default, private)
 *    - Clear demonstration of each modifier's scope
 * 3. Create class B in package 'Q' that attempts to access A's members
 * 4. Show:
 *    - Which members are accessible across packages
 *    - Compilation errors for restricted access
 *
 * Learning Objectives:
 * - Understanding access modifiers
 * - Package-level access control
 * - Cross-package member access
 * - Visibility rules in Java
 */

public class A {
    public void publicMethod() {
        System.out.println("This is a public method");
    }
    
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
    
    void defaultMethod() {
        System.out.println("This is a default (package-private) method");
    }
    
    private void privateMethod() {
        System.out.println("This is a private method");
    }
}